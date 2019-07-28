package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionTemplate extends js.Object {
  /**
    * Indicates whether the template can be deleted.
    */
  var canDelete: Boolean
  /**
    * The template category.
    */
  var category: String
  /**
    * A description of the template.
    */
  var description: String
  /**
    * The ID of the task whose icon is used when showing this template in the UI.
    */
  var iconTaskId: String
  var icons: StringDictionary[String]
  /**
    * The ID of the template.
    */
  var id: String
  /**
    * The name of the template.
    */
  var name: String
  /**
    * The actual template.
    */
  var template: BuildDefinition
}

object BuildDefinitionTemplate {
  @scala.inline
  def apply(
    canDelete: Boolean,
    category: String,
    description: String,
    iconTaskId: String,
    icons: StringDictionary[String],
    id: String,
    name: String,
    template: BuildDefinition
  ): BuildDefinitionTemplate = {
    val __obj = js.Dynamic.literal(canDelete = canDelete, category = category, description = description, iconTaskId = iconTaskId, icons = icons, id = id, name = name, template = template)
  
    __obj.asInstanceOf[BuildDefinitionTemplate]
  }
}

