package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.blogMod.BlogProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageBlogMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/Blog", JSImport.Default)
  @js.native
  val default: FC[BlogProps] = js.native
  
  type _To = FC[BlogProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageBlogMod.foo` */
  override def _to: FC[BlogProps] = default
}
