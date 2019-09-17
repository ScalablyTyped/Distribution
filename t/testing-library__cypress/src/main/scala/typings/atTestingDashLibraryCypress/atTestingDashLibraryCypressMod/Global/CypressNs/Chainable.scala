package typings.atTestingDashLibraryCypress.atTestingDashLibraryCypressMod.Global.CypressNs

import typings.atTestingDashLibraryCypress.atTestingDashLibraryCypressMod.MatcherOptions
import typings.atTestingDashLibraryCypress.atTestingDashLibraryCypressMod.SelectorMatcherOptions
import typings.atTestingDashLibraryDom.matchesMod.Matcher
import typings.jquery.JQuery
import typings.std.HTMLAnchorElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chainable[Subject] extends js.Object {
  def findAllByAltText(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def findAllByAltText(id: Matcher, options: MatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
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
  @JSName("findAllByAltText")
  def findAllByAltText_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("findAllByAltText")
  def findAllByAltText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[js.Array[E]] = js.native
  def findAllByDisplayValue(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def findAllByDisplayValue(id: Matcher, options: MatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
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
  @JSName("findAllByDisplayValue")
  def findAllByDisplayValue_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("findAllByDisplayValue")
  def findAllByDisplayValue_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[js.Array[E]] = js.native
  def findAllByLabelText(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def findAllByLabelText(id: Matcher, options: SelectorMatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
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
  @JSName("findAllByLabelText")
  def findAllByLabelText_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("findAllByLabelText")
  def findAllByLabelText_E_Node[E /* <: Node */](id: Matcher, options: SelectorMatcherOptions): Chainable[js.Array[E]] = js.native
  def findAllByPlaceholderText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def findAllByPlaceholderText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("findAllByPlaceholderText")
  def findAllByPlaceholderText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("findAllByPlaceholderText")
  def findAllByPlaceholderText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def findAllByRole(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def findAllByRole(id: Matcher, options: MatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
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
  @JSName("findAllByRole")
  def findAllByRole_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("findAllByRole")
  def findAllByRole_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[js.Array[E]] = js.native
  def findAllByTestId(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def findAllByTestId(id: Matcher, options: MatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
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
  @JSName("findAllByTestId")
  def findAllByTestId_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("findAllByTestId")
  def findAllByTestId_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[js.Array[E]] = js.native
  def findAllByText(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def findAllByText(id: Matcher, options: SelectorMatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
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
  @JSName("findAllByText")
  def findAllByText_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("findAllByText")
  def findAllByText_E_Node[E /* <: Node */](id: Matcher, options: SelectorMatcherOptions): Chainable[js.Array[E]] = js.native
  def findAllByTitle(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def findAllByTitle(id: Matcher, options: MatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
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
  @JSName("findAllByTitle")
  def findAllByTitle_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("findAllByTitle")
  def findAllByTitle_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[js.Array[E]] = js.native
  def findByAltText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def findByAltText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("findByAltText")
  def findByAltText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("findByAltText")
  def findByAltText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def findByDisplayValue(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def findByDisplayValue(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("findByDisplayValue")
  def findByDisplayValue_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("findByDisplayValue")
  def findByDisplayValue_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def findByLabelText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def findByLabelText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("findByLabelText")
  def findByLabelText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("findByLabelText")
  def findByLabelText_E_Node[E /* <: Node */](id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[E]] = js.native
  def findByPlaceholderText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def findByPlaceholderText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("findByPlaceholderText")
  def findByPlaceholderText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("findByPlaceholderText")
  def findByPlaceholderText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def findByRole(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def findByRole(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("findByRole")
  def findByRole_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("findByRole")
  def findByRole_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def findByTestId(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def findByTestId(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("findByTestId")
  def findByTestId_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("findByTestId")
  def findByTestId_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def findByText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def findByText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("findByText")
  def findByText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("findByText")
  def findByText_E_Node[E /* <: Node */](id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[E]] = js.native
  def findByTitle(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def findByTitle(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("findByTitle")
  def findByTitle_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("findByTitle")
  def findByTitle_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryAllByAltText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryAllByAltText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryAllByAltText")
  def queryAllByAltText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryAllByAltText")
  def queryAllByAltText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryAllByDisplayValue(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryAllByDisplayValue(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryAllByDisplayValue")
  def queryAllByDisplayValue_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryAllByDisplayValue")
  def queryAllByDisplayValue_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryAllByLabelText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryAllByLabelText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryAllByLabelText")
  def queryAllByLabelText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryAllByLabelText")
  def queryAllByLabelText_E_Node[E /* <: Node */](id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[E]] = js.native
  def queryAllByPlaceholderText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryAllByPlaceholderText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryAllByPlaceholderText")
  def queryAllByPlaceholderText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryAllByPlaceholderText")
  def queryAllByPlaceholderText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryAllByRole(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryAllByRole(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryAllByRole")
  def queryAllByRole_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryAllByRole")
  def queryAllByRole_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryAllByTestId(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryAllByTestId(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryAllByTestId")
  def queryAllByTestId_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryAllByTestId")
  def queryAllByTestId_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryAllByText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryAllByText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryAllByText")
  def queryAllByText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryAllByText")
  def queryAllByText_E_Node[E /* <: Node */](id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[E]] = js.native
  def queryAllByTitle(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryAllByTitle(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryAllByTitle")
  def queryAllByTitle_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryAllByTitle")
  def queryAllByTitle_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryByAltText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryByAltText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryByAltText")
  def queryByAltText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryByAltText")
  def queryByAltText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryByDisplayValue(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryByDisplayValue(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryByDisplayValue")
  def queryByDisplayValue_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryByDisplayValue")
  def queryByDisplayValue_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryByLabelText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryByLabelText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryByLabelText")
  def queryByLabelText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryByLabelText")
  def queryByLabelText_E_Node[E /* <: Node */](id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[E]] = js.native
  def queryByPlaceholderText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryByPlaceholderText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryByPlaceholderText")
  def queryByPlaceholderText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryByPlaceholderText")
  def queryByPlaceholderText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryByRole(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryByRole(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryByRole")
  def queryByRole_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryByRole")
  def queryByRole_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryByTestId(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryByTestId(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryByTestId")
  def queryByTestId_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryByTestId")
  def queryByTestId_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryByText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryByText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryByText")
  def queryByText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryByText")
  def queryByText_E_Node[E /* <: Node */](id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[E]] = js.native
  def queryByTitle(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryByTitle(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
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
  @JSName("queryByTitle")
  def queryByTitle_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryByTitle")
  def queryByTitle_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
}

