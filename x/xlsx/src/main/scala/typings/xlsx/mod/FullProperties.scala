package typings.xlsx.mod

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
    if (AppVersion != null) __obj.updateDynamic("AppVersion")(AppVersion.asInstanceOf[js.Any])
    if (Application != null) __obj.updateDynamic("Application")(Application.asInstanceOf[js.Any])
    if (Author != null) __obj.updateDynamic("Author")(Author.asInstanceOf[js.Any])
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (Comments != null) __obj.updateDynamic("Comments")(Comments.asInstanceOf[js.Any])
    if (Company != null) __obj.updateDynamic("Company")(Company.asInstanceOf[js.Any])
    if (ContentStatus != null) __obj.updateDynamic("ContentStatus")(ContentStatus.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (DocSecurity != null) __obj.updateDynamic("DocSecurity")(DocSecurity.asInstanceOf[js.Any])
    if (!js.isUndefined(HyperlinksChanged)) __obj.updateDynamic("HyperlinksChanged")(HyperlinksChanged.asInstanceOf[js.Any])
    if (Identifier != null) __obj.updateDynamic("Identifier")(Identifier.asInstanceOf[js.Any])
    if (Keywords != null) __obj.updateDynamic("Keywords")(Keywords.asInstanceOf[js.Any])
    if (Language != null) __obj.updateDynamic("Language")(Language.asInstanceOf[js.Any])
    if (LastAuthor != null) __obj.updateDynamic("LastAuthor")(LastAuthor.asInstanceOf[js.Any])
    if (LastPrinted != null) __obj.updateDynamic("LastPrinted")(LastPrinted.asInstanceOf[js.Any])
    if (!js.isUndefined(LinksUpToDate)) __obj.updateDynamic("LinksUpToDate")(LinksUpToDate.asInstanceOf[js.Any])
    if (Manager != null) __obj.updateDynamic("Manager")(Manager.asInstanceOf[js.Any])
    if (ModifiedDate != null) __obj.updateDynamic("ModifiedDate")(ModifiedDate.asInstanceOf[js.Any])
    if (Revision != null) __obj.updateDynamic("Revision")(Revision.asInstanceOf[js.Any])
    if (!js.isUndefined(ScaleCrop)) __obj.updateDynamic("ScaleCrop")(ScaleCrop.asInstanceOf[js.Any])
    if (!js.isUndefined(SharedDoc)) __obj.updateDynamic("SharedDoc")(SharedDoc.asInstanceOf[js.Any])
    if (SheetNames != null) __obj.updateDynamic("SheetNames")(SheetNames.asInstanceOf[js.Any])
    if (Subject != null) __obj.updateDynamic("Subject")(Subject.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (Worksheets != null) __obj.updateDynamic("Worksheets")(Worksheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullProperties]
  }
}

