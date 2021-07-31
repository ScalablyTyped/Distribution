package typings.wixUiCore

import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.PureComponent
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLImageElement
import typings.wixUiCore.anon.SrcString
import typings.wixUiCore.wixUiCoreStrings.contain
import typings.wixUiCore.wixUiCoreStrings.cover
import typings.wixUiCore.wixUiCoreStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsImageImageMod {
  
  @JSImport("wix-ui-core/src/components/image/image", "Image")
  @js.native
  class Image protected ()
    extends PureComponent[ImageProps, ImageState, js.Any] {
    def this(props: ImageProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ImageProps, context: js.Any) = this()
    
    val getErrorImage: js.Any = js.native
    
    val getErrorSrc: js.Any = js.native
    
    var getImageProps: js.Any = js.native
    
    val getSrc: js.Any = js.native
    
    val getSrcSet: js.Any = js.native
    
    val handleOnError: js.Any = js.native
    
    val handleOnLoad: js.Any = js.native
    
    val isErrorState: js.Any = js.native
    
    val isResized: js.Any = js.native
    
    @JSName("state")
    var state_Image: SrcString = js.native
  }
  
  trait ImageProps extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var errorImage: js.UndefOr[String] = js.undefined
    
    var nativeProps: js.UndefOr[ImgHTMLAttributes[HTMLImageElement]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLImageElement, Event], Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLImageElement, Event], Unit]] = js.undefined
    
    var resizeMode: js.UndefOr[fill | contain | cover] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var srcSet: js.UndefOr[String] = js.undefined
  }
  object ImageProps {
    
    @scala.inline
    def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
    
    @scala.inline
    implicit class ImagePropsMutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setErrorImage(value: String): Self = StObject.set(x, "errorImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorImageUndefined: Self = StObject.set(x, "errorImage", js.undefined)
      
      @scala.inline
      def setNativeProps(value: ImgHTMLAttributes[HTMLImageElement]): Self = StObject.set(x, "nativeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativePropsUndefined: Self = StObject.set(x, "nativeProps", js.undefined)
      
      @scala.inline
      def setOnError(value: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnLoad(value: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setResizeMode(value: fill | contain | cover): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  trait ImageState extends StObject {
    
    var src: js.UndefOr[String] = js.undefined
    
    var status: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageStatus */ js.Any
  }
  object ImageState {
    
    @scala.inline
    def apply(
      status: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageStatus */ js.Any
    ): ImageState = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageState]
    }
    
    @scala.inline
    implicit class ImageStateMutableBuilder[Self <: ImageState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStatus(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageStatus */ js.Any
      ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
