package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TrainingExampleList. */
@js.native
trait TrainingExampleList extends StObject {
  
  /** Array of training examples. */
  var examples: js.UndefOr[js.Array[TrainingExample]] = js.native
}
object TrainingExampleList {
  
  @scala.inline
  def apply(): TrainingExampleList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingExampleList]
  }
  
  @scala.inline
  implicit class TrainingExampleListMutableBuilder[Self <: TrainingExampleList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExamples(value: js.Array[TrainingExample]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    @scala.inline
    def setExamplesVarargs(value: TrainingExample*): Self = StObject.set(x, "examples", js.Array(value :_*))
  }
}
