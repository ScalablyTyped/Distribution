package typings.testingLibraryVue

import typings.std.HTMLElement
import typings.testingLibraryDom.matchesMod.Matcher
import typings.testingLibraryDom.matchesMod.MatcherOptions
import typings.testingLibraryDom.queriesMod.AllByBoundAttribute
import typings.testingLibraryDom.queriesMod.AllByRole
import typings.testingLibraryDom.queriesMod.AllByText
import typings.testingLibraryDom.queriesMod.ByRoleOptions
import typings.testingLibraryDom.queriesMod.FindAllByBoundAttribute
import typings.testingLibraryDom.queriesMod.FindAllByRole_
import typings.testingLibraryDom.queriesMod.FindAllByText_
import typings.testingLibraryDom.queriesMod.FindByBoundAttribute
import typings.testingLibraryDom.queriesMod.FindByRole_
import typings.testingLibraryDom.queriesMod.FindByText_
import typings.testingLibraryDom.queriesMod.GetByBoundAttribute
import typings.testingLibraryDom.queriesMod.GetByRole_
import typings.testingLibraryDom.queriesMod.GetByText_
import typings.testingLibraryDom.queriesMod.QueryByBoundAttribute
import typings.testingLibraryDom.queriesMod.QueryByRole_
import typings.testingLibraryDom.queriesMod.QueryByText_
import typings.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions
import typings.testingLibraryDom.waitForElementMod.WaitForElementOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofqueries extends js.Object {
  val findAllByAltText: FindAllByBoundAttribute
  val findAllByDisplayValue: FindAllByBoundAttribute
  val findAllByLabelText: FindAllByText_
  val findAllByPlaceholderText: FindAllByBoundAttribute
  val findAllByRole: FindAllByRole_
  val findAllByTestId: FindAllByBoundAttribute
  val findAllByText: FindAllByText_
  val findAllByTitle: FindAllByBoundAttribute
  val findByAltText: FindByBoundAttribute
  val findByDisplayValue: FindByBoundAttribute
  val findByLabelText: FindByText_
  val findByPlaceholderText: FindByBoundAttribute
  val findByRole: FindByRole_
  val findByTestId: FindByBoundAttribute
  val findByText: FindByText_
  val findByTitle: FindByBoundAttribute
  val getAllByAltText: AllByBoundAttribute
  val getAllByDisplayValue: AllByBoundAttribute
  val getAllByLabelText: AllByText
  val getAllByPlaceholderText: AllByBoundAttribute
  val getAllByRole: AllByRole
  val getAllByTestId: AllByBoundAttribute
  val getAllByText: AllByText
  val getAllByTitle: AllByBoundAttribute
  val getByAltText: GetByBoundAttribute
  val getByDisplayValue: GetByBoundAttribute
  val getByLabelText: GetByText_
  val getByPlaceholderText: GetByBoundAttribute
  val getByRole: GetByRole_
  val getByTestId: GetByBoundAttribute
  val getByText: GetByText_
  val getByTitle: GetByBoundAttribute
  val queryAllByAltText: AllByBoundAttribute
  val queryAllByDisplayValue: AllByBoundAttribute
  val queryAllByLabelText: AllByText
  val queryAllByPlaceholderText: AllByBoundAttribute
  val queryAllByRole: AllByRole
  val queryAllByTestId: AllByBoundAttribute
  val queryAllByText: AllByText
  val queryAllByTitle: AllByBoundAttribute
  val queryByAltText: QueryByBoundAttribute
  val queryByDisplayValue: QueryByBoundAttribute
  val queryByLabelText: QueryByText_
  val queryByPlaceholderText: QueryByBoundAttribute
  val queryByRole: QueryByRole_
  val queryByTestId: QueryByBoundAttribute
  val queryByText: QueryByText_
  val queryByTitle: QueryByBoundAttribute
}

