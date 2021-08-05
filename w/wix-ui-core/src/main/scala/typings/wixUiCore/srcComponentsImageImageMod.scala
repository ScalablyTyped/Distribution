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
    
    /* private */ val getErrorImage: js.Any = js.native
    
    /* private */ val getErrorSrc: js.Any = js.native
    
    /* private */ var getImageProps: js.Any = js.native
    
    /* private */ val getSrc: js.Any = js.native
    
    /* private */ val getSrcSet: js.Any = js.native
    
    /* private */ val handleOnError: js.Any = js.native
    
    /* private */ val handleOnLoad: js.Any = js.native
    
    /* private */ val isErrorState: js.Any = js.native
    
    /* private */ val isResized: js.Any = js.native
    
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
    
    inline def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
    
    extension [Self <: ImageProps](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setErrorImage(value: String): Self = StObject.set(x, "errorImage", value.asInstanceOf[js.Any])
      
      inline def setErrorImageUndefined: Self = StObject.set(x, "errorImage", js.undefined)
      
      inline def setNativeProps(value: ImgHTMLAttributes[HTMLImageElement]): Self = StObject.set(x, "nativeProps", value.asInstanceOf[js.Any])
      
      inline def setNativePropsUndefined: Self = StObject.set(x, "nativeProps", js.undefined)
      
      inline def setOnError(value: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setResizeMode(value: fill | contain | cover): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  trait ImageState extends StObject {
    
    var src: js.UndefOr[String] = js.undefined
    
    var status: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageStatus */ js.Any
  }
  object ImageState {
    
    inline def apply(
      status: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageStatus */ js.Any
    ): ImageState = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageState]
    }
    
    extension [Self <: ImageState](x: Self) {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStatus(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImageStatus */ js.Any
      ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
