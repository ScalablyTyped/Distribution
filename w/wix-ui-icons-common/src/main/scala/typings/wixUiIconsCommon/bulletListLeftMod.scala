package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsBulletListLeftMod.BulletListLeftProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bulletListLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/BulletListLeft", JSImport.Default)
  @js.native
  val default: FC[BulletListLeftProps] = js.native
  
  type _To = FC[BulletListLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `bulletListLeftMod.foo` */
  override def _to: FC[BulletListLeftProps] = default
}
