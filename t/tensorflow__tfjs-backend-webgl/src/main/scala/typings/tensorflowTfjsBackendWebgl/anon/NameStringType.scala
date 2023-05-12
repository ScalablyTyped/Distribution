package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameStringType extends StObject {
  
  var name: String
  
  var `type`: int
}
object NameStringType {
  
  inline def apply(name: String): NameStringType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("int")
    __obj.asInstanceOf[NameStringType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameStringType] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: int): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
