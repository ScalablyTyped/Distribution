package typings.wixStyleReact

import typings.wixStyleReact.distTypesCommonMod.StatusIndications
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesImageViewerImageViewerDotuniDotdriverMod {
  
  trait ImageViewerUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickAdd(): js.Promise[Unit]
    
    def clickDownload(): js.Promise[Unit]
    
    def clickRemove(): js.Promise[Unit]
    
    def clickUpdate(): js.Promise[Unit]
    
    def downloadButtonExists(): js.Promise[Boolean]
    
    def getAddTooltipContent(): js.Promise[String]
    
    def getContainerStyles(): js.Promise[String | Null]
    
    def getDownloadTooltipContent(): js.Promise[String]
    
    def getImageUrl(): js.Promise[String | Null]
    
    def getMoreTooltipContent(): js.Promise[String]
    
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
    
    def moreButtonExists(): js.Promise[Boolean]
    
    def removeButtonExists(): js.Promise[Boolean]
    
    def updateButtonExists(): js.Promise[Boolean]
    
    def updateExists(): js.Promise[Boolean]
  }
  object ImageViewerUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickAdd: () => js.Promise[Unit],
      clickDownload: () => js.Promise[Unit],
      clickRemove: () => js.Promise[Unit],
      clickUpdate: () => js.Promise[Unit],
      downloadButtonExists: () => js.Promise[Boolean],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getAddTooltipContent: () => js.Promise[String],
      getContainerStyles: () => js.Promise[String | Null],
      getDownloadTooltipContent: () => js.Promise[String],
      getImageUrl: () => js.Promise[String | Null],
      getMoreTooltipContent: () => js.Promise[String],
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
      moreButtonExists: () => js.Promise[Boolean],
      removeButtonExists: () => js.Promise[Boolean],
      updateButtonExists: () => js.Promise[Boolean],
      updateExists: () => js.Promise[Boolean]
    ): ImageViewerUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickAdd = js.Any.fromFunction0(clickAdd), clickDownload = js.Any.fromFunction0(clickDownload), clickRemove = js.Any.fromFunction0(clickRemove), clickUpdate = js.Any.fromFunction0(clickUpdate), downloadButtonExists = js.Any.fromFunction0(downloadButtonExists), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getAddTooltipContent = js.Any.fromFunction0(getAddTooltipContent), getContainerStyles = js.Any.fromFunction0(getContainerStyles), getDownloadTooltipContent = js.Any.fromFunction0(getDownloadTooltipContent), getImageUrl = js.Any.fromFunction0(getImageUrl), getMoreTooltipContent = js.Any.fromFunction0(getMoreTooltipContent), getPreviousImageUrl = js.Any.fromFunction0(getPreviousImageUrl), getRemoveTooltipContent = js.Any.fromFunction0(getRemoveTooltipContent), getStatusMessage = js.Any.fromFunction0(getStatusMessage), getUpdateTooltipContent = js.Any.fromFunction0(getUpdateTooltipContent), hasStatus = js.Any.fromFunction1(hasStatus), hover = js.Any.fromFunction0(hover), isAddItemVisible = js.Any.fromFunction0(isAddItemVisible), isDisabled = js.Any.fromFunction0(isDisabled), isImageLoaded = js.Any.fromFunction0(isImageLoaded), isImageVisible = isImageVisible.asInstanceOf[js.Any], isLoaderVisible = js.Any.fromFunction0(isLoaderVisible), isPreviousImageVisible = js.Any.fromFunction0(isPreviousImageVisible), moreButtonExists = js.Any.fromFunction0(moreButtonExists), removeButtonExists = js.Any.fromFunction0(removeButtonExists), updateButtonExists = js.Any.fromFunction0(updateButtonExists), updateExists = js.Any.fromFunction0(updateExists))
      __obj.asInstanceOf[ImageViewerUniDriver]
    }
    
    extension [Self <: ImageViewerUniDriver](x: Self) {
      
      inline def setClickAdd(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickAdd", js.Any.fromFunction0(value))
      
      inline def setClickDownload(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickDownload", js.Any.fromFunction0(value))
      
      inline def setClickRemove(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickRemove", js.Any.fromFunction0(value))
      
      inline def setClickUpdate(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickUpdate", js.Any.fromFunction0(value))
      
      inline def setDownloadButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "downloadButtonExists", js.Any.fromFunction0(value))
      
      inline def setGetAddTooltipContent(value: () => js.Promise[String]): Self = StObject.set(x, "getAddTooltipContent", js.Any.fromFunction0(value))
      
      inline def setGetContainerStyles(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getContainerStyles", js.Any.fromFunction0(value))
      
      inline def setGetDownloadTooltipContent(value: () => js.Promise[String]): Self = StObject.set(x, "getDownloadTooltipContent", js.Any.fromFunction0(value))
      
      inline def setGetImageUrl(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getImageUrl", js.Any.fromFunction0(value))
      
      inline def setGetMoreTooltipContent(value: () => js.Promise[String]): Self = StObject.set(x, "getMoreTooltipContent", js.Any.fromFunction0(value))
      
      inline def setGetPreviousImageUrl(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getPreviousImageUrl", js.Any.fromFunction0(value))
      
      inline def setGetRemoveTooltipContent(value: () => js.Promise[String]): Self = StObject.set(x, "getRemoveTooltipContent", js.Any.fromFunction0(value))
      
      inline def setGetStatusMessage(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getStatusMessage", js.Any.fromFunction0(value))
      
      inline def setGetUpdateTooltipContent(value: () => js.Promise[String]): Self = StObject.set(x, "getUpdateTooltipContent", js.Any.fromFunction0(value))
      
      inline def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setHover(value: () => js.Promise[Unit]): Self = StObject.set(x, "hover", js.Any.fromFunction0(value))
      
      inline def setIsAddItemVisible(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isAddItemVisible", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setIsImageLoaded(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isImageLoaded", js.Any.fromFunction0(value))
      
      inline def setIsImageVisible(value: js.Promise[Boolean]): Self = StObject.set(x, "isImageVisible", value.asInstanceOf[js.Any])
      
      inline def setIsLoaderVisible(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isLoaderVisible", js.Any.fromFunction0(value))
      
      inline def setIsPreviousImageVisible(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isPreviousImageVisible", js.Any.fromFunction0(value))
      
      inline def setMoreButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "moreButtonExists", js.Any.fromFunction0(value))
      
      inline def setRemoveButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "removeButtonExists", js.Any.fromFunction0(value))
      
      inline def setUpdateButtonExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "updateButtonExists", js.Any.fromFunction0(value))
      
      inline def setUpdateExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "updateExists", js.Any.fromFunction0(value))
    }
  }
}
