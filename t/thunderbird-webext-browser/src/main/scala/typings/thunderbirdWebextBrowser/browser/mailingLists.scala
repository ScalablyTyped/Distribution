package typings.thunderbirdWebextBrowser.browser

import typings.thunderbirdWebextBrowser.browser.addressBooks.NodeType
import typings.thunderbirdWebextBrowser.browser.contacts.ContactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailingLists {
  
  trait CreateProperties extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var nickName: js.UndefOr[String] = js.undefined
  }
  object CreateProperties {
    
    inline def apply(name: String): CreateProperties = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateProperties] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNickName(value: String): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
      
      inline def setNickNameUndefined: Self = StObject.set(x, "nickName", js.undefined)
    }
  }
  
  trait MailingListNode extends StObject {
    
    /** A list of contacts held by this node's address book or mailing list. */
    var contacts: js.UndefOr[js.Array[ContactNode]] = js.undefined
    
    var description: String
    
    /**
      * The unique identifier for the node. IDs are unique within the current
      * profile, and they remain valid even after the program is restarted.
      */
    var id: String
    
    var name: String
    
    var nickName: String
    
    /** The `id` of the parent object. */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** Indicates if the object is read-only. */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Indicates if the object came from a remote address book. */
    var remote: js.UndefOr[Boolean] = js.undefined
    
    /** Always set to `mailingList`. */
    var `type`: NodeType
  }
  object MailingListNode {
    
    inline def apply(description: String, id: String, name: String, nickName: String, `type`: NodeType): MailingListNode = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickName = nickName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailingListNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MailingListNode] (val x: Self) extends AnyVal {
      
      inline def setContacts(value: js.Array[ContactNode]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
      
      inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
      
      inline def setContactsVarargs(value: ContactNode*): Self = StObject.set(x, "contacts", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNickName(value: String): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateProperties extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var nickName: js.UndefOr[String] = js.undefined
  }
  object UpdateProperties {
    
    inline def apply(name: String): UpdateProperties = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateProperties] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNickName(value: String): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
      
      inline def setNickNameUndefined: Self = StObject.set(x, "nickName", js.undefined)
    }
  }
}
