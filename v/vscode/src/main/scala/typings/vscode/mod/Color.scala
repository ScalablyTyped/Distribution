package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "Color")
@js.native
class Color protected () extends StObject {
  /**
    * Creates a new color instance.
    *
    * @param red The red component.
    * @param green The green component.
    * @param blue The blue component.
    * @param alpha The alpha component.
    */
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  
  /**
    * The alpha component of this color in the range [0-1].
    */
  val alpha: Double = js.native
  
  /**
    * The blue component of this color in the range [0-1].
    */
  val blue: Double = js.native
  
  /**
    * The green component of this color in the range [0-1].
    */
  val green: Double = js.native
  
  /**
    * The red component of this color in the range [0-1].
    */
  val red: Double = js.native
}
