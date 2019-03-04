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
    val __obj = js.Dynamic.literal(_links = _links, description = description, id = id, name = name, state = state, url = url)
  
    __obj.asInstanceOf[TeamProjectCollection]
  }
}

