package typings.wixUiIconsCommon.categoryListCategoryListMod

import typings.wixUiIconsCommon.storiesTypesMod.CategoryTableRow
import typings.wixUiIconsCommon.typesMod.IconMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryListProps extends js.Object {
  
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
  implicit class CategoryListPropsOps[Self <: CategoryListProps] (val x: Self) extends AnyVal {
    
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
    def setSearchKeysVarargs(value: String*): Self = this.set("searchKeys", js.Array(value :_*))
    
    @scala.inline
    def setSearchKeys(value: js.Array[String]): Self = this.set("searchKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableHeaderTitlesVarargs(value: String*): Self = this.set("tableHeaderTitles", js.Array(value :_*))
    
    @scala.inline
    def setTableHeaderTitles(value: js.Array[String]): Self = this.set("tableHeaderTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDataHook(value: String): Self = this.set("dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataHook: Self = this.set("dataHook", js.undefined)
  }
}
