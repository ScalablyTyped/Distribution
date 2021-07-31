package typings.wixUiIconsCommon

import typings.wixUiIconsCommon.anon.DebouncedSearch
import typings.wixUiIconsCommon.typesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSearchIconsMod {
  
  @JSImport("wix-ui-icons-common/dist/stories/components/category-list/useSearchIcons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Searches icons
    * and sets the results to state
    * returns filtered and a debounced `searchCategoryIcons`
    */
  @scala.inline
  def default(iconsMetadata: js.Array[IconMetadata], keys: js.Array[String]): DebouncedSearch = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iconsMetadata.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[DebouncedSearch]
}
