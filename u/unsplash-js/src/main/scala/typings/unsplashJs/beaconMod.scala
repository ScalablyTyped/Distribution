package typings.unsplashJs

import typings.std.Response
import typings.unsplashJs.anon.AppId
import typings.unsplashJs.anon.PhotoId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beaconMod {
  
  @JSImport("unsplash-js/dist/beacon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def trackNonHotLinkedPhotoView(hasAppId: AppId): js.Function1[/* hasPhotoId */ PhotoId, js.Promise[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("trackNonHotLinkedPhotoView")(hasAppId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasPhotoId */ PhotoId, js.Promise[Response]]]
}
