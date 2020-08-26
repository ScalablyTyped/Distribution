package typings.xlsx.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Properties extends js.Object {
  /** Summary tab "Author" */
  var Author: js.UndefOr[String] = js.native
  /** Summary tab "Category" */
  var Category: js.UndefOr[String] = js.native
  /** Summary tab "Comments" */
  var Comments: js.UndefOr[String] = js.native
  /** Summary tab "Company" */
  var Company: js.UndefOr[String] = js.native
  /** Statistics tab "Created" */
  var CreatedDate: js.UndefOr[Date] = js.native
  /** Summary tab "Keywords" */
  var Keywords: js.UndefOr[String] = js.native
  /** Statistics tab "Last saved by" */
  var LastAuthor: js.UndefOr[String] = js.native
  /** Summary tab "Manager" */
  var Manager: js.UndefOr[String] = js.native
  /** Summary tab "Subject" */
  var Subject: js.UndefOr[String] = js.native
  /** Summary tab "Title" */
  var Title: js.UndefOr[String] = js.native
}

object Properties {
  @scala.inline
  def apply(): Properties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Properties]
  }
  @scala.inline
  implicit class PropertiesOps[Self <: Properties] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("Author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("Author", js.undefined)
    @scala.inline
    def setCategory(value: String): Self = this.set("Category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    @scala.inline
    def setComments(value: String): Self = this.set("Comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("Comments", js.undefined)
    @scala.inline
    def setCompany(value: String): Self = this.set("Company", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompany: Self = this.set("Company", js.undefined)
    @scala.inline
    def setCreatedDate(value: Date): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    @scala.inline
    def setKeywords(value: String): Self = this.set("Keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("Keywords", js.undefined)
    @scala.inline
    def setLastAuthor(value: String): Self = this.set("LastAuthor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAuthor: Self = this.set("LastAuthor", js.undefined)
    @scala.inline
    def setManager(value: String): Self = this.set("Manager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManager: Self = this.set("Manager", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("Subject", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
  }
  
}

