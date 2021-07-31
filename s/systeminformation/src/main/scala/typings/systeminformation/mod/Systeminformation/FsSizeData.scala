package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 5. File System
trait FsSizeData extends StObject {
  
  var fs: String
  
  var mount: String
  
  var size: Double
  
  var `type`: String
  
  var use: Double
  
  var used: Double
}
object FsSizeData {
  
  @scala.inline
  def apply(fs: String, mount: String, size: Double, `type`: String, use: Double, used: Double): FsSizeData = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsSizeData]
  }
  
  @scala.inline
  implicit class FsSizeDataMutableBuilder[Self <: FsSizeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFs(value: String): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMount(value: String): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse(value: Double): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsed(value: Double): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
  }
}
