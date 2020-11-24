package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Publisher extends js.Object {
  
  var displayName: String = js.native
  
  var emailAddress: js.Array[String] = js.native
  
  var extensions: js.Array[PublishedExtension] = js.native
  
  var flags: PublisherFlags = js.native
  
  var lastUpdated: Date = js.native
  
  var links: PublisherLinks = js.native
  
  var longDescription: String = js.native
  
  var publisherId: String = js.native
  
  var publisherName: String = js.native
  
  var shortDescription: String = js.native
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
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], longDescription = longDescription.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], shortDescription = shortDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Publisher]
  }
  
  @scala.inline
  implicit class PublisherOps[Self <: Publisher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressVarargs(value: String*): Self = this.set("emailAddress", js.Array(value :_*))
    
    @scala.inline
    def setEmailAddress(value: js.Array[String]): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsVarargs(value: PublishedExtension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[PublishedExtension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: PublisherFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdated(value: Date): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: PublisherLinks): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDescription(value: String): Self = this.set("longDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherId(value: String): Self = this.set("publisherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = this.set("publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescription(value: String): Self = this.set("shortDescription", value.asInstanceOf[js.Any])
  }
}
