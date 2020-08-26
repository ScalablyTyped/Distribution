package typings.wordpressBlocks.mod

import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.shortcode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformShortcode[T /* <: Record[String, _] */] extends Transform[T] {
  var attributes: js.UndefOr[js.Any] = js.native
  var priority: js.UndefOr[Double] = js.native
  var tag: String = js.native
  var `type`: shortcode = js.native
}

object TransformShortcode {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](tag: String, `type`: shortcode): TransformShortcode[T] = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformShortcode[T]]
  }
  @scala.inline
  implicit class TransformShortcodeOps[Self <: TransformShortcode[_], /* <: typings.std.Record[java.lang.String, _] */ T] (val x: Self with TransformShortcode[T]) extends AnyVal {
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
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: shortcode): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
  
}

