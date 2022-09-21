package typings.unsplashJs.anon

import typings.unsplashJs.requestMod.AdditionalFetchOptions
import typings.unsplashJs.responseMod.ApiResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCollections extends StObject {
  
  def get(a: Username): js.Promise[ApiResponse[typings.unsplashJs.topicsTypesMod.Full]] = js.native
  def get(a: Username, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[typings.unsplashJs.topicsTypesMod.Full]] = js.native
  
  def getCollections(a: usernamestringPaginationP): js.Promise[ApiResponse[Results]] = js.native
  def getCollections(a: usernamestringPaginationP, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Results]] = js.native
  
  def getLikes(a: OrientationParamusernames): js.Promise[ApiResponse[Results]] = js.native
  def getLikes(a: OrientationParamusernames, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Results]] = js.native
  
  def getPhotos(a: statsbooleanundefineduser): js.Promise[ApiResponse[Results]] = js.native
  def getPhotos(a: statsbooleanundefineduser, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[Results]] = js.native
}
