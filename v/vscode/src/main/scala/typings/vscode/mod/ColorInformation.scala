package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "ColorInformation")
@js.native
class ColorInformation protected () extends StObject {
  /**
    * Creates a new color range.
    *
    * @param range The range the color appears in. Must not be empty.
    * @param color The value of the color.
    * @param format The format in which this color is currently formatted.
    */
  def this(range: Range, color: Color) = this()
  
  /**
    * The actual color value for this color range.
    */
  var color: Color = js.native
  
  /**
    * The range in the document where this color appears.
    */
  var range: Range = js.native
}
