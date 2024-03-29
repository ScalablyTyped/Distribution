package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsGroupedimports extends StObject {
  
  var options: Groupedimports
}
object OptionsGroupedimports {
  
  inline def apply(options: Groupedimports): OptionsGroupedimports = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsGroupedimports]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsGroupedimports] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: Groupedimports): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
