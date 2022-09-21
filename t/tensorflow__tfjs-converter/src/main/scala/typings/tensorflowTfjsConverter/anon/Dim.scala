package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dim extends StObject {
  
  var dim: Unit
}
object Dim {
  
  inline def apply(dim: Unit): Dim = {
    val __obj = js.Dynamic.literal(dim = dim.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dim]
  }
  
  extension [Self <: Dim](x: Self) {
    
    inline def setDim(value: Unit): Self = StObject.set(x, "dim", value.asInstanceOf[js.Any])
  }
}
