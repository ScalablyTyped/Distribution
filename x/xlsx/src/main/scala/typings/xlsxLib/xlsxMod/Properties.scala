package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties extends js.Object {
  /** Summary tab "Author" */
  var Author: js.UndefOr[java.lang.String] = js.undefined
  /** Summary tab "Category" */
  var Category: js.UndefOr[java.lang.String] = js.undefined
  /** Summary tab "Comments" */
  var Comments: js.UndefOr[java.lang.String] = js.undefined
  /** Summary tab "Company" */
  var Company: js.UndefOr[java.lang.String] = js.undefined
  /** Statistics tab "Created" */
  var CreatedDate: js.UndefOr[stdLib.Date] = js.undefined
  /** Summary tab "Keywords" */
  var Keywords: js.UndefOr[java.lang.String] = js.undefined
  /** Statistics tab "Last saved by" */
  var LastAuthor: js.UndefOr[java.lang.String] = js.undefined
  /** Summary tab "Manager" */
  var Manager: js.UndefOr[java.lang.String] = js.undefined
  /** Summary tab "Subject" */
  var Subject: js.UndefOr[java.lang.String] = js.undefined
  /** Summary tab "Title" */
  var Title: js.UndefOr[java.lang.String] = js.undefined
}

object Properties {
  @scala.inline
  def apply(
    Author: java.lang.String = null,
    Category: java.lang.String = null,
    Comments: java.lang.String = null,
    Company: java.lang.String = null,
    CreatedDate: stdLib.Date = null,
    Keywords: java.lang.String = null,
    LastAuthor: java.lang.String = null,
    Manager: java.lang.String = null,
    Subject: java.lang.String = null,
    Title: java.lang.String = null
  ): Properties = {
    val __obj = js.Dynamic.literal()
    if (Author != null) __obj.updateDynamic("Author")(Author)
    if (Category != null) __obj.updateDynamic("Category")(Category)
    if (Comments != null) __obj.updateDynamic("Comments")(Comments)
    if (Company != null) __obj.updateDynamic("Company")(Company)
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (Keywords != null) __obj.updateDynamic("Keywords")(Keywords)
    if (LastAuthor != null) __obj.updateDynamic("LastAuthor")(LastAuthor)
    if (Manager != null) __obj.updateDynamic("Manager")(Manager)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    __obj.asInstanceOf[Properties]
  }
}

