package typings.vegaLite.anon

import typings.vegaLite.transformMod.AggregatedFieldDef
import typings.vegaLite.transformMod.BinTransform
import typings.vegaLite.transformMod.TimeUnitTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bins extends StObject {
  
  var aggregate: js.Array[AggregatedFieldDef]
  
  var bins: js.Array[BinTransform]
  
  var encoding: typings.vegaLite.encodingMod.Encoding[String]
  
  var groupby: js.Array[String]
  
  var timeUnits: js.Array[TimeUnitTransform]
}
object Bins {
  
  @scala.inline
  def apply(
    aggregate: js.Array[AggregatedFieldDef],
    bins: js.Array[BinTransform],
    encoding: typings.vegaLite.encodingMod.Encoding[String],
    groupby: js.Array[String],
    timeUnits: js.Array[TimeUnitTransform]
  ): Bins = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any], bins = bins.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], timeUnits = timeUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bins]
  }
  
  @scala.inline
  implicit class BinsMutableBuilder[Self <: Bins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: js.Array[AggregatedFieldDef]): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateVarargs(value: AggregatedFieldDef*): Self = StObject.set(x, "aggregate", js.Array(value :_*))
    
    @scala.inline
    def setBins(value: js.Array[BinTransform]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinsVarargs(value: BinTransform*): Self = StObject.set(x, "bins", js.Array(value :_*))
    
    @scala.inline
    def setEncoding(value: typings.vegaLite.encodingMod.Encoding[String]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupby(value: js.Array[String]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyVarargs(value: String*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setTimeUnits(value: js.Array[TimeUnitTransform]): Self = StObject.set(x, "timeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnitsVarargs(value: TimeUnitTransform*): Self = StObject.set(x, "timeUnits", js.Array(value :_*))
  }
}
