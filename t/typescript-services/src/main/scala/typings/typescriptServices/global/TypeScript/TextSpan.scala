package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TextSpan")
@js.native
class TextSpan protected ()
  extends typings.typescriptServices.TypeScript.TextSpan {
  def this(start: Double, length: Double) = this()
}

/* static members */
@JSGlobal("TypeScript.TextSpan")
@js.native
object TextSpan extends js.Object {
  def fromBounds(start: Double, end: Double): typings.typescriptServices.TypeScript.TextSpan = js.native
}

