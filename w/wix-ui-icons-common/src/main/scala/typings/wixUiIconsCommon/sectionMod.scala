package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSectionMod.SectionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectionMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Section", JSImport.Default)
  @js.native
  val default: FC[SectionProps] = js.native
  
  type _To = FC[SectionProps]
  
  /* This means you don't have to write `default`, but can instead just say `sectionMod.foo` */
  override def _to: FC[SectionProps] = default
}
