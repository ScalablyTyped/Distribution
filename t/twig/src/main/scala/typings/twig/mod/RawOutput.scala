package typings.twig.mod

import typings.twig.twigStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawOutput extends StObject {
  
  var `type`: raw
  
  var value: String
}
object RawOutput {
  
  inline def apply(value: String): RawOutput = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("raw")
    __obj.asInstanceOf[RawOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawOutput] (val x: Self) extends AnyVal {
    
    inline def setType(value: raw): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
