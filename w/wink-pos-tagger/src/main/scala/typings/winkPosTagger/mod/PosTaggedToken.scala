package typings.winkPosTagger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosTaggedToken extends js.Object {
  var lemma: js.UndefOr[String] = js.undefined
  var normal: String
  var pos: PosTag
  var tag: Tag
  var value: String
}

object PosTaggedToken {
  @scala.inline
  def apply(normal: String, pos: PosTag, tag: Tag, value: String, lemma: String = null): PosTaggedToken = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (lemma != null) __obj.updateDynamic("lemma")(lemma.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosTaggedToken]
  }
}

