package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FsOpenFilesData extends StObject {
  
  var allocated: Double
  
  var available: Double
  
  var max: Double
}
object FsOpenFilesData {
  
  inline def apply(allocated: Double, available: Double, max: Double): FsOpenFilesData = {
    val __obj = js.Dynamic.literal(allocated = allocated.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsOpenFilesData]
  }
  
  extension [Self <: FsOpenFilesData](x: Self) {
    
    inline def setAllocated(value: Double): Self = StObject.set(x, "allocated", value.asInstanceOf[js.Any])
    
    inline def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
