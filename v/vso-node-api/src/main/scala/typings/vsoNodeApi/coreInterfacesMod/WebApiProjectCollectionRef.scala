package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiProjectCollectionRef extends js.Object {
  /**
    * Collection Tfs Url (Host Url)
    */
  var collectionUrl: String
  /**
    * Collection Guid
    */
  var id: String
  /**
    * Collection Name
    */
  var name: String
  /**
    * Collection REST Url
    */
  var url: String
}

object WebApiProjectCollectionRef {
  @scala.inline
  def apply(collectionUrl: String, id: String, name: String, url: String): WebApiProjectCollectionRef = {
    val __obj = js.Dynamic.literal(collectionUrl = collectionUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiProjectCollectionRef]
  }
}

