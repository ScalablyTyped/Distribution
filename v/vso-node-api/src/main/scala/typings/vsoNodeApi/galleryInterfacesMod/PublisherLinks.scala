package typings.vsoNodeApi.galleryInterfacesMod

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
    val __obj = js.Dynamic.literal(company = company.asInstanceOf[js.Any], fallbackLogo = fallbackLogo.asInstanceOf[js.Any], linkedIn = linkedIn.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], sourceCode = sourceCode.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PublisherLinks]
  }
}

