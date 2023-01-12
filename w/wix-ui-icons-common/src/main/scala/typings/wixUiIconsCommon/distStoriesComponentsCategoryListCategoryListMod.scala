package typings.wixUiIconsCommon

import typings.react.mod.FC
import typings.wixUiIconsCommon.distSrcTypesMod.IconMetadata
import typings.wixUiIconsCommon.distStoriesTypesMod.Category
import typings.wixUiIconsCommon.distStoriesTypesMod.CategoryTableRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStoriesComponentsCategoryListCategoryListMod {
  
  @JSImport("wix-ui-icons-common/dist/stories/components/category-list/CategoryList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-icons-common/dist/stories/components/category-list/CategoryList", JSImport.Default)
  @js.native
  val default: FC[CategoryListProps] = js.native
  
  inline def mapIconsToCategories(iconsMetadata: js.Array[IconMetadata]): js.Array[Category] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapIconsToCategories")(iconsMetadata.asInstanceOf[js.Any]).asInstanceOf[js.Array[Category]]
  
  trait CategoryListProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var iconsMetadata: js.Array[IconMetadata]
    
    def mapIconToRow(iconMetadata: IconMetadata): CategoryTableRow
    
    var searchKeys: js.Array[String]
    
    var tableHeaderTitles: js.Array[String]
  }
  object CategoryListProps {
    
    inline def apply(
      iconsMetadata: js.Array[IconMetadata],
      mapIconToRow: IconMetadata => CategoryTableRow,
      searchKeys: js.Array[String],
      tableHeaderTitles: js.Array[String]
    ): CategoryListProps = {
      val __obj = js.Dynamic.literal(iconsMetadata = iconsMetadata.asInstanceOf[js.Any], mapIconToRow = js.Any.fromFunction1(mapIconToRow), searchKeys = searchKeys.asInstanceOf[js.Any], tableHeaderTitles = tableHeaderTitles.asInstanceOf[js.Any])
      __obj.asInstanceOf[CategoryListProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CategoryListProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setIconsMetadata(value: js.Array[IconMetadata]): Self = StObject.set(x, "iconsMetadata", value.asInstanceOf[js.Any])
      
      inline def setIconsMetadataVarargs(value: IconMetadata*): Self = StObject.set(x, "iconsMetadata", js.Array(value*))
      
      inline def setMapIconToRow(value: IconMetadata => CategoryTableRow): Self = StObject.set(x, "mapIconToRow", js.Any.fromFunction1(value))
      
      inline def setSearchKeys(value: js.Array[String]): Self = StObject.set(x, "searchKeys", value.asInstanceOf[js.Any])
      
      inline def setSearchKeysVarargs(value: String*): Self = StObject.set(x, "searchKeys", js.Array(value*))
      
      inline def setTableHeaderTitles(value: js.Array[String]): Self = StObject.set(x, "tableHeaderTitles", value.asInstanceOf[js.Any])
      
      inline def setTableHeaderTitlesVarargs(value: String*): Self = StObject.set(x, "tableHeaderTitles", js.Array(value*))
    }
  }
}
