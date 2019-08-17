package typings.vueDashServerDashRenderer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vueDashServerDashRendererMod {
  import typings.std.Error

  type RenderCallback = js.Function2[/* err */ Error | Null, /* html */ String, Unit]
}
