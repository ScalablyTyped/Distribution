package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionDataCollection extends StObject {
  
  /**
    * The name of the collection
    */
  var collectionName: String = js.native
  
  /**
    * A list of documents belonging to the collection
    */
  var documents: js.Array[_] = js.native
  
  /**
    * The type of the collection's scope, such as Default or User
    */
  var scopeType: String = js.native
  
  /**
    * The value of the collection's scope, such as Current or Me
    */
  var scopeValue: String = js.native
}
object ExtensionDataCollection {
  
  @scala.inline
  def apply(collectionName: String, documents: js.Array[_], scopeType: String, scopeValue: String): ExtensionDataCollection = {
    val __obj = js.Dynamic.literal(collectionName = collectionName.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], scopeType = scopeType.asInstanceOf[js.Any], scopeValue = scopeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDataCollection]
  }
  
  @scala.inline
  implicit class ExtensionDataCollectionMutableBuilder[Self <: ExtensionDataCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocuments(value: js.Array[_]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsVarargs(value: js.Any*): Self = StObject.set(x, "documents", js.Array(value :_*))
    
    @scala.inline
    def setScopeType(value: String): Self = StObject.set(x, "scopeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeValue(value: String): Self = StObject.set(x, "scopeValue", value.asInstanceOf[js.Any])
  }
}
