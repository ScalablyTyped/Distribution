package typings.winkPosTagger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PosTaggedToken extends js.Object {
  var lemma: js.UndefOr[String] = js.native
  var normal: String = js.native
  var pos: PosTag = js.native
  var tag: Tag = js.native
  var value: String = js.native
}

object PosTaggedToken {
  @scala.inline
  def apply(normal: String, pos: PosTag, tag: Tag, value: String): PosTaggedToken = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosTaggedToken]
  }
  @scala.inline
  implicit class PosTaggedTokenOps[Self <: PosTaggedToken] (val x: Self) extends AnyVal {
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
    def setNormal(value: String): Self = this.set("normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: PosTag): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: Tag): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setLemma(value: String): Self = this.set("lemma", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLemma: Self = this.set("lemma", js.undefined)
  }
  
}

