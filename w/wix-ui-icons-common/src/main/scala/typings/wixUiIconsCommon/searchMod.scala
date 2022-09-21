package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSearchMod.SearchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Search", JSImport.Default)
  @js.native
  val default: FC[SearchProps] = js.native
  
  type _To = FC[SearchProps]
  
  /* This means you don't have to write `default`, but can instead just say `searchMod.foo` */
  override def _to: FC[SearchProps] = default
}
