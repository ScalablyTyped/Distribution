package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUColorDict extends StObject {
  
  /**
    * The alpha channel value
    */
  var a: Double
  
  /**
    * The blue channel value
    */
  var b: Double
  
  /**
    * The green channel value
    */
  var g: Double
  
  /**
    * The red channel value
    */
  var r: Double
}
object GPUColorDict {
  
  inline def apply(a: Double, b: Double, g: Double, r: Double): GPUColorDict = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUColorDict]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUColorDict] (val x: Self) extends AnyVal {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
