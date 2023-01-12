package typings.vegaLite.anon

import typings.vegaLite.buildSrcTransformMod.AggregatedFieldDef
import typings.vegaLite.buildSrcTransformMod.BinTransform
import typings.vegaLite.buildSrcTransformMod.TimeUnitTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bins extends StObject {
  
  var aggregate: js.Array[AggregatedFieldDef]
  
  var bins: js.Array[BinTransform]
  
  var encoding: typings.vegaLite.buildSrcEncodingMod.Encoding[String]
  
  var groupby: js.Array[String]
  
  var timeUnits: js.Array[TimeUnitTransform]
}
object Bins {
  
  inline def apply(
    aggregate: js.Array[AggregatedFieldDef],
    bins: js.Array[BinTransform],
    encoding: typings.vegaLite.buildSrcEncodingMod.Encoding[String],
    groupby: js.Array[String],
    timeUnits: js.Array[TimeUnitTransform]
  ): Bins = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any], bins = bins.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], timeUnits = timeUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bins] (val x: Self) extends AnyVal {
    
    inline def setAggregate(value: js.Array[AggregatedFieldDef]): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateVarargs(value: AggregatedFieldDef*): Self = StObject.set(x, "aggregate", js.Array(value*))
    
    inline def setBins(value: js.Array[BinTransform]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    inline def setBinsVarargs(value: BinTransform*): Self = StObject.set(x, "bins", js.Array(value*))
    
    inline def setEncoding(value: typings.vegaLite.buildSrcEncodingMod.Encoding[String]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setGroupby(value: js.Array[String]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyVarargs(value: String*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setTimeUnits(value: js.Array[TimeUnitTransform]): Self = StObject.set(x, "timeUnits", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitsVarargs(value: TimeUnitTransform*): Self = StObject.set(x, "timeUnits", js.Array(value*))
  }
}
