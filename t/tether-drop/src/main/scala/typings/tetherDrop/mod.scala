package typings.tetherDrop

import org.scalablytyped.runtime.Instantiable1
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.tether.mod.ITetherOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // global Drop constructor
  @JSImport("tether-drop", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Drop {
    def this(options: IDropOptions) = this()
  }
  @JSImport("tether-drop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createContext(options: IDropContextOptions): Instantiable1[/* options */ IDropOptions, Drop] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(options.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* options */ IDropOptions, Drop]]
  
  // global Drop constructor
  @js.native
  trait Drop extends StObject {
    
    def close(): Unit = js.native
    
    var content: HTMLElement = js.native
    
    def destroy(): Unit = js.native
    
    def isOpened(): Boolean = js.native
    
    def off(event: String): Unit = js.native
    def off(event: String, handler: js.Function): Unit = js.native
    
    /*
      * Drop instances fire "open" and "close" events.
      */
    def on(event: String, handler: js.Function): Unit = js.native
    def on(event: String, handler: js.Function, context: js.Any): Unit = js.native
    
    def once(event: String, handler: js.Function): Unit = js.native
    def once(event: String, handler: js.Function, context: js.Any): Unit = js.native
    
    def open(): Unit = js.native
    
    def position(): Unit = js.native
    
    def remove(): Unit = js.native
    
    var tether: typings.tether.mod.^ = js.native
    
    def toggle(): Unit = js.native
  }
  
  trait IDropContextOptions extends StObject {
    
    var classPrefix: js.UndefOr[String] = js.undefined
    
    var defaults: js.UndefOr[IDropOptions] = js.undefined
  }
  object IDropContextOptions {
    
    inline def apply(): IDropContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDropContextOptions]
    }
    
    extension [Self <: IDropContextOptions](x: Self) {
      
      inline def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
      
      inline def setClassPrefixUndefined: Self = StObject.set(x, "classPrefix", js.undefined)
      
      inline def setDefaults(value: IDropOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    }
  }
  
  trait IDropOptions extends StObject {
    
    var beforeClose: js.UndefOr[js.Function2[/* event */ Event, /* drop */ Drop, Boolean]] = js.undefined
    
    var blurDelay: js.UndefOr[Double] = js.undefined
    
    var classes: js.UndefOr[String] = js.undefined
    
    var closeDelay: js.UndefOr[Double] = js.undefined
    
    var constrainToScrollParent: js.UndefOr[Boolean] = js.undefined
    
    var constrainToWindow: js.UndefOr[Boolean] = js.undefined
    
    var content: js.UndefOr[Element | String | (js.Function1[js.UndefOr[Drop], Element | String])] = js.undefined
    
    var focusDelay: js.UndefOr[Double] = js.undefined
    
    var hoverCloseDelay: js.UndefOr[Double] = js.undefined
    
    var hoverOpenDelay: js.UndefOr[Double] = js.undefined
    
    var openDelay: js.UndefOr[Double] = js.undefined
    
    var openOn: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var remove: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
    
    var tetherOptions: js.UndefOr[ITetherOptions] = js.undefined
  }
  object IDropOptions {
    
    inline def apply(): IDropOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDropOptions]
    }
    
    extension [Self <: IDropOptions](x: Self) {
      
      inline def setBeforeClose(value: (/* event */ Event, /* drop */ Drop) => Boolean): Self = StObject.set(x, "beforeClose", js.Any.fromFunction2(value))
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBlurDelay(value: Double): Self = StObject.set(x, "blurDelay", value.asInstanceOf[js.Any])
      
      inline def setBlurDelayUndefined: Self = StObject.set(x, "blurDelay", js.undefined)
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setCloseDelay(value: Double): Self = StObject.set(x, "closeDelay", value.asInstanceOf[js.Any])
      
      inline def setCloseDelayUndefined: Self = StObject.set(x, "closeDelay", js.undefined)
      
      inline def setConstrainToScrollParent(value: Boolean): Self = StObject.set(x, "constrainToScrollParent", value.asInstanceOf[js.Any])
      
      inline def setConstrainToScrollParentUndefined: Self = StObject.set(x, "constrainToScrollParent", js.undefined)
      
      inline def setConstrainToWindow(value: Boolean): Self = StObject.set(x, "constrainToWindow", value.asInstanceOf[js.Any])
      
      inline def setConstrainToWindowUndefined: Self = StObject.set(x, "constrainToWindow", js.undefined)
      
      inline def setContent(value: Element | String | (js.Function1[js.UndefOr[Drop], Element | String])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction1(value: js.UndefOr[Drop] => Element | String): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFocusDelay(value: Double): Self = StObject.set(x, "focusDelay", value.asInstanceOf[js.Any])
      
      inline def setFocusDelayUndefined: Self = StObject.set(x, "focusDelay", js.undefined)
      
      inline def setHoverCloseDelay(value: Double): Self = StObject.set(x, "hoverCloseDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverCloseDelayUndefined: Self = StObject.set(x, "hoverCloseDelay", js.undefined)
      
      inline def setHoverOpenDelay(value: Double): Self = StObject.set(x, "hoverOpenDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverOpenDelayUndefined: Self = StObject.set(x, "hoverOpenDelay", js.undefined)
      
      inline def setOpenDelay(value: Double): Self = StObject.set(x, "openDelay", value.asInstanceOf[js.Any])
      
      inline def setOpenDelayUndefined: Self = StObject.set(x, "openDelay", js.undefined)
      
      inline def setOpenOn(value: String): Self = StObject.set(x, "openOn", value.asInstanceOf[js.Any])
      
      inline def setOpenOnUndefined: Self = StObject.set(x, "openOn", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTetherOptions(value: ITetherOptions): Self = StObject.set(x, "tetherOptions", value.asInstanceOf[js.Any])
      
      inline def setTetherOptionsUndefined: Self = StObject.set(x, "tetherOptions", js.undefined)
    }
  }
}
