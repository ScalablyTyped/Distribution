package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesTransitionTransitionDottypesMod.EnterAnimation
import typings.wixStyleReact.distTypesTransitionTransitionDottypesMod.ExitAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wix-style-react.wix-style-react/dist/types/Transition/Transition.types.TransitionProps & {  timeout :number} */
trait TransitionPropstimeoutnum extends StObject {
  
  /** Shows enter animation on component mount. */
  var animateOnLoad: js.UndefOr[Boolean] = js.undefined
  
  /** Allows to render any component as a child item. */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /** Applies a data-hook HTML attribute to be used in the tests. */
  var dataHook: js.UndefOr[String] = js.undefined
  
  /**
    Sets a type of animation that happens on enter animation.
    * - fadeIn -
    ```javascript
    {
    delay?: 'short' | 'medium' | 'long';
    duration:
    | 'fast01'
    | 'fast02'
    | 'medium01'
    | 'medium02'
    | 'slow01'
    | 'slow02';
    easing?: 'enterEasing' | 'standardEasing';
    }
    ```
    * - moveIn -
    ```javascript
    {
    delay?: 'short' | 'medium' | 'long';
    direction:
    | 'topToBottom'
    | 'bottomToTop'
    | 'leftToRight'
    | 'rightToLeft';
    distance: string;
    duration:
    | 'fast01'
    | 'fast02'
    | 'medium01'
    | 'medium02'
    | 'slow01'
    | 'slow02';
    easing?: 'enterEasing' | 'standardEasing';
    }
    ```
    * - expand -
    ```javascript
    {
    delay?: 'short' | 'medium' | 'long';
    direction:
    | 'topToBottom'
    | 'bottomToTop'
    | 'leftToRight'
    | 'rightToLeft';
    duration:
    | 'fast01'
    | 'fast02'
    | 'medium01'
    | 'medium02'
    | 'slow01'
    | 'slow02';
    easing?: 'enterEasing' | 'standardEasing';
    }
    ```
    * - scaleUp -
    ```javascript
    {
    delay?: 'short' | 'medium' | 'long';
    direction:
    | 'center'
    | 'top'
    | 'topEnd'
    | 'right'
    | 'bottomEnd'
    | 'bottom'
    | 'bottomStart'
    | 'left'
    | 'topStart';
    duration:
    | 'fast01'
    | 'fast02'
    | 'medium01'
    | 'medium02'
    | 'slow01'
    | 'slow02';
    easing?: 'enterEasing' | 'standardEasing';
    scale: string;
    }
    ```
    */
  var enterAnimation: js.UndefOr[EnterAnimation] = js.undefined
  
  /**
    Sets a type of animation that happens on exit animation.
    * - fadeOut -
    ```javascript
    {
    delay?: 'short' | 'medium' | 'long';
    duration:
    | 'fast01'
    | 'fast02'
    | 'medium01'
    | 'medium02'
    | 'slow01'
    | 'slow02';
    easing?: 'exitEasing' | 'standardEasing';
    }
    ```
    * - moveOut -
    ```javascript
    {
    delay?: 'short' | 'medium' | 'long';
    direction:
    | 'topToBottom'
    | 'bottomToTop'
    | 'leftToRight'
    | 'rightToLeft';
    distance: string;
    duration:
    | 'fast01'
    | 'fast02'
    | 'medium01'
    | 'medium02'
    | 'slow01'
    | 'slow02';
    easing?: 'exitEasing' | 'standardEasing'
    }
    ```
    * - collapse -
    ```javascript
    {
    delay?: 'short' | 'medium' | 'long';
    direction:
    | 'topToBottom'
    | 'bottomToTop'
    | 'leftToRight'
    | 'rightToLeft';
    duration:
    | 'fast01'
    | 'fast02'
    | 'medium01'
    | 'medium02'
    | 'slow01'
    | 'slow02';
    easing?: 'exitEasing' | 'standardEasing';
    }
    ```
    * - scaleDown -
    ```javascript
    {
    delay?: 'short' | 'medium' | 'long';
    direction:
    | 'center'
    | 'top'
    | 'topEnd'
    | 'right'
    | 'bottomEnd'
    | 'bottom'
    | 'bottomStart'
    | 'left'
    | 'topStart';
    duration:
    | 'fast01'
    | 'fast02'
    | 'medium01'
    | 'medium02'
    | 'slow01'
    | 'slow02';
    easing?: 'exitEasing' | 'standardEasing';
    scale: string;
    }
    ```
    */
  var exitAnimation: js.UndefOr[ExitAnimation] = js.undefined
  
  /** Lazy-mounts the component. If false, will be mounted immediately. It true, will be mounted with first enter. */
  var mountOnEnter: js.UndefOr[Boolean] = js.undefined
  
  /** Defines a callback function which is called immediately after the animation ends. */
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Defines a callback function which is called immediately after the animation starts. */
  var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Shows animation when set to true. */
  var show: js.UndefOr[Boolean] = js.undefined
  
  var timeout: Double
  
  /** Unmounts the component after it finishes exiting. If false, will stay mounted after exit. */
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}
object TransitionPropstimeoutnum {
  
  inline def apply(timeout: Double): TransitionPropstimeoutnum = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionPropstimeoutnum]
  }
  
  extension [Self <: TransitionPropstimeoutnum](x: Self) {
    
    inline def setAnimateOnLoad(value: Boolean): Self = StObject.set(x, "animateOnLoad", value.asInstanceOf[js.Any])
    
    inline def setAnimateOnLoadUndefined: Self = StObject.set(x, "animateOnLoad", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setEnterAnimation(value: EnterAnimation): Self = StObject.set(x, "enterAnimation", value.asInstanceOf[js.Any])
    
    inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
    
    inline def setExitAnimation(value: ExitAnimation): Self = StObject.set(x, "exitAnimation", value.asInstanceOf[js.Any])
    
    inline def setExitAnimationUndefined: Self = StObject.set(x, "exitAnimation", js.undefined)
    
    inline def setMountOnEnter(value: Boolean): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
    
    inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
    
    inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
    
    inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
  }
}
