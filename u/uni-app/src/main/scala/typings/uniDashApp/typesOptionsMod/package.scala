package typings.uniDashApp

import typings.uniDashApp.AppNs.AppInstance
import typings.uniDashApp.PageNs.PageInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesOptionsMod {
  type Hooks = AppInstance[js.Object] with (PageInstance[_, _])
}
