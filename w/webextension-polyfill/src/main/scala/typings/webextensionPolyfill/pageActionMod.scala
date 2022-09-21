package typings.webextensionPolyfill

import org.scalablytyped.runtime.StringDictionary
import typings.std.ImageData
import typings.std.PredefinedColorSpace
import typings.std.Record
import typings.webextensionPolyfill.eventsMod.Events.Event
import typings.webextensionPolyfill.tabsMod.Tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageActionMod {
  
  object PageAction {
    
    trait GetPopupDetailsType extends StObject {
      
      /**
        * Specify the tab to get the popup from.
        */
      var tabId: Double
    }
    object GetPopupDetailsType {
      
      inline def apply(tabId: Double): GetPopupDetailsType = {
        val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
        __obj.asInstanceOf[GetPopupDetailsType]
      }
      
      extension [Self <: GetPopupDetailsType](x: Self) {
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      }
    }
    
    trait GetTitleDetailsType extends StObject {
      
      /**
        * Specify the tab to get the title from.
        */
      var tabId: Double
    }
    object GetTitleDetailsType {
      
      inline def apply(tabId: Double): GetTitleDetailsType = {
        val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
        __obj.asInstanceOf[GetTitleDetailsType]
      }
      
      extension [Self <: GetTitleDetailsType](x: Self) {
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Pixel data for an image. Must be an ImageData object (for example, from a <code>canvas</code> element).
      */
    trait ImageDataType
      extends StObject
         with ImageData
         with /* s */ StringDictionary[Any]
    object ImageDataType {
      
      inline def apply(
        colorSpace: PredefinedColorSpace,
        data: js.typedarray.Uint8ClampedArray,
        height: Double,
        width: Double
      ): ImageDataType = {
        val __obj = js.Dynamic.literal(colorSpace = colorSpace.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[ImageDataType]
      }
    }
    
    trait IsShownDetailsType extends StObject {
      
      /**
        * Specify the tab to get the shownness from.
        */
      var tabId: Double
    }
    object IsShownDetailsType {
      
      inline def apply(tabId: Double): IsShownDetailsType = {
        val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
        __obj.asInstanceOf[IsShownDetailsType]
      }
      
      extension [Self <: IsShownDetailsType](x: Self) {
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Information sent when a page action is clicked.
      */
    trait OnClickData extends StObject {
      
      /**
        * An integer value of button by which menu item was clicked.
        * Optional.
        */
      var button: js.UndefOr[Double] = js.undefined
      
      /**
        * An array of keyboard modifiers that were held while the menu item was clicked.
        */
      var modifiers: js.Array[OnClickDataModifiersItemEnum]
    }
    object OnClickData {
      
      inline def apply(modifiers: js.Array[OnClickDataModifiersItemEnum]): OnClickData = {
        val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnClickData]
      }
      
      extension [Self <: OnClickData](x: Self) {
        
        inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
        
        inline def setModifiers(value: js.Array[OnClickDataModifiersItemEnum]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
        
        inline def setModifiersVarargs(value: OnClickDataModifiersItemEnum*): Self = StObject.set(x, "modifiers", js.Array(value*))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.Shift
      - typings.webextensionPolyfill.webextensionPolyfillStrings.Alt
      - typings.webextensionPolyfill.webextensionPolyfillStrings.Command
      - typings.webextensionPolyfill.webextensionPolyfillStrings.Ctrl
      - typings.webextensionPolyfill.webextensionPolyfillStrings.MacCtrl
    */
    trait OnClickDataModifiersItemEnum extends StObject
    object OnClickDataModifiersItemEnum {
      
      inline def Alt: typings.webextensionPolyfill.webextensionPolyfillStrings.Alt = "Alt".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.Alt]
      
      inline def Command: typings.webextensionPolyfill.webextensionPolyfillStrings.Command = "Command".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.Command]
      
      inline def Ctrl: typings.webextensionPolyfill.webextensionPolyfillStrings.Ctrl = "Ctrl".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.Ctrl]
      
      inline def MacCtrl: typings.webextensionPolyfill.webextensionPolyfillStrings.MacCtrl = "MacCtrl".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.MacCtrl]
      
      inline def Shift: typings.webextensionPolyfill.webextensionPolyfillStrings.Shift = "Shift".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.Shift]
    }
    
    trait SetIconDetailsType extends StObject {
      
      /**
        * Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set.
        * If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density.
        * If the number of image pixels that fit into one screen space unit equals <code>scale</code>, then image with size <code>
        * scale</code> * 19 will be selected. Initially only scales 1 and 2 will be supported.
        * At least one image must be specified. Note that 'details.imageData = foo' is equivalent to 'details.
        * imageData = {'19': foo}'
        * Optional.
        */
      var imageData: js.UndefOr[ImageDataType | (Record[String, ImageDataType])] = js.undefined
      
      /**
        * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set.
        * If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density.
        * If the number of image pixels that fit into one screen space unit equals <code>scale</code>, then image with size <code>
        * scale</code> * 19 will be selected. Initially only scales 1 and 2 will be supported.
        * At least one image must be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'
        * Optional.
        */
      var path: js.UndefOr[String | (Record[String, String])] = js.undefined
      
      /**
        * The id of the tab for which you want to modify the page action.
        */
      var tabId: Double
    }
    object SetIconDetailsType {
      
      inline def apply(tabId: Double): SetIconDetailsType = {
        val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
        __obj.asInstanceOf[SetIconDetailsType]
      }
      
      extension [Self <: SetIconDetailsType](x: Self) {
        
        inline def setImageData(value: ImageDataType | (Record[String, ImageDataType])): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
        
        inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
        
        inline def setPath(value: String | (Record[String, String])): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      }
    }
    
    trait SetPopupDetailsType extends StObject {
      
      /**
        * The html file to show in a popup.  If set to the empty string (''), no popup is shown.
        */
      var popup: String | Null
      
      /**
        * The id of the tab for which you want to modify the page action.
        */
      var tabId: Double
    }
    object SetPopupDetailsType {
      
      inline def apply(tabId: Double): SetPopupDetailsType = {
        val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], popup = null)
        __obj.asInstanceOf[SetPopupDetailsType]
      }
      
      extension [Self <: SetPopupDetailsType](x: Self) {
        
        inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
        
        inline def setPopupNull: Self = StObject.set(x, "popup", null)
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      }
    }
    
    trait SetTitleDetailsType extends StObject {
      
      /**
        * The id of the tab for which you want to modify the page action.
        */
      var tabId: Double
      
      /**
        * The tooltip string.
        */
      var title: String | Null
    }
    object SetTitleDetailsType {
      
      inline def apply(tabId: Double): SetTitleDetailsType = {
        val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], title = null)
        __obj.asInstanceOf[SetTitleDetailsType]
      }
      
      extension [Self <: SetTitleDetailsType](x: Self) {
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
      }
    }
    
    trait Static extends StObject {
      
      /**
        * Gets the html document set as the popup for this page action.
        *
        * @param details
        */
      def getPopup(details: GetPopupDetailsType): js.Promise[String]
      
      /**
        * Gets the title of the page action.
        *
        * @param details
        */
      def getTitle(details: GetTitleDetailsType): js.Promise[String]
      
      /**
        * Hides the page action.
        *
        * @param tabId The id of the tab for which you want to modify the page action.
        */
      def hide(tabId: Double): js.Promise[Unit]
      
      /**
        * Checks whether the page action is shown.
        *
        * @param details
        */
      def isShown(details: IsShownDetailsType): js.Promise[Boolean]
      
      /**
        * Fired when a page action icon is clicked.  This event will not fire if the page action has a popup.
        *
        * @param tab
        * @param info Optional.
        */
      var onClicked: Event[js.Function2[/* tab */ Tab, /* info */ js.UndefOr[OnClickData], Unit]]
      
      /**
        * Opens the extension page action in the active window.
        */
      def openPopup(): js.Promise[Unit]
      
      /**
        * Sets the icon for the page action. The icon can be specified either as the path to an image file or as the pixel data
        * from a canvas element, or as dictionary of either one of those. Either the <b>path</b> or the <b>imageData</b>
        * property must be specified.
        *
        * @param details
        */
      def setIcon(details: SetIconDetailsType): js.Promise[Unit]
      
      /**
        * Sets the html document to be opened as a popup when the user clicks on the page action's icon.
        *
        * @param details
        */
      def setPopup(details: SetPopupDetailsType): js.Promise[Unit]
      
      /**
        * Sets the title of the page action. This is displayed in a tooltip over the page action.
        *
        * @param details
        */
      def setTitle(details: SetTitleDetailsType): Unit
      
      /**
        * Shows the page action. The page action is shown whenever the tab is selected.
        *
        * @param tabId The id of the tab for which you want to modify the page action.
        */
      def show(tabId: Double): js.Promise[Unit]
    }
    object Static {
      
      inline def apply(
        getPopup: GetPopupDetailsType => js.Promise[String],
        getTitle: GetTitleDetailsType => js.Promise[String],
        hide: Double => js.Promise[Unit],
        isShown: IsShownDetailsType => js.Promise[Boolean],
        onClicked: Event[js.Function2[/* tab */ Tab, /* info */ js.UndefOr[OnClickData], Unit]],
        openPopup: () => js.Promise[Unit],
        setIcon: SetIconDetailsType => js.Promise[Unit],
        setPopup: SetPopupDetailsType => js.Promise[Unit],
        setTitle: SetTitleDetailsType => Unit,
        show: Double => js.Promise[Unit]
      ): Static = {
        val __obj = js.Dynamic.literal(getPopup = js.Any.fromFunction1(getPopup), getTitle = js.Any.fromFunction1(getTitle), hide = js.Any.fromFunction1(hide), isShown = js.Any.fromFunction1(isShown), onClicked = onClicked.asInstanceOf[js.Any], openPopup = js.Any.fromFunction0(openPopup), setIcon = js.Any.fromFunction1(setIcon), setPopup = js.Any.fromFunction1(setPopup), setTitle = js.Any.fromFunction1(setTitle), show = js.Any.fromFunction1(show))
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setGetPopup(value: GetPopupDetailsType => js.Promise[String]): Self = StObject.set(x, "getPopup", js.Any.fromFunction1(value))
        
        inline def setGetTitle(value: GetTitleDetailsType => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction1(value))
        
        inline def setHide(value: Double => js.Promise[Unit]): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
        
        inline def setIsShown(value: IsShownDetailsType => js.Promise[Boolean]): Self = StObject.set(x, "isShown", js.Any.fromFunction1(value))
        
        inline def setOnClicked(value: Event[js.Function2[/* tab */ Tab, /* info */ js.UndefOr[OnClickData], Unit]]): Self = StObject.set(x, "onClicked", value.asInstanceOf[js.Any])
        
        inline def setOpenPopup(value: () => js.Promise[Unit]): Self = StObject.set(x, "openPopup", js.Any.fromFunction0(value))
        
        inline def setSetIcon(value: SetIconDetailsType => js.Promise[Unit]): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
        
        inline def setSetPopup(value: SetPopupDetailsType => js.Promise[Unit]): Self = StObject.set(x, "setPopup", js.Any.fromFunction1(value))
        
        inline def setSetTitle(value: SetTitleDetailsType => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
        
        inline def setShow(value: Double => js.Promise[Unit]): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      }
    }
  }
}
