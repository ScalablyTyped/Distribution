package typings.atTestingDashLibraryVue.atTestingDashLibraryVueMod

import typings.atTestingDashLibraryDom.queryDashHelpersMod.AllByAttribute
import typings.atTestingDashLibraryDom.queryDashHelpersMod.BuiltQueryMethods
import typings.atTestingDashLibraryDom.queryDashHelpersMod.GetAllBy
import typings.atTestingDashLibraryDom.queryDashHelpersMod.QueryByAttribute
import typings.std.Error
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/vue", "queryHelpers")
@js.native
object queryHelpers extends js.Object {
  val queryAllByAttribute: AllByAttribute = js.native
  val queryByAttribute: QueryByAttribute = js.native
  def buildQueries[Arguments /* <: js.Array[_] */](
    queryByAll: GetAllBy[Arguments],
    getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
    getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
  ): BuiltQueryMethods[Arguments] = js.native
  def getElementError(message: String, container: HTMLElement): Error = js.native
}

