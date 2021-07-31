package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsLimit extends StObject {
  
  var options: Limit
}
object OptionsLimit {
  
  @scala.inline
  def apply(options: Limit): OptionsLimit = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsLimit]
  }
  
  @scala.inline
  implicit class OptionsLimitMutableBuilder[Self <: OptionsLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: Limit): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
