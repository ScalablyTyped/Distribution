package typings.testingLibraryCypress

import typings.cypress.JQuery
import typings.std.HTMLElement
import typings.testingLibraryDom.anon.PartialConfig
import typings.testingLibraryDom.typesConfigMod.ConfigFn
import typings.testingLibraryDom.typesMatchesMod.Matcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@testing-library/cypress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configure(configDelta: PartialConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def configure(configDelta: ConfigFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configDelta.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ByRoleOptions = typings.testingLibraryDom.typesQueriesMod.ByRoleOptions | CTLMatcherOptions
  
  trait CTLMatcherOptions extends StObject {
    
    var container: js.UndefOr[HTMLElement | JQuery[HTMLElement]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object CTLMatcherOptions {
    
    inline def apply(): CTLMatcherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CTLMatcherOptions]
    }
    
    extension [Self <: CTLMatcherOptions](x: Self) {
      
      inline def setContainer(value: HTMLElement | JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type MatcherOptions = typings.testingLibraryDom.typesMatchesMod.MatcherOptions | CTLMatcherOptions
  
  type SelectorMatcherOptions = typings.testingLibraryDom.typesQueryHelpersMod.SelectorMatcherOptions | CTLMatcherOptions
  
  object global {
    
    object Cypress {
      
      @js.native
      trait Chainable[Subject] extends StObject {
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findAllByAltText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findAllByAltText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findAllByDisplayValue(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findAllByDisplayValue(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findAllByLabelText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findAllByLabelText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findAllByPlaceholderText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findAllByPlaceholderText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findAllByRole(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findAllByRole(id: Matcher, options: ByRoleOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findAllByTestId(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findAllByTestId(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findAllByText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findAllByText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findAllByTitle(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findAllByTitle(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findByAltText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findByAltText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findByDisplayValue(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findByDisplayValue(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findByLabelText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findByLabelText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findByPlaceholderText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findByPlaceholderText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findByRole(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findByRole(id: Matcher, options: ByRoleOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findByTestId(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findByTestId(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findByText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findByText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def findByTitle(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def findByTitle(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryAllByAltText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryAllByAltText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryAllByDisplayValue(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryAllByDisplayValue(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryAllByLabelText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryAllByLabelText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryAllByPlaceholderText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryAllByPlaceholderText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryAllByRole(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryAllByRole(id: Matcher, options: ByRoleOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryAllByTestId(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryAllByTestId(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryAllByText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryAllByText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryAllByTitle(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryAllByTitle(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryByAltText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryByAltText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryByDisplayValue(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryByDisplayValue(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryByLabelText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryByLabelText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryByPlaceholderText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryByPlaceholderText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryByRole(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryByRole(id: Matcher, options: ByRoleOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryByTestId(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryByTestId(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryByText(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryByText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
        
        /**
          * dom-testing-library helpers for Cypress
          *
          * `findBy*` APIs search for an element and throw an error if nothing found
          * `findAllBy*` APIs search for all elements and an error if nothing found
          * `queryBy*` APIs search for an element and returns null if nothing found
          * `queryAllBy*` APIs search for all elements and return empty array if nothing found
          *
          * @see https://github.com/testing-library/cypress-testing-library#usage
          * @see https://github.com/testing-library/dom-testing-library#table-of-contents
          */
        def queryByTitle(id: Matcher): Chainable[JQuery[HTMLElement]] = js.native
        def queryByTitle(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLElement]] = js.native
      }
    }
  }
}
