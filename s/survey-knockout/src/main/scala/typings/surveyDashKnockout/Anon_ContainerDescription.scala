package typings.surveyDashKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerDescription extends js.Object {
  var container: String
  var description: String
  var icon: String
  var iconExpanded: String
  var title: String
  var titleExpandable: String
}

object Anon_ContainerDescription {
  @scala.inline
  def apply(
    container: String,
    description: String,
    icon: String,
    iconExpanded: String,
    title: String,
    titleExpandable: String
  ): Anon_ContainerDescription = {
    val __obj = js.Dynamic.literal(container = container, description = description, icon = icon, iconExpanded = iconExpanded, title = title, titleExpandable = titleExpandable)
  
    __obj.asInstanceOf[Anon_ContainerDescription]
  }
}

