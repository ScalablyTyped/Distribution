package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsRssMod.RssProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rssMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Rss", JSImport.Default)
  @js.native
  val default: FC[RssProps] = js.native
  
  type _To = FC[RssProps]
  
  /* This means you don't have to write `default`, but can instead just say `rssMod.foo` */
  override def _to: FC[RssProps] = default
}
