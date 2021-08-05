package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flags extends StObject {
  
  var flags: Autokeep
  
  var id: Double
  
  var name: java.lang.String
  
  var raw: String
  
  var thresh: Double
  
  var value: Double
  
  var when_failed: java.lang.String
  
  var worst: Double
}
object Flags {
  
  inline def apply(
    flags: Autokeep,
    id: Double,
    name: java.lang.String,
    raw: String,
    thresh: Double,
    value: Double,
    when_failed: java.lang.String,
    worst: Double
  ): Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], thresh = thresh.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], when_failed = when_failed.asInstanceOf[js.Any], worst = worst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  
  extension [Self <: Flags](x: Self) {
    
    inline def setFlags(value: Autokeep): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setThresh(value: Double): Self = StObject.set(x, "thresh", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWhen_failed(value: java.lang.String): Self = StObject.set(x, "when_failed", value.asInstanceOf[js.Any])
    
    inline def setWorst(value: Double): Self = StObject.set(x, "worst", value.asInstanceOf[js.Any])
  }
}
