package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxIterations extends StObject {
  
  var maxIterations: js.UndefOr[Double] = js.native
  
  var softmaxFactor: js.UndefOr[Double] = js.native
}
object MaxIterations {
  
  @scala.inline
  def apply(): MaxIterations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxIterations]
  }
  
  @scala.inline
  implicit class MaxIterationsMutableBuilder[Self <: MaxIterations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
    
    @scala.inline
    def setSoftmaxFactor(value: Double): Self = StObject.set(x, "softmaxFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftmaxFactorUndefined: Self = StObject.set(x, "softmaxFactor", js.undefined)
  }
}
