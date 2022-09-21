package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPageAddMod.PageAddProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageAddMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/PageAdd", JSImport.Default)
  @js.native
  val default: FC[PageAddProps] = js.native
  
  type _To = FC[PageAddProps]
  
  /* This means you don't have to write `default`, but can instead just say `pageAddMod.foo` */
  override def _to: FC[PageAddProps] = default
}
