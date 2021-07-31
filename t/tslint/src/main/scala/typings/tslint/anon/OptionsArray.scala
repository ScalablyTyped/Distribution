package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsArray extends StObject {
  
  var options: js.Array[String]
}
object OptionsArray {
  
  @scala.inline
  def apply(options: js.Array[String]): OptionsArray = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsArray]
  }
  
  @scala.inline
  implicit class OptionsArrayMutableBuilder[Self <: OptionsArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
