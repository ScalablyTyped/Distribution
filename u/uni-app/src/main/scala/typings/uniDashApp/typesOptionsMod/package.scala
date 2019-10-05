package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesOptionsMod {
  import typings.uniDashApp.App.AppInstance
  import typings.uniDashApp.Page.PageInstance

  type Hooks = AppInstance[js.Object] with (PageInstance[_, _])
}
