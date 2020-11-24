package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApiProjectCollectionRef extends js.Object {
  
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
  implicit class WebApiProjectCollectionRefOps[Self <: WebApiProjectCollectionRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollectionUrl(value: String): Self = this.set("collectionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
