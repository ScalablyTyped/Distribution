package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionTemplate extends js.Object {
  /**
    * Indicates whether the template can be deleted.
    */
  var canDelete: scala.Boolean
  /**
    * The template category.
    */
  var category: java.lang.String
  /**
    * A description of the template.
    */
  var description: java.lang.String
  /**
    * The ID of the task whose icon is used when showing this template in the UI.
    */
  var iconTaskId: java.lang.String
  var icons: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The ID of the template.
    */
  var id: java.lang.String
  /**
    * The name of the template.
    */
  var name: java.lang.String
  /**
    * The actual template.
    */
  var template: BuildDefinition
}

object BuildDefinitionTemplate {
  @scala.inline
  def apply(
    canDelete: scala.Boolean,
    category: java.lang.String,
    description: java.lang.String,
    iconTaskId: java.lang.String,
    icons: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    id: java.lang.String,
    name: java.lang.String,
    template: BuildDefinition
  ): BuildDefinitionTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canDelete")(canDelete)
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("iconTaskId")(iconTaskId)
    __obj.updateDynamic("icons")(icons)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[BuildDefinitionTemplate]
  }
}

