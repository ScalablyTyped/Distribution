package typings.unsplashJs.anon

import typings.unsplashJs.requestMod.AdditionalFetchOptions
import typings.unsplashJs.responseMod.ApiResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends StObject {
  
  def get(a: TopicIdOrSlug): js.Promise[ApiResponse[typings.unsplashJs.topicsTypesMod.Full]] = js.native
  def get(a: TopicIdOrSlug, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[typings.unsplashJs.topicsTypesMod.Full]] = js.native
  
  def getPhotos(a: topicIdOrSlugstringPagina): js.Promise[ApiResponse[Results]] = js.native
  def getPhotos(a: topicIdOrSlugstringPagina, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Results]] = js.native
  
  def list(a: OmitStrictPaginationParam): js.Promise[ApiResponse[Results]] = js.native
  def list(a: OmitStrictPaginationParam, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Results]] = js.native
}
