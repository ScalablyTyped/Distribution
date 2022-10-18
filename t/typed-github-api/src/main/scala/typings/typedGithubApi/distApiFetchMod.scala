package typings.typedGithubApi

import typings.typedGithubApi.distGithubRefMod.OptionsOrRef
import typings.typedGithubApi.typedGithubApiStrings.`thor-preview`
import typings.typedGithubApi.typedGithubApiStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiFetchMod {
  
  @JSImport("typed-github-api/dist/api-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllPagesAsync[T](uri: String, options: Options): js.Promise[js.Array[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllPagesAsync")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T] | Null]]
  
  inline def getAsync[T](uri: String, options: Options): js.Promise[Response[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAsync")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response[T] | Null]]
  
  trait Options
    extends StObject
       with OptionsOrRef {
    
    var oAuthToken: js.UndefOr[String] = js.undefined
    
    var userAgent: String
    
    var version: js.UndefOr[v3 | `thor-preview`] = js.undefined
  }
  object Options {
    
    inline def apply(userAgent: String): Options = {
      val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOAuthToken(value: String): Self = StObject.set(x, "oAuthToken", value.asInstanceOf[js.Any])
      
      inline def setOAuthTokenUndefined: Self = StObject.set(x, "oAuthToken", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: v3 | `thor-preview`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Response[T] extends StObject {
    
    var data: T
    
    var nextLink: js.UndefOr[String] = js.undefined
  }
  object Response {
    
    inline def apply[T](data: T): Response[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response[T]]
    }
    
    extension [Self <: Response[?], T](x: Self & Response[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
      
      inline def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
    }
  }
}
