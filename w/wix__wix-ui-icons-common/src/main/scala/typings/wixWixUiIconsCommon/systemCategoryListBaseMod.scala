package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixWixUiIconsCommon.typesMod.SystemCategoryListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemCategoryListBaseMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/system-category-list-base/SystemCategoryListBase", JSImport.Default)
  @js.native
  val default: FC[SystemCategoryListProps] = js.native
  
  type _To = FC[SystemCategoryListProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemCategoryListBaseMod.foo` */
  override def _to: FC[SystemCategoryListProps] = default
}
