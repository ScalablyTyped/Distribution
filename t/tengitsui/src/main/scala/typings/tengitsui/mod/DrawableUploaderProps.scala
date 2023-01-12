package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawableUploaderProps extends StObject {
  
  def onChange(value: js.Array[UrlObj]): js.Object
  
  var opts: DrawableUploaderOpts
  
  var value: js.Array[String | UrlObj]
}
object DrawableUploaderProps {
  
  inline def apply(
    onChange: js.Array[UrlObj] => js.Object,
    opts: DrawableUploaderOpts,
    value: js.Array[String | UrlObj]
  ): DrawableUploaderProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), opts = opts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawableUploaderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawableUploaderProps] (val x: Self) extends AnyVal {
    
    inline def setOnChange(value: js.Array[UrlObj] => js.Object): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOpts(value: DrawableUploaderOpts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[String | UrlObj]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: (String | UrlObj)*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
