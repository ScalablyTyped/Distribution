package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionTemplate3_2 extends js.Object {
  var canDelete: scala.Boolean
  var category: java.lang.String
  var description: java.lang.String
  var iconTaskId: java.lang.String
  var icons: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var id: java.lang.String
  var name: java.lang.String
  var template: BuildDefinition3_2
}

object BuildDefinitionTemplate3_2 {
  @scala.inline
  def apply(
    canDelete: scala.Boolean,
    category: java.lang.String,
    description: java.lang.String,
    iconTaskId: java.lang.String,
    icons: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    id: java.lang.String,
    name: java.lang.String,
    template: BuildDefinition3_2
  ): BuildDefinitionTemplate3_2 = {
    val __obj = js.Dynamic.literal(canDelete = canDelete, category = category, description = description, iconTaskId = iconTaskId, icons = icons, id = id, name = name, template = template)
  
    __obj.asInstanceOf[BuildDefinitionTemplate3_2]
  }
}

