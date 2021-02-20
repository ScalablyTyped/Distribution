package typings.terminalMenu

import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a TerminalMenu with default settings.
    */
  @JSImport("terminal-menu", JSImport.Namespace)
  @js.native
  def apply(): TerminalMenu = js.native
  /**
    * Creates a TerminalMenu using options to override default settings.
    * @param options Override values for available settings.
    */
  @JSImport("terminal-menu", JSImport.Namespace)
  @js.native
  def apply(options: TerminalMenuOptions): TerminalMenu = js.native
  
  @js.native
  trait TerminalMenu extends EventEmitter {
    
    /**
      * Create a new selectable menu item with label as the anchor.
      * @param label Label to use as the menu item anchor.
      */
    def add(label: String): Unit = js.native
    /**
      * Create a new selectable menu item with label as the anchor.
      * @param label Label to use as the menu item anchor.
      * @param callback Callback to invoke when the menu item is selected.
      */
    def add(label: String, callback: js.Function2[/* label */ String, /* index */ Double, Unit]): Unit = js.native
    
    /**
      * Unregister all listeners and puts the terminal back to its original state.
      */
    def close(): Unit = js.native
    
    /**
      * Return a duplex stream to wire up input and output.
      */
    def createStream(): Duplex = js.native
    
    /**
      * When a menu item is selected, this event is fired.
      * @param eventName Name of the event. Only value available for eventName is "select"
      * @param callback Handler for the event specified by eventName
      */
    def on(eventName: String, callback: js.Function2[/* label */ String, /* index */ Double, Unit]): this.type = js.native
    def on(eventName: js.Symbol, callback: js.Function2[/* label */ String, /* index */ Double, Unit]): this.type = js.native
    
    /**
      * Reset the terminal, clearing all content.
      */
    def reset(): Unit = js.native
    
    /**
      * Writes a message to the terminal.
      * @param msg Message to be written.
      */
    def write(msg: String): Unit = js.native
  }
  
  @js.native
  trait TerminalMenuOptions extends StObject {
    
    /**
      * Background color for the menu.
      * Default = 'blue'
      */
    var bg: js.UndefOr[String] = js.native
    
    /**
      * Foreground color for the menu.
      * Default = 'white'
      */
    var fg: js.UndefOr[String] = js.native
    
    /**
      * Padding for the bounding rectangle.
      * If a number is passed, all elements of the Thickness structure will be set to
      * that value.
      * Default = {
      *      left: 2,
      *      right: 2,
      *      top: 1,
      *      bottom: 1
      * }
      */
    var padding: js.UndefOr[Double | Thickness] = js.native
    
    /**
      * Index of the menu item to be selected.
      * Default = 0
      */
    var selected: js.UndefOr[Double] = js.native
    
    /**
      * Menu width in columns.
      * Default = 50.
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * Horizontal offset for top-left corner.
      * Default = 1
      */
    var x: js.UndefOr[Double] = js.native
    
    /**
      * Vertical offset for top-left corner.
      * Default = 1
      */
    var y: js.UndefOr[Double] = js.native
  }
  object TerminalMenuOptions {
    
    @scala.inline
    def apply(): TerminalMenuOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TerminalMenuOptions]
    }
    
    @scala.inline
    implicit class TerminalMenuOptionsMutableBuilder[Self <: TerminalMenuOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      @scala.inline
      def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | Thickness): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait Thickness extends StObject {
    
    /**
      * Represents width of the lower side of the bounding rectangle.
      */
    var bottom: Double = js.native
    
    /**
      * Represents width of the left side of the bounding rectangle.
      */
    var left: Double = js.native
    
    /**
      * Represents width of the right side of the bounding rectangle.
      */
    var right: Double = js.native
    
    /**
      * Represents width of the upper side of the bounding rectangle.
      */
    var top: Double = js.native
  }
  object Thickness {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Thickness = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Thickness]
    }
    
    @scala.inline
    implicit class ThicknessMutableBuilder[Self <: Thickness] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
