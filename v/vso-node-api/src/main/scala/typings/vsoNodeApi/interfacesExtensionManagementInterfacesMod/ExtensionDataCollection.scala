package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionDataCollection extends StObject {
  
  /**
    * The name of the collection
    */
  var collectionName: String
  
  /**
    * A list of documents belonging to the collection
    */
  var documents: js.Array[Any]
  
  /**
    * The type of the collection's scope, such as Default or User
    */
  var scopeType: String
  
  /**
    * The value of the collection's scope, such as Current or Me
    */
  var scopeValue: String
}
object ExtensionDataCollection {
  
  inline def apply(collectionName: String, documents: js.Array[Any], scopeType: String, scopeValue: String): ExtensionDataCollection = {
    val __obj = js.Dynamic.literal(collectionName = collectionName.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], scopeType = scopeType.asInstanceOf[js.Any], scopeValue = scopeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDataCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionDataCollection] (val x: Self) extends AnyVal {
    
    inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    inline def setDocuments(value: js.Array[Any]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsVarargs(value: Any*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setScopeType(value: String): Self = StObject.set(x, "scopeType", value.asInstanceOf[js.Any])
    
    inline def setScopeValue(value: String): Self = StObject.set(x, "scopeValue", value.asInstanceOf[js.Any])
  }
}
