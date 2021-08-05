package typings.useResizeObserver

import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /***
    * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
    * The hook is invoked at least once before the first measurement of actual size by the observer.
    * @return a ref,
    *         and ref.current's width (undefined before the first measurement),
    *         and ref.current's height (undefined before the first measurement).
    */
  inline def apply(): ObserverResultWithSize[HTMLElement] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ObserverResultWithSize[HTMLElement]]
  /***
    * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
    * The hook is invoked at least once before the first measurement of actual size by the observer.
    * @param defaults The onResize callback will be called with new ref.current's width and height as a parameter.
    *         Because of that, the ref.current's width and height are not returned.
    * @return a ref (optionally pass in your own)
    *         The callback function will be called with new ref.current's width and height as a parameter.
    */
  inline def apply[TElement /* <: HTMLElement */](defaults: DefaultsWithResizeHandler[TElement]): ObserverResultForResizeHandler[TElement] = ^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any]).asInstanceOf[ObserverResultForResizeHandler[TElement]]
  /***
    * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
    * The hook is invoked at least once before the first measurement of actual size by the observer.
    * @return a ref (optionally pass in your own),
    *         and ref.current's width (undefined before the first measurement),
    *         and ref.current's height (undefined before the first measurement).
    */
  inline def apply[TElement /* <: HTMLElement */](defaults: DefaultsWithoutResizeHandler[TElement]): ObserverResultWithSize[TElement] = ^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any]).asInstanceOf[ObserverResultWithSize[TElement]]
  
  @JSImport("use-resize-observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DefaultsWithResizeHandler[TElement]
    extends StObject
       with ObserverDefaults[TElement] {
    
    var onResize: ResizeHandler
    
    var ref: js.UndefOr[RefObject[TElement]] = js.undefined
  }
  object DefaultsWithResizeHandler {
    
    inline def apply[TElement](onResize: /* newSize */ RefSize => Unit): DefaultsWithResizeHandler[TElement] = {
      val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
      __obj.asInstanceOf[DefaultsWithResizeHandler[TElement]]
    }
    
    extension [Self <: DefaultsWithResizeHandler[?], TElement](x: Self & DefaultsWithResizeHandler[TElement]) {
      
      inline def setOnResize(value: /* newSize */ RefSize => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setRef(value: RefObject[TElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait DefaultsWithoutResizeHandler[TElement]
    extends StObject
       with ObserverDefaults[TElement] {
    
    var ref: js.UndefOr[RefObject[TElement]] = js.undefined
  }
  object DefaultsWithoutResizeHandler {
    
    inline def apply[TElement](): DefaultsWithoutResizeHandler[TElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultsWithoutResizeHandler[TElement]]
    }
    
    extension [Self <: DefaultsWithoutResizeHandler[?], TElement](x: Self & DefaultsWithoutResizeHandler[TElement]) {
      
      inline def setRef(value: RefObject[TElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.useResizeObserver.mod.DefaultsWithoutResizeHandler[TElement]
    - typings.useResizeObserver.mod.DefaultsWithResizeHandler[TElement]
  */
  trait ObserverDefaults[TElement /* <: HTMLElement */] extends StObject
  object ObserverDefaults {
    
    inline def DefaultsWithResizeHandler[TElement /* <: HTMLElement */](onResize: /* newSize */ RefSize => Unit): typings.useResizeObserver.mod.DefaultsWithResizeHandler[TElement] = {
      val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
      __obj.asInstanceOf[typings.useResizeObserver.mod.DefaultsWithResizeHandler[TElement]]
    }
    
    inline def DefaultsWithoutResizeHandler[TElement /* <: HTMLElement */](): typings.useResizeObserver.mod.DefaultsWithoutResizeHandler[TElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.useResizeObserver.mod.DefaultsWithoutResizeHandler[TElement]]
    }
  }
  
  type ObserverRefSize = RefSize
  
  trait ObserverResultForResizeHandler[TElement] extends StObject {
    
    var ref: RefObject[TElement]
  }
  object ObserverResultForResizeHandler {
    
    inline def apply[TElement](ref: RefObject[TElement]): ObserverResultForResizeHandler[TElement] = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObserverResultForResizeHandler[TElement]]
    }
    
    extension [Self <: ObserverResultForResizeHandler[?], TElement](x: Self & ObserverResultForResizeHandler[TElement]) {
      
      inline def setRef(value: RefObject[TElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObserverResultWithSize[TElement] extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var ref: RefObject[TElement]
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ObserverResultWithSize {
    
    inline def apply[TElement](ref: RefObject[TElement]): ObserverResultWithSize[TElement] = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObserverResultWithSize[TElement]]
    }
    
    extension [Self <: ObserverResultWithSize[?], TElement](x: Self & ObserverResultWithSize[TElement]) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setRef(value: RefObject[TElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait RefSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object RefSize {
    
    inline def apply(height: Double, width: Double): RefSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefSize]
    }
    
    extension [Self <: RefSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type ResizeHandler = js.Function1[/* newSize */ RefSize, Unit]
}
