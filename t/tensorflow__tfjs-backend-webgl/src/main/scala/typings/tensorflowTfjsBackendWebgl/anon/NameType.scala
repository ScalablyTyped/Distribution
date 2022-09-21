package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.ivec4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameType extends StObject {
  
  var name: String
  
  var `type`: ivec4
}
object NameType {
  
  inline def apply(name: String): NameType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ivec4")
    __obj.asInstanceOf[NameType]
  }
  
  extension [Self <: NameType](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ivec4): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
