package typings.atTestingDashLibraryVue.atTestingDashLibraryVueMod

import typings.atTestingDashLibraryDom.queryDashHelpersMod.BuiltQueryMethods
import typings.atTestingDashLibraryDom.queryDashHelpersMod.GetAllBy
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/vue", "buildQueries")
@js.native
object buildQueries extends js.Object {
  def apply[Arguments /* <: js.Array[_] */](
    queryByAll: GetAllBy[Arguments],
    getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
    getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
  ): BuiltQueryMethods[Arguments] = js.native
}

