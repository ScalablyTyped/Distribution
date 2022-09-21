package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distComponentsApplyToMod.ApplyToProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyToMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/ApplyTo", JSImport.Default)
  @js.native
  val default: FC[ApplyToProps] = js.native
  
  type _To = FC[ApplyToProps]
  
  /* This means you don't have to write `default`, but can instead just say `applyToMod.foo` */
  override def _to: FC[ApplyToProps] = default
}
