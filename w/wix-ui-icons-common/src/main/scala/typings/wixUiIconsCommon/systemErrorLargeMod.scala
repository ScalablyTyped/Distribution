package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.errorLargeMod.ErrorLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemErrorLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/ErrorLarge", JSImport.Default)
  @js.native
  val default: FC[ErrorLargeProps] = js.native
  
  type _To = FC[ErrorLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemErrorLargeMod.foo` */
  override def _to: FC[ErrorLargeProps] = default
}
