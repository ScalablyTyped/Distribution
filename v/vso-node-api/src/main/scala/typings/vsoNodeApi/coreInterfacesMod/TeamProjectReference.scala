package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamProjectReference extends js.Object {
  /**
    * Project abbreviation.
    */
  var abbreviation: String
  /**
    * The project's description (if any).
    */
  var description: String
  /**
    * Project identifier.
    */
  var id: String
  /**
    * Project name.
    */
  var name: String
  /**
    * Project revision.
    */
  var revision: Double
  /**
    * Project state.
    */
  var state: js.Any
  /**
    * Url to the full version of the object.
    */
  var url: String
  /**
    * Project visibility.
    */
  var visibility: ProjectVisibility
}

object TeamProjectReference {
  @scala.inline
  def apply(
    abbreviation: String,
    description: String,
    id: String,
    name: String,
    revision: Double,
    state: js.Any,
    url: String,
    visibility: ProjectVisibility
  ): TeamProjectReference = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamProjectReference]
  }
}

