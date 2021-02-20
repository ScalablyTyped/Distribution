package typings.webgme.Gme

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Project extends StObject {
  
  var branches: StringDictionary[String] = js.native
  
  var delete: Boolean = js.native
  
  var name: String = js.native
  
  /** should always be true */
  var read: Boolean = js.native
  
  var write: Boolean = js.native
}
object Project {
  
  @scala.inline
  def apply(branches: StringDictionary[String], delete: Boolean, name: String, read: Boolean, write: Boolean): Project = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
  
  @scala.inline
  implicit class ProjectMutableBuilder[Self <: Project] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranches(value: StringDictionary[String]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
  }
}
