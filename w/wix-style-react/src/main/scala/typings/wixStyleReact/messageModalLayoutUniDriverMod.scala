package typings.wixStyleReact

import typings.wixStyleReact.baseModalLayoutUniDriverMod.BaseModalLayoutUniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageModalLayoutUniDriverMod {
  
  @JSImport("wix-style-react/dist/es/src/MessageModalLayout/MessageModalLayout.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def messageModalLayoutDriverFactory(base: BaseUniDriver): MessageModalLayoutUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("messageModalLayoutDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[MessageModalLayoutUniDriver]
  
  type MessageModalLayoutUniDriver = BaseModalLayoutUniDriver
}
