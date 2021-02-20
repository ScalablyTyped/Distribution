package typings.wixUiIconsCommon

import typings.wixUiIconsCommon.anon.DebouncedSearch
import typings.wixUiIconsCommon.typesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSearchIconsMod {
  
  /** Searches icons
    * and sets the results to state
    * returns filtered and a debounced `searchCategoryIcons`
    */
  @JSImport("wix-ui-icons-common/dist/stories/components/category-list/useSearchIcons", JSImport.Default)
  @js.native
  def default(iconsMetadata: js.Array[IconMetadata], keys: js.Array[String]): DebouncedSearch = js.native
}
