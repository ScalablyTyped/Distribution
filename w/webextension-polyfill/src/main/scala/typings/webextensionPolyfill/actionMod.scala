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

object actionMod {
  
  object Action {
    
    type ColorArray = js.Tuple4[Double, Double, Double, Double]
    
    /**
      * An array of four integers in the range [0,255] that make up the RGBA color of the badge. For example,
      * opaque red is <code>[255, 0, 0, 255]</code>. Can also be a string with a CSS value, with opaque red being <code>
      * #FF0000</code> or <code>#F00</code>.
      */
    type ColorValue = String | ColorArray | Null
    
    /**
      * Specifies to which tab or window the value should be set, or from which one it should be retrieved.
      * If no tab nor window is specified, the global value is set or retrieved.
      */
    trait Details extends StObject {
      
      /**
        * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab navigates.
        * When getting, specifies the tab to get the value from; if there is no tab-specific value,
        * the window one will be inherited.
        * Optional.
        */
      var tabId: js.UndefOr[Double] = js.undefined
      
      /**
        * When setting a value, it will be specific to the specified window. When getting, specifies the window to get the value
        * from; if there is no window-specific value, the global one will be inherited.
        * Optional.
        */
      var windowId: js.UndefOr[Double] = js.undefined
    }
    object Details {
      
      inline def apply(): Details = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Details]
      }
      
      extension [Self <: Details](x: Self) {
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
        
        inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
        
        inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
        
        inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
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
    
    /**
      * Information sent when a browser action is clicked.
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
    
    trait SetBadgeBackgroundColorDetailsType
      extends StObject
         with Details {
      
      var color: ColorValue
    }
    object SetBadgeBackgroundColorDetailsType {
      
      inline def apply(): SetBadgeBackgroundColorDetailsType = {
        val __obj = js.Dynamic.literal(color = null)
        __obj.asInstanceOf[SetBadgeBackgroundColorDetailsType]
      }
      
      extension [Self <: SetBadgeBackgroundColorDetailsType](x: Self) {
        
        inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorNull: Self = StObject.set(x, "color", null)
      }
    }
    
    trait SetBadgeTextColorDetailsType
      extends StObject
         with Details {
      
      var color: ColorValue
    }
    object SetBadgeTextColorDetailsType {
      
      inline def apply(): SetBadgeTextColorDetailsType = {
        val __obj = js.Dynamic.literal(color = null)
        __obj.asInstanceOf[SetBadgeTextColorDetailsType]
      }
      
      extension [Self <: SetBadgeTextColorDetailsType](x: Self) {
        
        inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setColorNull: Self = StObject.set(x, "color", null)
      }
    }
    
    trait SetBadgeTextDetailsType
      extends StObject
         with Details {
      
      /**
        * Any number of characters can be passed, but only about four can fit in the space.
        */
      var text: String | Null
    }
    object SetBadgeTextDetailsType {
      
      inline def apply(): SetBadgeTextDetailsType = {
        val __obj = js.Dynamic.literal(text = null)
        __obj.asInstanceOf[SetBadgeTextDetailsType]
      }
      
      extension [Self <: SetBadgeTextDetailsType](x: Self) {
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextNull: Self = StObject.set(x, "text", null)
      }
    }
    
    trait SetIconDetailsType
      extends StObject
         with Details {
      
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
    }
    object SetIconDetailsType {
      
