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
  def getAllByAltText(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def getAllByAltText(id: Matcher, options: MatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getAllByAltText")
  def getAllByAltText_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("getAllByAltText")
  def getAllByAltText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[js.Array[E]] = js.native
  def getAllByDisplayValue(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def getAllByDisplayValue(id: Matcher, options: MatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getAllByDisplayValue")
  def getAllByDisplayValue_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("getAllByDisplayValue")
  def getAllByDisplayValue_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[js.Array[E]] = js.native
  def getAllByLabelText(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def getAllByLabelText(id: Matcher, options: SelectorMatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getAllByLabelText")
  def getAllByLabelText_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("getAllByLabelText")
  def getAllByLabelText_E_Node[E /* <: Node */](id: Matcher, options: SelectorMatcherOptions): Chainable[js.Array[E]] = js.native
  def getAllByPlaceholderText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def getAllByPlaceholderText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getAllByPlaceholderText")
  def getAllByPlaceholderText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("getAllByPlaceholderText")
  def getAllByPlaceholderText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def getAllByRole(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def getAllByRole(id: Matcher, options: MatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getAllByRole")
  def getAllByRole_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("getAllByRole")
  def getAllByRole_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[js.Array[E]] = js.native
  def getAllBySelectText(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def getAllBySelectText(id: Matcher, options: MatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getAllBySelectText")
  def getAllBySelectText_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("getAllBySelectText")
  def getAllBySelectText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[js.Array[E]] = js.native
  def getAllByTestId(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def getAllByTestId(id: Matcher, options: MatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getAllByTestId")
  def getAllByTestId_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("getAllByTestId")
  def getAllByTestId_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[js.Array[E]] = js.native
  def getAllByText(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def getAllByText(id: Matcher, options: SelectorMatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getAllByText")
  def getAllByText_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("getAllByText")
  def getAllByText_E_Node[E /* <: Node */](id: Matcher, options: SelectorMatcherOptions): Chainable[js.Array[E]] = js.native
  def getAllByTitle(id: Matcher): Chainable[js.Array[HTMLAnchorElement]] = js.native
  def getAllByTitle(id: Matcher, options: MatcherOptions): Chainable[js.Array[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getAllByTitle")
  def getAllByTitle_E_Node[E /* <: Node */](id: Matcher): Chainable[js.Array[E]] = js.native
  @JSName("getAllByTitle")
  def getAllByTitle_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[js.Array[E]] = js.native
  def getByAltText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def getByAltText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getByAltText")
  def getByAltText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("getByAltText")
  def getByAltText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def getByDisplayValue(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def getByDisplayValue(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getByDisplayValue")
  def getByDisplayValue_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("getByDisplayValue")
  def getByDisplayValue_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def getByLabelText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def getByLabelText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getByLabelText")
  def getByLabelText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("getByLabelText")
  def getByLabelText_E_Node[E /* <: Node */](id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[E]] = js.native
  def getByPlaceholderText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def getByPlaceholderText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getByPlaceholderText")
  def getByPlaceholderText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("getByPlaceholderText")
  def getByPlaceholderText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def getByRole(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def getByRole(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getByRole")
  def getByRole_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("getByRole")
  def getByRole_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def getBySelectText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def getBySelectText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getBySelectText")
  def getBySelectText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("getBySelectText")
  def getBySelectText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def getByTestId(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def getByTestId(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getByTestId")
  def getByTestId_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("getByTestId")
  def getByTestId_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def getByText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def getByText(id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getByText")
  def getByText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("getByText")
  def getByText_E_Node[E /* <: Node */](id: Matcher, options: SelectorMatcherOptions): Chainable[JQuery[E]] = js.native
  def getByTitle(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def getByTitle(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("getByTitle")
  def getByTitle_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("getByTitle")
  def getByTitle_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryAllByAltText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryAllByAltText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
  def queryAllBySelectText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryAllBySelectText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("queryAllBySelectText")
  def queryAllBySelectText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryAllBySelectText")
  def queryAllBySelectText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryAllByTestId(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryAllByTestId(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
  def queryBySelectText(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryBySelectText(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
    * `queryBy*` APIs search for an element and returns null if nothing found
    * `queryAllBy*` APIs search for all elements and return empty array if nothing found
    *
    * @see https://github.com/testing-library/cypress-testing-library#usage
    * @see https://github.com/testing-library/dom-testing-library#table-of-contents
    */
  @JSName("queryBySelectText")
  def queryBySelectText_E_Node[E /* <: Node */](id: Matcher): Chainable[JQuery[E]] = js.native
  @JSName("queryBySelectText")
  def queryBySelectText_E_Node[E /* <: Node */](id: Matcher, options: MatcherOptions): Chainable[JQuery[E]] = js.native
  def queryByTestId(id: Matcher): Chainable[JQuery[HTMLAnchorElement]] = js.native
  def queryByTestId(id: Matcher, options: MatcherOptions): Chainable[JQuery[HTMLAnchorElement]] = js.native
  /**
    * dom-testing-library helpers for Cypress
    *
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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
    * `getBy*` APIs search for an element and throw an error if nothing found
    * `getAllBy*` APIs search for all elements and an error if nothing found
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

