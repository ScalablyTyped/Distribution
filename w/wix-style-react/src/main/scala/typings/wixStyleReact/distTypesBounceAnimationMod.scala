package typings.wixStyleReact

import typings.react.mod.AnimationEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBounceAnimationMod {
  
  @JSImport("wix-style-react/dist/types/BounceAnimation", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[BounceAnimationProps, js.Object, Any]
  
  type BounceAnimation = PureComponent[BounceAnimationProps, js.Object, Any]
  
  trait BounceAnimationProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var children: ReactNode
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[String | Double] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var onEnd: js.UndefOr[js.Function1[/* event */ AnimationEvent[HTMLDivElement], Unit]] = js.undefined
    
    var onStart: js.UndefOr[js.Function1[/* event */ AnimationEvent[HTMLDivElement], Unit]] = js.undefined
  }
  object BounceAnimationProps {
    
    inline def apply(): BounceAnimationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BounceAnimationProps]
    }
    
    extension [Self <: BounceAnimationProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDelay(value: String | Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnEnd(value: /* event */ AnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnStart(value: /* event */ AnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
}
