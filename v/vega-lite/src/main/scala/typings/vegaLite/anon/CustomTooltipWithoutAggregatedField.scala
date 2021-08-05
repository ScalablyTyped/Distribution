package typings.vegaLite.anon

import typings.vegaLite.channeldefMod.StringFieldDef
import typings.vegaLite.channeldefMod.StringFieldDefWithCondition
import typings.vegaLite.channeldefMod.StringValueDefWithCondition
import typings.vegaLite.srcTypeMod.StandardType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTooltipWithoutAggregatedField[F /* <: typings.vegaLite.channeldefMod.Field */] extends StObject {
  
  var customTooltipWithoutAggregatedField: js.UndefOr[
    StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
  ] = js.undefined
  
  var filteredEncoding: typings.vegaLite.encodingMod.Encoding[F]
}
object CustomTooltipWithoutAggregatedField {
  
  inline def apply[F /* <: typings.vegaLite.channeldefMod.Field */](filteredEncoding: typings.vegaLite.encodingMod.Encoding[F]): CustomTooltipWithoutAggregatedField[F] = {
    val __obj = js.Dynamic.literal(filteredEncoding = filteredEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTooltipWithoutAggregatedField[F]]
  }
  
  extension [Self <: CustomTooltipWithoutAggregatedField[?], F /* <: typings.vegaLite.channeldefMod.Field */](x: Self & CustomTooltipWithoutAggregatedField[F]) {
    
    inline def setCustomTooltipWithoutAggregatedField(
      value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
    ): Self = StObject.set(x, "customTooltipWithoutAggregatedField", value.asInstanceOf[js.Any])
    
    inline def setCustomTooltipWithoutAggregatedFieldUndefined: Self = StObject.set(x, "customTooltipWithoutAggregatedField", js.undefined)
    
    inline def setCustomTooltipWithoutAggregatedFieldVarargs(value: StringFieldDef[F]*): Self = StObject.set(x, "customTooltipWithoutAggregatedField", js.Array(value :_*))
    
    inline def setFilteredEncoding(value: typings.vegaLite.encodingMod.Encoding[F]): Self = StObject.set(x, "filteredEncoding", value.asInstanceOf[js.Any])
  }
}
