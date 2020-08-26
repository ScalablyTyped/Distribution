package typings.yamlFrontMatter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentKeyName[contentKeyName /* <: String */] extends js.Object {
  var contentKeyName: contentKeyName = js.native
}

object ContentKeyName {
  @scala.inline
  def apply[/* <: java.lang.String */ contentKeyName](contentKeyName: contentKeyName): ContentKeyName[contentKeyName] = {
    val __obj = js.Dynamic.literal(contentKeyName = contentKeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentKeyName[contentKeyName]]
  }
  @scala.inline
  implicit class ContentKeyNameOps[Self <: ContentKeyName[_], /* <: java.lang.String */ contentKeyName] (val x: Self with ContentKeyName[contentKeyName]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentKeyName(value: contentKeyName): Self = this.set("contentKeyName", value.asInstanceOf[js.Any])
  }
  
}

