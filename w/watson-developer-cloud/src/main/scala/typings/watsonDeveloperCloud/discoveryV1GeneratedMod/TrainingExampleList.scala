package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TrainingExampleList. */
trait TrainingExampleList extends StObject {
  
  /** Array of training examples. */
  var examples: js.UndefOr[js.Array[TrainingExample]] = js.undefined
}
object TrainingExampleList {
  
  inline def apply(): TrainingExampleList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingExampleList]
  }
  
  extension [Self <: TrainingExampleList](x: Self) {
    
    inline def setExamples(value: js.Array[TrainingExample]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setExamplesVarargs(value: TrainingExample*): Self = StObject.set(x, "examples", js.Array(value*))
  }
}
