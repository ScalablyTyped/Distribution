package typings.switchery

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Node
import typings.switchery.mod.Switchery.Options
import typings.switchery.mod.Switchery.SwitcheryStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("switchery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("switchery", JSImport.Default)
  @js.native
  class default protected () extends Switchery {
    def this(node: Node) = this()
    def this(node: Node, options: Options) = this()
  }
  @JSImport("switchery", JSImport.Default)
  @js.native
  def default: SwitcheryStatic = js.native
  @scala.inline
  def default_=(x: SwitcheryStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Switchery extends StObject {
    
    /**
      * Unbinding all event handlers attached to the switch element to prepare the object for garbage collection.
      * @returns {void}
      */
    def destroy(): Unit = js.native
    
    /**
      * Disable switch by unbinding attached events and changing opacity to disabledOpacity value
      * @returns {void}
      */
    def disable(): Unit = js.native
    
    /**
      * Enable disabled switch by re-adding event handlers and changing the opacity to 1.
      * @returns {void}
      */
    def enable(): Unit = js.native
    
    /**
      * Check if switch is currently disabled by checking the readonly and disabled attributes on the checkbox and the disabled option set via JS.
      *  If any of those are present, the returned value is true.
      * @returns {boolean} whether it's disabled or not.
      */
    def isDisabled(): Boolean = js.native
  }
  object Switchery {
    
    @scala.inline
    def apply(destroy: () => Unit, disable: () => Unit, enable: () => Unit, isDisabled: () => Boolean): Switchery = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[Switchery]
    }
    
    @js.native
    trait Options extends StObject {
      
      /**
        * class name for the switch element (by default styled in switchery.css)
        * @default 'switchery'
        */
      var className: js.UndefOr[String] = js.native
      
      /**
        * color of the switch element (HEX or RGB value)
        * @default '#64bd63'
        */
      var color: js.UndefOr[String] = js.native
      
      /**
        * enable or disable click events and changing the state of the switch (boolean value)
        * @default false
        */
      var disabled: js.UndefOr[Boolean] = js.native
      
      /**
        * opacity of the switch when it's disabled (0 to 1)
        * @default 0.5
        */
      var disabledOpacity: js.UndefOr[Double] = js.native
      
      /**
        * color of the jack/handle element
        * @default '#fff'
        */
      var jackColor: js.UndefOr[String] = js.native
      
      /**
        * color of unchecked jack/handle element
        * @default 'null'
        */
      var jackSecondaryColor: js.UndefOr[String] = js.native
      
      /**
        * secondary color for background color and border, when the switch is off
        * @default '#dfdfdf'
        */
      var secondaryColor: js.UndefOr[String] = js.native
      
      /**
        * size of the switch element (small or large)
        * @default 'default'
        */
      var size: js.UndefOr[String] = js.native
      
      /**
        * length of time that the transition will take, ex. '0.4s', '1s', '2.2s' (Note: transition speed of the handle is twice shorter)
        * @default '0.1s'
        */
      var speed: js.UndefOr[String] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabledOpacity(value: Double): Self = StObject.set(x, "disabledOpacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabledOpacityUndefined: Self = StObject.set(x, "disabledOpacity", js.undefined)
        
        @scala.inline
        def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        @scala.inline
        def setJackColor(value: String): Self = StObject.set(x, "jackColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJackColorUndefined: Self = StObject.set(x, "jackColor", js.undefined)
        
        @scala.inline
        def setJackSecondaryColor(value: String): Self = StObject.set(x, "jackSecondaryColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJackSecondaryColorUndefined: Self = StObject.set(x, "jackSecondaryColor", js.undefined)
        
        @scala.inline
        def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
        
        @scala.inline
        def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        @scala.inline
        def setSpeed(value: String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      }
    }
    
    @scala.inline
    implicit class SwitcheryMutableBuilder[Self <: Switchery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    }
    
    @js.native
    trait SwitcheryStatic
      extends Instantiable1[/* node */ Node, Switchery]
         with Instantiable2[/* node */ Node, /* options */ Options, Switchery]
  }
}
