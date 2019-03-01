package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullProperties extends Properties {
  var AppVersion: js.UndefOr[java.lang.String] = js.undefined
  var Application: js.UndefOr[java.lang.String] = js.undefined
  var ContentStatus: js.UndefOr[java.lang.String] = js.undefined
  var DocSecurity: js.UndefOr[java.lang.String] = js.undefined
  var HyperlinksChanged: js.UndefOr[scala.Boolean] = js.undefined
  var Identifier: js.UndefOr[java.lang.String] = js.undefined
  var Language: js.UndefOr[java.lang.String] = js.undefined
  var LastPrinted: js.UndefOr[java.lang.String] = js.undefined
  var LinksUpToDate: js.UndefOr[scala.Boolean] = js.undefined
  var ModifiedDate: js.UndefOr[stdLib.Date] = js.undefined
  var Revision: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var ScaleCrop: js.UndefOr[scala.Boolean] = js.undefined
  var SharedDoc: js.UndefOr[scala.Boolean] = js.undefined
  var SheetNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var Version: js.UndefOr[java.lang.String] = js.undefined
  var Worksheets: js.UndefOr[scala.Double] = js.undefined
}

object FullProperties {
  @scala.inline
  def apply(
    AppVersion: java.lang.String = null,
    Application: java.lang.String = null,
    Author: java.lang.String = null,
    Category: java.lang.String = null,
    Comments: java.lang.String = null,
    Company: java.lang.String = null,
    ContentStatus: java.lang.String = null,
    CreatedDate: stdLib.Date = null,
    DocSecurity: java.lang.String = null,
    HyperlinksChanged: js.UndefOr[scala.Boolean] = js.undefined,
    Identifier: java.lang.String = null,
    Keywords: java.lang.String = null,
    Language: java.lang.String = null,
    LastAuthor: java.lang.String = null,
    LastPrinted: java.lang.String = null,
    LinksUpToDate: js.UndefOr[scala.Boolean] = js.undefined,
    Manager: java.lang.String = null,
    ModifiedDate: stdLib.Date = null,
    Revision: java.lang.String | scala.Double = null,
    ScaleCrop: js.UndefOr[scala.Boolean] = js.undefined,
    SharedDoc: js.UndefOr[scala.Boolean] = js.undefined,
    SheetNames: js.Array[java.lang.String] = null,
    Subject: java.lang.String = null,
    Title: java.lang.String = null,
    Version: java.lang.String = null,
    Worksheets: scala.Int | scala.Double = null
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

