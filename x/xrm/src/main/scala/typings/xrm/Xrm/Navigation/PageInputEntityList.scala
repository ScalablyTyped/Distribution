package typings.xrm.Xrm.Navigation

import typings.xrm.xrmStrings.entitylist
import typings.xrm.xrmStrings.savedquery
import typings.xrm.xrmStrings.userquery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInputEntityList extends js.Object {
  /**
    * The logical name of the entity to load in the list control.
    * */
  var entityName: String
  var pageType: entitylist
  /**
    * The ID of the view to load. If you don't specify it, navigates to the default main view for the entity.
    * */
  var viewId: js.UndefOr[String] = js.undefined
  /**
    * Type of view to load. Specify "savedquery" or "userquery".
    * */
  var viewType: js.UndefOr[savedquery | userquery] = js.undefined
}

object PageInputEntityList {
  @scala.inline
  def apply(
    entityName: String,
    pageType: entitylist,
    viewId: String = null,
    viewType: savedquery | userquery = null
  ): PageInputEntityList = {
    val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any], pageType = pageType.asInstanceOf[js.Any])
    if (viewId != null) __obj.updateDynamic("viewId")(viewId.asInstanceOf[js.Any])
    if (viewType != null) __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInputEntityList]
  }
}

