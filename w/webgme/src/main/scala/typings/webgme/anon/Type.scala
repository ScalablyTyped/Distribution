package typings.webgme.anon

import typings.webgme.webgmeStrings.memory
import typings.webgme.webgmeStrings.mongo
import typings.webgme.webgmeStrings.redis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  /**
    * Type of database to store the data (metadata e.g. _users is always stored in mongo), 
    * can be 'mongo', 'redis' or 'memory'.
    *   config.storage.database.type = 'mongo';
    */
  var `type`: mongo | redis | memory = js.native
}
object Type {
  
  @scala.inline
  def apply(`type`: mongo | redis | memory): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: mongo | redis | memory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
