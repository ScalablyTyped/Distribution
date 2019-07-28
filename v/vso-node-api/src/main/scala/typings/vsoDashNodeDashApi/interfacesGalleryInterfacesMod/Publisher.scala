package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Publisher extends js.Object {
  var displayName: String
  var emailAddress: js.Array[String]
  var extensions: js.Array[PublishedExtension]
  var flags: PublisherFlags
  var lastUpdated: Date
  var links: PublisherLinks
  var longDescription: String
  var publisherId: String
  var publisherName: String
  var shortDescription: String
}

object Publisher {
  @scala.inline
  def apply(
    displayName: String,
    emailAddress: js.Array[String],
    extensions: js.Array[PublishedExtension],
    flags: PublisherFlags,
    lastUpdated: Date,
    links: PublisherLinks,
    longDescription: String,
    publisherId: String,
    publisherName: String,
    shortDescription: String
  ): Publisher = {
    val __obj = js.Dynamic.literal(displayName = displayName, emailAddress = emailAddress, extensions = extensions, flags = flags, lastUpdated = lastUpdated, links = links, longDescription = longDescription, publisherId = publisherId, publisherName = publisherName, shortDescription = shortDescription)
  
    __obj.asInstanceOf[Publisher]
  }
}

