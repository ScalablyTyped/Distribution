package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.ivec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameType extends StObject {
  
  var name: String
  
  var `type`: ivec2
}
object NameType {
  
  inline def apply(name: String): NameType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ivec2")
    __obj.asInstanceOf[NameType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameType] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ivec2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
