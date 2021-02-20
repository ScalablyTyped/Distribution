package typings.vegaLite.srcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceGenerator
  extends Generator
     with GeneratorBase {
  
  /**
    * Generate a sequence of numbers.
    */
  var sequence: SequenceParams = js.native
}
object SequenceGenerator {
  
  @scala.inline
  def apply(sequence: SequenceParams): SequenceGenerator = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceGenerator]
  }
  
  @scala.inline
  implicit class SequenceGeneratorMutableBuilder[Self <: SequenceGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSequence(value: SequenceParams): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
  }
}
