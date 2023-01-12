package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a color material used in the 3D model. */
trait Printing3DColorMaterial extends StObject {
  
  /** Gets or sets the color of the material. */
  var color: Color
  
  /** Gets or sets the color value of the material. */
  var value: Double
}
object Printing3DColorMaterial {
  
  inline def apply(color: Color, value: Double): Printing3DColorMaterial = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DColorMaterial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Printing3DColorMaterial] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
