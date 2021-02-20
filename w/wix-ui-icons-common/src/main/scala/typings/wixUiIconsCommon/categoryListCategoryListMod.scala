package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.storiesTypesMod.Category
import typings.wixUiIconsCommon.storiesTypesMod.CategoryTableRow
import typings.wixUiIconsCommon.typesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryListCategoryListMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/stories/components/category-list/CategoryList", JSImport.Default)
  @js.native
  val default: FC[CategoryListProps] = js.native
  
  @JSImport("wix-ui-icons-common/dist/stories/components/category-list/CategoryList", "mapIconsToCategories")
  @js.native
  def mapIconsToCategories(iconsMetadata: js.Array[IconMetadata]): js.Array[Category] = js.native
  
  @js.native
  trait CategoryListProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var dataHook: js.UndefOr[String] = js.native
    
    var iconsMetadata: js.Array[IconMetadata] = js.native
    
    def mapIconToRow(iconMetadata: IconMetadata): CategoryTableRow = js.native
    
    var searchKeys: js.Array[String] = js.native
    
    var tableHeaderTitles: js.Array[String] = js.native
  }
  object CategoryListProps {
    
    @scala.inline
    def apply(
      iconsMetadata: js.Array[IconMetadata],
      mapIconToRow: IconMetadata => CategoryTableRow,
      searchKeys: js.Array[String],
      tableHeaderTitles: js.Array[String]
    ): CategoryListProps = {
      val __obj = js.Dynamic.literal(iconsMetadata = iconsMetadata.asInstanceOf[js.Any], mapIconToRow = js.Any.fromFunction1(mapIconToRow), searchKeys = searchKeys.asInstanceOf[js.Any], tableHeaderTitles = tableHeaderTitles.asInstanceOf[js.Any])
      __obj.asInstanceOf[CategoryListProps]
    }
    
    @scala.inline
    implicit class CategoryListPropsMutableBuilder[Self <: CategoryListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setIconsMetadata(value: js.Array[IconMetadata]): Self = StObject.set(x, "iconsMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsMetadataVarargs(value: IconMetadata*): Self = StObject.set(x, "iconsMetadata", js.Array(value :_*))
      
      @scala.inline
      def setMapIconToRow(value: IconMetadata => CategoryTableRow): Self = StObject.set(x, "mapIconToRow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSearchKeys(value: js.Array[String]): Self = StObject.set(x, "searchKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchKeysVarargs(value: String*): Self = StObject.set(x, "searchKeys", js.Array(value :_*))
      
      @scala.inline
      def setTableHeaderTitles(value: js.Array[String]): Self = StObject.set(x, "tableHeaderTitles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeaderTitlesVarargs(value: String*): Self = StObject.set(x, "tableHeaderTitles", js.Array(value :_*))
    }
  }
  
  type _To = FC[CategoryListProps]
  
  /* This means you don't have to write `default`, but can instead just say `categoryListCategoryListMod.foo` */
  override def _to: FC[CategoryListProps] = default
}
