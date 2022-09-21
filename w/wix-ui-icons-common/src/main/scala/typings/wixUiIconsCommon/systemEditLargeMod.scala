package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.editLargeMod.EditLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemEditLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/EditLarge", JSImport.Default)
  @js.native
  val default: FC[EditLargeProps] = js.native
  
  type _To = FC[EditLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemEditLargeMod.foo` */
  override def _to: FC[EditLargeProps] = default
}
