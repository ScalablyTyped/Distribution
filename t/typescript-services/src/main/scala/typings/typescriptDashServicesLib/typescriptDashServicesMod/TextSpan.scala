package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TextSpan")
@js.native
class TextSpan protected ()
  extends typescriptDashServicesLib.TypeScriptNs.TextSpan {
  def this(start: scala.Double, length: scala.Double) = this()
}

/* static members */
@JSImport("typescript-services", "TextSpan")
@js.native
object TextSpan extends js.Object {
  def fromBounds(start: scala.Double, end: scala.Double): typescriptDashServicesLib.TypeScriptNs.TextSpan = js.native
}

