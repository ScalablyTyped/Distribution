package typings.wordpressCompose

import typings.mousetrap.mod.ExtendedKeyboardEvent
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseKeyboardShortcutMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-keyboard-shortcut", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(shortcuts: String, callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(shortcuts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    shortcuts: String,
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Unit],
    param2: WPKeyboardShortcutConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(shortcuts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * A block selection object.
    *
    * @typedef {Object} WPKeyboardShortcutConfig
    *
    * @property {boolean}                                [bindGlobal] Handle keyboard events anywhere including inside textarea/input fields.
    * @property {string}                                 [eventName]  Event name used to trigger the handler, defaults to keydown.
    * @property {boolean}                                [isDisabled] Disables the keyboard handler if the value is true.
    * @property {import('react').RefObject<HTMLElement>} [target]     React reference to the DOM element used to catch the keyboard event.
    */
  /**
    * Attach a keyboard shortcut handler.
    *
    * @see https://craig.is/killing/mice#api.bind for information about the `callback` parameter.
    *
    * @param {string[]|string}                                                       shortcuts Keyboard Shortcuts.
    * @param {(e: import('mousetrap').ExtendedKeyboardEvent, combo: string) => void} callback  Shortcut callback.
    * @param {WPKeyboardShortcutConfig}                                              options   Shortcut options.
    */
  inline def default(
    shortcuts: js.Array[String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(shortcuts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    shortcuts: js.Array[String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Unit],
    param2: WPKeyboardShortcutConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(shortcuts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait WPKeyboardShortcutConfig extends StObject {
    
    /**
      * Handle keyboard events anywhere including inside textarea/input fields.
      */
    var bindGlobal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Event name used to trigger the handler, defaults to keydown.
      */
    var eventName: js.UndefOr[String] = js.undefined
    
    /**
      * Disables the keyboard handler if the value is true.
      */
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * React reference to the DOM element used to catch the keyboard event.
      */
    var target: js.UndefOr[RefObject[HTMLElement]] = js.undefined
  }
  object WPKeyboardShortcutConfig {
    
    inline def apply(): WPKeyboardShortcutConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WPKeyboardShortcutConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WPKeyboardShortcutConfig] (val x: Self) extends AnyVal {
      
      inline def setBindGlobal(value: Boolean): Self = StObject.set(x, "bindGlobal", value.asInstanceOf[js.Any])
      
      inline def setBindGlobalUndefined: Self = StObject.set(x, "bindGlobal", js.undefined)
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setTarget(value: RefObject[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
