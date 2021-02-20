package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApiProjectCollectionRef extends StObject {
  
  /**
    * Collection Tfs Url (Host Url)
    */
  var collectionUrl: String = js.native
  
  /**
    * Collection Guid
    */
  var id: String = js.native
  
  /**
    * Collection Name
    */
  var name: String = js.native
  
  /**
    * Collection REST Url
    */
  var url: String = js.native
}
object WebApiProjectCollectionRef {
  
  @scala.inline
  def apply(collectionUrl: String, id: String, name: String, url: String): WebApiProjectCollectionRef = {
    val __obj = js.Dynamic.literal(collectionUrl = collectionUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiProjectCollectionRef]
  }
  
  @scala.inline
  implicit class WebApiProjectCollectionRefMutableBuilder[Self <: WebApiProjectCollectionRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionUrl(value: String): Self = StObject.set(x, "collectionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
