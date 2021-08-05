package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorInformation extends StObject {
  
  /**
    * The actual color value for this color range.
    */
  var color: Color
  
  /**
    * The range in the document where this color appers.
    */
  var range: Range
}
object ColorInformation {
  
  inline def apply(color: Color, range: Range): ColorInformation = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorInformation]
  }
  
  @JSImport("vscode-languageserver-types", "ColorInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ColorInformation literal.
    */
  inline def create(range: Range, color: Color): ColorInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ColorInformation]
  
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorInformation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.ColorInformation */ Boolean]
  
  extension [Self <: ColorInformation](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
