package typings.vegaTypings.typesSpecEncodeMod

import typings.vegaTypings.vegaTypingsStrings.linear
import typings.vegaTypings.vegaTypingsStrings.radial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseGradient extends StObject {
  
  /**
    * The type of gradient.
    */
  var gradient: linear | radial
}
object BaseGradient {
  
  inline def apply(gradient: linear | radial): BaseGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseGradient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseGradient] (val x: Self) extends AnyVal {
    
    inline def setGradient(value: linear | radial): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
  }
}
