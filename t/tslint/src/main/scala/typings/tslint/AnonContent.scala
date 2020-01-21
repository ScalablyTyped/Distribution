package typings.tslint

import typings.tslint.tagExclusionMod.IContentTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: IContentTags
  var existence: js.Array[String]
}

object AnonContent {
  @scala.inline
  def apply(content: IContentTags, existence: js.Array[String]): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], existence = existence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContent]
  }
}

