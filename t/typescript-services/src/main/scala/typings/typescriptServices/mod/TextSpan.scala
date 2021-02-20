package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "TextSpan")
@js.native
class TextSpan protected ()
  extends typings.typescriptServices.TypeScript.TextSpan {
  def this(start: Double, length: Double) = this()
}
object TextSpan {
  
  /* static member */
  @JSImport("typescript-services", "TextSpan.fromBounds")
  @js.native
  def fromBounds(start: Double, end: Double): typings.typescriptServices.TypeScript.TextSpan = js.native
}
