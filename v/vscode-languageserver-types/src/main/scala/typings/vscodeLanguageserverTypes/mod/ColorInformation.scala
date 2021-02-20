package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorInformation extends StObject {
  
  /**
    * The actual color value for this color range.
    */
  var color: Color = js.native
  
  /**
    * The range in the document where this color appers.
    */
  var range: Range = js.native
}
object ColorInformation {
  
  @scala.inline
  def apply(color: Color, range: Range): ColorInformation = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorInformation]
  }
  
  /**
    * Creates a new ColorInformation literal.
    */
  @JSImport("vscode-languageserver-types", "ColorInformation.create")
  @js.native
  def create(range: Range, color: Color): ColorInformation = js.native
  
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  @JSImport("vscode-languageserver-types", "ColorInformation.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorInformation */ Boolean = js.native
  
  @scala.inline
  implicit class ColorInformationMutableBuilder[Self <: ColorInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
