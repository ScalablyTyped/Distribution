package typings.thunderbirdWebextBrowser.messenger

import typings.thunderbirdWebextBrowser.messenger.contacts.ContactNode
import typings.thunderbirdWebextBrowser.messenger.mailingLists.MailingListNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressBooks {
  
  trait AddressBookNode extends StObject {
    
    /** A list of contacts held by this node's address book or mailing list. */
    var contacts: js.UndefOr[js.Array[ContactNode]] = js.undefined
    
    /**
      * The unique identifier for the node. IDs are unique within the current
      * profile, and they remain valid even after the program is restarted.
      */
    var id: String
    
    /** A list of mailingLists in this node's address book. */
    var mailingLists: js.UndefOr[js.Array[MailingListNode]] = js.undefined
    
    var name: String
    
    /** The `id` of the parent object. */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** Indicates if the object is read-only. */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Indicates if the address book is accessed via remote look-up. */
    var remote: js.UndefOr[Boolean] = js.undefined
    
    /** Always set to `addressBook`. */
    var `type`: NodeType
  }
  object AddressBookNode {
    
    inline def apply(id: String, name: String, `type`: NodeType): AddressBookNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressBookNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddressBookNode] (val x: Self) extends AnyVal {
      
      inline def setContacts(value: js.Array[ContactNode]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
      
      inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
      
      inline def setContactsVarargs(value: ContactNode*): Self = StObject.set(x, "contacts", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMailingLists(value: js.Array[MailingListNode]): Self = StObject.set(x, "mailingLists", value.asInstanceOf[js.Any])
      
      inline def setMailingListsUndefined: Self = StObject.set(x, "mailingLists", js.undefined)
      
      inline def setMailingListsVarargs(value: MailingListNode*): Self = StObject.set(x, "mailingLists", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateProperties extends StObject {
    
    var name: String
  }
  object CreateProperties {
    
    inline def apply(name: String): CreateProperties = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateProperties] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.addressBook
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.contact
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.mailingList
  */
  trait NodeType extends StObject
  object NodeType {
    
    inline def addressBook: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.addressBook = "addressBook".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.addressBook]
    
    inline def contact: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.contact = "contact".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.contact]
    
    inline def mailingList: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.mailingList = "mailingList".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.mailingList]
  }
  
  trait UpdateProperties extends StObject {
    
    var name: String
  }
  object UpdateProperties {
    
    inline def apply(name: String): UpdateProperties = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateProperties] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  object provider {
    
    type AddressBookNode = Any
    
    trait AddressBooksProviderOnSearchRequestEvent[TCallback] extends StObject {
      
      def addListener(cb: TCallback, parameters: OnSearchRequestParameters): Unit
      
      def hasListener(cb: TCallback): Boolean
      
      def removeListener(cb: TCallback): Unit
    }
    object AddressBooksProviderOnSearchRequestEvent {
      
      inline def apply[TCallback](
        addListener: (TCallback, OnSearchRequestParameters) => Unit,
        hasListener: TCallback => Boolean,
        removeListener: TCallback => Unit
      ): AddressBooksProviderOnSearchRequestEvent[TCallback] = {
        val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
        __obj.asInstanceOf[AddressBooksProviderOnSearchRequestEvent[TCallback]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AddressBooksProviderOnSearchRequestEvent[?], TCallback] (val x: Self & AddressBooksProviderOnSearchRequestEvent[TCallback]) extends AnyVal {
        
        inline def setAddListener(value: (TCallback, OnSearchRequestParameters) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
        
        inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
        
        inline def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
      }
    }
    
    trait OnSearchRequestParameters extends StObject {
      
      /** The name of the created address book. */
      var addressBookName: js.UndefOr[String] = js.undefined
      
      /**
        * The unique ID of the created address book. If several listeners have
        * been added, the `id` allows to identify which address book initiated
        * the search request. If not provided, a unique ID will be generated for
        * you.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * Whether the address book search queries are using encrypted protocols
        * like HTTPS.
        */
      var isSecure: js.UndefOr[Boolean] = js.undefined
    }
    object OnSearchRequestParameters {
      
      inline def apply(): OnSearchRequestParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OnSearchRequestParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OnSearchRequestParameters] (val x: Self) extends AnyVal {
        
        inline def setAddressBookName(value: String): Self = StObject.set(x, "addressBookName", value.asInstanceOf[js.Any])
        
        inline def setAddressBookNameUndefined: Self = StObject.set(x, "addressBookName", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
        
        inline def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
      }
    }
  }
}
