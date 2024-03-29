package typings.vegaLite.anon

import typings.vegaLite.buildSrcChanneldefMod.DatumDef
import typings.vegaLite.buildSrcChanneldefMod.PrimitiveValue
import typings.vegaLite.buildSrcDatetimeMod.DateTime
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaLite.vegaLiteStrings.datum
import typings.vegaLite.vegaLiteStrings.datumDotdatum
import typings.vegaLite.vegaLiteStrings.parent
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizeStack extends StObject {
  
  var config: typings.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]
  
  var expr: js.UndefOr[datum | parent | datumDotdatum] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var fieldOrDatumDef: (typings.vegaLite.buildSrcChanneldefMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
  
  var format: String | Dict[Any]
  
  var formatType: String
  
  var normalizeStack: js.UndefOr[Boolean] = js.undefined
}
object NormalizeStack {
  
  inline def apply(
    config: typings.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef],
    fieldOrDatumDef: (typings.vegaLite.buildSrcChanneldefMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]),
    format: String | Dict[Any],
    formatType: String
  ): NormalizeStack = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], formatType = formatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizeStack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizeStack] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: typings.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setExpr(value: datum | parent | datumDotdatum): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldOrDatumDef(
      value: (typings.vegaLite.buildSrcChanneldefMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
    ): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFormat(value: String | Dict[Any]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    inline def setNormalizeStack(value: Boolean): Self = StObject.set(x, "normalizeStack", value.asInstanceOf[js.Any])
    
    inline def setNormalizeStackUndefined: Self = StObject.set(x, "normalizeStack", js.undefined)
  }
}
