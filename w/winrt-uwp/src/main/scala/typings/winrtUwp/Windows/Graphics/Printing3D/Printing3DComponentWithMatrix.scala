package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Numerics.Matrix4x4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a 3D Manufacturing Format (3MF) component that's applied to the object definition with a matrix transform. */
trait Printing3DComponentWithMatrix extends StObject {
  
  /** Gets or sets the 3D Manufacturing Format (3MF) primitive component that's applied to the object definition with a matrix transform. */
  var component: Printing3DComponent
  
  /** Gets or sets the matrix transform that's applied to the 3D Manufacturing Format (3MF) primitive component. */
  var matrix: Matrix4x4
}
object Printing3DComponentWithMatrix {
  
  inline def apply(component: Printing3DComponent, matrix: Matrix4x4): Printing3DComponentWithMatrix = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DComponentWithMatrix]
  }
  
  extension [Self <: Printing3DComponentWithMatrix](x: Self) {
    
    inline def setComponent(value: Printing3DComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: Matrix4x4): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
  }
}
