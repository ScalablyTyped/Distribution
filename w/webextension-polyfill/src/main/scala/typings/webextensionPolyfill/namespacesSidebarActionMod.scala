package typings.webextensionPolyfill

import org.scalablytyped.runtime.StringDictionary
import typings.std.ImageData
import typings.std.PredefinedColorSpace
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesSidebarActionMod {
  
  object SidebarAction {
    
    trait GetPanelDetailsType extends StObject {
      
      /**
        * Specify the tab to get the panel from. If no tab nor window is specified, the global panel is returned.
        * Optional.
        */
      var tabId: js.UndefOr[Double] = js.undefined
      
      /**
        * Specify the window to get the panel from. If no tab nor window is specified, the global panel is returned.
        * Optional.
        */
      var windowId: js.UndefOr[Double] = js.undefined
    }
    object GetPanelDetailsType {
      
      inline def apply(): GetPanelDetailsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetPanelDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GetPanelDetailsType] (val x: Self) extends AnyVal {
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
        
        inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
        
        inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
        
        inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
      }
    }
    
    trait GetTitleDetailsType extends StObject {
      
      /**
        * Specify the tab to get the title from. If no tab nor window is specified, the global title is returned.
        * Optional.
        */
      var tabId: js.UndefOr[Double] = js.undefined
      
      /**
        * Specify the window to get the title from. If no tab nor window is specified, the global title is returned.
        * Optional.
        */
      var windowId: js.UndefOr[Double] = js.undefined
    }
    object GetTitleDetailsType {
      
      inline def apply(): GetTitleDetailsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetTitleDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GetTitleDetailsType] (val x: Self) extends AnyVal {
        
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
    
    trait IsOpenDetailsType extends StObject {
      
      /**
        * Specify the window to get the openness from.
        * Optional.
        */
      var windowId: js.UndefOr[Double] = js.undefined
    }
    object IsOpenDetailsType {
      
      inline def apply(): IsOpenDetailsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IsOpenDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IsOpenDetailsType] (val x: Self) extends AnyVal {
        
        inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
        
        inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
      }
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
      var path: js.UndefOr[String | SetIconDetailsTypePathC2Type] = js.undefined
      
      /**
        * Sets the sidebar icon for the tab specified by tabId. Automatically resets when the tab is closed.
        * Optional.
        */
      var tabId: js.UndefOr[Double] = js.undefined
      
      /**
        * Sets the sidebar icon for the window specified by windowId.
        * Optional.
        */
      var windowId: js.UndefOr[Double] = js.undefined
    }
    object SetIconDetailsType {
      
      inline def apply(): SetIconDetailsType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SetIconDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SetIconDetailsType] (val x: Self) extends AnyVal {
        
        inline def setImageData(value: ImageDataType | (Record[String, ImageDataType])): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
        
        inline def setImageDataUndefined: Self = StObject.set(x, "imageData", js.undefined)
        
        inline def setPath(value: String | SetIconDetailsTypePathC2Type): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
        
        inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
        
        inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
        
        inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
      }
    }
    
    type SetIconDetailsTypePathC2Type = StringDictionary[Any]
    
    trait SetPanelDetailsType extends StObject {
      
      /**
        * The url to the html file to show in a sidebar.  If set to the empty string (''), no sidebar is shown.
        */
      var panel: String | Null
      
      /**
        * Sets the sidebar url for the tab specified by tabId. Automatically resets when the tab is closed.
        * Optional.
        */
      var tabId: js.UndefOr[Double] = js.undefined
      
      /**
        * Sets the sidebar url for the window specified by windowId.
        * Optional.
        */
      var windowId: js.UndefOr[Double] = js.undefined
    }
    object SetPanelDetailsType {
      
      inline def apply(): SetPanelDetailsType = {
        val __obj = js.Dynamic.literal(panel = null)
        __obj.asInstanceOf[SetPanelDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SetPanelDetailsType] (val x: Self) extends AnyVal {
        
        inline def setPanel(value: String): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
        
        inline def setPanelNull: Self = StObject.set(x, "panel", null)
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
        
        inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
        
        inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
        
        inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
      }
    }
    
    trait SetTitleDetailsType extends StObject {
      
      /**
        * Sets the sidebar title for the tab specified by tabId. Automatically resets when the tab is closed.
        * Optional.
        */
      var tabId: js.UndefOr[Double] = js.undefined
      
      /**
        * The string the sidebar action should display when moused over.
        */
      var title: String | Null
      
      /**
        * Sets the sidebar title for the window specified by windowId.
        * Optional.
        */
      var windowId: js.UndefOr[Double] = js.undefined
    }
    object SetTitleDetailsType {
      
      inline def apply(): SetTitleDetailsType = {
        val __obj = js.Dynamic.literal(title = null)
        __obj.asInstanceOf[SetTitleDetailsType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SetTitleDetailsType] (val x: Self) extends AnyVal {
        
        inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
        
        inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleNull: Self = StObject.set(x, "title", null)
        
        inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
        
        inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
      }
    }
    
    trait Static extends StObject {
      
      /**
        * Closes the extension sidebar in the active window if the sidebar belongs to the extension.
        */
      def close(): js.Promise[Unit]
      
      /**
        * Gets the url to the html document set as the panel for this sidebar action.
        *
        * @param details
        */
      def getPanel(details: GetPanelDetailsType): js.Promise[String]
      
      /**
        * Gets the title of the sidebar action.
        *
        * @param details
        */
      def getTitle(details: GetTitleDetailsType): js.Promise[String]
      
      /**
        * Checks whether the sidebar action is open.
        *
        * @param details
        */
      def isOpen(details: IsOpenDetailsType): js.Promise[Boolean]
      
      /**
        * Opens the extension sidebar in the active window.
        */
      def open(): js.Promise[Unit]
      
      /**
        * Sets the icon for the sidebar action. The icon can be specified either as the path to an image file or as the pixel data
        * from a canvas element, or as dictionary of either one of those. Either the <strong>path</strong> or the <strong>
        * imageData</strong> property must be specified.
        *
        * @param details
        */
      def setIcon(details: SetIconDetailsType): js.Promise[Unit]
      
      /**
        * Sets the url to the html document to be opened in the sidebar when the user clicks on the sidebar action's icon.
        *
        * @param details
        */
      def setPanel(details: SetPanelDetailsType): js.Promise[Unit]
      
      /**
        * Sets the title of the sidebar action. This shows up in the tooltip.
        *
        * @param details
        */
      def setTitle(details: SetTitleDetailsType): js.Promise[Unit]
      
      /**
        * Toggles the extension sidebar in the active window.
        */
      def toggle(): Unit
    }
    object Static {
      
      inline def apply(
        close: () => js.Promise[Unit],
        getPanel: GetPanelDetailsType => js.Promise[String],
        getTitle: GetTitleDetailsType => js.Promise[String],
        isOpen: IsOpenDetailsType => js.Promise[Boolean],
        open: () => js.Promise[Unit],
        setIcon: SetIconDetailsType => js.Promise[Unit],
        setPanel: SetPanelDetailsType => js.Promise[Unit],
        setTitle: SetTitleDetailsType => js.Promise[Unit],
        toggle: () => Unit
      ): Static = {
        val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getPanel = js.Any.fromFunction1(getPanel), getTitle = js.Any.fromFunction1(getTitle), isOpen = js.Any.fromFunction1(isOpen), open = js.Any.fromFunction0(open), setIcon = js.Any.fromFunction1(setIcon), setPanel = js.Any.fromFunction1(setPanel), setTitle = js.Any.fromFunction1(setTitle), toggle = js.Any.fromFunction0(toggle))
        __obj.asInstanceOf[Static]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
        
        inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
        
        inline def setGetPanel(value: GetPanelDetailsType => js.Promise[String]): Self = StObject.set(x, "getPanel", js.Any.fromFunction1(value))
        
        inline def setGetTitle(value: GetTitleDetailsType => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction1(value))
        
        inline def setIsOpen(value: IsOpenDetailsType => js.Promise[Boolean]): Self = StObject.set(x, "isOpen", js.Any.fromFunction1(value))
        
        inline def setOpen(value: () => js.Promise[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
        
        inline def setSetIcon(value: SetIconDetailsType => js.Promise[Unit]): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
        
        inline def setSetPanel(value: SetPanelDetailsType => js.Promise[Unit]): Self = StObject.set(x, "setPanel", js.Any.fromFunction1(value))
        
        inline def setSetTitle(value: SetTitleDetailsType => js.Promise[Unit]): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
        
        inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      }
    }
  }
}
