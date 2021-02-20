package typings.webgme.anon

import typings.webgme.v1Mod.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Guid extends StObject {
  
  var guid: GUID = js.native
  
  var path: String = js.native
}
object Guid {
  
  @scala.inline
  def apply(guid: GUID, path: String): Guid = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guid]
  }
  
  @scala.inline
  implicit class GuidMutableBuilder[Self <: Guid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuid(value: GUID): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
