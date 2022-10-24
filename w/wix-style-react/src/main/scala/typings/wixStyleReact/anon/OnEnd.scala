package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEnd extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var dataHook: Requireable[String]
  
  var mountOnEnter: Requireable[Boolean]
  
  var onEnd: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onStart: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var show: Requireable[Boolean]
  
  var unmountOnExit: Requireable[Boolean]
}
object OnEnd {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    dataHook: Requireable[String],
    mountOnEnter: Requireable[Boolean],
    onEnd: Requireable[js.Function1[/* repeated */ Any, Any]],
    onStart: Requireable[js.Function1[/* repeated */ Any, Any]],
    show: Requireable[Boolean],
    unmountOnExit: Requireable[Boolean]
  ): OnEnd = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], mountOnEnter = mountOnEnter.asInstanceOf[js.Any], onEnd = onEnd.asInstanceOf[js.Any], onStart = onStart.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], unmountOnExit = unmountOnExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEnd]
  }
  
  extension [Self <: OnEnd](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setMountOnEnter(value: Requireable[Boolean]): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
    
    inline def setOnEnd(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    inline def setOnStart(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Requireable[Boolean]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setUnmountOnExit(value: Requireable[Boolean]): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
  }
}
