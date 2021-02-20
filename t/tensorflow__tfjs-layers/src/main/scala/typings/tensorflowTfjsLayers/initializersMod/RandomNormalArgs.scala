package typings.tensorflowTfjsLayers.initializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomNormalArgs extends StObject {
  
  /** Mean of the random values to generate. */
  var mean: js.UndefOr[Double] = js.native
  
  /** Used to seed the random generator. */
  var seed: js.UndefOr[Double] = js.native
  
  /** Standard deviation of the random values to generate. */
  var stddev: js.UndefOr[Double] = js.native
}
object RandomNormalArgs {
  
  @scala.inline
  def apply(): RandomNormalArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomNormalArgs]
  }
  
  @scala.inline
  implicit class RandomNormalArgsMutableBuilder[Self <: RandomNormalArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    @scala.inline
    def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStddevUndefined: Self = StObject.set(x, "stddev", js.undefined)
  }
}
