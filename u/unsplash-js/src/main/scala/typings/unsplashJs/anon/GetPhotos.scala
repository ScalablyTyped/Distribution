package typings.unsplashJs.anon

import typings.unsplashJs.requestMod.AdditionalFetchOptions
import typings.unsplashJs.responseMod.ApiResponse
import typings.unsplashJs.searchMod.SearchParams
import typings.unsplashJs.typesResponseMod.Users
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPhotos extends StObject {
  
  def getCollections(a: SearchParams): js.Promise[ApiResponse[typings.unsplashJs.typesResponseMod.Collections]] = js.native
  def getCollections(a: SearchParams, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[typings.unsplashJs.typesResponseMod.Collections]] = js.native
  
  def getPhotos(a: querystringorderBySearchO): js.Promise[ApiResponse[typings.unsplashJs.typesResponseMod.Photos]] = js.native
  def getPhotos(a: querystringorderBySearchO, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[typings.unsplashJs.typesResponseMod.Photos]] = js.native
  
  def getUsers(a: SearchParams): js.Promise[ApiResponse[Users]] = js.native
  def getUsers(a: SearchParams, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Users]] = js.native
}
