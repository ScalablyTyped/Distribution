package typings.thunderbirdWebextBrowser.browser

import org.scalablytyped.runtime.StringDictionary
import typings.thunderbirdWebextBrowser.anon.NewValue
import typings.thunderbirdWebextBrowser.browser.addressBooks.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contacts {
  
  trait ContactNode extends StObject {
    
    /**
      * The unique identifier for the node. IDs are unique within the current
      * profile, and they remain valid even after the program is restarted.
      */
    var id: String
    
    /** The `id` of the parent object. */
    var parentId: js.UndefOr[String] = js.undefined
    
    var properties: ContactProperties
    
    /** Indicates if the object is read-only. */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Indicates if the object came from a remote address book. */
    var remote: js.UndefOr[Boolean] = js.undefined
    
    /** Always set to `contact`. */
    var `type`: NodeType
  }
  object ContactNode {
    
    inline def apply(id: String, properties: ContactProperties, `type`: NodeType): ContactNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContactNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContactNode] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setProperties(value: ContactProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ContactProperties = StringDictionary[String | Null]
  
  type PropertyChange = StringDictionary[NewValue]
  
  trait QueryInfo extends StObject {
    
    /** Whether to include results from local address books. Defaults to true. */
    var includeLocal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to include results from read-only address books. Defaults to
      * true.
      */
    var includeReadOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to include results from read-write address books. Defaults to
      * true.
      */
    var includeReadWrite: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to include results from remote address books. Defaults to
      * true.
      */
    var includeRemote: js.UndefOr[Boolean] = js.undefined
    
    /** One or more space-separated terms to search for. */
    var searchString: js.UndefOr[String] = js.undefined
  }
  object QueryInfo {
    
    inline def apply(): QueryInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryInfo] (val x: Self) extends AnyVal {
      
      inline def setIncludeLocal(value: Boolean): Self = StObject.set(x, "includeLocal", value.asInstanceOf[js.Any])
      
      inline def setIncludeLocalUndefined: Self = StObject.set(x, "includeLocal", js.undefined)
      
      inline def setIncludeReadOnly(value: Boolean): Self = StObject.set(x, "includeReadOnly", value.asInstanceOf[js.Any])
      
      inline def setIncludeReadOnlyUndefined: Self = StObject.set(x, "includeReadOnly", js.undefined)
      
      inline def setIncludeReadWrite(value: Boolean): Self = StObject.set(x, "includeReadWrite", value.asInstanceOf[js.Any])
      
      inline def setIncludeReadWriteUndefined: Self = StObject.set(x, "includeReadWrite", js.undefined)
      
      inline def setIncludeRemote(value: Boolean): Self = StObject.set(x, "includeRemote", value.asInstanceOf[js.Any])
      
      inline def setIncludeRemoteUndefined: Self = StObject.set(x, "includeRemote", js.undefined)
      
      inline def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
      
      inline def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
    }
  }
}
