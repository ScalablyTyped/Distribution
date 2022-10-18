package typings.testingLibraryTestcafe

import typings.testcafe.mod.global.Selector
import typings.testcafe.mod.global.SelectorPromise
import typings.testingLibraryDom.typesMatchesMod.Matcher
import typings.testingLibraryDom.typesMatchesMod.MatcherOptions
import typings.testingLibraryDom.typesQueriesMod.ByRoleOptions
import typings.testingLibraryDom.typesQueryHelpersMod.SelectorMatcherOptions
import typings.testingLibraryTestcafe.anon.Content
import typings.testingLibraryTestcafe.anon.PartialOptions
import typings.testingLibraryTestcafe.anon.Typeofqueries
import typings.testingLibraryTestcafe.distTypesMod.WithinSelectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@testing-library/testcafe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configure(options: PartialOptions): Content = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Content]
  
  inline def configureOnce(options: PartialOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureOnce")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def findAllByAltText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByAltText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findAllByAltText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByAltText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findAllByDisplayValue(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByDisplayValue")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findAllByDisplayValue(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByDisplayValue")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findAllByLabelText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByLabelText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findAllByLabelText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByLabelText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findAllByPlaceholderText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByPlaceholderText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findAllByPlaceholderText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByPlaceholderText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findAllByRole(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByRole")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findAllByRole(matcher: Matcher, options: ByRoleOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByRole")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findAllByTestId(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByTestId")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findAllByTestId(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByTestId")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findAllByText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findAllByText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findAllByTitle(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByTitle")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findAllByTitle(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByTitle")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findByAltText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByAltText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findByAltText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByAltText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findByDisplayValue(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByDisplayValue")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findByDisplayValue(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByDisplayValue")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findByLabelText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByLabelText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findByLabelText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByLabelText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findByPlaceholderText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByPlaceholderText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findByPlaceholderText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByPlaceholderText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findByRole(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByRole")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findByRole(matcher: Matcher, options: ByRoleOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByRole")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findByTestId(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByTestId")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findByTestId(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByTestId")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findByText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findByText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def findByTitle(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByTitle")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def findByTitle(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByTitle")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getAllByAltText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByAltText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getAllByAltText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByAltText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getAllByDisplayValue(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByDisplayValue")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getAllByDisplayValue(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByDisplayValue")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getAllByLabelText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByLabelText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getAllByLabelText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByLabelText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getAllByPlaceholderText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByPlaceholderText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getAllByPlaceholderText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByPlaceholderText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getAllByRole(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByRole")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getAllByRole(matcher: Matcher, options: ByRoleOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByRole")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getAllByTestId(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByTestId")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getAllByTestId(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByTestId")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getAllByText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getAllByText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getAllByTitle(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByTitle")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getAllByTitle(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByTitle")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getByAltText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByAltText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getByAltText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByAltText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getByDisplayValue(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByDisplayValue")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getByDisplayValue(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByDisplayValue")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getByLabelText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByLabelText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getByLabelText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByLabelText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getByPlaceholderText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByPlaceholderText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getByPlaceholderText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByPlaceholderText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getByRole(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByRole")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getByRole(matcher: Matcher, options: ByRoleOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByRole")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getByTestId(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByTestId")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getByTestId(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByTestId")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getByText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getByText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def getByTitle(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByTitle")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def getByTitle(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByTitle")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryAllByAltText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByAltText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryAllByAltText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByAltText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryAllByDisplayValue(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByDisplayValue")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryAllByDisplayValue(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByDisplayValue")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryAllByLabelText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByLabelText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryAllByLabelText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByLabelText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryAllByPlaceholderText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByPlaceholderText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryAllByPlaceholderText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByPlaceholderText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryAllByRole(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByRole")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryAllByRole(matcher: Matcher, options: ByRoleOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByRole")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryAllByTestId(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByTestId")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryAllByTestId(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByTestId")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryAllByText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryAllByText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryAllByTitle(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByTitle")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryAllByTitle(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByTitle")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryByAltText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByAltText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryByAltText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByAltText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryByDisplayValue(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByDisplayValue")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryByDisplayValue(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByDisplayValue")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryByLabelText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByLabelText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryByLabelText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByLabelText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryByPlaceholderText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByPlaceholderText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryByPlaceholderText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByPlaceholderText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryByRole(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByRole")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryByRole(matcher: Matcher, options: ByRoleOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByRole")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryByTestId(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByTestId")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryByTestId(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByTestId")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryByText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryByText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def queryByTitle(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByTitle")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def queryByTitle(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByTitle")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  object screen {
    
    @JSImport("@testing-library/testcafe", "screen")
    @js.native
    val ^ : js.Any = js.native
    
    inline def findAllByAltText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByAltText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findAllByAltText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByAltText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findAllByDisplayValue(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByDisplayValue")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findAllByDisplayValue(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByDisplayValue")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findAllByLabelText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByLabelText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findAllByLabelText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByLabelText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findAllByPlaceholderText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByPlaceholderText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findAllByPlaceholderText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByPlaceholderText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findAllByRole(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByRole")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findAllByRole(matcher: Matcher, options: ByRoleOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByRole")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findAllByTestId(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByTestId")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findAllByTestId(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByTestId")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findAllByText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findAllByText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findAllByTitle(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllByTitle")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findAllByTitle(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllByTitle")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findByAltText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByAltText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findByAltText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByAltText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findByDisplayValue(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByDisplayValue")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findByDisplayValue(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByDisplayValue")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findByLabelText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByLabelText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findByLabelText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByLabelText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findByPlaceholderText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByPlaceholderText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findByPlaceholderText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByPlaceholderText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findByRole(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByRole")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findByRole(matcher: Matcher, options: ByRoleOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByRole")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findByTestId(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByTestId")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findByTestId(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByTestId")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findByText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findByText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def findByTitle(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("findByTitle")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def findByTitle(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("findByTitle")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getAllByAltText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByAltText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getAllByAltText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByAltText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getAllByDisplayValue(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByDisplayValue")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getAllByDisplayValue(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByDisplayValue")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getAllByLabelText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByLabelText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getAllByLabelText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByLabelText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getAllByPlaceholderText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByPlaceholderText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getAllByPlaceholderText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByPlaceholderText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getAllByRole(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByRole")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getAllByRole(matcher: Matcher, options: ByRoleOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByRole")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getAllByTestId(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByTestId")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getAllByTestId(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByTestId")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getAllByText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getAllByText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getAllByTitle(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllByTitle")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getAllByTitle(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllByTitle")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getByAltText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByAltText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getByAltText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByAltText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getByDisplayValue(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByDisplayValue")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getByDisplayValue(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByDisplayValue")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getByLabelText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByLabelText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getByLabelText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByLabelText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getByPlaceholderText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByPlaceholderText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getByPlaceholderText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByPlaceholderText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getByRole(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByRole")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getByRole(matcher: Matcher, options: ByRoleOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByRole")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getByTestId(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByTestId")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getByTestId(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByTestId")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getByText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getByText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def getByTitle(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("getByTitle")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def getByTitle(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("getByTitle")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryAllByAltText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByAltText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryAllByAltText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByAltText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryAllByDisplayValue(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByDisplayValue")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryAllByDisplayValue(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByDisplayValue")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryAllByLabelText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByLabelText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryAllByLabelText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByLabelText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryAllByPlaceholderText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByPlaceholderText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryAllByPlaceholderText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByPlaceholderText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryAllByRole(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByRole")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryAllByRole(matcher: Matcher, options: ByRoleOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByRole")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryAllByTestId(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByTestId")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryAllByTestId(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByTestId")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryAllByText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryAllByText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryAllByTitle(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByTitle")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryAllByTitle(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryAllByTitle")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryByAltText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByAltText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryByAltText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByAltText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryByDisplayValue(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByDisplayValue")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryByDisplayValue(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByDisplayValue")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryByLabelText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByLabelText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryByLabelText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByLabelText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryByPlaceholderText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByPlaceholderText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryByPlaceholderText(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByPlaceholderText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryByRole(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByRole")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryByRole(matcher: Matcher, options: ByRoleOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByRole")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryByTestId(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByTestId")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryByTestId(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByTestId")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryByText(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByText")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryByText(matcher: Matcher, options: SelectorMatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByText")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
    
    inline def queryByTitle(matcher: Matcher): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("queryByTitle")(matcher.asInstanceOf[js.Any]).asInstanceOf[Selector]
    inline def queryByTitle(matcher: Matcher, options: MatcherOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("queryByTitle")(matcher.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  }
  
  inline def within(selector: SelectorArg): WithinSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("within")(selector.asInstanceOf[js.Any]).asInstanceOf[WithinSelectors]
  
  type SelectorArg = String | Selector | SelectorPromise | js.Function0[SelectorPromise]
  
  object global {
    
    trait Window extends StObject {
      
      var TestingLibraryDom: Typeofqueries
    }
    object Window {
      
      inline def apply(TestingLibraryDom: Typeofqueries): Window = {
        val __obj = js.Dynamic.literal(TestingLibraryDom = TestingLibraryDom.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setTestingLibraryDom(value: Typeofqueries): Self = StObject.set(x, "TestingLibraryDom", value.asInstanceOf[js.Any])
      }
    }
  }
}
