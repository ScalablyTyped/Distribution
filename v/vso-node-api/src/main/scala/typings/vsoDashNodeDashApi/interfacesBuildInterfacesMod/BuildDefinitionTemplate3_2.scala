package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionTemplate3_2 extends js.Object {
  var canDelete: Boolean
  var category: String
  var description: String
  var iconTaskId: String
  var icons: StringDictionary[String]
  var id: String
  var name: String
  var template: BuildDefinition3_2
}

object BuildDefinitionTemplate3_2 {
  @scala.inline
  def apply(
    canDelete: Boolean,
    category: String,
    description: String,
    iconTaskId: String,
    icons: StringDictionary[String],
    id: String,
    name: String,
    template: BuildDefinition3_2
  ): BuildDefinitionTemplate3_2 = {
    val __obj = js.Dynamic.literal(canDelete = canDelete.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], iconTaskId = iconTaskId.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildDefinitionTemplate3_2]
  }
}

