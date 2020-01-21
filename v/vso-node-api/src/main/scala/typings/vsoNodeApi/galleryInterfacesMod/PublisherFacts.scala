package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherFacts extends js.Object {
  var displayName: String
  var flags: PublisherFlags
  var publisherId: String
  var publisherName: String
}

object PublisherFacts {
  @scala.inline
  def apply(displayName: String, flags: PublisherFlags, publisherId: String, publisherName: String): PublisherFacts = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PublisherFacts]
  }
}

