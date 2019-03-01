package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamProjectCollection extends TeamProjectCollectionReference {
  /**
    * The links to other objects related to this object.
    */
  var _links: js.Any
  /**
    * Project collection description.
    */
  var description: java.lang.String
  /**
    * Project collection state.
    */
  var state: java.lang.String
}

object TeamProjectCollection {
  @scala.inline
  def apply(
    _links: js.Any,
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    state: java.lang.String,
    url: java.lang.String
  ): TeamProjectCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TeamProjectCollection]
  }
}

