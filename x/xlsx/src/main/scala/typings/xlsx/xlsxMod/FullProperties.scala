package typings.xlsx.xlsxMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullProperties extends Properties {
  var AppVersion: js.UndefOr[String] = js.undefined
  var Application: js.UndefOr[String] = js.undefined
  var ContentStatus: js.UndefOr[String] = js.undefined
  var DocSecurity: js.UndefOr[String] = js.undefined
  var HyperlinksChanged: js.UndefOr[Boolean] = js.undefined
  var Identifier: js.UndefOr[String] = js.undefined
  var Language: js.UndefOr[String] = js.undefined
  var LastPrinted: js.UndefOr[String] = js.undefined
  var LinksUpToDate: js.UndefOr[Boolean] = js.undefined
  var ModifiedDate: js.UndefOr[Date] = js.undefined
  var Revision: js.UndefOr[String | Double] = js.undefined
  var ScaleCrop: js.UndefOr[Boolean] = js.undefined
  var SharedDoc: js.UndefOr[Boolean] = js.undefined
  var SheetNames: js.UndefOr[js.Array[String]] = js.undefined
  var Version: js.UndefOr[String] = js.undefined
  var Worksheets: js.UndefOr[Double] = js.undefined
}

object FullProperties {
  @scala.inline
  def apply(
    AppVersion: String = null,
    Application: String = null,
    Author: String = null,
    Category: String = null,
    Comments: String = null,
    Company: String = null,
    ContentStatus: String = null,
    CreatedDate: Date = null,
    DocSecurity: String = null,
    HyperlinksChanged: js.UndefOr[Boolean] = js.undefined,
    Identifier: String = null,
    Keywords: String = null,
    Language: String = null,
    LastAuthor: String = null,
    LastPrinted: String = null,
    LinksUpToDate: js.UndefOr[Boolean] = js.undefined,
    Manager: String = null,
    ModifiedDate: Date = null,
    Revision: String | Double = null,
    ScaleCrop: js.UndefOr[Boolean] = js.undefined,
    SharedDoc: js.UndefOr[Boolean] = js.undefined,
    SheetNames: js.Array[String] = null,
    Subject: String = null,
    Title: String = null,
    Version: String = null,
    Worksheets: Int | Double = null
  ): FullProperties = {
    val __obj = js.Dynamic.literal()
    if (AppVersion != null) __obj.updateDynamic("AppVersion")(AppVersion)
    if (Application != null) __obj.updateDynamic("Application")(Application)
    if (Author != null) __obj.updateDynamic("Author")(Author)
    if (Category != null) __obj.updateDynamic("Category")(Category)
    if (Comments != null) __obj.updateDynamic("Comments")(Comments)
    if (Company != null) __obj.updateDynamic("Company")(Company)
    if (ContentStatus != null) __obj.updateDynamic("ContentStatus")(ContentStatus)
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (DocSecurity != null) __obj.updateDynamic("DocSecurity")(DocSecurity)
    if (!js.isUndefined(HyperlinksChanged)) __obj.updateDynamic("HyperlinksChanged")(HyperlinksChanged)
    if (Identifier != null) __obj.updateDynamic("Identifier")(Identifier)
    if (Keywords != null) __obj.updateDynamic("Keywords")(Keywords)
    if (Language != null) __obj.updateDynamic("Language")(Language)
    if (LastAuthor != null) __obj.updateDynamic("LastAuthor")(LastAuthor)
    if (LastPrinted != null) __obj.updateDynamic("LastPrinted")(LastPrinted)
    if (!js.isUndefined(LinksUpToDate)) __obj.updateDynamic("LinksUpToDate")(LinksUpToDate)
    if (Manager != null) __obj.updateDynamic("Manager")(Manager)
    if (ModifiedDate != null) __obj.updateDynamic("ModifiedDate")(ModifiedDate)
    if (Revision != null) __obj.updateDynamic("Revision")(Revision.asInstanceOf[js.Any])
    if (!js.isUndefined(ScaleCrop)) __obj.updateDynamic("ScaleCrop")(ScaleCrop)
    if (!js.isUndefined(SharedDoc)) __obj.updateDynamic("SharedDoc")(SharedDoc)
    if (SheetNames != null) __obj.updateDynamic("SheetNames")(SheetNames)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    if (Worksheets != null) __obj.updateDynamic("Worksheets")(Worksheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullProperties]
  }
}

