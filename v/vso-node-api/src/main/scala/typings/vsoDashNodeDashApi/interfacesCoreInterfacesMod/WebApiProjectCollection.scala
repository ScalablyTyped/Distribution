package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiProjectCollection extends WebApiProjectCollectionRef {
  /**
    * Project collection description
    */
  var description: String
  /**
    * Project collection state
    */
  var state: String
}

object WebApiProjectCollection {
  @scala.inline
  def apply(collectionUrl: String, description: String, id: String, name: String, state: String, url: String): WebApiProjectCollection = {
    val __obj = js.Dynamic.literal(collectionUrl = collectionUrl, description = description, id = id, name = name, state = state, url = url)
  
    __obj.asInstanceOf[WebApiProjectCollection]
  }
}

