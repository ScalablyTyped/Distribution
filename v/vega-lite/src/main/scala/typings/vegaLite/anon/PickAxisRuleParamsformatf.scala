package typings.vegaLite.anon

import typings.vegaLite.buildSrcChanneldefMod.PositionDatumDef
import typings.vegaLite.buildSrcChanneldefMod.PositionFieldDef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<vega-lite.vega-lite/build/src/compile/axis/properties.AxisRuleParams, 'format' | 'fieldOrDatumDef'> */
trait PickAxisRuleParamsformatf extends StObject {
  
  var fieldOrDatumDef: PositionFieldDef[String] | PositionDatumDef[String]
  
  var format: String | SignalRef
}
object PickAxisRuleParamsformatf {
  
  inline def apply(fieldOrDatumDef: PositionFieldDef[String] | PositionDatumDef[String], format: String | SignalRef): PickAxisRuleParamsformatf = {
    val __obj = js.Dynamic.literal(fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAxisRuleParamsformatf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickAxisRuleParamsformatf] (val x: Self) extends AnyVal {
    
    inline def setFieldOrDatumDef(value: PositionFieldDef[String] | PositionDatumDef[String]): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String | SignalRef): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
