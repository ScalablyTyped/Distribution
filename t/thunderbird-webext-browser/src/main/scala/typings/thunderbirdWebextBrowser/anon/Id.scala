package typings.thunderbirdWebextBrowser.anon

import typings.thunderbirdWebextBrowser.messenger.compose.UndefinedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  /**
    * The ID of a contact or mailing list from the
    * [contacts](https://webextension-api.thunderbird.net/en/stable/contacts.html)
    * and
    * [mailingLists](https://webextension-api.thunderbird.net/en/stable/mailingLists.html)
    * APIs.
    */
  var id: String
  
  /** Which sort of object this ID is for. */
  var `type`: UndefinedType
}
object Id {
  
  inline def apply(id: String, `type`: UndefinedType): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: UndefinedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
