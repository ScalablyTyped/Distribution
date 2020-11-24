package typings.wixUiIconsCommon.categoryTableCategoryTableMod

import typings.wixUiIconsCommon.storiesTypesMod.CategoryTableRow
import typings.wixUiIconsCommon.typesMod.IconMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryTableProps extends js.Object {
  
  var iconsMetadata: js.Array[IconMetadata] = js.native
  
  def mapIconToRow(iconMetadata: IconMetadata): CategoryTableRow = js.native
  
  var tableHeaderTitles: js.Array[String] = js.native
  
  var title: String = js.native
}
object CategoryTableProps {
  
  @scala.inline
  def apply(
    iconsMetadata: js.Array[IconMetadata],
    mapIconToRow: IconMetadata => CategoryTableRow,
    tableHeaderTitles: js.Array[String],
    title: String
  ): CategoryTableProps = {
    val __obj = js.Dynamic.literal(iconsMetadata = iconsMetadata.asInstanceOf[js.Any], mapIconToRow = js.Any.fromFunction1(mapIconToRow), tableHeaderTitles = tableHeaderTitles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryTableProps]
  }
  
  @scala.inline
  implicit class CategoryTablePropsOps[Self <: CategoryTableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIconsMetadataVarargs(value: IconMetadata*): Self = this.set("iconsMetadata", js.Array(value :_*))
    
    @scala.inline
    def setIconsMetadata(value: js.Array[IconMetadata]): Self = this.set("iconsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapIconToRow(value: IconMetadata => CategoryTableRow): Self = this.set("mapIconToRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTableHeaderTitlesVarargs(value: String*): Self = this.set("tableHeaderTitles", js.Array(value :_*))
    
    @scala.inline
    def setTableHeaderTitles(value: js.Array[String]): Self = this.set("tableHeaderTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
