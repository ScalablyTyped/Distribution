package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animateMod {
  
  @JSImport("wix-style-react/dist/es/src/Animate", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[AnimateProps, js.Object, js.Any]
  
  type Animate = PureComponent[AnimateProps, js.Object, js.Any]
  
  trait AnimateProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var children: ReactNode
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[String | Double] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object AnimateProps {
    
    @scala.inline
    def apply(): AnimateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimateProps]
    }
    
    @scala.inline
    implicit class AnimatePropsMutableBuilder[Self <: AnimateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDelay(value: String | Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
}
