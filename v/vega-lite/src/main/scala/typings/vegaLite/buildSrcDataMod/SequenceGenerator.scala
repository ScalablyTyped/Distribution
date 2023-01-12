package typings.vegaLite.buildSrcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceGenerator
  extends StObject
     with GeneratorBase
     with Generator {
  
  /**
    * Generate a sequence of numbers.
    */
  var sequence: SequenceParams
}
object SequenceGenerator {
  
  inline def apply(sequence: SequenceParams): SequenceGenerator = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceGenerator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SequenceGenerator] (val x: Self) extends AnyVal {
    
    inline def setSequence(value: SequenceParams): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
  }
}
