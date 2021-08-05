package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the base material used for manufacturing certain objects in the 3D model. */
trait Printing3DBaseMaterial extends StObject {
  
  /** Gets or sets the color of the base material. */
  var color: Printing3DColorMaterial
  
  /** Gets or sets the name of the base material. */
  var name: String
}
object Printing3DBaseMaterial {
  
  inline def apply(color: Printing3DColorMaterial, name: String): Printing3DBaseMaterial = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DBaseMaterial]
  }
  
  extension [Self <: Printing3DBaseMaterial](x: Self) {
    
    inline def setColor(value: Printing3DColorMaterial): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
