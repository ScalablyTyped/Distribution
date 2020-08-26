package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSON2SheetOpts
  extends CommonOptions
     with DateNFOption {
  /** Use specified column order */
  var header: js.UndefOr[js.Array[String]] = js.native
  /** Skip header row in generated sheet */
  var skipHeader: js.UndefOr[Boolean] = js.native
}

object JSON2SheetOpts {
  @scala.inline
  def apply(): JSON2SheetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSON2SheetOpts]
  }
  @scala.inline
  implicit class JSON2SheetOptsOps[Self <: JSON2SheetOpts] (val x: Self) extends AnyVal {
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
    def setHeaderVarargs(value: String*): Self = this.set("header", js.Array(value :_*))
    @scala.inline
    def setHeader(value: js.Array[String]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setSkipHeader(value: Boolean): Self = this.set("skipHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipHeader: Self = this.set("skipHeader", js.undefined)
  }
  
}

