package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.AriaAttributes
import typings.react.mod.AriaRole
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClassAttributes
import typings.react.mod.ComponentType
import typings.react.mod.DOMAttributes
import typings.react.reactStrings.decimal
import typings.react.reactStrings.email
import typings.react.reactStrings.environment
import typings.react.reactStrings.inherit
import typings.react.reactStrings.no
import typings.react.reactStrings.none
import typings.react.reactStrings.numeric
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.react.reactStrings.search
import typings.react.reactStrings.tel
import typings.react.reactStrings.text
import typings.react.reactStrings.url
import typings.react.reactStrings.user
import typings.react.reactStrings.yes
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.wordpressComponents.buttonMod.Button.Props
import typings.wordpressComponents.popoverMod.Popover.Position
import typings.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import typings.wordpressComponents.wordpressComponentsStrings.left
import typings.wordpressComponents.wordpressComponentsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/button", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Button {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.react.mod.HTMLAttributes because var conflicts: className. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, placeholder, radioGroup, id, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, unselectable, role, datatype, itemProp, title, autoCorrect, results
    - typings.react.mod.AllHTMLAttributes because var conflicts: className, disabled, label. Inlined formAction, srcDoc, alt, coords, src, max, marginWidth, keyParams, required, selected, kind, charSet, srcLang, sizes, dateTime, multiple, height, rowSpan, as, method, content, nonce, start, httpEquiv, default, optimum, target, scope, sandbox, seamless, classID, noValidate, autoPlay, min, cols, capture, encType, wmode, wrap, keyType, frameBorder, media, preload, useMap, size, scoped, rel, maxLength, manifest, colSpan, data, formEncType, pattern, form, open, accept, step, defer, shape, value, cite, minLength, cellSpacing, readOnly, challenge, poster, name, formMethod, playsInline, marginHeight, htmlFor, allowTransparency, headers, width, summary, formTarget, rows, href, action, scrolling, low, acceptCharset, reversed, autoFocus, controls, loop, mediaGroup, download, crossOrigin, muted, async, integrity, high, `type`, checked, srcSet, formNoValidate, allowFullScreen, list, cellPadding, autoComplete, hrefLang, span
    - typings.react.mod.HTMLProps because var conflicts: className, disabled, label. Inlined  */ trait AnchorProps
      extends StObject
         with BaseProps
         with Props
         with ClassAttributes[HTMLAnchorElement]
         with AriaAttributes
         with DOMAttributes[HTMLAnchorElement] {
      
      var default: js.UndefOr[Boolean] = js.undefined
      
      // RDFa Attributes
      var about: js.UndefOr[String] = js.undefined
      
      // Standard HTML Attributes
      var accept: js.UndefOr[String] = js.undefined
      
      var acceptCharset: js.UndefOr[String] = js.undefined
      
      // Standard HTML Attributes
      var accessKey: js.UndefOr[String] = js.undefined
      
      var action: js.UndefOr[String] = js.undefined
      
      var allowFullScreen: js.UndefOr[Boolean] = js.undefined
      
      var allowTransparency: js.UndefOr[Boolean] = js.undefined
      
      var alt: js.UndefOr[String] = js.undefined
      
      var as: js.UndefOr[String] = js.undefined
      
      var async: js.UndefOr[Boolean] = js.undefined
      
      // Non-standard Attributes
      var autoCapitalize: js.UndefOr[String] = js.undefined
      
      var autoComplete: js.UndefOr[String] = js.undefined
      
      var autoCorrect: js.UndefOr[String] = js.undefined
      
      var autoFocus: js.UndefOr[Boolean] = js.undefined
      
      var autoPlay: js.UndefOr[Boolean] = js.undefined
      
      var autoSave: js.UndefOr[String] = js.undefined
      
      var capture: js.UndefOr[Boolean | user | environment] = js.undefined
      
      var cellPadding: js.UndefOr[Double | String] = js.undefined
      
      var cellSpacing: js.UndefOr[Double | String] = js.undefined
      
      var challenge: js.UndefOr[String] = js.undefined
      
      var charSet: js.UndefOr[String] = js.undefined
      
      var checked: js.UndefOr[Boolean] = js.undefined
      
      var cite: js.UndefOr[String] = js.undefined
      
      var classID: js.UndefOr[String] = js.undefined
      
      var colSpan: js.UndefOr[Double] = js.undefined
      
      var color: js.UndefOr[String] = js.undefined
      
      var cols: js.UndefOr[Double] = js.undefined
      
      var content: js.UndefOr[String] = js.undefined
      
      var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
      
      var contextMenu: js.UndefOr[String] = js.undefined
      
      var controls: js.UndefOr[Boolean] = js.undefined
      
      var coords: js.UndefOr[String] = js.undefined
      
      var crossOrigin: js.UndefOr[String] = js.undefined
      
      var data: js.UndefOr[String] = js.undefined
      
      var datatype: js.UndefOr[String] = js.undefined
      
      var dateTime: js.UndefOr[String] = js.undefined
      
      // React-specific Attributes
      var defaultChecked: js.UndefOr[Boolean] = js.undefined
      
      var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
      
      var defer: js.UndefOr[Boolean] = js.undefined
      
      var dir: js.UndefOr[String] = js.undefined
      
      var download: js.UndefOr[Any] = js.undefined
      
      var draggable: js.UndefOr[Booleanish] = js.undefined
      
      var encType: js.UndefOr[String] = js.undefined
      
      var form: js.UndefOr[String] = js.undefined
      
      var formAction: js.UndefOr[String] = js.undefined
      
      var formEncType: js.UndefOr[String] = js.undefined
      
      var formMethod: js.UndefOr[String] = js.undefined
      
      var formNoValidate: js.UndefOr[Boolean] = js.undefined
      
      var formTarget: js.UndefOr[String] = js.undefined
      
      var frameBorder: js.UndefOr[Double | String] = js.undefined
      
      var headers: js.UndefOr[String] = js.undefined
      
      var height: js.UndefOr[Double | String] = js.undefined
      
      var hidden: js.UndefOr[Boolean] = js.undefined
      
      var high: js.UndefOr[Double] = js.undefined
      
      var href: js.UndefOr[String] = js.undefined
      
      var hrefLang: js.UndefOr[String] = js.undefined
      
      var htmlFor: js.UndefOr[String] = js.undefined
      
      var httpEquiv: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var inlist: js.UndefOr[Any] = js.undefined
      
      // Living Standard
      /**
        * Hints at the type of data that might be entered by the user while editing the element or its contents
        * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
        */
      var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
      
      var integrity: js.UndefOr[String] = js.undefined
      
      /**
        * Specify that a standard HTML element should behave like a defined custom built-in element
        * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
        */
      var is: js.UndefOr[String] = js.undefined
      
      var itemID: js.UndefOr[String] = js.undefined
      
      var itemProp: js.UndefOr[String] = js.undefined
      
      var itemRef: js.UndefOr[String] = js.undefined
      
      var itemScope: js.UndefOr[Boolean] = js.undefined
      
      var itemType: js.UndefOr[String] = js.undefined
      
      var keyParams: js.UndefOr[String] = js.undefined
      
      var keyType: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var lang: js.UndefOr[String] = js.undefined
      
      var list: js.UndefOr[String] = js.undefined
      
      var loop: js.UndefOr[Boolean] = js.undefined
      
      var low: js.UndefOr[Double] = js.undefined
      
      var manifest: js.UndefOr[String] = js.undefined
      
      var marginHeight: js.UndefOr[Double] = js.undefined
      
      var marginWidth: js.UndefOr[Double] = js.undefined
      
      var max: js.UndefOr[Double | String] = js.undefined
      
      var maxLength: js.UndefOr[Double] = js.undefined
      
      var media: js.UndefOr[String] = js.undefined
      
      var mediaGroup: js.UndefOr[String] = js.undefined
      
      var method: js.UndefOr[String] = js.undefined
      
      var min: js.UndefOr[Double | String] = js.undefined
      
      var minLength: js.UndefOr[Double] = js.undefined
      
      var multiple: js.UndefOr[Boolean] = js.undefined
      
      var muted: js.UndefOr[Boolean] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var noValidate: js.UndefOr[Boolean] = js.undefined
      
      var nonce: js.UndefOr[String] = js.undefined
      
      var open: js.UndefOr[Boolean] = js.undefined
      
      var optimum: js.UndefOr[Double] = js.undefined
      
      var pattern: js.UndefOr[String] = js.undefined
      
      var placeholder: js.UndefOr[String] = js.undefined
      
      var playsInline: js.UndefOr[Boolean] = js.undefined
      
      var poster: js.UndefOr[String] = js.undefined
      
      var prefix: js.UndefOr[String] = js.undefined
      
      var preload: js.UndefOr[String] = js.undefined
      
      var property: js.UndefOr[String] = js.undefined
      
      // Unknown
      var radioGroup: js.UndefOr[String] = js.undefined
      
      var readOnly: js.UndefOr[Boolean] = js.undefined
      
      var rel: js.UndefOr[String] = js.undefined
      
      var required: js.UndefOr[Boolean] = js.undefined
      
      var resource: js.UndefOr[String] = js.undefined
      
      var results: js.UndefOr[Double] = js.undefined
      
      var reversed: js.UndefOr[Boolean] = js.undefined
      
      // <command>, <menuitem>
      // WAI-ARIA
      var role: js.UndefOr[AriaRole] = js.undefined
      
      var rowSpan: js.UndefOr[Double] = js.undefined
      
      var rows: js.UndefOr[Double] = js.undefined
      
      var sandbox: js.UndefOr[String] = js.undefined
      
      var scope: js.UndefOr[String] = js.undefined
      
      var scoped: js.UndefOr[Boolean] = js.undefined
      
      var scrolling: js.UndefOr[String] = js.undefined
      
      var seamless: js.UndefOr[Boolean] = js.undefined
      
      var security: js.UndefOr[String] = js.undefined
      
      var selected: js.UndefOr[Boolean] = js.undefined
      
      var shape: js.UndefOr[String] = js.undefined
      
      var size: js.UndefOr[Double] = js.undefined
      
      var sizes: js.UndefOr[String] = js.undefined
      
      var slot: js.UndefOr[String] = js.undefined
      
      var span: js.UndefOr[Double] = js.undefined
      
      var spellCheck: js.UndefOr[Booleanish] = js.undefined
      
      var src: js.UndefOr[String] = js.undefined
      
      var srcDoc: js.UndefOr[String] = js.undefined
      
      var srcLang: js.UndefOr[String] = js.undefined
      
      var srcSet: js.UndefOr[String] = js.undefined
      
      var start: js.UndefOr[Double] = js.undefined
      
      var step: js.UndefOr[Double | String] = js.undefined
      
      var style: js.UndefOr[CSSProperties] = js.undefined
      
      var summary: js.UndefOr[String] = js.undefined
      
      var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
      
      var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
      
      var tabIndex: js.UndefOr[Double] = js.undefined
      
      var target: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var translate: js.UndefOr[yes | no] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var typeof: js.UndefOr[String] = js.undefined
      
      var unselectable: js.UndefOr[on | off] = js.undefined
      
      var useMap: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
      
      var vocab: js.UndefOr[String] = js.undefined
      
      var width: js.UndefOr[Double | String] = js.undefined
      
      var wmode: js.UndefOr[String] = js.undefined
      
      var wrap: js.UndefOr[String] = js.undefined
    }
    object AnchorProps {
      
      inline def apply(): AnchorProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AnchorProps]
      }
      
      extension [Self <: AnchorProps](x: Self) {
        
        inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
        
        inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
        
        inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
        
        inline def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
        
        inline def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
        
        inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
        
        inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
        
        inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
        
        inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        inline def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
        
        inline def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
        
        inline def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
        
        inline def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
        
        inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
        
        inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
        
        inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
        
        inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
        
        inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
        
        inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
        
        inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
        
        inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
        
        inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
        
        inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
        
        inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
        
        inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
        
        inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
        
        inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
        
        inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
        
        inline def setCapture(value: Boolean | user | environment): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
        
        inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
        
        inline def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
        
        inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
        
        inline def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
        
        inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
        
        inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
        
        inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
        
        inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
        
        inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
        
        inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
        
        inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
        
        inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
        
        inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
        
        inline def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
        
        inline def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
        
        inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
        
        inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
        
        inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
        
        inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
        
        inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
        
        inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
        
        inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
        
        inline def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
        
        inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
        
        inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
        
        inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
        
        inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
        
        inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
        
        inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
        
        inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
        
        inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
        
        inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
        
        inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
        
        inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
        
        inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
        
        inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
        
        inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
        
        inline def setDownload(value: Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
        
        inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
        
        inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
        
        inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
        
        inline def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
        
        inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
        
        inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
        
        inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
        
        inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
        
        inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
        
        inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
        
        inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
        
        inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
        
        inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
        
        inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
        
        inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
        
        inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
        
        inline def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
        
        inline def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
        
        inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
        
        inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
        
        inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
        
        inline def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
        
        inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
        
        inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
        
        inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
        
        inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
        
        inline def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
        
        inline def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
        
        inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
        
        inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
        
        inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
        
        inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
        
        inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
        
        inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
        
        inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
        
        inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
        
        inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
        
        inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
        
        inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
        
        inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
        
        inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
        
        inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
        
        inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
        
        inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
        
        inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
        
        inline def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
        
        inline def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
        
        inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
        
        inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
        
        inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
        
        inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
        
        inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
        
        inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
        
        inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
        
        inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
        
        inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
        
        inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
        
        inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
        
        inline def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
        
        inline def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
        
        inline def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
        
        inline def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
        
        inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
        
        inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
        
        inline def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
        
        inline def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
        
        inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
        
        inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
        
        inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
        
        inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
        
        inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
        
        inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
        
        inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
        
        inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
        
        inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
        
        inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
        
        inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
        
        inline def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
        
        inline def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
        
        inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        inline def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
        
        inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
        
        inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
        
        inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
        
        inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
        
        inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
        
        inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
        
        inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
        
        inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
        
        inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
        
        inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        
        inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
        
        inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
        
        inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
        
        inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
        
        inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
        
        inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
        
        inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
        
        inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
        
        inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
        
        inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
        
        inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
        
        inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
        
        inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
        
        inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
        
        inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
        
        inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
        
        inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
        
        inline def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
        
        inline def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
        
        inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
        
        inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
        
        inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
        
        inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
        
        inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
        
        inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
        
        inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
        
        inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
        
        inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
        
        inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
        
        inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
        
        inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
        
        inline def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
        
        inline def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
        
        inline def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
        
        inline def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
        
        inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
        
        inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
        
        inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
        
        inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        
        inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
        
        inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
        
        inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
        inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
        
        inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
        
        inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
        
        inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
        
        inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
        
        inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
        
        inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
        
        inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
        
        inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
        
        inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
        
        inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
        
        inline def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
        
        inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
        
        inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        
        inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
        
        inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
        
        inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
        
        inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        inline def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
        
        inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
        
        inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
        
        inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
      }
    }
    
    trait BaseProps extends StObject {
      
      /**
        * An optional additional class name to apply to the rendered button.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * Renders a disabled button.
        */
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The icon to render. Supported values are: Dashicons (specified as
        * strings), functions, WPComponent instances and `null`.
        * @defaultValue null
        */
      var icon: js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['icon'] */ js.Any
          ] = js.undefined
      
      /**
        * The position of the icon within the button.
        * @defaultValue `left`
        */
      var iconPosition: js.UndefOr[left | right] = js.undefined
      
      /**
        * The size (width and height) of the icon.
        * @defaultValue `20` (when using Dashicon), `24` otherwise
        */
      var iconSize: js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['size'] */ js.Any
          ] = js.undefined
      
      /**
        * Indicates activity while a action is being performed.
        */
      var isBusy: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Renders a default button style.
        * @deprecated use `variant="secondary"` instead.
        */
      var isDefault: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Renders a red text-based button style to indicate destructive
        * behavior.
        */
      var isDestructive: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Renders a button with an anchor style.
        * @deprecated use `variant="link"` instead.
        */
      var isLink: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Renders a toggled button style.
        */
      var isPressed: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Renders a primary button style.
        * @deprecated use `variant="primary"` instead.
        */
      var isPrimary: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Renders a default button style.
        * @deprecated use `variant="secondary"` instead.
        */
      var isSecondary: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Decreases the size of the button.
        */
      var isSmall: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Renders a text-based button style.
        * @deprecated use `variant="tertiary"` instead.
        */
      var isTertiary: js.UndefOr[Boolean] = js.undefined
      
      /**
        * @deprecated Use `isPressed` instead.
        */
      var isToggled: js.UndefOr[scala.Nothing] = js.undefined
      
      /**
        * Used as the Tooltip text and `aria-label` if one is not provided.
        */
      var label: js.UndefOr[String] = js.undefined
      
      /**
        * If provided with `showTooltip`, appends the Shortcut label to the
        * tooltip content. If an `Object` is provided, it should contain
        * `display` and `ariaLabel` keys.
        */
      var shortcut: js.UndefOr[ShortcutType] = js.undefined
      
      /**
        * Renders a with the `label` prop when `true`.
        * @defaultValue false
        */
      var showTooltip: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If provided, displays the given text inside the button. If the button
        * contains children elements, the text is displayed before them.
        */
      var text: js.UndefOr[String] = js.undefined
      
      /**
        * The direction in which the tooltip should open relative to its
        * parent node.
        */
      var tooltipPosition: js.UndefOr[Position] = js.undefined
      
      /**
        * Specifies the button's style. The accepted values are 'primary'
        * (the primary button styles), 'secondary' (the default button
        * styles), 'tertiary' (the text-based button styles), and 'link'
        * (the link button styles).
        */
      var variant: js.UndefOr[ButtonVariant] = js.undefined
    }
    object BaseProps {
      
      inline def apply(): BaseProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseProps]
      }
      
      extension [Self <: BaseProps](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setIcon(
          value: /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['icon'] */ js.Any
        ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconPosition(value: left | right): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
        
        inline def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", js.undefined)
        
        inline def setIconSize(
          value: /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/components.@wordpress/components/icon.Icon.Props<any>['size'] */ js.Any
        ): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
        
        inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setIsBusy(value: Boolean): Self = StObject.set(x, "isBusy", value.asInstanceOf[js.Any])
        
        inline def setIsBusyUndefined: Self = StObject.set(x, "isBusy", js.undefined)
        
        inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
        
        inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
        
        inline def setIsDestructive(value: Boolean): Self = StObject.set(x, "isDestructive", value.asInstanceOf[js.Any])
        
        inline def setIsDestructiveUndefined: Self = StObject.set(x, "isDestructive", js.undefined)
        
        inline def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
        
        inline def setIsLinkUndefined: Self = StObject.set(x, "isLink", js.undefined)
        
        inline def setIsPressed(value: Boolean): Self = StObject.set(x, "isPressed", value.asInstanceOf[js.Any])
        
        inline def setIsPressedUndefined: Self = StObject.set(x, "isPressed", js.undefined)
        
        inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
        
        inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
        
        inline def setIsSecondary(value: Boolean): Self = StObject.set(x, "isSecondary", value.asInstanceOf[js.Any])
        
        inline def setIsSecondaryUndefined: Self = StObject.set(x, "isSecondary", js.undefined)
        
        inline def setIsSmall(value: Boolean): Self = StObject.set(x, "isSmall", value.asInstanceOf[js.Any])
        
        inline def setIsSmallUndefined: Self = StObject.set(x, "isSmall", js.undefined)
        
        inline def setIsTertiary(value: Boolean): Self = StObject.set(x, "isTertiary", value.asInstanceOf[js.Any])
        
        inline def setIsTertiaryUndefined: Self = StObject.set(x, "isTertiary", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setShortcut(value: ShortcutType): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
        
        inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
        
        inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
        
        inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        inline def setTooltipPosition(value: Position): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
        
        inline def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
        
        inline def setVariant(value: ButtonVariant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
        
        inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.react.mod.HTMLAttributes because var conflicts: className. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, itemScope, style, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, placeholder, radioGroup, id, lang, color, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, unselectable, role, datatype, itemProp, title, autoCorrect, results
    - typings.react.mod.AllHTMLAttributes because var conflicts: className, disabled, label. Inlined formAction, srcDoc, alt, coords, src, max, marginWidth, keyParams, required, selected, kind, charSet, srcLang, sizes, dateTime, multiple, height, rowSpan, as, method, content, nonce, start, httpEquiv, default, optimum, target, scope, sandbox, seamless, classID, noValidate, autoPlay, min, cols, capture, encType, wmode, wrap, keyType, frameBorder, media, preload, useMap, size, scoped, rel, maxLength, manifest, colSpan, data, formEncType, pattern, form, open, accept, step, defer, shape, value, cite, minLength, cellSpacing, readOnly, challenge, poster, name, formMethod, playsInline, marginHeight, htmlFor, allowTransparency, headers, width, summary, formTarget, rows, href, action, scrolling, low, acceptCharset, reversed, autoFocus, controls, loop, mediaGroup, download, crossOrigin, muted, async, integrity, high, `type`, checked, srcSet, formNoValidate, allowFullScreen, list, cellPadding, autoComplete, hrefLang, span
    - typings.react.mod.HTMLProps because var conflicts: className, disabled, label. Inlined  */ trait ButtonProps
      extends StObject
         with BaseProps
         with Props
         with ClassAttributes[HTMLButtonElement]
         with AriaAttributes
         with DOMAttributes[HTMLButtonElement] {
      
      var default: js.UndefOr[Boolean] = js.undefined
      
      // RDFa Attributes
      var about: js.UndefOr[String] = js.undefined
      
      // Standard HTML Attributes
      var accept: js.UndefOr[String] = js.undefined
      
      var acceptCharset: js.UndefOr[String] = js.undefined
      
      // Standard HTML Attributes
      var accessKey: js.UndefOr[String] = js.undefined
      
      var action: js.UndefOr[String] = js.undefined
      
      var allowFullScreen: js.UndefOr[Boolean] = js.undefined
      
      var allowTransparency: js.UndefOr[Boolean] = js.undefined
      
      var alt: js.UndefOr[String] = js.undefined
      
      var as: js.UndefOr[String] = js.undefined
      
      var async: js.UndefOr[Boolean] = js.undefined
      
      // Non-standard Attributes
      var autoCapitalize: js.UndefOr[String] = js.undefined
      
      var autoComplete: js.UndefOr[String] = js.undefined
      
      var autoCorrect: js.UndefOr[String] = js.undefined
      
      var autoFocus: js.UndefOr[Boolean] = js.undefined
      
      var autoPlay: js.UndefOr[Boolean] = js.undefined
      
      var autoSave: js.UndefOr[String] = js.undefined
      
      var capture: js.UndefOr[Boolean | user | environment] = js.undefined
      
      var cellPadding: js.UndefOr[Double | String] = js.undefined
      
      var cellSpacing: js.UndefOr[Double | String] = js.undefined
      
      var challenge: js.UndefOr[String] = js.undefined
      
      var charSet: js.UndefOr[String] = js.undefined
      
      var checked: js.UndefOr[Boolean] = js.undefined
      
      var cite: js.UndefOr[String] = js.undefined
      
      var classID: js.UndefOr[String] = js.undefined
      
      var colSpan: js.UndefOr[Double] = js.undefined
      
      var color: js.UndefOr[String] = js.undefined
      
      var cols: js.UndefOr[Double] = js.undefined
      
      var content: js.UndefOr[String] = js.undefined
      
      var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
      
      var contextMenu: js.UndefOr[String] = js.undefined
      
      var controls: js.UndefOr[Boolean] = js.undefined
      
      var coords: js.UndefOr[String] = js.undefined
      
      var crossOrigin: js.UndefOr[String] = js.undefined
      
      var data: js.UndefOr[String] = js.undefined
      
      var datatype: js.UndefOr[String] = js.undefined
      
      var dateTime: js.UndefOr[String] = js.undefined
      
      // React-specific Attributes
      var defaultChecked: js.UndefOr[Boolean] = js.undefined
      
      var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
      
      var defer: js.UndefOr[Boolean] = js.undefined
      
      var dir: js.UndefOr[String] = js.undefined
      
      var download: js.UndefOr[Any] = js.undefined
      
      var draggable: js.UndefOr[Booleanish] = js.undefined
      
      var encType: js.UndefOr[String] = js.undefined
      
      var form: js.UndefOr[String] = js.undefined
      
      var formAction: js.UndefOr[String] = js.undefined
      
      var formEncType: js.UndefOr[String] = js.undefined
      
      var formMethod: js.UndefOr[String] = js.undefined
      
      var formNoValidate: js.UndefOr[Boolean] = js.undefined
      
      var formTarget: js.UndefOr[String] = js.undefined
      
      var frameBorder: js.UndefOr[Double | String] = js.undefined
      
      var headers: js.UndefOr[String] = js.undefined
      
      var height: js.UndefOr[Double | String] = js.undefined
      
      var hidden: js.UndefOr[Boolean] = js.undefined
      
      var high: js.UndefOr[Double] = js.undefined
      
      var href: js.UndefOr[String] = js.undefined
      
      var hrefLang: js.UndefOr[String] = js.undefined
      
      var htmlFor: js.UndefOr[String] = js.undefined
      
      var httpEquiv: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var inlist: js.UndefOr[Any] = js.undefined
      
      // Living Standard
      /**
        * Hints at the type of data that might be entered by the user while editing the element or its contents
        * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
        */
      var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
      
      var integrity: js.UndefOr[String] = js.undefined
      
      /**
        * Specify that a standard HTML element should behave like a defined custom built-in element
        * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
        */
      var is: js.UndefOr[String] = js.undefined
      
      var itemID: js.UndefOr[String] = js.undefined
      
      var itemProp: js.UndefOr[String] = js.undefined
      
      var itemRef: js.UndefOr[String] = js.undefined
      
      var itemScope: js.UndefOr[Boolean] = js.undefined
      
      var itemType: js.UndefOr[String] = js.undefined
      
      var keyParams: js.UndefOr[String] = js.undefined
      
      var keyType: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var lang: js.UndefOr[String] = js.undefined
      
      var list: js.UndefOr[String] = js.undefined
      
      var loop: js.UndefOr[Boolean] = js.undefined
      
      var low: js.UndefOr[Double] = js.undefined
      
      var manifest: js.UndefOr[String] = js.undefined
      
      var marginHeight: js.UndefOr[Double] = js.undefined
      
      var marginWidth: js.UndefOr[Double] = js.undefined
      
      var max: js.UndefOr[Double | String] = js.undefined
      
      var maxLength: js.UndefOr[Double] = js.undefined
      
      var media: js.UndefOr[String] = js.undefined
      
      var mediaGroup: js.UndefOr[String] = js.undefined
      
      var method: js.UndefOr[String] = js.undefined
      
      var min: js.UndefOr[Double | String] = js.undefined
      
      var minLength: js.UndefOr[Double] = js.undefined
      
      var multiple: js.UndefOr[Boolean] = js.undefined
      
      var muted: js.UndefOr[Boolean] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var noValidate: js.UndefOr[Boolean] = js.undefined
      
      var nonce: js.UndefOr[String] = js.undefined
      
      var open: js.UndefOr[Boolean] = js.undefined
      
      var optimum: js.UndefOr[Double] = js.undefined
      
      var pattern: js.UndefOr[String] = js.undefined
      
      var placeholder: js.UndefOr[String] = js.undefined
      
      var playsInline: js.UndefOr[Boolean] = js.undefined
      
      var poster: js.UndefOr[String] = js.undefined
      
      var prefix: js.UndefOr[String] = js.undefined
      
      var preload: js.UndefOr[String] = js.undefined
      
      var property: js.UndefOr[String] = js.undefined
      
      // Unknown
      var radioGroup: js.UndefOr[String] = js.undefined
      
      var readOnly: js.UndefOr[Boolean] = js.undefined
      
      var rel: js.UndefOr[String] = js.undefined
      
      var required: js.UndefOr[Boolean] = js.undefined
      
      var resource: js.UndefOr[String] = js.undefined
      
      var results: js.UndefOr[Double] = js.undefined
      
      var reversed: js.UndefOr[Boolean] = js.undefined
      
      // <command>, <menuitem>
      // WAI-ARIA
      var role: js.UndefOr[AriaRole] = js.undefined
      
      var rowSpan: js.UndefOr[Double] = js.undefined
      
      var rows: js.UndefOr[Double] = js.undefined
      
      var sandbox: js.UndefOr[String] = js.undefined
      
      var scope: js.UndefOr[String] = js.undefined
      
      var scoped: js.UndefOr[Boolean] = js.undefined
      
      var scrolling: js.UndefOr[String] = js.undefined
      
      var seamless: js.UndefOr[Boolean] = js.undefined
      
      var security: js.UndefOr[String] = js.undefined
      
      var selected: js.UndefOr[Boolean] = js.undefined
      
      var shape: js.UndefOr[String] = js.undefined
      
      var size: js.UndefOr[Double] = js.undefined
      
      var sizes: js.UndefOr[String] = js.undefined
      
      var slot: js.UndefOr[String] = js.undefined
      
      var span: js.UndefOr[Double] = js.undefined
      
      var spellCheck: js.UndefOr[Booleanish] = js.undefined
      
      var src: js.UndefOr[String] = js.undefined
      
      var srcDoc: js.UndefOr[String] = js.undefined
      
      var srcLang: js.UndefOr[String] = js.undefined
      
      var srcSet: js.UndefOr[String] = js.undefined
      
      var start: js.UndefOr[Double] = js.undefined
      
      var step: js.UndefOr[Double | String] = js.undefined
      
      var style: js.UndefOr[CSSProperties] = js.undefined
      
      var summary: js.UndefOr[String] = js.undefined
      
      var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
      
      var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
      
      var tabIndex: js.UndefOr[Double] = js.undefined
      
      var target: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var translate: js.UndefOr[yes | no] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var typeof: js.UndefOr[String] = js.undefined
      
      var unselectable: js.UndefOr[on | off] = js.undefined
      
      var useMap: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
      
      var vocab: js.UndefOr[String] = js.undefined
      
      var width: js.UndefOr[Double | String] = js.undefined
      
      var wmode: js.UndefOr[String] = js.undefined
      
      var wrap: js.UndefOr[String] = js.undefined
    }
    object ButtonProps {
      
      inline def apply(): ButtonProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ButtonProps]
      }
      
      extension [Self <: ButtonProps](x: Self) {
        
        inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
        
        inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
        
        inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
        
        inline def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
        
        inline def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
        
        inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
        
        inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
        
        inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
        
        inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        inline def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
        
        inline def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
        
        inline def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
        
        inline def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
        
        inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
        
        inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
        
        inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
        
        inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
        
        inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
        
        inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
        
        inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
        
        inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
        
        inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
        
        inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
        
        inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
        
        inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
        
        inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
        
        inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
        
        inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
        
        inline def setCapture(value: Boolean | user | environment): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
        
        inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
        
        inline def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
        
        inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
        
        inline def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
        
        inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
        
        inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
        
        inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
        
        inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
        
        inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
        
        inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
        
        inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
        
        inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
        
        inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
        
        inline def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
        
        inline def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
        
        inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
        
        inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
        
        inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
        
        inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
        
        inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
        
        inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
        
        inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
        
        inline def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
        
        inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
        
        inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
        
        inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
        
        inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
        
        inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
        
        inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
        
        inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
        
        inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
        
        inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
        
        inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
        
        inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
        
        inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
        
        inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
        
        inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
        
        inline def setDownload(value: Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
        
        inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
        
        inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
        
        inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
        
        inline def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
        
        inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
        
        inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
        
        inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
        
        inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
        
        inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
        
        inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
        
        inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
        
        inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
        
        inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
        
        inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
        
        inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
        
        inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
        
        inline def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
        
        inline def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
        
        inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
        
        inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
        
        inline def setHref(value: scala.Nothing | String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
        
        inline def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
        
        inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
        
        inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
        
        inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
        
        inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
        
        inline def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
        
        inline def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
        
        inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
        
        inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
        
        inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
        
        inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
        
        inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
        
        inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
        
        inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
        
        inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
        
        inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
        
        inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
        
        inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
        
        inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
        
        inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
        
        inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
        
        inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
        
        inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
        
        inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
        
        inline def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
        
        inline def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
        
        inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
        
        inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
        
        inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
        
        inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
        
        inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
        
        inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
        
        inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
        
        inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
        
        inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
        
        inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
        
        inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
        
        inline def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
        
        inline def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
        
        inline def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
        
        inline def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
        
        inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
        
        inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
        
        inline def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
        
        inline def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
        
        inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
        
        inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
        
        inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
        
        inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
        
        inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
        
        inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
        
        inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
        
        inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
        
        inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
        
        inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
        
        inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
        
        inline def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
        
        inline def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
        
        inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        inline def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
        
        inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
        
        inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
        
        inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
        
        inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
        
        inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
        
        inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
        
        inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
        
        inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
        
        inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
        
        inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        
        inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
        
        inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
        
        inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
        
        inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
        
        inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
        
        inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
        
        inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
        
        inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
        
        inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
        
        inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
        
        inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
        
        inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
        
        inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
        
        inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
        
        inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
        
        inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
        
        inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
        
        inline def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
        
        inline def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
        
        inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
        
        inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
        
        inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
        
        inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
        
        inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
        
        inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
        
        inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
        
        inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
        
        inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
        
        inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
        
        inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
        
        inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
        
        inline def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
        
        inline def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
        
        inline def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
        
        inline def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
        
        inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
        
        inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
        
        inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
        
        inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        
        inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
        
        inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
        
        inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
        inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
        
        inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
        
        inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
        
        inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
        
        inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
        
        inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
        
        inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
        
        inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
        
        inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
        
        inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
        
        inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
        
        inline def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
        
        inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
        
        inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        
        inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
        
        inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
        
        inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
        
        inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        inline def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
        
        inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
        
        inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
        
        inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressComponents.wordpressComponentsStrings.primary
      - typings.wordpressComponents.wordpressComponentsStrings.secondary
      - typings.wordpressComponents.wordpressComponentsStrings.tertiary
      - typings.wordpressComponents.wordpressComponentsStrings.link
    */
    trait ButtonVariant extends StObject
    object ButtonVariant {
      
      inline def link: typings.wordpressComponents.wordpressComponentsStrings.link = "link".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.link]
      
      inline def primary: typings.wordpressComponents.wordpressComponentsStrings.primary = "primary".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.primary]
      
      inline def secondary: typings.wordpressComponents.wordpressComponentsStrings.secondary = "secondary".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.secondary]
      
      inline def tertiary: typings.wordpressComponents.wordpressComponentsStrings.tertiary = "tertiary".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.tertiary]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressComponents.buttonMod.Button.AnchorProps
      - typings.wordpressComponents.buttonMod.Button.ButtonProps
    */
    trait Props extends StObject
    object Props {
      
      inline def AnchorProps(): typings.wordpressComponents.buttonMod.Button.AnchorProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.wordpressComponents.buttonMod.Button.AnchorProps]
      }
      
      inline def ButtonProps(): typings.wordpressComponents.buttonMod.Button.ButtonProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.wordpressComponents.buttonMod.Button.ButtonProps]
      }
    }
  }
}
