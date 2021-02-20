package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pathname extends StObject {
  
  var pathname: String = js.native
  
  var search: String = js.native
}
object Pathname {
  
  @scala.inline
  def apply(pathname: String, search: String): Pathname = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pathname]
  }
  
  @scala.inline
  implicit class PathnameMutableBuilder[Self <: Pathname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
