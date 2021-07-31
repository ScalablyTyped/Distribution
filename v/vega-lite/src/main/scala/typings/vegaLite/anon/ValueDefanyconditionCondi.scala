package typings.vegaLite.anon

import typings.vegaLite.channeldefMod.Conditional
import typings.vegaLite.channeldefMod.ValueDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/channeldef.ValueDef<any> & {  condition :vega-lite.vega-lite/build/src/channeldef.Conditional<vega-lite.vega-lite/build/src/channeldef.ValueDef<any>> | std.Array<vega-lite.vega-lite/build/src/channeldef.Conditional<vega-lite.vega-lite/build/src/channeldef.ValueDef<any>>>} */
trait ValueDefanyconditionCondi extends StObject {
  
  var condition: Conditional[ValueDef[js.Any]] | js.Array[Conditional[ValueDef[js.Any]]]
  
  /**
    * A constant value in visual domain (e.g., `"red"` / `"#0099ff"` / [gradient definition](https://vega.github.io/vega-lite/docs/types.html#gradient) for color, values between `0` to `1` for opacity).
    */
  var value: js.Any
}
object ValueDefanyconditionCondi {
  
  @scala.inline
  def apply(condition: Conditional[ValueDef[js.Any]] | js.Array[Conditional[ValueDef[js.Any]]], value: js.Any): ValueDefanyconditionCondi = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDefanyconditionCondi]
  }
  
  @scala.inline
  implicit class ValueDefanyconditionCondiMutableBuilder[Self <: ValueDefanyconditionCondi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: Conditional[ValueDef[js.Any]] | js.Array[Conditional[ValueDef[js.Any]]]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionVarargs(value: Conditional[ValueDef[js.Any]]*): Self = StObject.set(x, "condition", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
