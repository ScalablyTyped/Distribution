package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delimiters extends StObject {
  
  var delimiters: Any
  
  var disableEditing: Boolean
  
  var inputElement: typings.react.mod.global.JSX.Element
  
  def onKeyDown(event: Any): Unit
  
  def onPaste(): Unit
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
}
object Delimiters {
  
  inline def apply(
    delimiters: Any,
    disableEditing: Boolean,
    inputElement: typings.react.mod.global.JSX.Element,
    onKeyDown: Any => Unit,
    onPaste: () => Unit
  ): Delimiters = {
    val __obj = js.Dynamic.literal(delimiters = delimiters.asInstanceOf[js.Any], disableEditing = disableEditing.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), onPaste = js.Any.fromFunction0(onPaste))
    __obj.asInstanceOf[Delimiters]
  }
  
  extension [Self <: Delimiters](x: Self) {
    
    inline def setDelimiters(value: Any): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
    
    inline def setDisableEditing(value: Boolean): Self = StObject.set(x, "disableEditing", value.asInstanceOf[js.Any])
    
    inline def setInputElement(value: typings.react.mod.global.JSX.Element): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDown(value: Any => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnPaste(value: () => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction0(value))
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
