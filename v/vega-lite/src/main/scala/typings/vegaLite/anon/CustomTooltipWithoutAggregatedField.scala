package typings.vegaLite.anon

import typings.vegaLite.buildSrcChanneldefMod.StringFieldDef
import typings.vegaLite.buildSrcChanneldefMod.StringFieldDefWithCondition
import typings.vegaLite.buildSrcChanneldefMod.StringValueDefWithCondition
import typings.vegaLite.buildSrcTypeMod.StandardType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTooltipWithoutAggregatedField[F /* <: typings.vegaLite.buildSrcChanneldefMod.Field */] extends StObject {
  
  var customTooltipWithoutAggregatedField: js.UndefOr[
    StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
  ] = js.undefined
  
  var filteredEncoding: typings.vegaLite.buildSrcEncodingMod.Encoding[F]
}
object CustomTooltipWithoutAggregatedField {
  
  inline def apply[F /* <: typings.vegaLite.buildSrcChanneldefMod.Field */](filteredEncoding: typings.vegaLite.buildSrcEncodingMod.Encoding[F]): CustomTooltipWithoutAggregatedField[F] = {
    val __obj = js.Dynamic.literal(filteredEncoding = filteredEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTooltipWithoutAggregatedField[F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomTooltipWithoutAggregatedField[?], F /* <: typings.vegaLite.buildSrcChanneldefMod.Field */] (val x: Self & CustomTooltipWithoutAggregatedField[F]) extends AnyVal {
    
    inline def setCustomTooltipWithoutAggregatedField(
      value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
    ): Self = StObject.set(x, "customTooltipWithoutAggregatedField", value.asInstanceOf[js.Any])
    
    inline def setCustomTooltipWithoutAggregatedFieldUndefined: Self = StObject.set(x, "customTooltipWithoutAggregatedField", js.undefined)
    
    inline def setCustomTooltipWithoutAggregatedFieldVarargs(value: StringFieldDef[F]*): Self = StObject.set(x, "customTooltipWithoutAggregatedField", js.Array(value*))
    
    inline def setFilteredEncoding(value: typings.vegaLite.buildSrcEncodingMod.Encoding[F]): Self = StObject.set(x, "filteredEncoding", value.asInstanceOf[js.Any])
  }
}
