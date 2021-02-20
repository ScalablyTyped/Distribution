package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.categoryListCategoryListMod.CategoryListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryListMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/stories/components/category-list", JSImport.Default)
  @js.native
  val default: FC[CategoryListProps] = js.native
  
  type _To = FC[CategoryListProps]
  
  /* This means you don't have to write `default`, but can instead just say `categoryListMod.foo` */
  override def _to: FC[CategoryListProps] = default
}
