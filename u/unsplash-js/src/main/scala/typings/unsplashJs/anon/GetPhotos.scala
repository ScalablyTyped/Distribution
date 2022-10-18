package typings.unsplashJs.anon

import typings.unsplashJs.distHelpersRequestMod.AdditionalFetchOptions
import typings.unsplashJs.distHelpersResponseMod.ApiResponse
import typings.unsplashJs.distMethodsSearchMod.SearchParams
import typings.unsplashJs.distMethodsSearchTypesResponseMod.Users
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPhotos extends StObject {
  
  def getCollections(a: SearchParams): js.Promise[ApiResponse[typings.unsplashJs.distMethodsSearchTypesResponseMod.Collections]] = js.native
  def getCollections(a: SearchParams, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[typings.unsplashJs.distMethodsSearchTypesResponseMod.Collections]] = js.native
  
  def getPhotos(a: querystringorderBySearchO): js.Promise[ApiResponse[typings.unsplashJs.distMethodsSearchTypesResponseMod.Photos]] = js.native
  def getPhotos(a: querystringorderBySearchO, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[typings.unsplashJs.distMethodsSearchTypesResponseMod.Photos]] = js.native
  
  def getUsers(a: SearchParams): js.Promise[ApiResponse[Users]] = js.native
  def getUsers(a: SearchParams, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Users]] = js.native
}
