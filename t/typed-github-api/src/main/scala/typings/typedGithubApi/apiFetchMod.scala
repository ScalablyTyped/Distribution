package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.typedGithubApiStrings.`thor-preview`
import typings.typedGithubApi.typedGithubApiStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiFetchMod {
  
  @JSImport("typed-github-api/dist/api-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAllPagesAsync[T](uri: String, options: Options): js.Promise[js.Array[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllPagesAsync")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T] | Null]]
  
  @scala.inline
  def getAsync[T](uri: String, options: Options): js.Promise[Response[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAsync")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response[T] | Null]]
  
  trait Options
    extends StObject
       with OptionsOrRef {
    
    var oAuthToken: js.UndefOr[String] = js.undefined
    
    var userAgent: String
    
    var version: js.UndefOr[v3 | `thor-preview`] = js.undefined
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
  
  trait Response[T] extends StObject {
    
    var data: T
    
    var nextLink: js.UndefOr[String] = js.undefined
  }
  object Response {
    
    @scala.inline
    def apply[T](data: T): Response[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response[T]]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response[?], T] (val x: Self & Response[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
    }
  }
}
