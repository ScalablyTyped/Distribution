package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherFilterResult extends js.Object {
  /**
    * This is the set of appplications that matched the query filter supplied.
    */
  var publishers: js.Array[Publisher]
}

object PublisherFilterResult {
  @scala.inline
  def apply(publishers: js.Array[Publisher]): PublisherFilterResult = {
    val __obj = js.Dynamic.literal(publishers = publishers)
  
    __obj.asInstanceOf[PublisherFilterResult]
  }
}

