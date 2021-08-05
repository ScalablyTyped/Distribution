package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of color materials used in the 3D model. */
trait Printing3DColorMaterialGroup extends StObject {
  
  /** Gets a group of color materials used in the 3D model. */
  var colors: IVector[Printing3DColorMaterial]
  
  /** Gets the identifier (ID) for the color material group. */
  var materialGroupId: Double
}
object Printing3DColorMaterialGroup {
  
  inline def apply(colors: IVector[Printing3DColorMaterial], materialGroupId: Double): Printing3DColorMaterialGroup = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], materialGroupId = materialGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DColorMaterialGroup]
  }
  
  extension [Self <: Printing3DColorMaterialGroup](x: Self) {
    
    inline def setColors(value: IVector[Printing3DColorMaterial]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setMaterialGroupId(value: Double): Self = StObject.set(x, "materialGroupId", value.asInstanceOf[js.Any])
  }
}
