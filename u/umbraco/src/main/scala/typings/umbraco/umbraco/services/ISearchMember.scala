package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search members
  */
@js.native
trait ISearchMember extends js.Object {
  var editorPath: String = js.native
  var id: Double = js.native
  var menuUrl: String = js.native
  var metaData: js.Object = js.native
  var name: String = js.native
  var subtitle: String = js.native
}

object ISearchMember {
  @scala.inline
  def apply(
    editorPath: String,
    id: Double,
    menuUrl: String,
    metaData: js.Object,
    name: String,
    subtitle: String
  ): ISearchMember = {
    val __obj = js.Dynamic.literal(editorPath = editorPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], menuUrl = menuUrl.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchMember]
  }
  @scala.inline
  implicit class ISearchMemberOps[Self <: ISearchMember] (val x: Self) extends AnyVal {
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
    def setEditorPath(value: String): Self = this.set("editorPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuUrl(value: String): Self = this.set("menuUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaData(value: js.Object): Self = this.set("metaData", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
  }
  
}

