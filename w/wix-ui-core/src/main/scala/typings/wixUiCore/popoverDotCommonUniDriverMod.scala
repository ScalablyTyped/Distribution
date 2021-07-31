package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.anon.GetContentElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverDotCommonUniDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/Popover.common.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def CommonDriver(base: UniDriver[js.Any], body: UniDriver[js.Any]): GetContentElement = (^.asInstanceOf[js.Dynamic].applyDynamic("CommonDriver")(base.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[GetContentElement]
}
