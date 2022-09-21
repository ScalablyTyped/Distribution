package typings.vegaLite.anon

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channeldefMod.DatumDef
import typings.vegaLite.channeldefMod.PrimitiveValue
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldOrDatumDef extends StObject {
  
  var fieldOrDatumDef: (TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
  
  var scaleType: typings.vegaLite.scaleMod.ScaleType
  
  var size: js.UndefOr[SignalRef] = js.undefined
  
  var values: js.UndefOr[(js.Array[Boolean | DateTime | Double | String]) | SignalRef] = js.undefined
}
object FieldOrDatumDef {
  
  inline def apply(
    fieldOrDatumDef: (TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]),
    scaleType: typings.vegaLite.scaleMod.ScaleType
  ): FieldOrDatumDef = {
    val __obj = js.Dynamic.literal(fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOrDatumDef]
  }
  
  extension [Self <: FieldOrDatumDef](x: Self) {
    
    inline def setFieldOrDatumDef(
      value: (TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
    ): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
    
    inline def setScaleType(value: typings.vegaLite.scaleMod.ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    inline def setSize(value: SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValues(value: (js.Array[Boolean | DateTime | Double | String]) | SignalRef): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
