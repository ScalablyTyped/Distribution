package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.deleteLargeMod.DeleteLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemDeleteLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/DeleteLarge", JSImport.Default)
  @js.native
  val default: FC[DeleteLargeProps] = js.native
  
  type _To = FC[DeleteLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemDeleteLargeMod.foo` */
  override def _to: FC[DeleteLargeProps] = default
}
