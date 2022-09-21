package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsHeartBoldMod.HeartBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heartBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/HeartBold", JSImport.Default)
  @js.native
  val default: FC[HeartBoldProps] = js.native
  
  type _To = FC[HeartBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `heartBoldMod.foo` */
  override def _to: FC[HeartBoldProps] = default
}
