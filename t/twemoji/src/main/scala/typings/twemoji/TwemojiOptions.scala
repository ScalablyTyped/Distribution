package typings.twemoji

import typings.twemoji.twemojiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TwemojiOptions extends StObject {
  
  /**
    * The function to invoke in order to generate additional, custom attributes for the image tag.
    * Default () => ({})
    * @param icon the lower case HEX code point i.e. "1f4a9"
    * @param variant variant the optional \\uFE0F ("as image") variant, in case this info is anyhow meaningful. By default this is ignored.
    * 
    */
  var attributes: js.UndefOr[js.Function2[/* icon */ String, /* variant */ String, js.Object]] = js.undefined
  
  /**
    * Default: MaxCDN
    */
  var base: js.UndefOr[String] = js.undefined
  
  /**
    * The function to invoke in order to generate image src(s).
    */
  var callback: js.UndefOr[ParseCallback] = js.undefined
  
  /**
    * Default: emoji
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Default: .png
    */
  var ext: js.UndefOr[String] = js.undefined
  
  /**
    * To render with SVG use `folder: svg, ext: .svg`
    */
  var folder: js.UndefOr[String] = js.undefined
  
  /**
    * Default: 72x72
    */
  var size: js.UndefOr[String | Double] = js.undefined
}
object TwemojiOptions {
  
  inline def apply(): TwemojiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwemojiOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TwemojiOptions] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: (/* icon */ String, /* variant */ String) => js.Object): Self = StObject.set(x, "attributes", js.Any.fromFunction2(value))
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setCallback(value: (/* icon */ String, /* options */ js.Object, /* variant */ String) => String | `false`): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
