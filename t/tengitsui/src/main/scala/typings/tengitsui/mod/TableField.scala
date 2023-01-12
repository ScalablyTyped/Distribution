package typings.tengitsui.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableField extends StObject {
  
  var beforeOptionRender: js.UndefOr[js.Function1[/* items */ String | js.Array[String], Any]] = js.undefined
  
  var compute: js.UndefOr[ComputeFnc] = js.undefined
  
  var editable: js.UndefOr[Boolean | editableFnc] = js.undefined
  
  var filters: js.UndefOr[js.Array[ColumnFilter]] = js.undefined
  
  var name: String
  
  var noclean: js.UndefOr[Boolean] = js.undefined
  
  var nocopy: js.UndefOr[Boolean] = js.undefined
  
  var optionCompute: js.UndefOr[OptionComputeFnc] = js.undefined
  
  var options: js.UndefOr[js.Array[Option_]] = js.undefined
  
  var opts: js.UndefOr[TableEditorOpts] = js.undefined
  
  var render: js.UndefOr[ColumnRender] = js.undefined
  
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
  
  var `type`: js.UndefOr[String | Element] = js.undefined
}
object TableField {
  
  inline def apply(name: String): TableField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableField] (val x: Self) extends AnyVal {
    
    inline def setBeforeOptionRender(value: /* items */ String | js.Array[String] => Any): Self = StObject.set(x, "beforeOptionRender", js.Any.fromFunction1(value))
    
    inline def setBeforeOptionRenderUndefined: Self = StObject.set(x, "beforeOptionRender", js.undefined)
    
    inline def setCompute(value: (/* record */ Record, /* field */ String) => Any): Self = StObject.set(x, "compute", js.Any.fromFunction2(value))
    
    inline def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
    
    inline def setEditable(value: Boolean | editableFnc): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableFunction1(value: /* record */ Record => Boolean): Self = StObject.set(x, "editable", js.Any.fromFunction1(value))
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFilters(value: js.Array[ColumnFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ColumnFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNoclean(value: Boolean): Self = StObject.set(x, "noclean", value.asInstanceOf[js.Any])
    
    inline def setNocleanUndefined: Self = StObject.set(x, "noclean", js.undefined)
    
    inline def setNocopy(value: Boolean): Self = StObject.set(x, "nocopy", value.asInstanceOf[js.Any])
    
    inline def setNocopyUndefined: Self = StObject.set(x, "nocopy", js.undefined)
    
    inline def setOptionCompute(
      value: (/* record */ Record, /* options */ js.Array[Option_]) => js.Array[Option_] | js.Promise[js.Array[Option_]]
    ): Self = StObject.set(x, "optionCompute", js.Any.fromFunction2(value))
    
    inline def setOptionComputeUndefined: Self = StObject.set(x, "optionCompute", js.undefined)
    
    inline def setOptions(value: js.Array[Option_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Option_ *): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setOpts(value: TableEditorOpts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    
    inline def setRender(value: /* props */ RenderProps => Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setType(value: String | Element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
