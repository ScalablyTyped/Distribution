package typings.unsplashJs

import typings.std.Response
import typings.unsplashJs.anon.AppId
import typings.unsplashJs.anon.PhotoId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBeaconMod {
  
  @JSImport("unsplash-js/dist/beacon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def trackNonHotLinkedPhotoView(param0: AppId): js.Function1[/* param0 */ PhotoId, js.Promise[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("trackNonHotLinkedPhotoView")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param0 */ PhotoId, js.Promise[Response]]]
}
