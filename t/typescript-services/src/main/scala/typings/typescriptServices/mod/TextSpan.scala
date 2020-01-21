package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TextSpan")
@js.native
class TextSpan protected ()
  extends typings.typescriptServices.TypeScript.TextSpan {
  def this(start: Double, length: Double) = this()
}

/* static members */
@JSImport("typescript-services", "TextSpan")
@js.native
object TextSpan extends js.Object {
  def fromBounds(start: Double, end: Double): typings.typescriptServices.TypeScript.TextSpan = js.native
}

