package typings.wixStyleReact

import typings.wixStyleReact.commonMod.StatusIndications
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageViewerDriverMod {
  
  trait ImageViewerDriver[T]
    extends StObject
       with BaseDriver {
    
    def clickAdd(): Unit
    
    def clickRemove(): Unit
    
    def clickUpdate(): Unit
    
    def element(): T
    
    def getAddTooltipContent(): String
    
    def getContainerStyles(): String | Null
    
    def getElement(): T
    
    def getImageUrl(): String | Null
    
    def getPreviousImageUrl(): String | Null
    
    def getRemoveTooltipContent(): String
    
    def getStatusMessage(): String | Null
    
    def getUpdateTooltipContent(): String
    
    // Status
    def hasStatus(status: StatusIndications): Boolean
    
    def hover(): Unit
    
    def isAddItemVisible(): Boolean
    
    def isDisabled(): Boolean
    
    def isImageLoaded(): Boolean
    
    def isImageVisible(): Boolean
    
    def isLoaderVisible(): Boolean
    
    def isPreviousImageVisible(): Boolean
    
    def removeButtonExists(): Boolean
    
    def updateButtonExists(): Boolean
    
    def updateExists(): Boolean
  }
  object ImageViewerDriver {
    
    inline def apply[T](
      clickAdd: () => Unit,
      clickRemove: () => Unit,
      clickUpdate: () => Unit,
      element: () => T,
      exists: () => Boolean,
      getAddTooltipContent: () => String,
      getContainerStyles: () => String | Null,
      getElement: () => T,
      getImageUrl: () => String | Null,
      getPreviousImageUrl: () => String | Null,
      getRemoveTooltipContent: () => String,
      getStatusMessage: () => String | Null,
      getUpdateTooltipContent: () => String,
      hasStatus: StatusIndications => Boolean,
      hover: () => Unit,
      isAddItemVisible: () => Boolean,
      isDisabled: () => Boolean,
      isImageLoaded: () => Boolean,
      isImageVisible: () => Boolean,
      isLoaderVisible: () => Boolean,
      isPreviousImageVisible: () => Boolean,
      removeButtonExists: () => Boolean,
      updateButtonExists: () => Boolean,
      updateExists: () => Boolean
    ): ImageViewerDriver[T] = {
      val __obj = js.Dynamic.literal(clickAdd = js.Any.fromFunction0(clickAdd), clickRemove = js.Any.fromFunction0(clickRemove), clickUpdate = js.Any.fromFunction0(clickUpdate), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAddTooltipContent = js.Any.fromFunction0(getAddTooltipContent), getContainerStyles = js.Any.fromFunction0(getContainerStyles), getElement = js.Any.fromFunction0(getElement), getImageUrl = js.Any.fromFunction0(getImageUrl), getPreviousImageUrl = js.Any.fromFunction0(getPreviousImageUrl), getRemoveTooltipContent = js.Any.fromFunction0(getRemoveTooltipContent), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getUpdateTooltipContent = js.Any.fromFunction0(getUpdateTooltipContent), hasStatus = js.Any.fromFunction1(hasStatus), hover = js.Any.fromFunction0(hover), isAddItemVisible = js.Any.fromFunction0(isAddItemVisible), isDisabled = js.Any.fromFunction0(isDisabled), isImageLoaded = js.Any.fromFunction0(isImageLoaded), isImageVisible = js.Any.fromFunction0(isImageVisible), isLoaderVisible = js.Any.fromFunction0(isLoaderVisible), isPreviousImageVisible = js.Any.fromFunction0(isPreviousImageVisible), removeButtonExists = js.Any.fromFunction0(removeButtonExists), updateButtonExists = js.Any.fromFunction0(updateButtonExists), updateExists = js.Any.fromFunction0(updateExists))
      __obj.asInstanceOf[ImageViewerDriver[T]]
    }
    
    extension [Self <: ImageViewerDriver[?], T](x: Self & ImageViewerDriver[T]) {
      
      inline def setClickAdd(value: () => Unit): Self = StObject.set(x, "clickAdd", js.Any.fromFunction0(value))
      
      inline def setClickRemove(value: () => Unit): Self = StObject.set(x, "clickRemove", js.Any.fromFunction0(value))
      
      inline def setClickUpdate(value: () => Unit): Self = StObject.set(x, "clickUpdate", js.Any.fromFunction0(value))
      
      inline def setElement(value: () => T): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setGetAddTooltipContent(value: () => String): Self = StObject.set(x, "getAddTooltipContent", js.Any.fromFunction0(value))
      
      inline def setGetContainerStyles(value: () => String | Null): Self = StObject.set(x, "getContainerStyles", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => T): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setGetImageUrl(value: () => String | Null): Self = StObject.set(x, "getImageUrl", js.Any.fromFunction0(value))
      
      inline def setGetPreviousImageUrl(value: () => String | Null): Self = StObject.set(x, "getPreviousImageUrl", js.Any.fromFunction0(value))
      
      inline def setGetRemoveTooltipContent(value: () => String): Self = StObject.set(x, "getRemoveTooltipContent", js.Any.fromFunction0(value))
      
      inline def setGetStatusMessage(value: () => String | Null): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      inline def setGetUpdateTooltipContent(value: () => String): Self = StObject.set(x, "getUpdateTooltipContent", js.Any.fromFunction0(value))
      
      inline def setHasStatus(value: StatusIndications => Boolean): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setHover(value: () => Unit): Self = StObject.set(x, "hover", js.Any.fromFunction0(value))
      
      inline def setIsAddItemVisible(value: () => Boolean): Self = StObject.set(x, "isAddItemVisible", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsImageLoaded(value: () => Boolean): Self = StObject.set(x, "isImageLoaded", js.Any.fromFunction0(value))
      
      inline def setIsImageVisible(value: () => Boolean): Self = StObject.set(x, "isImageVisible", js.Any.fromFunction0(value))
      
      inline def setIsLoaderVisible(value: () => Boolean): Self = StObject.set(x, "isLoaderVisible", js.Any.fromFunction0(value))
      
      inline def setIsPreviousImageVisible(value: () => Boolean): Self = StObject.set(x, "isPreviousImageVisible", js.Any.fromFunction0(value))
      
      inline def setRemoveButtonExists(value: () => Boolean): Self = StObject.set(x, "removeButtonExists", js.Any.fromFunction0(value))
      
      inline def setUpdateButtonExists(value: () => Boolean): Self = StObject.set(x, "updateButtonExists", js.Any.fromFunction0(value))
      
      inline def setUpdateExists(value: () => Boolean): Self = StObject.set(x, "updateExists", js.Any.fromFunction0(value))
    }
  }
}
