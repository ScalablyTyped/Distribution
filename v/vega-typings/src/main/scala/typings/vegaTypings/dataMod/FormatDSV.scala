package typings.vegaTypings.dataMod

import typings.vegaTypings.vegaTypingsStrings.dsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatDSV extends _Format {
  var delimiter: String = js.native
  var header: js.UndefOr[js.Array[String]] = js.native
  var parse: js.UndefOr[Parse] = js.native
  var `type`: dsv = js.native
}

object FormatDSV {
  @scala.inline
  def apply(delimiter: String, `type`: dsv): FormatDSV = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatDSV]
  }
  @scala.inline
  implicit class FormatDSVOps[Self <: FormatDSV] (val x: Self) extends AnyVal {
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: dsv): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderVarargs(value: String*): Self = this.set("header", js.Array(value :_*))
    @scala.inline
    def setHeader(value: js.Array[String]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setParse(value: Parse): Self = this.set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
  }
  
}

