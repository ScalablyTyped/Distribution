package typings.unsplashJs.anon

import typings.unsplashJs.distHelpersRequestMod.AdditionalFetchOptions
import typings.unsplashJs.distHelpersResponseMod.ApiResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelated extends StObject {
  
  def get(a: CollectionId): js.Promise[ApiResponse[Any]] = js.native
  def get(a: CollectionId, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Any]] = js.native
  
  def getPhotos(a: collectionIdstringPaginat): js.Promise[ApiResponse[Results]] = js.native
  def getPhotos(a: collectionIdstringPaginat, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Results]] = js.native
  
  def getRelated(a: CollectionId): js.Promise[ApiResponse[Any]] = js.native
  def getRelated(a: CollectionId, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Any]] = js.native
  
  def list(): js.Promise[ApiResponse[Results]] = js.native
  def list(a: Unit, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Results]] = js.native
  def list(a: PickPaginationParamspagep): js.Promise[ApiResponse[Results]] = js.native
  def list(a: PickPaginationParamspagep, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Results]] = js.native
}
