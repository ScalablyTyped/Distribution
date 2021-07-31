package typings.wixStyleReact

import typings.wixStyleReact.commonMod.StatusIndications
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageViewerUniDriverMod {
  
  trait ImageViewerUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickAdd(): js.Promise[Unit]
    
    def clickRemove(): js.Promise[Unit]
    
    def clickUpdate(): js.Promise[Unit]
    
    def getAddTooltipContent(): js.Promise[String]
    
    def getContainerStyles(): js.Promise[String | Null]
    
    def getImageUrl(): js.Promise[String | Null]
    
    def getPreviousImageUrl(): js.Promise[String | Null]
    
    def getRemoveTooltipContent(): js.Promise[String]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    def getUpdateTooltipContent(): js.Promise[String]
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def hover(): js.Promise[Unit]
    
    def isAddItemVisible(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isImageLoaded(): js.Promise[Boolean]
    
    var isImageVisible: js.Promise[Boolean]
    
    def isLoaderVisible(): js.Promise[Boolean]
    
    def isPreviousImageVisible(): js.Promise[Boolean]
    
    def removeButtonExists(): js.Promise[Boolean]
    
    def updateButtonExists(): js.Promise[Boolean]
    
    def updateExists(): js.Promise[Boolean]
  }
  object ImageViewerUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      clickAdd: () => js.Promise[Unit],
      clickRemove: () => js.Promise[Unit],
      clickUpdate: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getAddTooltipContent: () => js.Promise[String],
      getContainerStyles: () => js.Promise[String | Null],
      getImageUrl: () => js.Promise[String | Null],
      getPreviousImageUrl: () => js.Promise[String | Null],
      getRemoveTooltipContent: () => js.Promise[String],
      getStatusMessage: () => js.Promise[String | Null],
      getUpdateTooltipContent: () => js.Promise[String],
      hasStatus: StatusIndications => js.Promise[Boolean],
      hover: () => js.Promise[Unit],
      isAddItemVisible: () => js.Promise[Boolean],
      isDisabled: () => js.Promise[Boolean],
      isImageLoaded: () => js.Promise[Boolean],
      isImageVisible: js.Promise[Boolean],
      isLoaderVisible: () => js.Promise[Boolean],
      isPreviousImageVisible: () => js.Promise[Boolean],
      removeButtonExists: () => js.Promise[Boolean],
      updateButtonExists: () => js.Promise[Boolean],
      updateExists: () => js.Promise[Boolean]
    ): ImageViewerUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickAdd = js.Any.fromFunction0(clickAdd), clickRemove = js.Any.fromFunction0(clickRemove), clickUpdate = js.Any.fromFunction0(clickUpdate), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAddTooltipContent = js.Any.fromFunction0(getAddTooltipContent), getContainerStyles = js.Any.fromFunction0(getContainerStyles), getImageUrl = js.Any.fromFunction0(getImageUrl), getPreviousImageUrl = js.Any.fromFunction0(getPreviousImageUrl), getRemoveTooltipContent = js.Any.fromFunction0(getRemoveTooltipContent), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getUpdateTooltipContent = js.Any.fromFunction0(getUpdateTooltipContent), hasStatus = js.Any.fromFunction1(hasStatus), hover = js.Any.fromFunction0(hover), isAddItemVisible = js.Any.fromFunction0(isAddItemVisible), isDisabled = js.Any.fromFunction0(isDisabled), isImageLoaded = js.Any.fromFunction0(isImageLoaded), isImageVisible = isImageVisible.asInstanceOf[js.Any], isLoaderVisible = js.Any.fromFunction0(isLoaderVisible), isPreviousImageVisible = js.Any.fromFunction0(isPreviousImageVisible), removeButtonExists = js.Any.fromFunction0(removeButtonExists), updateButtonExists = js.Any.fromFunction0(updateButtonExists), updateExists = js.Any.fromFunction0(updateExists))
      __obj.asInstanceOf[ImageViewerUniDriver]
    }
    
    @scala.inline
    implicit class ImageViewerUniDriverMutableBuilder[Self <: ImageViewerUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickAdd(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickAdd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickRemove(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickRemove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickUpdate(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAddTooltipContent(value: () => js.Promise[String]): Self = StObject.set(x, "getAddTooltipContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerStyles(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getContainerStyles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetImageUrl(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getImageUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreviousImageUrl(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getPreviousImageUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRemoveTooltipContent(value: () => js.Promise[String]): Self = StObject.set(x, "getRemoveTooltipContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStatusMessage(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUpdateTooltipContent(value: () => js.Promise[String]): Self = StObject.set(x, "getUpdateTooltipContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHover(value: () => js.Promise[Unit]): Self = StObject.set(x, "hover", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsAddItemVisible(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isAddItemVisible", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsImageLoaded(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isImageLoaded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsImageVisible(value: js.Promise[Boolean]): Self = StObject.set(x, "isImageVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoaderVisible(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLoaderVisible", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPreviousImageVisible(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPreviousImageVisible", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "removeButtonExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "updateButtonExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "updateExists", js.Any.fromFunction0(value))
    }
  }
}
