package typings.unsplashJs.anon

import typings.unsplashJs.distHelpersRequestMod.AdditionalFetchOptions
import typings.unsplashJs.distHelpersResponseMod.ApiResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCollections extends StObject {
  
  def get(a: Username): js.Promise[ApiResponse[typings.unsplashJs.distMethodsTopicsTypesMod.Full]] = js.native
  def get(a: Username, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[typings.unsplashJs.distMethodsTopicsTypesMod.Full]] = js.native
  
  def getCollections(a: usernamestringPaginationP): js.Promise[ApiResponse[ResultsTotal]] = js.native
  def getCollections(a: usernamestringPaginationP, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[ResultsTotal]] = js.native
  
  def getLikes(a: OrientationParamusernames): js.Promise[ApiResponse[ResultsTotal]] = js.native
  def getLikes(a: OrientationParamusernames, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[ResultsTotal]] = js.native
  
  def getPhotos(a: statsbooleanundefineduser): js.Promise[ApiResponse[ResultsTotal]] = js.native
  def getPhotos(a: statsbooleanundefineduser, additionalFetchOptions: AdditionalFetchOptions): js.Promise[ApiResponse[ResultsTotal]] = js.native
}
