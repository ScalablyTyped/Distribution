package typings.xrm.Xrm.Navigation

import typings.xrm.xrmStrings.entitylist
import typings.xrm.xrmStrings.savedquery
import typings.xrm.xrmStrings.userquery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInputEntityList extends js.Object {
  /**
    * The logical name of the entity to load in the list control.
    * */
  var entityName: String = js.native
  var pageType: entitylist = js.native
  /**
    * The ID of the view to load. If you don't specify it, navigates to the default main view for the entity.
    * */
  var viewId: js.UndefOr[String] = js.native
  /**
    * Type of view to load. Specify "savedquery" or "userquery".
    * */
  var viewType: js.UndefOr[savedquery | userquery] = js.native
}

object PageInputEntityList {
  @scala.inline
  def apply(entityName: String, pageType: entitylist): PageInputEntityList = {
    val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any], pageType = pageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInputEntityList]
  }
  @scala.inline
  implicit class PageInputEntityListOps[Self <: PageInputEntityList] (val x: Self) extends AnyVal {
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
    def setEntityName(value: String): Self = this.set("entityName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageType(value: entitylist): Self = this.set("pageType", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewId(value: String): Self = this.set("viewId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewId: Self = this.set("viewId", js.undefined)
    @scala.inline
    def setViewType(value: savedquery | userquery): Self = this.set("viewType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewType: Self = this.set("viewType", js.undefined)
  }
  
}

