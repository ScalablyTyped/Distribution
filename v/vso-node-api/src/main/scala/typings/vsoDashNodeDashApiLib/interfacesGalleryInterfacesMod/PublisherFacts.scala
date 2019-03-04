package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherFacts extends js.Object {
  var displayName: java.lang.String
  var flags: PublisherFlags
  var publisherId: java.lang.String
  var publisherName: java.lang.String
}

object PublisherFacts {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    flags: PublisherFlags,
    publisherId: java.lang.String,
    publisherName: java.lang.String
  ): PublisherFacts = {
    val __obj = js.Dynamic.literal(displayName = displayName, flags = flags, publisherId = publisherId, publisherName = publisherName)
  
    __obj.asInstanceOf[PublisherFacts]
  }
}

