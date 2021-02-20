package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FsOpenFilesData extends StObject {
  
  var allocated: Double = js.native
  
  var available: Double = js.native
  
  var max: Double = js.native
}
object FsOpenFilesData {
  
  @scala.inline
  def apply(allocated: Double, available: Double, max: Double): FsOpenFilesData = {
    val __obj = js.Dynamic.literal(allocated = allocated.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsOpenFilesData]
  }
  
  @scala.inline
  implicit class FsOpenFilesDataMutableBuilder[Self <: FsOpenFilesData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocated(value: Double): Self = StObject.set(x, "allocated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
