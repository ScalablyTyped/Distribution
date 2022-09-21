package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.clearXSmallMod.ClearXSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemClearXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/ClearXSmall", JSImport.Default)
  @js.native
  val default: FC[ClearXSmallProps] = js.native
  
  type _To = FC[ClearXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemClearXSmallMod.foo` */
  override def _to: FC[ClearXSmallProps] = default
}
