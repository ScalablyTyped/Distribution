package typings.toastifyJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Node
import typings.toastifyJs.toastifyJsStrings.bottom
import typings.toastifyJs.toastifyJsStrings.center
import typings.toastifyJs.toastifyJsStrings.left
import typings.toastifyJs.toastifyJsStrings.right
import typings.toastifyJs.toastifyJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Toastify = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Toastify]
  inline def apply(options: Options): Toastify = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Toastify]
  
  @JSImport("toastify-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reposition(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reposition")().asInstanceOf[Unit]
  
  trait Offset extends StObject {
    
    var x: Double | String
    
    var y: Double | String
  }
  object Offset {
    
    inline def apply(x: Double | String, y: Double | String): Offset = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Image/icon to be shown before text
      */
    var avatar: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated use style.background option instead
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Invoked when the toast is dismissed
      */
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var close: js.UndefOr[Boolean] = js.undefined
    
    var destination: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Toggle the default behavior of escaping HTML markup
      */
    var escapeMarkup: js.UndefOr[Boolean] = js.undefined
    
    var gravity: js.UndefOr[top | bottom] = js.undefined
    
    var newWindow: js.UndefOr[Boolean] = js.undefined
    
    var node: js.UndefOr[Node] = js.undefined
    
    var offset: js.UndefOr[Offset] = js.undefined
    
    /**
      * Set the order in which toasts are stacked in page
      */
    var oldestFirst: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var position: js.UndefOr[left | center | right] = js.undefined
    
    var selector: js.UndefOr[String | Node] = js.undefined
    
    /**
      * @default true
      */
    var stopOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * HTML DOM Style properties to add any style directly to toast
      */
    var style: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEscapeMarkup(value: Boolean): Self = StObject.set(x, "escapeMarkup", value.asInstanceOf[js.Any])
      
      inline def setEscapeMarkupUndefined: Self = StObject.set(x, "escapeMarkup", js.undefined)
      
      inline def setGravity(value: top | bottom): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setNewWindow(value: Boolean): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
      
      inline def setNewWindowUndefined: Self = StObject.set(x, "newWindow", js.undefined)
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOldestFirst(value: Boolean): Self = StObject.set(x, "oldestFirst", value.asInstanceOf[js.Any])
      
      inline def setOldestFirstUndefined: Self = StObject.set(x, "oldestFirst", js.undefined)
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPosition(value: left | center | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSelector(value: String | Node): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setStopOnFocus(value: Boolean): Self = StObject.set(x, "stopOnFocus", value.asInstanceOf[js.Any])
      
      inline def setStopOnFocusUndefined: Self = StObject.set(x, "stopOnFocus", js.undefined)
      
      inline def setStyle(value: StringDictionary[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Toastify extends StObject {
    
    /**
      * Hide the toast
      */
    def hideToast(): Unit
    
    /**
      * The configuration object to configure Toastify
      */
    val options: Options
    
    /**
      * Display the toast
      */
    def showToast(): Unit
    
    /**
      * The element that is the Toast
      */
    val toastElement: Element | Null
  }
  object Toastify {
    
    inline def apply(hideToast: () => Unit, options: Options, showToast: () => Unit): Toastify = {
      val __obj = js.Dynamic.literal(hideToast = js.Any.fromFunction0(hideToast), options = options.asInstanceOf[js.Any], showToast = js.Any.fromFunction0(showToast), toastElement = null)
      __obj.asInstanceOf[Toastify]
    }
    
    extension [Self <: Toastify](x: Self) {
      
      inline def setHideToast(value: () => Unit): Self = StObject.set(x, "hideToast", js.Any.fromFunction0(value))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setShowToast(value: () => Unit): Self = StObject.set(x, "showToast", js.Any.fromFunction0(value))
      
      inline def setToastElement(value: Element): Self = StObject.set(x, "toastElement", value.asInstanceOf[js.Any])
      
      inline def setToastElementNull: Self = StObject.set(x, "toastElement", null)
    }
  }
}
