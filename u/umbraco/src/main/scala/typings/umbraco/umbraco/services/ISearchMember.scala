package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search members
  */
trait ISearchMember extends js.Object {
  var editorPath: String
  var id: Double
  var menuUrl: String
  var metaData: js.Object
  var name: String
  var subtitle: String
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
}

