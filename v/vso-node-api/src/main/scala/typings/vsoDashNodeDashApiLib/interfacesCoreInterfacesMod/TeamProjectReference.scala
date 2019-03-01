package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamProjectReference extends js.Object {
  /**
    * Project abbreviation.
    */
  var abbreviation: java.lang.String
  /**
    * The project's description (if any).
    */
  var description: java.lang.String
  /**
    * Project identifier.
    */
  var id: java.lang.String
  /**
    * Project name.
    */
  var name: java.lang.String
  /**
    * Project revision.
    */
  var revision: scala.Double
  /**
    * Project state.
    */
  var state: js.Any
  /**
    * Url to the full version of the object.
    */
  var url: java.lang.String
  /**
    * Project visibility.
    */
  var visibility: ProjectVisibility
}

object TeamProjectReference {
  @scala.inline
  def apply(
    abbreviation: java.lang.String,
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    revision: scala.Double,
    state: js.Any,
    url: java.lang.String,
    visibility: ProjectVisibility
  ): TeamProjectReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abbreviation")(abbreviation)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[TeamProjectReference]
  }
}

