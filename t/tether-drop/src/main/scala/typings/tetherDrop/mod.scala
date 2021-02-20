package typings.tetherDrop

import org.scalablytyped.runtime.Instantiable1
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.tether.mod.ITetherOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // global Drop constructor
  @JSImport("tether-drop", JSImport.Namespace)
  @js.native
  class ^ protected () extends Drop {
    def this(options: IDropOptions) = this()
  }
  
  /* static member */
  @JSImport("tether-drop", "createContext")
  @js.native
  def createContext(options: IDropContextOptions): Instantiable1[/* options */ IDropOptions, Drop] = js.native
  
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
  
  @js.native
  trait IDropContextOptions extends StObject {
    
    var classPrefix: js.UndefOr[String] = js.native
    
    var defaults: js.UndefOr[IDropOptions] = js.native
  }
  object IDropContextOptions {
    
    @scala.inline
    def apply(): IDropContextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDropContextOptions]
    }
    
    @scala.inline
    implicit class IDropContextOptionsMutableBuilder[Self <: IDropContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassPrefixUndefined: Self = StObject.set(x, "classPrefix", js.undefined)
      
      @scala.inline
      def setDefaults(value: IDropOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    }
  }
  
  @js.native
  trait IDropOptions extends StObject {
    
    var beforeClose: js.UndefOr[js.Function2[/* event */ Event, /* drop */ Drop, Boolean]] = js.native
    
    var blurDelay: js.UndefOr[Double] = js.native
    
    var classes: js.UndefOr[String] = js.native
    
    var closeDelay: js.UndefOr[Double] = js.native
    
    var constrainToScrollParent: js.UndefOr[Boolean] = js.native
    
    var constrainToWindow: js.UndefOr[Boolean] = js.native
    
    var content: js.UndefOr[Element | String | (js.Function1[js.UndefOr[Drop], Element | String])] = js.native
    
    var focusDelay: js.UndefOr[Double] = js.native
    
    var hoverCloseDelay: js.UndefOr[Double] = js.native
    
    var hoverOpenDelay: js.UndefOr[Double] = js.native
    
    var openDelay: js.UndefOr[Double] = js.native
    
    var openOn: js.UndefOr[String] = js.native
    
    var position: js.UndefOr[String] = js.native
    
    var remove: js.UndefOr[Boolean] = js.native
    
    var target: js.UndefOr[Element] = js.native
    
    var tetherOptions: js.UndefOr[ITetherOptions] = js.native
  }
  object IDropOptions {
    
    @scala.inline
    def apply(): IDropOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDropOptions]
    }
    
    @scala.inline
    implicit class IDropOptionsMutableBuilder[Self <: IDropOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeClose(value: (/* event */ Event, /* drop */ Drop) => Boolean): Self = StObject.set(x, "beforeClose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      @scala.inline
      def setBlurDelay(value: Double): Self = StObject.set(x, "blurDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurDelayUndefined: Self = StObject.set(x, "blurDelay", js.undefined)
      
      @scala.inline
      def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setCloseDelay(value: Double): Self = StObject.set(x, "closeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDelayUndefined: Self = StObject.set(x, "closeDelay", js.undefined)
      
      @scala.inline
      def setConstrainToScrollParent(value: Boolean): Self = StObject.set(x, "constrainToScrollParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainToScrollParentUndefined: Self = StObject.set(x, "constrainToScrollParent", js.undefined)
      
      @scala.inline
      def setConstrainToWindow(value: Boolean): Self = StObject.set(x, "constrainToWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainToWindowUndefined: Self = StObject.set(x, "constrainToWindow", js.undefined)
      
      @scala.inline
      def setContent(value: Element | String | (js.Function1[js.UndefOr[Drop], Element | String])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction1(value: js.UndefOr[Drop] => Element | String): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setFocusDelay(value: Double): Self = StObject.set(x, "focusDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusDelayUndefined: Self = StObject.set(x, "focusDelay", js.undefined)
      
      @scala.inline
      def setHoverCloseDelay(value: Double): Self = StObject.set(x, "hoverCloseDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverCloseDelayUndefined: Self = StObject.set(x, "hoverCloseDelay", js.undefined)
      
      @scala.inline
      def setHoverOpenDelay(value: Double): Self = StObject.set(x, "hoverOpenDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverOpenDelayUndefined: Self = StObject.set(x, "hoverOpenDelay", js.undefined)
      
      @scala.inline
      def setOpenDelay(value: Double): Self = StObject.set(x, "openDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenDelayUndefined: Self = StObject.set(x, "openDelay", js.undefined)
      
      @scala.inline
      def setOpenOn(value: String): Self = StObject.set(x, "openOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnUndefined: Self = StObject.set(x, "openOn", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTetherOptions(value: ITetherOptions): Self = StObject.set(x, "tetherOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTetherOptionsUndefined: Self = StObject.set(x, "tetherOptions", js.undefined)
    }
  }
}
