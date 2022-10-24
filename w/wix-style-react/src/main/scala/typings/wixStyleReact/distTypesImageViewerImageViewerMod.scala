package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.CurrentImageUrl
import typings.wixStyleReact.anon.ImageLoading
import typings.wixStyleReact.anon.ImageUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesImageViewerImageViewerMod {
  
  @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", JSImport.Default)
  @js.native
  open class default protected () extends ImageViewer {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.defaultProps.addImageInfo")
      @js.native
      val addImageInfo: String = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.defaultProps.downloadImageInfo")
      @js.native
      val downloadImageInfo: String = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.defaultProps.moreImageInfo")
      @js.native
      val moreImageInfo: String = js.native
      
      inline def onImageLoad(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("onImageLoad")().asInstanceOf[js.Object]
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.defaultProps.removeImageInfo")
      @js.native
      val removeImageInfo: String = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.defaultProps.showDownloadButton")
      @js.native
      val showDownloadButton: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.defaultProps.showRemoveButton")
      @js.native
      val showRemoveButton: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.defaultProps.showUpdateButton")
      @js.native
      val showUpdateButton: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.defaultProps.updateImageInfo")
      @js.native
      val updateImageInfo: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.addImageInfo_1")
      @js.native
      val addImageInfo1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.downloadImageInfo_1")
      @js.native
      val downloadImageInfo1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.height")
      @js.native
      val height: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.imageUrl")
      @js.native
      val imageUrl: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.moreImageInfo_1")
      @js.native
      val moreImageInfo1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.onAddImage")
      @js.native
      val onAddImage: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.onDownloadImage")
      @js.native
      val onDownloadImage: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.onImageLoad_1")
      @js.native
      val onImageLoad1: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.onRemoveImage")
      @js.native
      val onRemoveImage: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.onUpdateImage")
      @js.native
      val onUpdateImage: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.removeImageInfo_1")
      @js.native
      val removeImageInfo1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.removeRoundedBorders")
      @js.native
      val removeRoundedBorders: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.showDownloadButton_1")
      @js.native
      val showDownloadButton1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.showRemoveButton_1")
      @js.native
      val showRemoveButton1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.showUpdateButton_1")
      @js.native
      val showUpdateButton1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.statusMessage")
      @js.native
      val statusMessage: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.tooltipProps")
      @js.native
      val tooltipProps: Requireable[InferProps[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.updateImageInfo_1")
      @js.native
      val updateImageInfo1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ImageViewer/ImageViewer", "default.propTypes.width")
      @js.native
      val width: Requireable[String | Double] = js.native
    }
  }
  
  @js.native
  trait ImageViewer extends Component[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MImageViewer(nextProps: Any): Unit = js.native
    
    def _getCurrentAndPreviousImages(): CurrentImageUrl = js.native
    
    def _hidePopover(): Unit = js.native
    
    def _onImageLoad(e: Any): Unit = js.native
    
    def _renderAddImage(): Element = js.native
    
    def _renderButtons(): Element = js.native
    
    def _renderDownloadButton(ref: Any): Element = js.native
    
    def _renderFirstButton(): Element | Null = js.native
    
    def _renderImage(): js.UndefOr[Element] = js.native
    
    /** `display: none` is used to prefetch an image == it fetches the image but doesn't show it */
    def _renderImageElement(param0: ImageUrl): Element = js.native
    
    def _renderLoader(): Element = js.native
    
    def _renderMoreButton(): Element = js.native
    
    def _renderOverlayWith(content: Any): Element = js.native
    
    def _renderRemoveButton(ref: Any): Element = js.native
    
    def _renderSecondButton(): Element | Null = js.native
    
    def _renderUpdateButton(ref: Any): Element = js.native
    
    def _resetImageLoading(): Unit = js.native
    
    def _resetPreviousImage(): Unit = js.native
    
    def _showPopover(): Unit = js.native
    
    /**
      * Sets focus on the element
      */
    def focus(): Unit = js.native
    
    var focusNode: RefObject[Any] = js.native
    
    @JSName("state")
    var state_ImageViewer: ImageLoading = js.native
  }
}
