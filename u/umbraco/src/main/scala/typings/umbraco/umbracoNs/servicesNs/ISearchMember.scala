package typings.umbraco.umbracoNs.servicesNs

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
    val __obj = js.Dynamic.literal(editorPath = editorPath, id = id, menuUrl = menuUrl, metaData = metaData, name = name, subtitle = subtitle)
  
    __obj.asInstanceOf[ISearchMember]
  }
}

