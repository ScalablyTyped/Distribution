package typings.webscreensWindowPlacement

import typings.std.PermissionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permissions extends StObject {
  
  def query(permissionDesc: PermissionDescriptorWithWindowPlacement): js.Promise[PermissionStatus]
}
object Permissions {
  
  inline def apply(query: PermissionDescriptorWithWindowPlacement => js.Promise[PermissionStatus]): Permissions = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[Permissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Permissions] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PermissionDescriptorWithWindowPlacement => js.Promise[PermissionStatus]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
  }
}
