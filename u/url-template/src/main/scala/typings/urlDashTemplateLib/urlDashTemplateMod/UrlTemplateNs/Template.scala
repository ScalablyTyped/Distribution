package typings
package urlDashTemplateLib.urlDashTemplateMod.UrlTemplateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  def expand(parameters: js.Any): java.lang.String
}

object Template {
  @scala.inline
  def apply(expand: js.Function1[js.Any, java.lang.String]): Template = {
    val __obj = js.Dynamic.literal(expand = expand)
  
    __obj.asInstanceOf[Template]
  }
}

