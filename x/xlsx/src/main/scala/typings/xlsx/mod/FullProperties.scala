package typings.xlsx.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullProperties extends Properties {
  var AppVersion: js.UndefOr[String] = js.native
  var Application: js.UndefOr[String] = js.native
  var ContentStatus: js.UndefOr[String] = js.native
  var DocSecurity: js.UndefOr[String] = js.native
  var HyperlinksChanged: js.UndefOr[Boolean] = js.native
  var Identifier: js.UndefOr[String] = js.native
  var Language: js.UndefOr[String] = js.native
  var LastPrinted: js.UndefOr[String] = js.native
  var LinksUpToDate: js.UndefOr[Boolean] = js.native
  var ModifiedDate: js.UndefOr[Date] = js.native
  var Revision: js.UndefOr[String | Double] = js.native
  var ScaleCrop: js.UndefOr[Boolean] = js.native
  var SharedDoc: js.UndefOr[Boolean] = js.native
  var SheetNames: js.UndefOr[js.Array[String]] = js.native
  var Version: js.UndefOr[String] = js.native
  var Worksheets: js.UndefOr[Double] = js.native
}

object FullProperties {
  @scala.inline
  def apply(): FullProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullProperties]
  }
  @scala.inline
  implicit class FullPropertiesOps[Self <: FullProperties] (val x: Self) extends AnyVal {
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
    def setAppVersion(value: String): Self = this.set("AppVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppVersion: Self = this.set("AppVersion", js.undefined)
    @scala.inline
    def setApplication(value: String): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication: Self = this.set("Application", js.undefined)
    @scala.inline
    def setContentStatus(value: String): Self = this.set("ContentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStatus: Self = this.set("ContentStatus", js.undefined)
    @scala.inline
    def setDocSecurity(value: String): Self = this.set("DocSecurity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocSecurity: Self = this.set("DocSecurity", js.undefined)
    @scala.inline
    def setHyperlinksChanged(value: Boolean): Self = this.set("HyperlinksChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyperlinksChanged: Self = this.set("HyperlinksChanged", js.undefined)
    @scala.inline
    def setIdentifier(value: String): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("Identifier", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("Language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("Language", js.undefined)
    @scala.inline
    def setLastPrinted(value: String): Self = this.set("LastPrinted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPrinted: Self = this.set("LastPrinted", js.undefined)
    @scala.inline
    def setLinksUpToDate(value: Boolean): Self = this.set("LinksUpToDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinksUpToDate: Self = this.set("LinksUpToDate", js.undefined)
    @scala.inline
    def setModifiedDate(value: Date): Self = this.set("ModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedDate: Self = this.set("ModifiedDate", js.undefined)
    @scala.inline
    def setRevision(value: String | Double): Self = this.set("Revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("Revision", js.undefined)
    @scala.inline
    def setScaleCrop(value: Boolean): Self = this.set("ScaleCrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleCrop: Self = this.set("ScaleCrop", js.undefined)
    @scala.inline
    def setSharedDoc(value: Boolean): Self = this.set("SharedDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedDoc: Self = this.set("SharedDoc", js.undefined)
    @scala.inline
    def setSheetNamesVarargs(value: String*): Self = this.set("SheetNames", js.Array(value :_*))
    @scala.inline
    def setSheetNames(value: js.Array[String]): Self = this.set("SheetNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetNames: Self = this.set("SheetNames", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
    @scala.inline
    def setWorksheets(value: Double): Self = this.set("Worksheets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorksheets: Self = this.set("Worksheets", js.undefined)
  }
  
}

