package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.plusXSmallMod.PlusXSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemPlusXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/PlusXSmall", JSImport.Default)
  @js.native
  val default: FC[PlusXSmallProps] = js.native
  
  type _To = FC[PlusXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemPlusXSmallMod.foo` */
  override def _to: FC[PlusXSmallProps] = default
}
