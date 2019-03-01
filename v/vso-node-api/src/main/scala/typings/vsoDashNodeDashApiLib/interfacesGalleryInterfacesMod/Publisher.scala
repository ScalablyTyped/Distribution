package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Publisher extends js.Object {
  var displayName: java.lang.String
  var emailAddress: js.Array[java.lang.String]
  var extensions: js.Array[PublishedExtension]
  var flags: PublisherFlags
  var lastUpdated: stdLib.Date
  var links: PublisherLinks
  var longDescription: java.lang.String
  var publisherId: java.lang.String
  var publisherName: java.lang.String
  var shortDescription: java.lang.String
}

object Publisher {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    emailAddress: js.Array[java.lang.String],
    extensions: js.Array[PublishedExtension],
    flags: PublisherFlags,
    lastUpdated: stdLib.Date,
    links: PublisherLinks,
    longDescription: java.lang.String,
    publisherId: java.lang.String,
    publisherName: java.lang.String,
    shortDescription: java.lang.String
  ): Publisher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("emailAddress")(emailAddress)
    __obj.updateDynamic("extensions")(extensions)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("lastUpdated")(lastUpdated)
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("longDescription")(longDescription)
    __obj.updateDynamic("publisherId")(publisherId)
    __obj.updateDynamic("publisherName")(publisherName)
    __obj.updateDynamic("shortDescription")(shortDescription)
    __obj.asInstanceOf[Publisher]
  }
}

