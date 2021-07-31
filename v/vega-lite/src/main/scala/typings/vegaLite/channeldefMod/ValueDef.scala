package typings.vegaLite.channeldefMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueDef[V /* <: Value[ExprRef | SignalRef] */] extends StObject {
  
  /**
    * A constant value in visual domain (e.g., `"red"` / `"#0099ff"` / [gradient definition](https://vega.github.io/vega-lite/docs/types.html#gradient) for color, values between `0` to `1` for opacity).
    */
  var value: V
}
object ValueDef {
  
  @scala.inline
  def apply[V /* <: Value[ExprRef | SignalRef] */](value: V): ValueDef[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDef[V]]
  }
  
  @scala.inline
  implicit class ValueDefMutableBuilder[Self <: ValueDef[?], V /* <: Value[ExprRef | SignalRef] */] (val x: Self & ValueDef[V]) extends AnyVal {
    
    @scala.inline
    def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
