package typings.umbraco.umbraco.services

import typings.umbraco.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search content
  */
trait ISearchContent extends js.Object {
  var editorPath: String
  var id: Double
  var menuUrl: String
  var metaData: Url
  var subTitle: String
}

object ISearchContent {
  @scala.inline
  def apply(editorPath: String, id: Double, menuUrl: String, metaData: Url, subTitle: String): ISearchContent = {
    val __obj = js.Dynamic.literal(editorPath = editorPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], menuUrl = menuUrl.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchContent]
  }
}

