package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessFdinfoInotifyFile extends StObject {
  
  var devId: Double
  
  var ignoredMask: Double
  
  var inode: Double
  
  var mask: Double
  
  var wd: Double
}
object ProcessFdinfoInotifyFile {
  
  inline def apply(devId: Double, ignoredMask: Double, inode: Double, mask: Double, wd: Double): ProcessFdinfoInotifyFile = {
    val __obj = js.Dynamic.literal(devId = devId.asInstanceOf[js.Any], ignoredMask = ignoredMask.asInstanceOf[js.Any], inode = inode.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], wd = wd.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessFdinfoInotifyFile]
  }
  
  extension [Self <: ProcessFdinfoInotifyFile](x: Self) {
    
    inline def setDevId(value: Double): Self = StObject.set(x, "devId", value.asInstanceOf[js.Any])
    
    inline def setIgnoredMask(value: Double): Self = StObject.set(x, "ignoredMask", value.asInstanceOf[js.Any])
    
    inline def setInode(value: Double): Self = StObject.set(x, "inode", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setWd(value: Double): Self = StObject.set(x, "wd", value.asInstanceOf[js.Any])
  }
}
