package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a composite material that's defined by a mixture of base materials. */
trait Printing3DCompositeMaterial extends StObject {
  
  /** Gets the mixture of base materials used in the composite material. Each mixture is defined by listing the proportion of the overall mixture for each base material (values between 0 and 1). */
  var values: IVector[Double]
}
object Printing3DCompositeMaterial {
  
  inline def apply(values: IVector[Double]): Printing3DCompositeMaterial = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DCompositeMaterial]
  }
  
  extension [Self <: Printing3DCompositeMaterial](x: Self) {
    
    inline def setValues(value: IVector[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
