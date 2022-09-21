package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.storiesTypesMod.GeneralCategoryListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalCategoryListBaseMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/stories/components/general-category-list-base/GeneralCategoryListBase", JSImport.Default)
  @js.native
  val default: FC[GeneralCategoryListProps] = js.native
  
  type _To = FC[GeneralCategoryListProps]
  
  /* This means you don't have to write `default`, but can instead just say `generalCategoryListBaseMod.foo` */
  override def _to: FC[GeneralCategoryListProps] = default
}
