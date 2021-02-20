package typings.useResizeObserver

import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /***
    * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
    * The hook is invoked at least once before the first measurement of actual size by the observer.
    * @return a ref,
    *         and ref.current's width (undefined before the first measurement),
    *         and ref.current's height (undefined before the first measurement).
    */
  @JSImport("use-resize-observer", JSImport.Namespace)
  @js.native
  def apply(): ObserverResultWithSize[HTMLElement] = js.native
  /***
    * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
    * The hook is invoked at least once before the first measurement of actual size by the observer.
    * @param defaults The onResize callback will be called with new ref.current's width and height as a parameter.
    *         Because of that, the ref.current's width and height are not returned.
    * @return a ref (optionally pass in your own)
    *         The callback function will be called with new ref.current's width and height as a parameter.
    */
  @JSImport("use-resize-observer", JSImport.Namespace)
  @js.native
  def apply[TElement /* <: HTMLElement */](defaults: DefaultsWithResizeHandler[TElement]): ObserverResultForResizeHandler[TElement] = js.native
  /***
    * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
    * The hook is invoked at least once before the first measurement of actual size by the observer.
    * @return a ref (optionally pass in your own),
    *         and ref.current's width (undefined before the first measurement),
    *         and ref.current's height (undefined before the first measurement).
    */
  @JSImport("use-resize-observer", JSImport.Namespace)
  @js.native
  def apply[TElement /* <: HTMLElement */](defaults: DefaultsWithoutResizeHandler[TElement]): ObserverResultWithSize[TElement] = js.native
  
  @js.native
  trait DefaultsWithResizeHandler[TElement] extends ObserverDefaults[TElement] {
    
    var onResize: ResizeHandler = js.native
    
    var ref: js.UndefOr[RefObject[TElement]] = js.native
  }
  object DefaultsWithResizeHandler {
    
    @scala.inline
    def apply[TElement](onResize: /* newSize */ RefSize => Unit): DefaultsWithResizeHandler[TElement] = {
      val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
      __obj.asInstanceOf[DefaultsWithResizeHandler[TElement]]
    }
    
    @scala.inline
    implicit class DefaultsWithResizeHandlerMutableBuilder[Self <: DefaultsWithResizeHandler[_], TElement] (val x: Self with DefaultsWithResizeHandler[TElement]) extends AnyVal {
      
      @scala.inline
      def setOnResize(value: /* newSize */ RefSize => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRef(value: RefObject[TElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  @js.native
  trait DefaultsWithoutResizeHandler[TElement] extends ObserverDefaults[TElement] {
    
    var ref: js.UndefOr[RefObject[TElement]] = js.native
  }
  object DefaultsWithoutResizeHandler {
    
    @scala.inline
    def apply[TElement](): DefaultsWithoutResizeHandler[TElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultsWithoutResizeHandler[TElement]]
    }
    
    @scala.inline
    implicit class DefaultsWithoutResizeHandlerMutableBuilder[Self <: DefaultsWithoutResizeHandler[_], TElement] (val x: Self with DefaultsWithoutResizeHandler[TElement]) extends AnyVal {
      
      @scala.inline
      def setRef(value: RefObject[TElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.useResizeObserver.mod.DefaultsWithoutResizeHandler[TElement]
    - typings.useResizeObserver.mod.DefaultsWithResizeHandler[TElement]
  */
  trait ObserverDefaults[TElement /* <: HTMLElement */] extends StObject
  object ObserverDefaults {
    
    @scala.inline
    def DefaultsWithResizeHandler[TElement /* <: HTMLElement */](onResize: /* newSize */ RefSize => Unit): typings.useResizeObserver.mod.DefaultsWithResizeHandler[TElement] = {
      val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
      __obj.asInstanceOf[typings.useResizeObserver.mod.DefaultsWithResizeHandler[TElement]]
    }
    
    @scala.inline
    def DefaultsWithoutResizeHandler[TElement /* <: HTMLElement */](): typings.useResizeObserver.mod.DefaultsWithoutResizeHandler[TElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.useResizeObserver.mod.DefaultsWithoutResizeHandler[TElement]]
    }
  }
  
  type ObserverRefSize = RefSize
  
  @js.native
  trait ObserverResultForResizeHandler[TElement] extends StObject {
    
    var ref: RefObject[TElement] = js.native
  }
  object ObserverResultForResizeHandler {
    
    @scala.inline
    def apply[TElement](ref: RefObject[TElement]): ObserverResultForResizeHandler[TElement] = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObserverResultForResizeHandler[TElement]]
    }
    
    @scala.inline
    implicit class ObserverResultForResizeHandlerMutableBuilder[Self <: ObserverResultForResizeHandler[_], TElement] (val x: Self with ObserverResultForResizeHandler[TElement]) extends AnyVal {
      
      @scala.inline
      def setRef(value: RefObject[TElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ObserverResultWithSize[TElement] extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var ref: RefObject[TElement] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object ObserverResultWithSize {
    
    @scala.inline
    def apply[TElement](ref: RefObject[TElement]): ObserverResultWithSize[TElement] = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObserverResultWithSize[TElement]]
    }
    
    @scala.inline
    implicit class ObserverResultWithSizeMutableBuilder[Self <: ObserverResultWithSize[_], TElement] (val x: Self with ObserverResultWithSize[TElement]) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setRef(value: RefObject[TElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait RefSize extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object RefSize {
    
    @scala.inline
    def apply(height: Double, width: Double): RefSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefSize]
    }
    
    @scala.inline
    implicit class RefSizeMutableBuilder[Self <: RefSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type ResizeHandler = js.Function1[/* newSize */ RefSize, Unit]
}
