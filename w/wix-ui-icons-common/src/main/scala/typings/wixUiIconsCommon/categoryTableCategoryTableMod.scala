package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.storiesTypesMod.CategoryTableRow
import typings.wixUiIconsCommon.typesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryTableCategoryTableMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/stories/components/category-table/CategoryTable", JSImport.Default)
  @js.native
  val default: FC[CategoryTableProps] = js.native
  
  trait CategoryTableProps extends StObject {
    
    var iconsMetadata: js.Array[IconMetadata]
    
    def mapIconToRow(iconMetadata: IconMetadata): CategoryTableRow
    
    var tableHeaderTitles: js.Array[String]
    
    var title: String
  }
  object CategoryTableProps {
    
    inline def apply(
      iconsMetadata: js.Array[IconMetadata],
      mapIconToRow: IconMetadata => CategoryTableRow,
      tableHeaderTitles: js.Array[String],
      title: String
    ): CategoryTableProps = {
      val __obj = js.Dynamic.literal(iconsMetadata = iconsMetadata.asInstanceOf[js.Any], mapIconToRow = js.Any.fromFunction1(mapIconToRow), tableHeaderTitles = tableHeaderTitles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CategoryTableProps]
    }
    
    extension [Self <: CategoryTableProps](x: Self) {
      
      inline def setIconsMetadata(value: js.Array[IconMetadata]): Self = StObject.set(x, "iconsMetadata", value.asInstanceOf[js.Any])
      
      inline def setIconsMetadataVarargs(value: IconMetadata*): Self = StObject.set(x, "iconsMetadata", js.Array(value :_*))
      
      inline def setMapIconToRow(value: IconMetadata => CategoryTableRow): Self = StObject.set(x, "mapIconToRow", js.Any.fromFunction1(value))
      
      inline def setTableHeaderTitles(value: js.Array[String]): Self = StObject.set(x, "tableHeaderTitles", value.asInstanceOf[js.Any])
      
      inline def setTableHeaderTitlesVarargs(value: String*): Self = StObject.set(x, "tableHeaderTitles", js.Array(value :_*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[CategoryTableProps]
  
  /* This means you don't have to write `default`, but can instead just say `categoryTableCategoryTableMod.foo` */
  override def _to: FC[CategoryTableProps] = default
}
