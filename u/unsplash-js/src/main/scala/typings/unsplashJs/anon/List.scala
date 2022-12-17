package typings.unsplashJs.anon

import typings.unsplashJs.distHelpersRequestMod.AdditionalFetchOptions
import typings.unsplashJs.distHelpersResponseMod.ApiResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends StObject {
  
  def get(a: TopicIdOrSlug): js.Promise[ApiResponse[typings.unsplashJs.distMethodsTopicsTypesMod.Full]] = js.native
  def get(a: TopicIdOrSlug, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[typings.unsplashJs.distMethodsTopicsTypesMod.Full]] = js.native
  
  def getPhotos(a: topicIdOrSlugstringPagina): js.Promise[ApiResponse[Results]] = js.native
  def getPhotos(a: topicIdOrSlugstringPagina, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Results]] = js.native
  
  def list(a: OmitStrictPaginationParam): js.Promise[ApiResponse[Results]] = js.native
  def list(a: OmitStrictPaginationParam, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Results]] = js.native
}
