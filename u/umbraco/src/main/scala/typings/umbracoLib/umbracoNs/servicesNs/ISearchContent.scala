package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search content
  */
trait ISearchContent extends js.Object {
  var editorPath: java.lang.String
  var id: scala.Double
  var menuUrl: java.lang.String
  var metaData: umbracoLib.Anon_Url
  var subTitle: java.lang.String
}

object ISearchContent {
  @scala.inline
  def apply(
    editorPath: java.lang.String,
    id: scala.Double,
    menuUrl: java.lang.String,
    metaData: umbracoLib.Anon_Url,
    subTitle: java.lang.String
  ): ISearchContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editorPath")(editorPath)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("menuUrl")(menuUrl)
    __obj.updateDynamic("metaData")(metaData)
    __obj.updateDynamic("subTitle")(subTitle)
    __obj.asInstanceOf[ISearchContent]
  }
}

