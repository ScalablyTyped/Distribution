package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSectionsMod.SectionsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectionsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Sections", JSImport.Default)
  @js.native
  val default: FC[SectionsProps] = js.native
  
  type _To = FC[SectionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `sectionsMod.foo` */
  override def _to: FC[SectionsProps] = default
}
