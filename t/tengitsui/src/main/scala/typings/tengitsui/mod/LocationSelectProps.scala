package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationSelectProps extends StObject {
  
  var fields: Location
  
  var onChange: typings.tengitsui.mod.onChange
  
  var opts: LocationSelectOpts
}
object LocationSelectProps {
  
  inline def apply(fields: Location, onChange: /* value */ Any => Unit, opts: LocationSelectOpts): LocationSelectProps = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationSelectProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationSelectProps] (val x: Self) extends AnyVal {
    
    inline def setFields(value: Location): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOpts(value: LocationSelectOpts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
  }
}
