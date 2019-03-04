package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiProjectCollection extends WebApiProjectCollectionRef {
  /**
    * Project collection description
    */
  var description: java.lang.String
  /**
    * Project collection state
    */
  var state: java.lang.String
}

object WebApiProjectCollection {
  @scala.inline
  def apply(
    collectionUrl: java.lang.String,
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    state: java.lang.String,
    url: java.lang.String
  ): WebApiProjectCollection = {
    val __obj = js.Dynamic.literal(collectionUrl = collectionUrl, description = description, id = id, name = name, state = state, url = url)
  
    __obj.asInstanceOf[WebApiProjectCollection]
  }
}

