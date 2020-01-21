package typings.xlsx.mod

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
    if (Author != null) __obj.updateDynamic("Author")(Author.asInstanceOf[js.Any])
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (Comments != null) __obj.updateDynamic("Comments")(Comments.asInstanceOf[js.Any])
    if (Company != null) __obj.updateDynamic("Company")(Company.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (Keywords != null) __obj.updateDynamic("Keywords")(Keywords.asInstanceOf[js.Any])
    if (LastAuthor != null) __obj.updateDynamic("LastAuthor")(LastAuthor.asInstanceOf[js.Any])
    if (Manager != null) __obj.updateDynamic("Manager")(Manager.asInstanceOf[js.Any])
    if (Subject != null) __obj.updateDynamic("Subject")(Subject.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
}

