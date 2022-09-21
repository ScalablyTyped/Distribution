package typings.vegaLite

import typings.vegaLite.channelMod.ExtendedChannel
import typings.vegaLite.srcSelectionMod.ParameterExtent
import typings.vegaLite.vegaLiteBooleans.`true`
import typings.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binMod {
  
  @JSImport("vega-lite/build/src/bin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoMaxBins(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("autoMaxBins")().asInstanceOf[Double]
  inline def autoMaxBins(channel: ExtendedChannel): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("autoMaxBins")(channel.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def binToString(bin: BinParams): String = ^.asInstanceOf[js.Dynamic].applyDynamic("binToString")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def binToString_true(bin: `true`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("binToString")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isBinParams(bin: Boolean): /* is vega-lite.vega-lite/build/src/bin.BinParams */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinParams")(bin.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/bin.BinParams */ Boolean]
  inline def isBinParams(bin: BinParams): /* is vega-lite.vega-lite/build/src/bin.BinParams */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinParams")(bin.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/bin.BinParams */ Boolean]
  
  inline def isBinParams_binned(bin: binned): /* is vega-lite.vega-lite/build/src/bin.BinParams */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinParams")(bin.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/bin.BinParams */ Boolean]
  
  inline def isBinned(bin: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinned")(bin.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isBinned(bin: BinParams): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinned")(bin.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBinned_binned(bin: binned): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinned")(bin.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBinning(bin: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinning")(bin.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isBinning(bin: BinParams): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinning")(bin.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBinning_binned(bin: binned): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinning")(bin.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isParameterExtent(extent: BinExtent): /* is vega-lite.vega-lite/build/src/selection.ParameterExtent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParameterExtent")(extent.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/selection.ParameterExtent */ Boolean]
  
  trait BaseBin extends StObject {
    
    /**
      * A value in the binned domain at which to anchor the bins, shifting the bin boundaries if necessary to ensure that a boundary aligns with the anchor value.
      *
      * __Default value:__ the minimum bin extent value
      */
    var anchor: js.UndefOr[Double] = js.undefined
    
    /**
      * The number base to use for automatic bin determination (default is base 10).
      *
      * __Default value:__ `10`
      *
      */
    var base: js.UndefOr[Double] = js.undefined
    
    /**
      * Scale factors indicating allowable subdivisions. The default value is [5, 2], which indicates that for base 10 numbers (the default base), the method may consider dividing bin sizes by 5 and/or 2. For example, for an initial step size of 10, the method can check if bin sizes of 2 (= 10/5), 5 (= 10/2), or 1 (= 10/(5*2)) might also satisfy the given constraints.
      *
      * __Default value:__ `[5, 2]`
      *
      * @minItems 1
      */
    var divide: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    /**
      * Maximum number of bins.
      *
      * __Default value:__ `6` for `row`, `column` and `shape` channels; `10` for other channels
      *
      * @minimum 2
      */
    var maxbins: js.UndefOr[Double] = js.undefined
    
    /**
      * A minimum allowable step size (particularly useful for integer values).
      */
    var minstep: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, attempts to make the bin boundaries use human-friendly boundaries, such as multiples of ten.
      *
      * __Default value:__ `true`
      */
    var nice: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An exact step size to use between bins.
      *
      * __Note:__ If provided, options such as maxbins will be ignored.
      */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * An array of allowable step sizes to choose from.
      * @minItems 1
      */
    var steps: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object BaseBin {
    
    inline def apply(): BaseBin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseBin]
    }
    
    extension [Self <: BaseBin](x: Self) {
      
      inline def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setDivide(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "divide", value.asInstanceOf[js.Any])
      
      inline def setDivideUndefined: Self = StObject.set(x, "divide", js.undefined)
      
      inline def setMaxbins(value: Double): Self = StObject.set(x, "maxbins", value.asInstanceOf[js.Any])
      
      inline def setMaxbinsUndefined: Self = StObject.set(x, "maxbins", js.undefined)
      
      inline def setMinstep(value: Double): Self = StObject.set(x, "minstep", value.asInstanceOf[js.Any])
      
      inline def setMinstepUndefined: Self = StObject.set(x, "minstep", js.undefined)
      
      inline def setNice(value: Boolean): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setSteps(value: js.Array[Double]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStepsVarargs(value: Double*): Self = StObject.set(x, "steps", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.vegaLite.binMod.BinParams
    - typings.vegaLite.vegaLiteStrings.binned
    - scala.Null
  */
  type Bin = _Bin | Boolean | Null
  
  type BinExtent = (js.Tuple2[Double, Double]) | ParameterExtent
  
  trait BinParams
    extends StObject
       with BaseBin
       with _Bin {
    
    /**
      * When set to `true`, Vega-Lite treats the input data as already binned.
      */
    var binned: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A two-element (`[min, max]`) array indicating the range of desired bin values.
      */
    var extent: js.UndefOr[BinExtent] = js.undefined
  }
  object BinParams {
    
    inline def apply(): BinParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BinParams]
    }
    
    extension [Self <: BinParams](x: Self) {
      
      inline def setBinned(value: Boolean): Self = StObject.set(x, "binned", value.asInstanceOf[js.Any])
      
      inline def setBinnedUndefined: Self = StObject.set(x, "binned", js.undefined)
      
      inline def setExtent(value: BinExtent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    }
  }
  
  trait _Bin extends StObject
}
