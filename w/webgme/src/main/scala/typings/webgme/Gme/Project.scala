package typings.webgme.Gme

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Project extends StObject {
  
  var branches: StringDictionary[String]
  
  var delete: Boolean
  
  var name: String
  
  /** should always be true */
  var read: Boolean
  
  var write: Boolean
}
object Project {
  
  inline def apply(branches: StringDictionary[String], delete: Boolean, name: String, read: Boolean, write: Boolean): Project = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Project] (val x: Self) extends AnyVal {
    
    inline def setBranches(value: StringDictionary[String]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
  }
}
