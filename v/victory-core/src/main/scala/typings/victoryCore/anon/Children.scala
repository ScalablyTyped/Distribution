package typings.victoryCore.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var data: Requireable[js.Object]
  
  var delay: Requireable[Double]
  
  var duration: Requireable[Double]
  
  var easing: Requireable[String]
  
  var onEnd: Requireable[js.Function1[/* repeated */ Any, Any]]
}
object Children {
  
  inline def apply(
    children: Requireable[js.Function1[/* repeated */ Any, Any]],
    data: Requireable[js.Object],
    delay: Requireable[Double],
    duration: Requireable[Double],
    easing: Requireable[String],
    onEnd: Requireable[js.Function1[/* repeated */ Any, Any]]
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], onEnd = onEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setData(value: Requireable[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Requireable[Double]): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Requireable[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: Requireable[String]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setOnEnd(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
  }
}
