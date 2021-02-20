package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends StObject {
  
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
object Color {
  
  @scala.inline
  def apply(alpha: Double, blue: Double, green: Double, red: Double): Color = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  /**
    * Creates a new Color literal.
    */
  @JSImport("vscode-languageserver-types", "Color.create")
  @js.native
  def create(red: Double, green: Double, blue: Double, alpha: Double): Color = js.native
  
  /**
    * Checks whether the given literal conforms to the [Color](#Color) interface.
    */
  @JSImport("vscode-languageserver-types", "Color.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Color */ Boolean = js.native
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
  }
}
