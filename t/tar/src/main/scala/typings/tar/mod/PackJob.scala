package typings.tar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackJob extends StObject {
  
  var absolute: String
  
  var entry: Any | Null
  
  var ignore: Boolean
  
  var path: String
  
  var pending: Boolean
  
  var piped: Boolean
  
  var readdir: Any | Null
  
  var stat: Any | Null
}
object PackJob {
  
  inline def apply(absolute: String, ignore: Boolean, path: String, pending: Boolean, piped: Boolean): PackJob = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], piped = piped.asInstanceOf[js.Any], entry = null, readdir = null, stat = null)
    __obj.asInstanceOf[PackJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackJob] (val x: Self) extends AnyVal {
    
    inline def setAbsolute(value: String): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    inline def setEntry(value: Any): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryNull: Self = StObject.set(x, "entry", null)
    
    inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPiped(value: Boolean): Self = StObject.set(x, "piped", value.asInstanceOf[js.Any])
    
    inline def setReaddir(value: Any): Self = StObject.set(x, "readdir", value.asInstanceOf[js.Any])
    
    inline def setReaddirNull: Self = StObject.set(x, "readdir", null)
    
    inline def setStat(value: Any): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    
    inline def setStatNull: Self = StObject.set(x, "stat", null)
  }
}
