package typings.strongLogTransformer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<strong-log-transformer.strong-log-transformer.Options> */
@js.native
trait PartialOptions extends js.Object {
  var format: js.UndefOr[String] = js.native
  var mergeMultiline: js.UndefOr[Boolean] = js.native
  var tag: js.UndefOr[String] = js.native
  var timeStamp: js.UndefOr[Boolean] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setMergeMultiline(value: Boolean): Self = this.set("mergeMultiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeMultiline: Self = this.set("mergeMultiline", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTimeStamp(value: Boolean): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeStamp: Self = this.set("timeStamp", js.undefined)
  }
  
}

