package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tengitsui.mod.BaseProps
  - typings.tengitsui.anon.Value
*/
trait RangePickerProps extends StObject
object RangePickerProps {
  
  inline def BaseProps(field: String, onChange: () => Unit, options: js.Array[Option_], opts: BaseOpts): typings.tengitsui.mod.BaseProps = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), options = options.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tengitsui.mod.BaseProps]
  }
  
  inline def Value(): typings.tengitsui.anon.Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.tengitsui.anon.Value]
  }
}
