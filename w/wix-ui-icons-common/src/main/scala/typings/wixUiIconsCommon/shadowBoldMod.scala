package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsShadowBoldMod.ShadowBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ShadowBold", JSImport.Default)
  @js.native
  val default: FC[ShadowBoldProps] = js.native
  
  type _To = FC[ShadowBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `shadowBoldMod.foo` */
  override def _to: FC[ShadowBoldProps] = default
}
