package typings.vsoNodeApi.coreInterfacesMod

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
  var description: String
  /**
    * Project collection state.
    */
  var state: String
}

object TeamProjectCollection {
  @scala.inline
  def apply(_links: js.Any, description: String, id: String, name: String, state: String, url: String): TeamProjectCollection = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamProjectCollection]
  }
}

