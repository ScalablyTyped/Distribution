package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessFdinfoFanotifyMark extends StObject {
  
  var devId: Double
  
  var flags: Double
  
  var ignoredMask: Double
  
  var inode: Double
  
  var mask: Double
}
object ProcessFdinfoFanotifyMark {
  
  inline def apply(devId: Double, flags: Double, ignoredMask: Double, inode: Double, mask: Double): ProcessFdinfoFanotifyMark = {
    val __obj = js.Dynamic.literal(devId = devId.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], ignoredMask = ignoredMask.asInstanceOf[js.Any], inode = inode.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessFdinfoFanotifyMark]
  }
  
  extension [Self <: ProcessFdinfoFanotifyMark](x: Self) {
    
    inline def setDevId(value: Double): Self = StObject.set(x, "devId", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setIgnoredMask(value: Double): Self = StObject.set(x, "ignoredMask", value.asInstanceOf[js.Any])
    
    inline def setInode(value: Double): Self = StObject.set(x, "inode", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
