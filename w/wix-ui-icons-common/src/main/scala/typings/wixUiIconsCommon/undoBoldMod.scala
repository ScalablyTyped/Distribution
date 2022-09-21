package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUndoBoldMod.UndoBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undoBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/UndoBold", JSImport.Default)
  @js.native
  val default: FC[UndoBoldProps] = js.native
  
  type _To = FC[UndoBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `undoBoldMod.foo` */
  override def _to: FC[UndoBoldProps] = default
}
