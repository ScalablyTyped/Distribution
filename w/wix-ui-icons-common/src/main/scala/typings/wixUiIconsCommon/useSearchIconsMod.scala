package typings.wixUiIconsCommon

import typings.wixUiIconsCommon.anon.DebouncedSearch
import typings.wixUiIconsCommon.typesMod.IconMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-icons-common/dist/stories/components/category-list/useSearchIcons", JSImport.Namespace)
@js.native
object useSearchIconsMod extends js.Object {
  
  /** Searches icons
    * and sets the results to state
    * returns filtered and a debounced `searchCategoryIcons`
    */
  def default(iconsMetadata: js.Array[IconMetadata], keys: js.Array[String]): DebouncedSearch = js.native
}