      inline def apply(): SetIconDetailsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SetIconDetailsType]
      }
      
      extension [Self <: SetIconDetailsType](x: Self) {
        
        inline def setImageData(value: ImageDataType | (Record[String, ImageDataType])): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
        
        inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
        
        inline def setPath(value: String | (Record[String, String])): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      }
    }
    
    trait SetPopupDetailsType
      extends StObject
         with Details {
      
      /**
        * The html file to show in a popup.  If set to the empty string (''), no popup is shown.
        */
      var popup: String | Null
    }
    object SetPopupDetailsType {
      
      inline def apply(): SetPopupDetailsType = {
        val __obj = js.Dynamic.literal(popup = null)
        __obj.asInstanceOf[SetPopupDetailsType]
      }
      
      extension [Self <: SetPopupDetailsType](x: Self) {
        
        inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
        
        inline def setPopupNull: Self = StObject.set(x, "popup", null)
      }
    }
    
    trait SetTitleDetailsType
      extends StObject
         with Details {
      
      /**
        * The string the browser action should display when moused over.
        */
      var title: String | Null
    }
    object SetTitleDetailsType {
      
      inline def apply(): SetTitleDetailsType = {
        val __obj = js.Dynamic.literal(title = null)
        __obj.asInstanceOf[SetTitleDetailsType]
      }
      
      extension [Self <: SetTitleDetailsType](x: Self) {
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
      }
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Disables the browser action for a tab.
        *
        * @param tabId Optional. The id of the tab for which you want to modify the browser action.
        */
      def disable(): js.Promise[Unit] = js.native
      def disable(tabId: Double): js.Promise[Unit] = js.native
      
      /**
        * Enables the browser action for a tab. By default, browser actions are enabled.
        *
        * @param tabId Optional. The id of the tab for which you want to modify the browser action.
        */
      def enable(): js.Promise[Unit] = js.native
      def enable(tabId: Double): js.Promise[Unit] = js.native
      
      /**
        * Gets the background color of the browser action badge.
        *
        * @param details
        */
      def getBadgeBackgroundColor(details: Details): js.Promise[ColorArray] = js.native
      
      /**
        * Gets the badge text of the browser action. If no tab nor window is specified is specified,
        * the global badge text is returned.
        *
        * @param details
        */
      def getBadgeText(details: Details): js.Promise[String] = js.native
      
      /**
        * Gets the text color of the browser action badge.
        *
        * @param details
        */
      def getBadgeTextColor(details: Details): Unit = js.native
      
      /**
        * Gets the html document set as the popup for this browser action.
        *
        * @param details
        */
      def getPopup(details: Details): js.Promise[String] = js.native
      
      /**
        * Gets the title of the browser action.
        *
        * @param details
        */
      def getTitle(details: Details): js.Promise[String] = js.native
      
      /**
        * Checks whether the browser action is enabled.
        *
        * @param details
        */
      def isEnabled(details: Details): js.Promise[Boolean] = js.native
      
      /**
        * Fired when a browser action icon is clicked.  This event will not fire if the browser action has a popup.
        *
        * @param tab
        * @param info Optional.
        */
      var onClicked: Event[js.Function2[/* tab */ Tab, /* info */ js.UndefOr[OnClickData], Unit]] = js.native
      
      /**
        * Opens the extension popup window in the active window.
        */
      def openPopup(): js.Promise[Unit] = js.native
      
      /**
        * Sets the background color for the badge.
        *
        * @param details
        */
      def setBadgeBackgroundColor(details: SetBadgeBackgroundColorDetailsType): js.Promise[Unit] = js.native
      
      /**
        * Sets the badge text for the browser action. The badge is displayed on top of the icon.
        *
        * @param details
        */
      def setBadgeText(details: SetBadgeTextDetailsType): js.Promise[Unit] = js.native
      
      /**
        * Sets the text color for the badge.
        *
        * @param details
        */
      def setBadgeTextColor(details: SetBadgeTextColorDetailsType): Unit = js.native
      
      /**
        * Sets the icon for the browser action. The icon can be specified either as the path to an image file or as the pixel data
        * from a canvas element, or as dictionary of either one of those. Either the <b>path</b> or the <b>imageData</b>
        * property must be specified.
        *
        * @param details
        */
      def setIcon(details: SetIconDetailsType): js.Promise[Unit] = js.native
      
      /**
        * Sets the html document to be opened as a popup when the user clicks on the browser action's icon.
        *
        * @param details
        */
      def setPopup(details: SetPopupDetailsType): js.Promise[Unit] = js.native
      
      /**
        * Sets the title of the browser action. This shows up in the tooltip.
        *
        * @param details
        */
      def setTitle(details: SetTitleDetailsType): js.Promise[Unit] = js.native
    }
  }
}