object Typeofqueries {
  @scala.inline
  def apply(
    findAllByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findAllByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[js.Array[HTMLElement]],
    findByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    findByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => js.Promise[HTMLElement],
    getAllByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    getAllByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    getAllByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement],
    getAllByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    getAllByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions]) => js.Array[HTMLElement],
    getAllByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    getAllByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement],
    getAllByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    getByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
    getByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
    getByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement,
    getByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
    getByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions]) => HTMLElement,
    getByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
    getByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement,
    getByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement,
    queryAllByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    queryAllByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    queryAllByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement],
    queryAllByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    queryAllByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions]) => js.Array[HTMLElement],
    queryAllByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    queryAllByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => js.Array[HTMLElement],
    queryAllByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => js.Array[HTMLElement],
    queryByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null,
    queryByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null,
    queryByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement | Null,
    queryByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null,
    queryByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions]) => HTMLElement | Null,
    queryByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null,
    queryByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => HTMLElement | Null,
    queryByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => HTMLElement | Null
  ): Typeofqueries = {
    val __obj = js.Dynamic.literal(findAllByAltText = js.Any.fromFunction4(findAllByAltText), findAllByDisplayValue = js.Any.fromFunction4(findAllByDisplayValue), findAllByLabelText = js.Any.fromFunction4(findAllByLabelText), findAllByPlaceholderText = js.Any.fromFunction4(findAllByPlaceholderText), findAllByRole = js.Any.fromFunction4(findAllByRole), findAllByTestId = js.Any.fromFunction4(findAllByTestId), findAllByText = js.Any.fromFunction4(findAllByText), findAllByTitle = js.Any.fromFunction4(findAllByTitle), findByAltText = js.Any.fromFunction4(findByAltText), findByDisplayValue = js.Any.fromFunction4(findByDisplayValue), findByLabelText = js.Any.fromFunction4(findByLabelText), findByPlaceholderText = js.Any.fromFunction4(findByPlaceholderText), findByRole = js.Any.fromFunction4(findByRole), findByTestId = js.Any.fromFunction4(findByTestId), findByText = js.Any.fromFunction4(findByText), findByTitle = js.Any.fromFunction4(findByTitle), getAllByAltText = js.Any.fromFunction3(getAllByAltText), getAllByDisplayValue = js.Any.fromFunction3(getAllByDisplayValue), getAllByLabelText = js.Any.fromFunction3(getAllByLabelText), getAllByPlaceholderText = js.Any.fromFunction3(getAllByPlaceholderText), getAllByRole = js.Any.fromFunction3(getAllByRole), getAllByTestId = js.Any.fromFunction3(getAllByTestId), getAllByText = js.Any.fromFunction3(getAllByText), getAllByTitle = js.Any.fromFunction3(getAllByTitle), getByAltText = js.Any.fromFunction3(getByAltText), getByDisplayValue = js.Any.fromFunction3(getByDisplayValue), getByLabelText = js.Any.fromFunction3(getByLabelText), getByPlaceholderText = js.Any.fromFunction3(getByPlaceholderText), getByRole = js.Any.fromFunction3(getByRole), getByTestId = js.Any.fromFunction3(getByTestId), getByText = js.Any.fromFunction3(getByText), getByTitle = js.Any.fromFunction3(getByTitle), queryAllByAltText = js.Any.fromFunction3(queryAllByAltText), queryAllByDisplayValue = js.Any.fromFunction3(queryAllByDisplayValue), queryAllByLabelText = js.Any.fromFunction3(queryAllByLabelText), queryAllByPlaceholderText = js.Any.fromFunction3(queryAllByPlaceholderText), queryAllByRole = js.Any.fromFunction3(queryAllByRole), queryAllByTestId = js.Any.fromFunction3(queryAllByTestId), queryAllByText = js.Any.fromFunction3(queryAllByText), queryAllByTitle = js.Any.fromFunction3(queryAllByTitle), queryByAltText = js.Any.fromFunction3(queryByAltText), queryByDisplayValue = js.Any.fromFunction3(queryByDisplayValue), queryByLabelText = js.Any.fromFunction3(queryByLabelText), queryByPlaceholderText = js.Any.fromFunction3(queryByPlaceholderText), queryByRole = js.Any.fromFunction3(queryByRole), queryByTestId = js.Any.fromFunction3(queryByTestId), queryByText = js.Any.fromFunction3(queryByText), queryByTitle = js.Any.fromFunction3(queryByTitle))
  
    __obj.asInstanceOf[Typeofqueries]
  }
}

