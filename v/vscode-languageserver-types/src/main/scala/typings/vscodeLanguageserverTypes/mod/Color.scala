package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  /**
    * The alpha component of this color in the range [0-1].
    */
  val alpha: decimal
  
  /**
    * The blue component of this color in the range [0-1].
    */
  val blue: decimal
  
  /**
    * The green component of this color in the range [0-1].
    */
  val green: decimal
  
  /**
    * The red component of this color in the range [0-1].
    */
  val red: decimal
}
object Color {
  
  inline def apply(alpha: decimal, blue: decimal, green: decimal, red: decimal): Color = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @JSImport("vscode-languageserver-types", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Color literal.
    */
  inline def create(red: decimal, green: decimal, blue: decimal, alpha: decimal): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Checks whether the given literal conforms to the [Color](#Color) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.Color */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Color */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: decimal): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setBlue(value: decimal): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: decimal): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setRed(value: decimal): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
  }
}
