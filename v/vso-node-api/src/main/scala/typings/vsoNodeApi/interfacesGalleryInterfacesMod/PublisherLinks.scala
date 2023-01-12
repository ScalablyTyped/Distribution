package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublisherLinks extends StObject {
  
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
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublisherLinks] (val x: Self) extends AnyVal {
    
    inline def setCompany(value: Link): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setFallbackLogo(value: Link): Self = StObject.set(x, "fallbackLogo", value.asInstanceOf[js.Any])
    
    inline def setLinkedIn(value: Link): Self = StObject.set(x, "linkedIn", value.asInstanceOf[js.Any])
    
    inline def setLogo(value: Link): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: Link): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setSourceCode(value: Link): Self = StObject.set(x, "sourceCode", value.asInstanceOf[js.Any])
    
    inline def setSupport(value: Link): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
    
    inline def setTwitter(value: Link): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
  }
}
