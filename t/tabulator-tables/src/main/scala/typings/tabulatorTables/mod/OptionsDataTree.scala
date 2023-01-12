package typings.tabulatorTables.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsDataTree extends StObject {
  
  /** To enable data trees in your table, set the dataTree property to true in your table constructor: */
  var dataTree: js.UndefOr[Boolean] = js.undefined
  
  /** Show tree branch icon. */
  var dataTreeBranchElement: js.UndefOr[Boolean | String] = js.undefined
  
  /** By default Tabulator will look for child rows in the _children field of a row data object. You can change this to look in a different field using the dataTreeChildField property in your table constructor: */
  var dataTreeChildField: js.UndefOr[String] = js.undefined
  
  /** Tree level indent in pixels */
  var dataTreeChildIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * The toggle button that allows users to collapse and expand the column can be customized to meet your needs. There are two options, dataTreeExpandElement and dataTreeCollapseElement, that can be set to replace the default toggle elements with your own.
    *
    * Both options can take either an html string representing the contents of the toggle element
    */
  var dataTreeCollapseElement: js.UndefOr[String | HTMLElement | Boolean] = js.undefined
  
  /** By default the toggle element will be inserted into the first column on the table. If you want the toggle element to be inserted in a different column you can pass the field name of the column to the dataTreeElementColumn setup option. */
  var dataTreeElementColumn: js.UndefOr[Boolean | String] = js.undefined
  
  /** The toggle button that allows users to expand the column. */
  var dataTreeExpandElement: js.UndefOr[String | HTMLElement | Boolean] = js.undefined
  
  var dataTreeFilter: js.UndefOr[Boolean] = js.undefined
  
  /** Propagate selection events from parent rows to children. */
  var dataTreeSelectPropagate: js.UndefOr[Boolean] = js.undefined
  
  var dataTreeSort: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default all nodes on the tree will start collapsed, you can customize the initial expansion state of the tree using the dataTreeStartExpanded option.*
    * This option can take one of three possible value types, either a boolean to indicate whether all nodes should start expanded or collapsed:
    */
  var dataTreeStartExpanded: js.UndefOr[
    Boolean | js.Array[Boolean] | (js.Function2[/* row */ RowComponent, /* level */ Double, Boolean])
  ] = js.undefined
}
object OptionsDataTree {
  
  inline def apply(): OptionsDataTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsDataTree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsDataTree] (val x: Self) extends AnyVal {
    
    inline def setDataTree(value: Boolean): Self = StObject.set(x, "dataTree", value.asInstanceOf[js.Any])
    
    inline def setDataTreeBranchElement(value: Boolean | String): Self = StObject.set(x, "dataTreeBranchElement", value.asInstanceOf[js.Any])
    
    inline def setDataTreeBranchElementUndefined: Self = StObject.set(x, "dataTreeBranchElement", js.undefined)
    
    inline def setDataTreeChildField(value: String): Self = StObject.set(x, "dataTreeChildField", value.asInstanceOf[js.Any])
    
    inline def setDataTreeChildFieldUndefined: Self = StObject.set(x, "dataTreeChildField", js.undefined)
    
    inline def setDataTreeChildIndent(value: Double): Self = StObject.set(x, "dataTreeChildIndent", value.asInstanceOf[js.Any])
    
    inline def setDataTreeChildIndentUndefined: Self = StObject.set(x, "dataTreeChildIndent", js.undefined)
    
    inline def setDataTreeCollapseElement(value: String | HTMLElement | Boolean): Self = StObject.set(x, "dataTreeCollapseElement", value.asInstanceOf[js.Any])
    
    inline def setDataTreeCollapseElementUndefined: Self = StObject.set(x, "dataTreeCollapseElement", js.undefined)
    
    inline def setDataTreeElementColumn(value: Boolean | String): Self = StObject.set(x, "dataTreeElementColumn", value.asInstanceOf[js.Any])
    
    inline def setDataTreeElementColumnUndefined: Self = StObject.set(x, "dataTreeElementColumn", js.undefined)
    
    inline def setDataTreeExpandElement(value: String | HTMLElement | Boolean): Self = StObject.set(x, "dataTreeExpandElement", value.asInstanceOf[js.Any])
    
    inline def setDataTreeExpandElementUndefined: Self = StObject.set(x, "dataTreeExpandElement", js.undefined)
    
    inline def setDataTreeFilter(value: Boolean): Self = StObject.set(x, "dataTreeFilter", value.asInstanceOf[js.Any])
    
    inline def setDataTreeFilterUndefined: Self = StObject.set(x, "dataTreeFilter", js.undefined)
    
    inline def setDataTreeSelectPropagate(value: Boolean): Self = StObject.set(x, "dataTreeSelectPropagate", value.asInstanceOf[js.Any])
    
    inline def setDataTreeSelectPropagateUndefined: Self = StObject.set(x, "dataTreeSelectPropagate", js.undefined)
    
    inline def setDataTreeSort(value: Boolean): Self = StObject.set(x, "dataTreeSort", value.asInstanceOf[js.Any])
    
    inline def setDataTreeSortUndefined: Self = StObject.set(x, "dataTreeSort", js.undefined)
    
    inline def setDataTreeStartExpanded(
      value: Boolean | js.Array[Boolean] | (js.Function2[/* row */ RowComponent, /* level */ Double, Boolean])
    ): Self = StObject.set(x, "dataTreeStartExpanded", value.asInstanceOf[js.Any])
    
    inline def setDataTreeStartExpandedFunction2(value: (/* row */ RowComponent, /* level */ Double) => Boolean): Self = StObject.set(x, "dataTreeStartExpanded", js.Any.fromFunction2(value))
    
    inline def setDataTreeStartExpandedUndefined: Self = StObject.set(x, "dataTreeStartExpanded", js.undefined)
    
    inline def setDataTreeStartExpandedVarargs(value: Boolean*): Self = StObject.set(x, "dataTreeStartExpanded", js.Array(value*))
    
    inline def setDataTreeUndefined: Self = StObject.set(x, "dataTree", js.undefined)
  }
}
