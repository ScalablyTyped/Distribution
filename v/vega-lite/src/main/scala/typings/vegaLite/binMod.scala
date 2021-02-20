package typings.vegaLite

import typings.vegaLite.channelMod.ExtendedChannel
import typings.vegaLite.srcSelectionMod.SelectionExtent
import typings.vegaLite.vegaLiteBooleans.`true`
import typings.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binMod {
  
  @JSImport("vega-lite/build/src/bin", "autoMaxBins")
  @js.native
  def autoMaxBins(): Double = js.native
  @JSImport("vega-lite/build/src/bin", "autoMaxBins")
  @js.native
  def autoMaxBins(channel: ExtendedChannel): Double = js.native
  
  @JSImport("vega-lite/build/src/bin", "binToString")
  @js.native
  def binToString(bin: BinParams): String = js.native
  @JSImport("vega-lite/build/src/bin", "binToString")
  @js.native
  def binToString_true(bin: `true`): String = js.native
  
  @JSImport("vega-lite/build/src/bin", "isBinParams")
  @js.native
  def isBinParams(bin: Boolean): /* is vega-lite.vega-lite/build/src/bin.BinParams */ Boolean = js.native
  @JSImport("vega-lite/build/src/bin", "isBinParams")
  @js.native
  def isBinParams(bin: BinParams): /* is vega-lite.vega-lite/build/src/bin.BinParams */ Boolean = js.native
  @JSImport("vega-lite/build/src/bin", "isBinParams")
  @js.native
  def isBinParams_binned(bin: binned): /* is vega-lite.vega-lite/build/src/bin.BinParams */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/bin", "isBinned")
  @js.native
  def isBinned(bin: Boolean): Boolean = js.native
  @JSImport("vega-lite/build/src/bin", "isBinned")
  @js.native
  def isBinned(bin: BinParams): Boolean = js.native
  @JSImport("vega-lite/build/src/bin", "isBinned")
  @js.native
  def isBinned_binned(bin: binned): Boolean = js.native
  
  @JSImport("vega-lite/build/src/bin", "isBinning")
  @js.native
  def isBinning(bin: Boolean): Boolean = js.native
  @JSImport("vega-lite/build/src/bin", "isBinning")
  @js.native
  def isBinning(bin: BinParams): Boolean = js.native
  @JSImport("vega-lite/build/src/bin", "isBinning")
  @js.native
  def isBinning_binned(bin: binned): Boolean = js.native
  
  @JSImport("vega-lite/build/src/bin", "isSelectionExtent")
  @js.native
  def isSelectionExtent(extent: BinExtent): /* is vega-lite.vega-lite/build/src/selection.SelectionExtent */ Boolean = js.native
  
  @js.native
  trait BaseBin extends StObject {
    
    /**
      * A value in the binned domain at which to anchor the bins, shifting the bin boundaries if necessary to ensure that a boundary aligns with the anchor value.
      *
      * __Default value:__ the minimum bin extent value
      */
    var anchor: js.UndefOr[Double] = js.native
    
    /**
      * The number base to use for automatic bin determination (default is base 10).
      *
      * __Default value:__ `10`
      *
      */
    var base: js.UndefOr[Double] = js.native
    
    /**
      * Scale factors indicating allowable subdivisions. The default value is [5, 2], which indicates that for base 10 numbers (the default base), the method may consider dividing bin sizes by 5 and/or 2. For example, for an initial step size of 10, the method can check if bin sizes of 2 (= 10/5), 5 (= 10/2), or 1 (= 10/(5*2)) might also satisfy the given constraints.
      *
      * __Default value:__ `[5, 2]`
      *
      * @minItems 1
      */
    var divide: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    /**
      * Maximum number of bins.
      *
      * __Default value:__ `6` for `row`, `column` and `shape` channels; `10` for other channels
      *
      * @minimum 2
      */
    var maxbins: js.UndefOr[Double] = js.native
    
    /**
      * A minimum allowable step size (particularly useful for integer values).
      */
    var minstep: js.UndefOr[Double] = js.native
    
    /**
      * If true, attempts to make the bin boundaries use human-friendly boundaries, such as multiples of ten.
      *
      * __Default value:__ `true`
      */
    var nice: js.UndefOr[Boolean] = js.native
    
    /**
      * An exact step size to use between bins.
      *
      * __Note:__ If provided, options such as maxbins will be ignored.
      */
    var step: js.UndefOr[Double] = js.native
    
    /**
      * An array of allowable step sizes to choose from.
      * @minItems 1
      */
    var steps: js.UndefOr[js.Array[Double]] = js.native
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
      def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setDivide(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "divide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivideUndefined: Self = StObject.set(x, "divide", js.undefined)
      
      @scala.inline
      def setMaxbins(value: Double): Self = StObject.set(x, "maxbins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxbinsUndefined: Self = StObject.set(x, "maxbins", js.undefined)
      
      @scala.inline
      def setMinstep(value: Double): Self = StObject.set(x, "minstep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinstepUndefined: Self = StObject.set(x, "minstep", js.undefined)
      
      @scala.inline
      def setNice(value: Boolean): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setSteps(value: js.Array[Double]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setStepsVarargs(value: Double*): Self = StObject.set(x, "steps", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.vegaLite.binMod.BinParams
    - typings.vegaLite.vegaLiteStrings.binned
    - scala.Null
  */
  type Bin = _Bin | Boolean | Null
  
  type BinExtent = (js.Tuple2[Double, Double]) | SelectionExtent
  
  @js.native
  trait BinParams
    extends BaseBin
       with _Bin {
    
    /**
      * When set to `true`, Vega-Lite treats the input data as already binned.
      */
    var binned: js.UndefOr[Boolean] = js.native
    
    /**
      * A two-element (`[min, max]`) array indicating the range of desired bin values.
      */
    var extent: js.UndefOr[BinExtent] = js.native
  }
  object BinParams {
    
    @scala.inline
    def apply(): BinParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BinParams]
    }
    
    @scala.inline
    implicit class BinParamsMutableBuilder[Self <: BinParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinned(value: Boolean): Self = StObject.set(x, "binned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinnedUndefined: Self = StObject.set(x, "binned", js.undefined)
      
      @scala.inline
      def setExtent(value: BinExtent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    }
  }
  
  trait _Bin extends StObject
}
