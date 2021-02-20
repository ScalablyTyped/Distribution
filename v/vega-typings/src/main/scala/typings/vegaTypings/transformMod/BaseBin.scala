package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseBin extends StObject {
  
  /**
    * The number base to use for automatic bin determination (default is base 10).
    *
    * __Default value:__ `10`
    *
    */
  var base: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * Scale factors indicating allowable subdivisions. The default value is [5, 2], which indicates that for base 10 numbers (the default base), the method may consider dividing bin sizes by 5 and/or 2. For example, for an initial step size of 10, the method can check if bin sizes of 2 (= 10/5), 5 (= 10/2), or 1 (= 10/(5*2)) might also satisfy the given constraints.
    *
    * __Default value:__ `[5, 2]`
    *
    * @minItems 1
    */
  var divide: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  /**
    * Maximum number of bins.
    *
    * __Default value:__ `6` for `row`, `column` and `shape` channels; `10` for other channels
    *
    * @minimum 2
    */
  var maxbins: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * A minimum allowable step size (particularly useful for integer values).
    */
  var minstep: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * If true (the default), attempts to make the bin boundaries use human-friendly boundaries, such as multiples of ten.
    */
  var nice: js.UndefOr[Boolean | SignalRef] = js.native
  
  /**
    * An exact step size to use between bins.
    *
    * __Note:__ If provided, options such as maxbins will be ignored.
    */
  var step: js.UndefOr[Double | SignalRef] = js.native
  
  /**
    * An array of allowable step sizes to choose from.
    * @minItems 1
    */
  var steps: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
}
object BaseBin {
  
  @scala.inline
  def apply(): BaseBin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseBin]
  }
  
  @scala.inline
  implicit class BaseBinMutableBuilder[Self <: BaseBin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Double | SignalRef): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setDivide(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "divide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivideUndefined: Self = StObject.set(x, "divide", js.undefined)
    
    @scala.inline
    def setMaxbins(value: Double | SignalRef): Self = StObject.set(x, "maxbins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxbinsUndefined: Self = StObject.set(x, "maxbins", js.undefined)
    
    @scala.inline
    def setMinstep(value: Double | SignalRef): Self = StObject.set(x, "minstep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinstepUndefined: Self = StObject.set(x, "minstep", js.undefined)
    
    @scala.inline
    def setNice(value: Boolean | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    @scala.inline
    def setStep(value: Double | SignalRef): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setSteps(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
