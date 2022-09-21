package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.errorSmallMod.ErrorSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageErrorSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/ErrorSmall", JSImport.Default)
  @js.native
  val default: FC[ErrorSmallProps] = js.native
  
  type _To = FC[ErrorSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageErrorSmallMod.foo` */
  override def _to: FC[ErrorSmallProps] = default
}
