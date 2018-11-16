package typings
package atWebscopeioReactDashTextareaDashAutocompleteLib.reactDashTextareaDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Pick) */ @js.native
trait TextareaProps[TItem] extends js.Object {
  /**
       * ClassNames of the textarea.
       */
  var className: js.UndefOr[java.lang.String] = js.native
  /**
       * 	When it's true autocomplete will close when use click outside.
       * @default false
       */
  var closeOnClickOutside: js.UndefOr[scala.Boolean] = js.native
  /**
       * ClassNames of the textarea's container.
       */
  var containerClassName: js.UndefOr[java.lang.String] = js.native
  /**
       * Styles of textarea's container.
       */
  var containerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  /**
       * 	ClassNames of dropdown's wrapper.
       */
  var dropdownClassName: js.UndefOr[java.lang.String] = js.native
  /**
       * Styles of dropdown's wrapper.
       */
  var dropdownStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  /**
       * Allows you to get React ref of the underlying textarea.
       */
  var innerRef: js.UndefOr[js.Function1[/* ref */ reactLib.HTMLTextAreaElement, scala.Unit]] = js.native
  /**
       * ClassNames of item's wrapper.
       */
  var itemClassName: js.UndefOr[java.lang.String] = js.native
  /**
       * Styles of item's wrapper.
       */
  var itemStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  /**
       * 	ClassNames of list's wrapper.
       */
  var listClassName: js.UndefOr[java.lang.String] = js.native
  /**
       * Styles of list's wrapper.
       */
  var listStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  /**
       * ClassNames of loader's wrapper.
       */
  var loaderClassName: js.UndefOr[java.lang.String] = js.native
  /**
       * Styles of loader's wrapper.
       */
  var loaderStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  /**
       * Gets data props which is already fetched (and displayed) suggestion.
       */
  @JSName("loadingComponent")
  var loadingComponent_Original: reactLib.reactMod.ReactNs.SFC[js.Object] = js.native
  /**
       * Number of characters that user should type for trigger a suggestion.
       * @default 1
       */
  var minChar: js.UndefOr[scala.Double] = js.native
  /**
       * When it's true the textarea will move along with a caret as a user continues to type.
       * @default false
       */
  var movePopupAsYouType: js.UndefOr[scala.Boolean] = js.native
  /**
       * Listener called every time the textarea's caret position is changed. The listener is called with one attribute - caret position denoted by an integer number.
       */
  var onCaretPositionChange: js.UndefOr[js.Function1[/* pos */ scala.Double, scala.Unit]] = js.native
  /**
       * With default implementation it will scroll the dropdown every time when the item gets out of the view.
       * @default true
       */
  var scrollToItem: js.UndefOr[
    scala.Boolean | (js.Function2[
      /* container */ reactLib.HTMLDivElement, 
      /* item */ reactLib.HTMLDivElement, 
      scala.Unit
    ])
  ] = js.native
  /**
       * Styles of textarea
       */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  /**
       * Define triggers and their corresponding behavior.
       */
  var trigger: TriggerType[TItem] = js.native
  /**
       * Gets data props which is already fetched (and displayed) suggestion.
       */
  def loadingComponent(props: js.Object with reactLib.Anon_Children): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  /**
       * Gets data props which is already fetched (and displayed) suggestion.
       */
  def loadingComponent(props: js.Object with reactLib.Anon_Children, context: js.Any): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
}

