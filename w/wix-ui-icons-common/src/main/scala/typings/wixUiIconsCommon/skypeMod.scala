package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSkypeMod.SkypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skypeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Skype", JSImport.Default)
  @js.native
  val default: FC[SkypeProps] = js.native
  
  type _To = FC[SkypeProps]
  
  /* This means you don't have to write `default`, but can instead just say `skypeMod.foo` */
  override def _to: FC[SkypeProps] = default
}
