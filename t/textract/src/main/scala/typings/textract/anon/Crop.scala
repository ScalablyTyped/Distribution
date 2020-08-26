package typings.textract.anon

import typings.textract.textractStrings.ASCII7
import typings.textract.textractStrings.Latin1
import typings.textract.textractStrings.Symbol
import typings.textract.textractStrings.ZapfDingbats
import typings.textract.textractStrings.`UCS-2`
import typings.textract.textractStrings.`UTF-8`
import typings.textract.textractStrings.dos
import typings.textract.textractStrings.htmlmeta
import typings.textract.textractStrings.layout
import typings.textract.textractStrings.mac
import typings.textract.textractStrings.raw
import typings.textract.textractStrings.unix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crop extends js.Object {
  var crop: js.UndefOr[H] = js.native
  /**
    * @default "UTF-8"
    */
  var encoding: js.UndefOr[`UCS-2` | ASCII7 | Latin1 | `UTF-8` | ZapfDingbats | Symbol] = js.native
  var eol: js.UndefOr[unix | dos | mac] = js.native
  var firstPage: js.UndefOr[Double] = js.native
  var lastPage: js.UndefOr[Double] = js.native
  /**
    * Do not change unless you know what you are doing!
    * @default "raw"
    */
  var layout: js.UndefOr[typings.textract.textractStrings.layout | raw | htmlmeta] = js.native
  var ownerPassword: js.UndefOr[String] = js.native
  var resolution: js.UndefOr[Double] = js.native
  /**
    * @default true
    */
  var splitPages: js.UndefOr[Boolean] = js.native
  var userPassword: js.UndefOr[String] = js.native
}

object Crop {
  @scala.inline
  def apply(): Crop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crop]
  }
  @scala.inline
  implicit class CropOps[Self <: Crop] (val x: Self) extends AnyVal {
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
    def setCrop(value: H): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    @scala.inline
    def setEncoding(value: `UCS-2` | ASCII7 | Latin1 | `UTF-8` | ZapfDingbats | Symbol): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEol(value: unix | dos | mac): Self = this.set("eol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    @scala.inline
    def setFirstPage(value: Double): Self = this.set("firstPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPage: Self = this.set("firstPage", js.undefined)
    @scala.inline
    def setLastPage(value: Double): Self = this.set("lastPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPage: Self = this.set("lastPage", js.undefined)
    @scala.inline
    def setLayout(value: layout | raw | htmlmeta): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setOwnerPassword(value: String): Self = this.set("ownerPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerPassword: Self = this.set("ownerPassword", js.undefined)
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    @scala.inline
    def setSplitPages(value: Boolean): Self = this.set("splitPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitPages: Self = this.set("splitPages", js.undefined)
    @scala.inline
    def setUserPassword(value: String): Self = this.set("userPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPassword: Self = this.set("userPassword", js.undefined)
  }
  
}

