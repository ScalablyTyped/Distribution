package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  var displayName: java.lang.String
  var id: java.lang.String
  var imageUrl: java.lang.String
  var uniqueName: java.lang.String
  var url: java.lang.String
}

object Member {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    id: java.lang.String,
    imageUrl: java.lang.String,
    uniqueName: java.lang.String,
    url: java.lang.String
  ): Member = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id, imageUrl = imageUrl, uniqueName = uniqueName, url = url)
  
    __obj.asInstanceOf[Member]
  }
}

