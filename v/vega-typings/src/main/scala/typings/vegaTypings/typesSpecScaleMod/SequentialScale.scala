package typings.vegaTypings.typesSpecScaleMod

import typings.vegaTypings.vegaTypingsStrings.sequential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequentialScale
  extends StObject
     with NumericScale
     with Scale {
  
  @JSName("type")
  var type_SequentialScale: sequential
}
object SequentialScale {
  
  inline def apply(name: String): SequentialScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sequential")
    __obj.asInstanceOf[SequentialScale]
  }
  
  extension [Self <: SequentialScale](x: Self) {
    
    inline def setType(value: sequential): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
