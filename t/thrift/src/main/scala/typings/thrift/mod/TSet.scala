package typings.thrift.mod

import typings.thrift.mod.Thrift.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSet extends StObject {
  
  var etype: Type
  
  var size: Double
}
object TSet {
  
  inline def apply(etype: Type, size: Double): TSet = {
    val __obj = js.Dynamic.literal(etype = etype.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSet]
  }
  
  extension [Self <: TSet](x: Self) {
    
    inline def setEtype(value: Type): Self = StObject.set(x, "etype", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
