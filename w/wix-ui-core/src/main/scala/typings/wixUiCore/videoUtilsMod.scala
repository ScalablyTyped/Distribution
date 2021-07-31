package typings.wixUiCore

import typings.wixUiCore.videoTypesMod.ISDKConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoUtilsMod {
  
  @JSImport("wix-ui-core/dist/src/components/video/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSDK(hasNameUrlOnReadyIsLoadedResolveRequireIsRequireAllow: ISDKConfig): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSDK")(hasNameUrlOnReadyIsLoadedResolveRequireIsRequireAllow.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
