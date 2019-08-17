package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesOptionsMod {
  import typings.uniDashApp.AppNs.AppInstance
  import typings.uniDashApp.PageNs.PageInstance

  type Hooks = AppInstance[js.Object] with (PageInstance[_, _])
}
