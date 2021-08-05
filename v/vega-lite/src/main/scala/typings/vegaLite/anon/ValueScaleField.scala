package typings.vegaLite.anon

import typings.vegaTypings.scaleMod.ScaleField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueScaleField extends StObject {
  
  var value: ScaleField
}
object ValueScaleField {
  
  inline def apply(value: ScaleField): ValueScaleField = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueScaleField]
  }
  
  extension [Self <: ValueScaleField](x: Self) {
    
    inline def setValue(value: ScaleField): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
