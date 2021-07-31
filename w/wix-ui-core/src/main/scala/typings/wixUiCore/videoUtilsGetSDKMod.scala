package typings.wixUiCore

import typings.wixUiCore.srcComponentsVideoTypesMod.ISDKConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoUtilsGetSDKMod {
  
  @JSImport("wix-ui-core/src/components/video/utils/getSDK", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSDK(hasNameUrlOnReadyIsLoadedResolveRequireIsRequireAllow: ISDKConfig): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSDK")(hasNameUrlOnReadyIsLoadedResolveRequireIsRequireAllow.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def mockLoadjs(mockedLoadjs: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mockLoadjs")(mockedLoadjs.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
