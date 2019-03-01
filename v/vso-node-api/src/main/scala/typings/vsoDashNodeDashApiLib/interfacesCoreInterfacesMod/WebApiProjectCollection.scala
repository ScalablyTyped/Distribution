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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collectionUrl")(collectionUrl)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebApiProjectCollection]
  }
}

