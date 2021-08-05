package typings.unsplashJs

import org.scalablytyped.runtime.StringDictionary
import typings.unsplashJs.mod.CollectionIds
import typings.unsplashJs.mod.ContentSafety
import typings.unsplashJs.mod.Languages
import typings.unsplashJs.unsplashJsStrings.black
import typings.unsplashJs.unsplashJsStrings.black_and_white
import typings.unsplashJs.unsplashJsStrings.blue
import typings.unsplashJs.unsplashJsStrings.green
import typings.unsplashJs.unsplashJsStrings.latest
import typings.unsplashJs.unsplashJsStrings.magenta
import typings.unsplashJs.unsplashJsStrings.orange
import typings.unsplashJs.unsplashJsStrings.purple
import typings.unsplashJs.unsplashJsStrings.red
import typings.unsplashJs.unsplashJsStrings.relevant
import typings.unsplashJs.unsplashJsStrings.teal
import typings.unsplashJs.unsplashJsStrings.white
import typings.unsplashJs.unsplashJsStrings.yellow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessKey extends StObject {
    
    var accessKey: String
    
    var apiUrl: js.UndefOr[String] = js.undefined
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    var bearerToken: js.UndefOr[String] = js.undefined
    
    var callbackUrl: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var secret: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AccessKey {
    
    inline def apply(accessKey: String): AccessKey = {
      val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessKey]
    }
    
    extension [Self <: AccessKey](x: Self) {
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setApiUrl(value: String): Self = StObject.set(x, "apiUrl", value.asInstanceOf[js.Any])
      
      inline def setApiUrlUndefined: Self = StObject.set(x, "apiUrl", js.undefined)
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setBearerToken(value: String): Self = StObject.set(x, "bearerToken", value.asInstanceOf[js.Any])
      
      inline def setBearerTokenUndefined: Self = StObject.set(x, "bearerToken", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Bio extends StObject {
    
    var bio: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var firstName: js.UndefOr[String] = js.undefined
    
    var instagramUsername: js.UndefOr[String] = js.undefined
    
    var lastName: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Bio {
    
    inline def apply(): Bio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bio]
    }
    
    extension [Self <: Bio](x: Self) {
      
      inline def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
      
      inline def setBioUndefined: Self = StObject.set(x, "bio", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      inline def setInstagramUsername(value: String): Self = StObject.set(x, "instagramUsername", value.asInstanceOf[js.Any])
      
      inline def setInstagramUsernameUndefined: Self = StObject.set(x, "instagramUsername", js.undefined)
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Body extends StObject {
    
    var body: js.Object
    
    var headers: js.Object
    
    var method: String
    
    var oauth: Boolean
    
    var query: js.Object
    
    var url: String
  }
  object Body {
    
    inline def apply(body: js.Object, headers: js.Object, method: String, oauth: Boolean, query: js.Object, url: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], oauth = oauth.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOauth(value: Boolean): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait C extends StObject {
    
    var c: js.UndefOr[String] = js.undefined
    
    var collections: js.UndefOr[CollectionIds] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var featured: js.UndefOr[Boolean] = js.undefined
    
    var orientation: js.UndefOr[typings.unsplashJs.mod.Orientation] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object C {
    
    inline def apply(): C = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[C]
    }
    
    extension [Self <: C](x: Self) {
      
      inline def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      inline def setCollections(value: CollectionIds): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      inline def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
      
      inline def setCollectionsVarargs(value: (Double | String)*): Self = StObject.set(x, "collections", js.Array(value :_*))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
      
      inline def setFeaturedUndefined: Self = StObject.set(x, "featured", js.undefined)
      
      inline def setOrientation(value: typings.unsplashJs.mod.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Collections extends StObject {
    
    var collections: js.UndefOr[CollectionIds] = js.undefined
    
    var color: js.UndefOr[
        black_and_white | black | white | yellow | orange | red | purple | magenta | green | teal | blue
      ] = js.undefined
    
    var contentFilter: js.UndefOr[ContentSafety] = js.undefined
    
    var lang: js.UndefOr[Languages] = js.undefined
    
    var orderBy: js.UndefOr[latest | relevant] = js.undefined
    
    var orientation: js.UndefOr[typings.unsplashJs.mod.Orientation] = js.undefined
  }
  object Collections {
    
    inline def apply(): Collections = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Collections]
    }
    
    extension [Self <: Collections](x: Self) {
      
      inline def setCollections(value: CollectionIds): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      inline def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
      
      inline def setCollectionsVarargs(value: (Double | String)*): Self = StObject.set(x, "collections", js.Array(value :_*))
      
      inline def setColor(
        value: black_and_white | black | white | yellow | orange | red | purple | magenta | green | teal | blue
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContentFilter(value: ContentSafety): Self = StObject.set(x, "contentFilter", value.asInstanceOf[js.Any])
      
      inline def setContentFilterUndefined: Self = StObject.set(x, "contentFilter", js.undefined)
      
      inline def setLang(value: Languages): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setOrderBy(value: latest | relevant): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      inline def setOrientation(value: typings.unsplashJs.mod.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
  
  trait Downloadlocation extends StObject {
    
    var download_location: String
  }
  object Downloadlocation {
    
    inline def apply(download_location: String): Downloadlocation = {
      val __obj = js.Dynamic.literal(download_location = download_location.asInstanceOf[js.Any])
      __obj.asInstanceOf[Downloadlocation]
    }
    
    extension [Self <: Downloadlocation](x: Self) {
      
      inline def setDownload_location(value: String): Self = StObject.set(x, "download_location", value.asInstanceOf[js.Any])
    }
  }
  
  trait Links extends StObject {
    
    var links: Downloadlocation
  }
  object Links {
    
    inline def apply(links: Downloadlocation): Links = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
      __obj.asInstanceOf[Links]
    }
    
    extension [Self <: Links](x: Self) {
      
      inline def setLinks(value: Downloadlocation): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    }
  }
  
  trait Orientation extends StObject {
    
    var orientation: js.UndefOr[typings.unsplashJs.mod.Orientation] = js.undefined
  }
  object Orientation {
    
    inline def apply(): Orientation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Orientation]
    }
    
    extension [Self <: Orientation](x: Self) {
      
      inline def setOrientation(value: typings.unsplashJs.mod.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
  
  trait OrientationOrientation extends StObject {
    
    var orientation: typings.unsplashJs.mod.Orientation
  }
  object OrientationOrientation {
    
    inline def apply(orientation: typings.unsplashJs.mod.Orientation): OrientationOrientation = {
      val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrientationOrientation]
    }
    
    extension [Self <: OrientationOrientation](x: Self) {
      
      inline def setOrientation(value: typings.unsplashJs.mod.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stats extends StObject {
    
    var orientation: js.UndefOr[typings.unsplashJs.mod.Orientation] = js.undefined
    
    var stats: js.UndefOr[Boolean] = js.undefined
  }
  object Stats {
    
    inline def apply(): Stats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setOrientation(value: typings.unsplashJs.mod.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
}
