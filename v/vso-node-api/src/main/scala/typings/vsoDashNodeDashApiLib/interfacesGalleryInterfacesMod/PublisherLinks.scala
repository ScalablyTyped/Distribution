package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherLinks extends js.Object {
  /**
    * URL for company website
    */
  var company: Link
  /**
    * URL for publisher logo if CDN is down
    */
  var fallbackLogo: Link
  /**
    * URL for publisher LinkedIn profile
    */
  var linkedIn: Link
  /**
    * CDN URL for publisher logo
    */
  var logo: Link
  /**
    * URL for publisher public profile page
    */
  var profile: Link
  /**
    * URL for source code repo
    */
  var sourceCode: Link
  /**
    * URL or email id for support
    */
  var support: Link
  /**
    * URL for Twitter handle of publisher company
    */
  var twitter: Link
}

object PublisherLinks {
  @scala.inline
  def apply(
    company: Link,
    fallbackLogo: Link,
    linkedIn: Link,
    logo: Link,
    profile: Link,
    sourceCode: Link,
    support: Link,
    twitter: Link
  ): PublisherLinks = {
    val __obj = js.Dynamic.literal(company = company, fallbackLogo = fallbackLogo, linkedIn = linkedIn, logo = logo, profile = profile, sourceCode = sourceCode, support = support, twitter = twitter)
  
    __obj.asInstanceOf[PublisherLinks]
  }
}

