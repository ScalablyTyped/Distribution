package typings.tensorflowTfjsLayers.distInitializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstantArgs extends StObject {
  
  /** The value for each element in the variable. */
  var value: Double
}
object ConstantArgs {
  
  inline def apply(value: Double): ConstantArgs = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstantArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConstantArgs] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
