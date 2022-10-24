package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDown extends StObject {
  
  var dataHook: Requireable[String]
  
  var downDisabled: Requireable[Boolean]
  
  var onDown: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onMouseDown: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onUp: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var upDisabled: Requireable[Boolean]
}
object OnDown {
  
  inline def apply(
    dataHook: Requireable[String],
    downDisabled: Requireable[Boolean],
    onDown: Requireable[js.Function1[/* repeated */ Any, Any]],
    onMouseDown: Requireable[js.Function1[/* repeated */ Any, Any]],
    onUp: Requireable[js.Function1[/* repeated */ Any, Any]],
    upDisabled: Requireable[Boolean]
  ): OnDown = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], downDisabled = downDisabled.asInstanceOf[js.Any], onDown = onDown.asInstanceOf[js.Any], onMouseDown = onMouseDown.asInstanceOf[js.Any], onUp = onUp.asInstanceOf[js.Any], upDisabled = upDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDown]
  }
  
  extension [Self <: OnDown](x: Self) {
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDownDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "downDisabled", value.asInstanceOf[js.Any])
    
    inline def setOnDown(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onDown", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDown(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    inline def setOnUp(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onUp", value.asInstanceOf[js.Any])
    
    inline def setUpDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "upDisabled", value.asInstanceOf[js.Any])
  }
}
