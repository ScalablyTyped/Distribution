package typings.umbraco.umbraco.services

import typings.umbraco.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search content
  */
@js.native
trait ISearchContent extends js.Object {
  var editorPath: String = js.native
  var id: Double = js.native
  var menuUrl: String = js.native
  var metaData: Url = js.native
  var subTitle: String = js.native
}

object ISearchContent {
  @scala.inline
  def apply(editorPath: String, id: Double, menuUrl: String, metaData: Url, subTitle: String): ISearchContent = {
    val __obj = js.Dynamic.literal(editorPath = editorPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], menuUrl = menuUrl.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchContent]
  }
  @scala.inline
  implicit class ISearchContentOps[Self <: ISearchContent] (val x: Self) extends AnyVal {
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
    def setMetaData(value: Url): Self = this.set("metaData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubTitle(value: String): Self = this.set("subTitle", value.asInstanceOf[js.Any])
  }
  
}

