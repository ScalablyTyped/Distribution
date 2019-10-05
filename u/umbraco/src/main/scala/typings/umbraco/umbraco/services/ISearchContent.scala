package typings.umbraco.umbraco.services

import typings.umbraco.Anon_Url
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
  var metaData: Anon_Url
  var subTitle: String
}

object ISearchContent {
  @scala.inline
  def apply(editorPath: String, id: Double, menuUrl: String, metaData: Anon_Url, subTitle: String): ISearchContent = {
    val __obj = js.Dynamic.literal(editorPath = editorPath, id = id, menuUrl = menuUrl, metaData = metaData, subTitle = subTitle)
  
    __obj.asInstanceOf[ISearchContent]
  }
}

