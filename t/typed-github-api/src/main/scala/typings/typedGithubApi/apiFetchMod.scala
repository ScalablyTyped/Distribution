package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.typedGithubApiStrings.`thor-preview`
import typings.typedGithubApi.typedGithubApiStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiFetchMod {
  
  @JSImport("typed-github-api/dist/api-fetch", "getAllPagesAsync")
  @js.native
  def getAllPagesAsync[T](uri: String, options: Options): js.Promise[js.Array[T] | Null] = js.native
  
  @JSImport("typed-github-api/dist/api-fetch", "getAsync")
  @js.native
  def getAsync[T](uri: String, options: Options): js.Promise[Response[T] | Null] = js.native
  
  @js.native
  trait Options extends OptionsOrRef {
    
    var oAuthToken: js.UndefOr[String] = js.native
    
    var userAgent: String = js.native
    
    var version: js.UndefOr[v3 | `thor-preview`] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(userAgent: String): Options = {
      val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOAuthToken(value: String): Self = StObject.set(x, "oAuthToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAuthTokenUndefined: Self = StObject.set(x, "oAuthToken", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: v3 | `thor-preview`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Response[T] extends StObject {
    
    var data: T = js.native
    
    var nextLink: js.UndefOr[String] = js.native
  }
  object Response {
    
    @scala.inline
    def apply[T](data: T): Response[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response[T]]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response[_], T] (val x: Self with Response[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
    }
  }
}
