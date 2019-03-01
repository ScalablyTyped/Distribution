package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiProjectCollectionRef extends js.Object {
  /**
    * Collection Tfs Url (Host Url)
    */
  var collectionUrl: java.lang.String
  /**
    * Collection Guid
    */
  var id: java.lang.String
  /**
    * Collection Name
    */
  var name: java.lang.String
  /**
    * Collection REST Url
    */
  var url: java.lang.String
}

object WebApiProjectCollectionRef {
  @scala.inline
  def apply(
    collectionUrl: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    url: java.lang.String
  ): WebApiProjectCollectionRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collectionUrl")(collectionUrl)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebApiProjectCollectionRef]
  }
}

