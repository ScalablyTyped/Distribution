package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessFd extends StObject {
  
  var anonInodeType: js.UndefOr[String] = js.undefined
  
  var inode: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var `type`: ProcessFdType
}
object ProcessFd {
  
  inline def apply(`type`: ProcessFdType): ProcessFd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessFd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessFd] (val x: Self) extends AnyVal {
    
    inline def setAnonInodeType(value: String): Self = StObject.set(x, "anonInodeType", value.asInstanceOf[js.Any])
    
    inline def setAnonInodeTypeUndefined: Self = StObject.set(x, "anonInodeType", js.undefined)
    
    inline def setInode(value: Double): Self = StObject.set(x, "inode", value.asInstanceOf[js.Any])
    
    inline def setInodeUndefined: Self = StObject.set(x, "inode", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setType(value: ProcessFdType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
