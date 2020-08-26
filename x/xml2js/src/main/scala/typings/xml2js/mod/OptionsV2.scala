package typings.xml2js.mod

import typings.xml2js.anon.Encoding
import typings.xml2js.anon.Indent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsV2 extends Options {
  var cdata: js.UndefOr[Boolean] = js.native
  var chunkSize: js.UndefOr[Double] = js.native
  var doctype: js.UndefOr[js.Any] = js.native
  var headless: js.UndefOr[Boolean] = js.native
  var preserveChildrenOrder: js.UndefOr[Boolean] = js.native
  var renderOpts: js.UndefOr[Indent] = js.native
  var rootName: js.UndefOr[String] = js.native
  var xmldec: js.UndefOr[Encoding] = js.native
}

object OptionsV2 {
  @scala.inline
  def apply(): OptionsV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsV2]
  }
  @scala.inline
  implicit class OptionsV2Ops[Self <: OptionsV2] (val x: Self) extends AnyVal {
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
    def setCdata(value: Boolean): Self = this.set("cdata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdata: Self = this.set("cdata", js.undefined)
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    @scala.inline
    def setDoctype(value: js.Any): Self = this.set("doctype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoctype: Self = this.set("doctype", js.undefined)
    @scala.inline
    def setHeadless(value: Boolean): Self = this.set("headless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadless: Self = this.set("headless", js.undefined)
    @scala.inline
    def setPreserveChildrenOrder(value: Boolean): Self = this.set("preserveChildrenOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveChildrenOrder: Self = this.set("preserveChildrenOrder", js.undefined)
    @scala.inline
    def setRenderOpts(value: Indent): Self = this.set("renderOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderOpts: Self = this.set("renderOpts", js.undefined)
    @scala.inline
    def setRootName(value: String): Self = this.set("rootName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootName: Self = this.set("rootName", js.undefined)
    @scala.inline
    def setXmldec(value: Encoding): Self = this.set("xmldec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmldec: Self = this.set("xmldec", js.undefined)
  }
  
}

