package typings.xlsx.xlsxMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties extends js.Object {
  /** Summary tab "Author" */
  var Author: js.UndefOr[String] = js.undefined
  /** Summary tab "Category" */
  var Category: js.UndefOr[String] = js.undefined
  /** Summary tab "Comments" */
  var Comments: js.UndefOr[String] = js.undefined
  /** Summary tab "Company" */
  var Company: js.UndefOr[String] = js.undefined
  /** Statistics tab "Created" */
  var CreatedDate: js.UndefOr[Date] = js.undefined
  /** Summary tab "Keywords" */
  var Keywords: js.UndefOr[String] = js.undefined
  /** Statistics tab "Last saved by" */
  var LastAuthor: js.UndefOr[String] = js.undefined
  /** Summary tab "Manager" */
  var Manager: js.UndefOr[String] = js.undefined
  /** Summary tab "Subject" */
  var Subject: js.UndefOr[String] = js.undefined
  /** Summary tab "Title" */
  var Title: js.UndefOr[String] = js.undefined
}

object Properties {
  @scala.inline
  def apply(
    Author: String = null,
    Category: String = null,
    Comments: String = null,
    Company: String = null,
    CreatedDate: Date = null,
    Keywords: String = null,
    LastAuthor: String = null,
    Manager: String = null,
    Subject: String = null,
    Title: String = null
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

