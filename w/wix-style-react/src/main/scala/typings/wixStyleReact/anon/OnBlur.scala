package typings.wixStyleReact.anon

import typings.react.mod.RefCallback
import typings.react.mod.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBlur extends StObject {
  
  var className: String
  
  def onBlur(e: SyntheticEvent[typings.std.Element, typings.std.Event]): Unit
  
  def onFocus(e: SyntheticEvent[typings.std.Element, typings.std.Event]): Unit
  
  def onInput(): js.UndefOr[Unit]
  
  def onKeyDown(e: SyntheticEvent[typings.std.Element, typings.std.Event]): Unit
  
  var ref: RefCallback[Any]
  
  var rows: Double
}
object OnBlur {
  
  inline def apply(
    className: String,
    onBlur: SyntheticEvent[typings.std.Element, typings.std.Event] => Unit,
    onFocus: SyntheticEvent[typings.std.Element, typings.std.Event] => Unit,
    onInput: () => js.UndefOr[Unit],
    onKeyDown: SyntheticEvent[typings.std.Element, typings.std.Event] => Unit,
    ref: /* instance */ Any | Null => Unit,
    rows: Double
  ): OnBlur = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), onInput = js.Any.fromFunction0(onInput), onKeyDown = js.Any.fromFunction1(onKeyDown), ref = js.Any.fromFunction1(ref), rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBlur]
  }
  
  extension [Self <: OnBlur](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: SyntheticEvent[typings.std.Element, typings.std.Event] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnFocus(value: SyntheticEvent[typings.std.Element, typings.std.Event] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnInput(value: () => js.UndefOr[Unit]): Self = StObject.set(x, "onInput", js.Any.fromFunction0(value))
    
    inline def setOnKeyDown(value: SyntheticEvent[typings.std.Element, typings.std.Event] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setRef(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
