package typings.surveyDashKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerContent extends js.Object {
  var container: String
  var content: String
  var description: String
  var icon: String
  var iconExpanded: String
  var title: String
  var titleExpandable: String
}

object Anon_ContainerContent {
  @scala.inline
  def apply(
    container: String,
    content: String,
    description: String,
    icon: String,
    iconExpanded: String,
    title: String,
    titleExpandable: String
  ): Anon_ContainerContent = {
    val __obj = js.Dynamic.literal(container = container, content = content, description = description, icon = icon, iconExpanded = iconExpanded, title = title, titleExpandable = titleExpandable)
  
    __obj.asInstanceOf[Anon_ContainerContent]
  }
}

