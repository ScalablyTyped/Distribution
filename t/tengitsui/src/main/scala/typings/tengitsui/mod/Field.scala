package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  var name: String
  
  var optionCompute: js.UndefOr[typings.tengitsui.mod.optionCompute] = js.undefined
  
  var options: js.UndefOr[js.Array[Option_]] = js.undefined
  
  var opts: js.UndefOr[BaseOpts] = js.undefined
  
  var `type`: String
  
  var visible: js.UndefOr[visibleFnc] = js.undefined
}
object Field {
  
  inline def apply(name: String, `type`: String): Field = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  extension [Self <: Field](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptionCompute(value: (/* fields */ Fields, /* options */ js.Array[Option_]) => js.Array[Option_]): Self = StObject.set(x, "optionCompute", js.Any.fromFunction2(value))
    
    inline def setOptionComputeUndefined: Self = StObject.set(x, "optionCompute", js.undefined)
    
    inline def setOptions(value: js.Array[Option_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Option_ *): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setOpts(value: BaseOpts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: /* params */ typings.tengitsui.anon.Fields => Boolean): Self = StObject.set(x, "visible", js.Any.fromFunction1(value))
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
