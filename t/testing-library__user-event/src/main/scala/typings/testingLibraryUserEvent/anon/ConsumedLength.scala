package typings.testingLibraryUserEvent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumedLength extends StObject {
  
  var consumedLength: Double
  
  var descriptor: String
  
  var releasePrevious: Boolean
  
  var releaseSelf: js.UndefOr[Boolean] = js.undefined
  
  var repeat: Double
  
  var `type`: String
}
object ConsumedLength {
  
  inline def apply(
    consumedLength: Double,
    descriptor: String,
    releasePrevious: Boolean,
    repeat: Double,
    `type`: String
  ): ConsumedLength = {
    val __obj = js.Dynamic.literal(consumedLength = consumedLength.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], releasePrevious = releasePrevious.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumedLength]
  }
  
  extension [Self <: ConsumedLength](x: Self) {
    
    inline def setConsumedLength(value: Double): Self = StObject.set(x, "consumedLength", value.asInstanceOf[js.Any])
    
    inline def setDescriptor(value: String): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setReleasePrevious(value: Boolean): Self = StObject.set(x, "releasePrevious", value.asInstanceOf[js.Any])
    
    inline def setReleaseSelf(value: Boolean): Self = StObject.set(x, "releaseSelf", value.asInstanceOf[js.Any])
    
    inline def setReleaseSelfUndefined: Self = StObject.set(x, "releaseSelf", js.undefined)
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
