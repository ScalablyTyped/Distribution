package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ImgHTMLAttributes
import typings.std.HTMLImageElement
import typings.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/Image", JSImport.Default)
  @js.native
  val default: FC[ImageProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.contain
    - typings.wixStyleReact.wixStyleReactStrings.cover
    - typings.wixStyleReact.wixStyleReactStrings.tile
    - typings.wixStyleReact.wixStyleReactStrings.none_
  */
  trait ImageFit extends StObject
  object ImageFit {
    
    inline def contain: typings.wixStyleReact.wixStyleReactStrings.contain = "contain".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.contain]
    
    inline def cover: typings.wixStyleReact.wixStyleReactStrings.cover = "cover".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.cover]
    
    inline def none: none_ = "none".asInstanceOf[none_]
    
    inline def tile: typings.wixStyleReact.wixStyleReactStrings.tile = "tile".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tile]
  }
  
  trait ImageProps
    extends StObject
       with ImgHTMLAttributes[HTMLImageElement] {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var fit: js.UndefOr[ImageFit] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
  }
  object ImageProps {
    
    inline def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
    
    extension [Self <: ImageProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFit(value: ImageFit): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  type _To = FC[ImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `imageMod.foo` */
  override def _to: FC[ImageProps] = default
}
