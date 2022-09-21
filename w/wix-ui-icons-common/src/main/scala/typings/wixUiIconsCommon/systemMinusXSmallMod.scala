package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.minusXSmallMod.MinusXSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemMinusXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/MinusXSmall", JSImport.Default)
  @js.native
  val default: FC[MinusXSmallProps] = js.native
  
  type _To = FC[MinusXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemMinusXSmallMod.foo` */
  override def _to: FC[MinusXSmallProps] = default
}
