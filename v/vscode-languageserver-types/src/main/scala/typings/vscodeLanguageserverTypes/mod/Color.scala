package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  /**
    * The alpha component of this color in the range [0-1].
    */
  val alpha: Double
  
  /**
    * The blue component of this color in the range [0-1].
    */
  val blue: Double
  
  /**
    * The green component of this color in the range [0-1].
    */
  val green: Double
  
  /**
    * The red component of this color in the range [0-1].
    */
  val red: Double
}
object Color {
  
  inline def apply(alpha: Double, blue: Double, green: Double, red: Double): Color = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @JSImport("vscode-languageserver-types", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Color literal.
    */
  inline def create(red: Double, green: Double, blue: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /**
    * Checks whether the given literal conforms to the [Color](#Color) interface.
    */
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Color */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Color */ Boolean]
  
  extension [Self <: Color](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
  }
}
