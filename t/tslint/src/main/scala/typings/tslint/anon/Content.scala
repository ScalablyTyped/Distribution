package typings.tslint.anon

import typings.tslint.tagExclusionMod.IContentTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: IContentTags
  var existence: js.Array[String]
}

object Content {
  @scala.inline
  def apply(content: IContentTags, existence: js.Array[String]): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], existence = existence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

