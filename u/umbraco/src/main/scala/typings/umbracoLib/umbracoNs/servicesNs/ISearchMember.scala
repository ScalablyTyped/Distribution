package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search members
  */
trait ISearchMember extends js.Object {
  var editorPath: java.lang.String
  var id: scala.Double
  var menuUrl: java.lang.String
  var metaData: js.Object
  var name: java.lang.String
  var subtitle: java.lang.String
}

object ISearchMember {
  @scala.inline
  def apply(
    editorPath: java.lang.String,
    id: scala.Double,
    menuUrl: java.lang.String,
    metaData: js.Object,
    name: java.lang.String,
    subtitle: java.lang.String
  ): ISearchMember = {
    val __obj = js.Dynamic.literal(editorPath = editorPath, id = id, menuUrl = menuUrl, metaData = metaData, name = name, subtitle = subtitle)
  
    __obj.asInstanceOf[ISearchMember]
  }
}

