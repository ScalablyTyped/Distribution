package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionDataCollectionQuery extends StObject {
  
  /**
    * A list of collections to query
    */
  var collections: js.Array[ExtensionDataCollection] = js.native
}
object ExtensionDataCollectionQuery {
  
  @scala.inline
  def apply(collections: js.Array[ExtensionDataCollection]): ExtensionDataCollectionQuery = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDataCollectionQuery]
  }
  
  @scala.inline
  implicit class ExtensionDataCollectionQueryMutableBuilder[Self <: ExtensionDataCollectionQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollections(value: js.Array[ExtensionDataCollection]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionsVarargs(value: ExtensionDataCollection*): Self = StObject.set(x, "collections", js.Array(value :_*))
  }
}
