package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The object represents a webpage in the back-forward of a web view.
  */
@js.native
trait BackForwardListItem extends js.Object {
  /**
    * The URL of the initial request that created this item.
    */
  var initialUrl: js.UndefOr[java.lang.String] = js.native
  /**
    * The title of the webpage represented by this item.
    */
  var title: js.UndefOr[java.lang.String] = js.native
  /**
    * The URL of the webpage represented by this item.
    */
  var url: js.UndefOr[java.lang.String] = js.native
}

object BackForwardListItem {
  @scala.inline
  def apply(): BackForwardListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackForwardListItem]
  }
  @scala.inline
  implicit class BackForwardListItemOps[Self <: BackForwardListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInitialUrl(value: java.lang.String): Self = this.set("initialUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialUrl: Self = this.set("initialUrl", js.undefined)
    @scala.inline
    def setTitle(value: java.lang.String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUrl(value: java.lang.String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

