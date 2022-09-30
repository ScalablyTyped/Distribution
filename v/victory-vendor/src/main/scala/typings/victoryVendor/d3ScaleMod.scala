package typings.victoryVendor

import typings.d3Scale.anon.ToString
import typings.d3Scale.mod.NumberValue
import typings.d3Scale.mod.ScaleBand_
import typings.d3Scale.mod.ScaleDiverging_
import typings.d3Scale.mod.ScaleIdentity_
import typings.d3Scale.mod.ScaleLinear_
import typings.d3Scale.mod.ScaleLogarithmic
import typings.d3Scale.mod.ScaleOrdinal_
import typings.d3Scale.mod.ScalePoint_
import typings.d3Scale.mod.ScalePower
import typings.d3Scale.mod.ScaleQuantile_
import typings.d3Scale.mod.ScaleQuantize_
import typings.d3Scale.mod.ScaleRadial_
import typings.d3Scale.mod.ScaleSequentialQuantile_
import typings.d3Scale.mod.ScaleSequential_
import typings.d3Scale.mod.ScaleSymLog_
import typings.d3Scale.mod.ScaleThreshold_
import typings.d3Scale.mod.ScaleTime_
import typings.victoryVendor.victoryVendorStrings.`implicit`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object d3ScaleMod {
  
  @JSImport("victory-vendor/d3-scale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scaleBand[Domain /* <: ToString */](): ScaleBand_[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleBand")().asInstanceOf[ScaleBand_[Domain]]
  inline def scaleBand[Domain /* <: ToString */](domain: js.Iterable[Domain], range: js.Iterable[NumberValue]): ScaleBand_[Domain] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleBand")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScaleBand_[Domain]]
  inline def scaleBand[Domain /* <: ToString */](range: js.Iterable[NumberValue]): ScaleBand_[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleBand")(range.asInstanceOf[js.Any]).asInstanceOf[ScaleBand_[Domain]]
  
  inline def scaleDiverging[Output, Unknown](): ScaleDiverging_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleDiverging")().asInstanceOf[ScaleDiverging_[Output, Unknown]]
  inline def scaleDiverging[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Function1[/* t */ Double, Output]): ScaleDiverging_[Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleDiverging")(domain.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[ScaleDiverging_[Output, Unknown]]
  inline def scaleDiverging[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Iterable[Output]): ScaleDiverging_[Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleDiverging")(domain.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[ScaleDiverging_[Output, Unknown]]
  inline def scaleDiverging[Output, Unknown](interpolator: js.Function1[/* t */ Double, Output]): ScaleDiverging_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleDiverging")(interpolator.asInstanceOf[js.Any]).asInstanceOf[ScaleDiverging_[Output, Unknown]]
  inline def scaleDiverging[Output, Unknown](interpolator: js.Iterable[Output]): ScaleDiverging_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleDiverging")(interpolator.asInstanceOf[js.Any]).asInstanceOf[ScaleDiverging_[Output, Unknown]]
  
  inline def scaleDivergingLog[Output, Unknown](): ScaleDiverging_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleDivergingLog")().asInstanceOf[ScaleDiverging_[Output, Unknown]]
  inline def scaleDivergingLog[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Function1[/* t */ Double, Output]): ScaleDiverging_[Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleDivergingLog")(domain.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[ScaleDiverging_[Output, Unknown]]
  inline def scaleDivergingLog[Output, Unknown](interpolator: js.Function1[/* t */ Double, Output]): ScaleDiverging_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleDivergingLog")(interpolator.asInstanceOf[js.Any]).asInstanceOf[ScaleDiverging_[Output, Unknown]]
  
  inline def scaleDivergingPow[Output, Unknown](): ScaleDiverging_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleDivergingPow")().asInstanceOf[ScaleDiverging_[Output, Unknown]]
  inline def scaleDivergingPow[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Function1[/* t */ Double, Output]): ScaleDiverging_[Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleDivergingPow")(domain.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[ScaleDiverging_[Output, Unknown]]
  inline def scaleDivergingPow[Output, Unknown](interpolator: js.Function1[/* t */ Double, Output]): ScaleDiverging_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleDivergingPow")(interpolator.asInstanceOf[js.Any]).asInstanceOf[ScaleDiverging_[Output, Unknown]]
  
  inline def scaleDivergingSqrt[Output, Unknown](): ScaleDiverging_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleDivergingSqrt")().asInstanceOf[ScaleDiverging_[Output, Unknown]]
  inline def scaleDivergingSqrt[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Function1[/* t */ Double, Output]): ScaleDiverging_[Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleDivergingSqrt")(domain.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[ScaleDiverging_[Output, Unknown]]
  inline def scaleDivergingSqrt[Output, Unknown](interpolator: js.Function1[/* t */ Double, Output]): ScaleDiverging_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleDivergingSqrt")(interpolator.asInstanceOf[js.Any]).asInstanceOf[ScaleDiverging_[Output, Unknown]]
  
  inline def scaleDivergingSymlog[Output, Unknown](): ScaleDiverging_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleDivergingSymlog")().asInstanceOf[ScaleDiverging_[Output, Unknown]]
  inline def scaleDivergingSymlog[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Function1[/* t */ Double, Output]): ScaleDiverging_[Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleDivergingSymlog")(domain.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[ScaleDiverging_[Output, Unknown]]
  inline def scaleDivergingSymlog[Output, Unknown](interpolator: js.Function1[/* t */ Double, Output]): ScaleDiverging_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleDivergingSymlog")(interpolator.asInstanceOf[js.Any]).asInstanceOf[ScaleDiverging_[Output, Unknown]]
  
  inline def scaleIdentity[Unknown](): ScaleIdentity_[Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleIdentity")().asInstanceOf[ScaleIdentity_[Unknown]]
  inline def scaleIdentity[Unknown](range: js.Iterable[NumberValue]): ScaleIdentity_[Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleIdentity")(range.asInstanceOf[js.Any]).asInstanceOf[ScaleIdentity_[Unknown]]
  
  object scaleImplicit {
    
    @JSImport("victory-vendor/d3-scale", "scaleImplicit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-vendor/d3-scale", "scaleImplicit.name")
    @js.native
    def name: `implicit` = js.native
    inline def name_=(x: `implicit`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  inline def scaleLinear[Range, Output, Unknown](): ScaleLinear_[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleLinear")().asInstanceOf[ScaleLinear_[Range, Output, Unknown]]
  inline def scaleLinear[Range, Output, Unknown](domain: js.Iterable[NumberValue], range: js.Iterable[Range]): ScaleLinear_[Range, Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleLinear")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScaleLinear_[Range, Output, Unknown]]
  inline def scaleLinear[Range, Output, Unknown](range: js.Iterable[Range]): ScaleLinear_[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleLinear")(range.asInstanceOf[js.Any]).asInstanceOf[ScaleLinear_[Range, Output, Unknown]]
  
  inline def scaleLog[Range, Output, Unknown](): ScaleLogarithmic[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleLog")().asInstanceOf[ScaleLogarithmic[Range, Output, Unknown]]
  inline def scaleLog[Range, Output, Unknown](domain: js.Iterable[NumberValue], range: js.Iterable[Range]): ScaleLogarithmic[Range, Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleLog")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScaleLogarithmic[Range, Output, Unknown]]
  inline def scaleLog[Range, Output, Unknown](range: js.Iterable[Range]): ScaleLogarithmic[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleLog")(range.asInstanceOf[js.Any]).asInstanceOf[ScaleLogarithmic[Range, Output, Unknown]]
  
  inline def scaleOrdinal[Range](): ScaleOrdinal_[String, Range, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleOrdinal")().asInstanceOf[ScaleOrdinal_[String, Range, scala.Nothing]]
  inline def scaleOrdinal[Range](range: js.Iterable[Range]): ScaleOrdinal_[String, Range, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleOrdinal")(range.asInstanceOf[js.Any]).asInstanceOf[ScaleOrdinal_[String, Range, scala.Nothing]]
  inline def scaleOrdinal[Domain /* <: ToString */, Range, Unknown](domain: js.Iterable[Domain], range: js.Iterable[Range]): ScaleOrdinal_[Domain, Range, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleOrdinal")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScaleOrdinal_[Domain, Range, Unknown]]
  
  inline def scaleOrdinal_DomainRangeUnknown[Domain /* <: ToString */, Range, Unknown](): ScaleOrdinal_[Domain, Range, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleOrdinal")().asInstanceOf[ScaleOrdinal_[Domain, Range, Unknown]]
  inline def scaleOrdinal_DomainRangeUnknown[Domain /* <: ToString */, Range, Unknown](range: js.Iterable[Range]): ScaleOrdinal_[Domain, Range, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleOrdinal")(range.asInstanceOf[js.Any]).asInstanceOf[ScaleOrdinal_[Domain, Range, Unknown]]
  
  inline def scalePoint[Domain /* <: ToString */](): ScalePoint_[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("scalePoint")().asInstanceOf[ScalePoint_[Domain]]
  inline def scalePoint[Domain /* <: ToString */](domain: js.Iterable[Domain], range: js.Iterable[NumberValue]): ScalePoint_[Domain] = (^.asInstanceOf[js.Dynamic].applyDynamic("scalePoint")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScalePoint_[Domain]]
  inline def scalePoint[Domain /* <: ToString */](range: js.Iterable[NumberValue]): ScalePoint_[Domain] = ^.asInstanceOf[js.Dynamic].applyDynamic("scalePoint")(range.asInstanceOf[js.Any]).asInstanceOf[ScalePoint_[Domain]]
  
  inline def scalePow[Range, Output, Unknown](): ScalePower[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scalePow")().asInstanceOf[ScalePower[Range, Output, Unknown]]
  inline def scalePow[Range, Output, Unknown](domain: js.Iterable[NumberValue], range: js.Iterable[Range]): ScalePower[Range, Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scalePow")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScalePower[Range, Output, Unknown]]
  inline def scalePow[Range, Output, Unknown](range: js.Iterable[Range]): ScalePower[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scalePow")(range.asInstanceOf[js.Any]).asInstanceOf[ScalePower[Range, Output, Unknown]]
  
  inline def scaleQuantile[Range, Unknown](): ScaleQuantile_[Range, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleQuantile")().asInstanceOf[ScaleQuantile_[Range, Unknown]]
  inline def scaleQuantile[Range, Unknown](domain: js.Iterable[js.UndefOr[NumberValue | Null]], range: js.Iterable[Range]): ScaleQuantile_[Range, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleQuantile")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScaleQuantile_[Range, Unknown]]
  inline def scaleQuantile[Range, Unknown](range: js.Iterable[Range]): ScaleQuantile_[Range, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleQuantile")(range.asInstanceOf[js.Any]).asInstanceOf[ScaleQuantile_[Range, Unknown]]
  
  inline def scaleQuantize[Range, Unknown](): ScaleQuantize_[Range, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleQuantize")().asInstanceOf[ScaleQuantize_[Range, Unknown]]
  inline def scaleQuantize[Range, Unknown](domain: js.Iterable[NumberValue], range: js.Iterable[Range]): ScaleQuantize_[Range, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleQuantize")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScaleQuantize_[Range, Unknown]]
  inline def scaleQuantize[Range, Unknown](range: js.Iterable[Range]): ScaleQuantize_[Range, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleQuantize")(range.asInstanceOf[js.Any]).asInstanceOf[ScaleQuantize_[Range, Unknown]]
  
  inline def scaleRadial[Range, Unknown](): ScaleRadial_[Range, Range, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleRadial")().asInstanceOf[ScaleRadial_[Range, Range, Unknown]]
  inline def scaleRadial[Range, Unknown](domain: js.Iterable[NumberValue], range: js.Iterable[Range]): ScaleRadial_[Range, Range, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleRadial")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScaleRadial_[Range, Range, Unknown]]
  inline def scaleRadial[Range, Unknown](range: js.Iterable[Range]): ScaleRadial_[Range, Range, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleRadial")(range.asInstanceOf[js.Any]).asInstanceOf[ScaleRadial_[Range, Range, Unknown]]
  
  inline def scaleSequential[Output, Unknown](): ScaleSequential_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequential")().asInstanceOf[ScaleSequential_[Output, Unknown]]
  inline def scaleSequential[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Function1[/* t */ Double, Output]): ScaleSequential_[Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequential")(domain.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[ScaleSequential_[Output, Unknown]]
  inline def scaleSequential[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Iterable[Output]): ScaleSequential_[Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequential")(domain.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[ScaleSequential_[Output, Unknown]]
  inline def scaleSequential[Output, Unknown](interpolator: js.Function1[/* t */ Double, Output]): ScaleSequential_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequential")(interpolator.asInstanceOf[js.Any]).asInstanceOf[ScaleSequential_[Output, Unknown]]
  inline def scaleSequential[Output, Unknown](interpolator: js.Iterable[Output]): ScaleSequential_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequential")(interpolator.asInstanceOf[js.Any]).asInstanceOf[ScaleSequential_[Output, Unknown]]
  
  inline def scaleSequentialLog[Output, Unknown](): ScaleSequential_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialLog")().asInstanceOf[ScaleSequential_[Output, Unknown]]
  inline def scaleSequentialLog[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Function1[/* t */ Double, Output]): ScaleSequential_[Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialLog")(domain.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[ScaleSequential_[Output, Unknown]]
  inline def scaleSequentialLog[Output, Unknown](interpolator: js.Function1[/* t */ Double, Output]): ScaleSequential_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialLog")(interpolator.asInstanceOf[js.Any]).asInstanceOf[ScaleSequential_[Output, Unknown]]
  
  inline def scaleSequentialPow[Output, Unknown](): ScaleSequential_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialPow")().asInstanceOf[ScaleSequential_[Output, Unknown]]
  inline def scaleSequentialPow[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Function1[/* t */ Double, Output]): ScaleSequential_[Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialPow")(domain.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[ScaleSequential_[Output, Unknown]]
  inline def scaleSequentialPow[Output, Unknown](interpolator: js.Function1[/* t */ Double, Output]): ScaleSequential_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialPow")(interpolator.asInstanceOf[js.Any]).asInstanceOf[ScaleSequential_[Output, Unknown]]
  
  inline def scaleSequentialQuantile[Output, Unknown](): ScaleSequentialQuantile_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialQuantile")().asInstanceOf[ScaleSequentialQuantile_[Output, Unknown]]
  inline def scaleSequentialQuantile[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Function1[/* t */ Double, Output]): ScaleSequentialQuantile_[Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialQuantile")(domain.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[ScaleSequentialQuantile_[Output, Unknown]]
  inline def scaleSequentialQuantile[Output, Unknown](interpolator: js.Function1[/* t */ Double, Output]): ScaleSequentialQuantile_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialQuantile")(interpolator.asInstanceOf[js.Any]).asInstanceOf[ScaleSequentialQuantile_[Output, Unknown]]
  
  inline def scaleSequentialSqrt[Output, Unknown](): ScaleSequential_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialSqrt")().asInstanceOf[ScaleSequential_[Output, Unknown]]
  inline def scaleSequentialSqrt[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Function1[/* t */ Double, Output]): ScaleSequential_[Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialSqrt")(domain.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[ScaleSequential_[Output, Unknown]]
  inline def scaleSequentialSqrt[Output, Unknown](interpolator: js.Function1[/* t */ Double, Output]): ScaleSequential_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialSqrt")(interpolator.asInstanceOf[js.Any]).asInstanceOf[ScaleSequential_[Output, Unknown]]
  
  inline def scaleSequentialSymlog[Output, Unknown](): ScaleSequential_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialSymlog")().asInstanceOf[ScaleSequential_[Output, Unknown]]
  inline def scaleSequentialSymlog[Output, Unknown](domain: js.Iterable[NumberValue], interpolator: js.Function1[/* t */ Double, Output]): ScaleSequential_[Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialSymlog")(domain.asInstanceOf[js.Any], interpolator.asInstanceOf[js.Any])).asInstanceOf[ScaleSequential_[Output, Unknown]]
  inline def scaleSequentialSymlog[Output, Unknown](interpolator: js.Function1[/* t */ Double, Output]): ScaleSequential_[Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSequentialSymlog")(interpolator.asInstanceOf[js.Any]).asInstanceOf[ScaleSequential_[Output, Unknown]]
  
  inline def scaleSqrt[Range, Output, Unknown](): ScalePower[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSqrt")().asInstanceOf[ScalePower[Range, Output, Unknown]]
  inline def scaleSqrt[Range, Output, Unknown](domain: js.Iterable[NumberValue], range: js.Iterable[Range]): ScalePower[Range, Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleSqrt")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScalePower[Range, Output, Unknown]]
  inline def scaleSqrt[Range, Output, Unknown](range: js.Iterable[Range]): ScalePower[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSqrt")(range.asInstanceOf[js.Any]).asInstanceOf[ScalePower[Range, Output, Unknown]]
  
  inline def scaleSymlog[Range, Output, Unknown](): ScaleSymLog_[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSymlog")().asInstanceOf[ScaleSymLog_[Range, Output, Unknown]]
  inline def scaleSymlog[Range, Output, Unknown](domain: js.Iterable[NumberValue], range: js.Iterable[Range]): ScaleSymLog_[Range, Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleSymlog")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScaleSymLog_[Range, Output, Unknown]]
  inline def scaleSymlog[Range, Output, Unknown](range: js.Iterable[Range]): ScaleSymLog_[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleSymlog")(range.asInstanceOf[js.Any]).asInstanceOf[ScaleSymLog_[Range, Output, Unknown]]
  
  inline def scaleThreshold[Domain /* <: Double | String | js.Date */, Range, Unknown](): ScaleThreshold_[Domain, Range, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleThreshold")().asInstanceOf[ScaleThreshold_[Domain, Range, Unknown]]
  inline def scaleThreshold[Domain /* <: Double | String | js.Date */, Range, Unknown](domain: js.Iterable[Domain], range: js.Iterable[Range]): ScaleThreshold_[Domain, Range, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleThreshold")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScaleThreshold_[Domain, Range, Unknown]]
  inline def scaleThreshold[Domain /* <: Double | String | js.Date */, Range, Unknown](range: js.Iterable[Range]): ScaleThreshold_[Domain, Range, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleThreshold")(range.asInstanceOf[js.Any]).asInstanceOf[ScaleThreshold_[Domain, Range, Unknown]]
  
  inline def scaleTime[Range, Output, Unknown](): ScaleTime_[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleTime")().asInstanceOf[ScaleTime_[Range, Output, Unknown]]
  inline def scaleTime[Range, Output, Unknown](domain: js.Iterable[js.Date | NumberValue], range: js.Iterable[Range]): ScaleTime_[Range, Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleTime")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScaleTime_[Range, Output, Unknown]]
  inline def scaleTime[Range, Output, Unknown](range: js.Iterable[Range]): ScaleTime_[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleTime")(range.asInstanceOf[js.Any]).asInstanceOf[ScaleTime_[Range, Output, Unknown]]
  
  inline def scaleUtc[Range, Output, Unknown](): ScaleTime_[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleUtc")().asInstanceOf[ScaleTime_[Range, Output, Unknown]]
  inline def scaleUtc[Range, Output, Unknown](domain: js.Iterable[NumberValue], range: js.Iterable[Range]): ScaleTime_[Range, Output, Unknown] = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleUtc")(domain.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[ScaleTime_[Range, Output, Unknown]]
  inline def scaleUtc[Range, Output, Unknown](range: js.Iterable[Range]): ScaleTime_[Range, Output, Unknown] = ^.asInstanceOf[js.Dynamic].applyDynamic("scaleUtc")(range.asInstanceOf[js.Any]).asInstanceOf[ScaleTime_[Range, Output, Unknown]]
  
  inline def tickFormat(start: Double, stop: Double, count: Double): js.Function1[/* d */ NumberValue, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("tickFormat")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* d */ NumberValue, String]]
  inline def tickFormat(start: Double, stop: Double, count: Double, specifier: String): js.Function1[/* d */ NumberValue, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("tickFormat")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], count.asInstanceOf[js.Any], specifier.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* d */ NumberValue, String]]
}
