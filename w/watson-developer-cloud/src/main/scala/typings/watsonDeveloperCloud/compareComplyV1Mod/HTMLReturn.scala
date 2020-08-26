package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTML converted from an input document. */
@js.native
trait HTMLReturn extends js.Object {
  /** The author of the input document, if identified. */
  var author: js.UndefOr[String] = js.native
  /** The HTML version of the input document. */
  var html: js.UndefOr[String] = js.native
  /** The number of pages in the input document. */
  var num_pages: js.UndefOr[String] = js.native
  /** The publication date of the input document, if identified. */
  var publication_date: js.UndefOr[String] = js.native
  /** The title of the input document, if identified. */
  var title: js.UndefOr[String] = js.native
}

object HTMLReturn {
  @scala.inline
  def apply(): HTMLReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLReturn]
  }
  @scala.inline
  implicit class HTMLReturnOps[Self <: HTMLReturn] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setNum_pages(value: String): Self = this.set("num_pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNum_pages: Self = this.set("num_pages", js.undefined)
    @scala.inline
    def setPublication_date(value: String): Self = this.set("publication_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublication_date: Self = this.set("publication_date", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

