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
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconExpanded = iconExpanded.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleExpandable = titleExpandable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContainerContent]
  }
}

