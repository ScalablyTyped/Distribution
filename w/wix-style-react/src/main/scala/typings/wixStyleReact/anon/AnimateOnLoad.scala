package typings.wixStyleReact.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimateOnLoad extends StObject {
  
  var animateOnLoad: Requireable[Boolean]
  
  var children: Requireable[ReactNodeLike]
  
  var dataHook: Requireable[String]
  
  var enterAnimation: Requireable[InferProps[Expand]]
  
  var exitAnimation: Requireable[InferProps[Collapse]]
  
  var mountOnEnter: Requireable[Boolean]
  
  var onEnd: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onStart: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var show: Requireable[Boolean]
  
  var unmountOnExit: Requireable[Boolean]
}
object AnimateOnLoad {
  
  inline def apply(
    animateOnLoad: Requireable[Boolean],
    children: Requireable[ReactNodeLike],
    dataHook: Requireable[String],
    enterAnimation: Requireable[InferProps[Expand]],
    exitAnimation: Requireable[InferProps[Collapse]],
    mountOnEnter: Requireable[Boolean],
    onEnd: Requireable[js.Function1[/* repeated */ Any, Any]],
    onStart: Requireable[js.Function1[/* repeated */ Any, Any]],
    show: Requireable[Boolean],
    unmountOnExit: Requireable[Boolean]
  ): AnimateOnLoad = {
    val __obj = js.Dynamic.literal(animateOnLoad = animateOnLoad.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], enterAnimation = enterAnimation.asInstanceOf[js.Any], exitAnimation = exitAnimation.asInstanceOf[js.Any], mountOnEnter = mountOnEnter.asInstanceOf[js.Any], onEnd = onEnd.asInstanceOf[js.Any], onStart = onStart.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], unmountOnExit = unmountOnExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimateOnLoad]
  }
  
  extension [Self <: AnimateOnLoad](x: Self) {
    
    inline def setAnimateOnLoad(value: Requireable[Boolean]): Self = StObject.set(x, "animateOnLoad", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setEnterAnimation(value: Requireable[InferProps[Expand]]): Self = StObject.set(x, "enterAnimation", value.asInstanceOf[js.Any])
    
    inline def setExitAnimation(value: Requireable[InferProps[Collapse]]): Self = StObject.set(x, "exitAnimation", value.asInstanceOf[js.Any])
    
    inline def setMountOnEnter(value: Requireable[Boolean]): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
    
    inline def setOnEnd(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    inline def setOnStart(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Requireable[Boolean]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setUnmountOnExit(value: Requireable[Boolean]): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
  }
}
