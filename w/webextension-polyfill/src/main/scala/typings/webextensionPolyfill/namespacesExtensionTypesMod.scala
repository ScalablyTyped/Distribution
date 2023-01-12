package typings.webextensionPolyfill

import org.scalablytyped.runtime.StringDictionary
import typings.webextensionPolyfill.namespacesManifestMod.Manifest.ExtensionURL
import typings.webextensionPolyfill.webextensionPolyfillStrings.author_
import typings.webextensionPolyfill.webextensionPolyfillStrings.user_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesExtensionTypesMod {
  
  object ExtensionTypes {
    
    /**
      * The origin of the CSS to inject, this affects the cascading order (priority) of the stylesheet.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.user_
      - typings.webextensionPolyfill.webextensionPolyfillStrings.author_
    */
    trait CSSOrigin extends StObject
    object CSSOrigin {
      
      inline def author: author_ = "author".asInstanceOf[author_]
      
      inline def user: user_ = "user".asInstanceOf[user_]
    }
    
    type DateType = String | Double | js.Date
    
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.ExtensionFileOrCodeC1Type
      - typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.ExtensionFileOrCodeC2Type
    */
    trait ExtensionFileOrCode extends StObject
    object ExtensionFileOrCode {
      
      inline def ExtensionFileOrCodeC1Type(file: ExtensionURL): typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.ExtensionFileOrCodeC1Type = {
        val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.ExtensionFileOrCodeC1Type]
      }
      
      inline def ExtensionFileOrCodeC2Type(code: String): typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.ExtensionFileOrCodeC2Type = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.ExtensionFileOrCodeC2Type]
      }
    }
    
    trait ExtensionFileOrCodeC1Type
      extends StObject
         with ExtensionFileOrCode {
      
      var file: ExtensionURL
    }
    object ExtensionFileOrCodeC1Type {
      
      inline def apply(file: ExtensionURL): ExtensionFileOrCodeC1Type = {
        val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExtensionFileOrCodeC1Type]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ExtensionFileOrCodeC1Type] (val x: Self) extends AnyVal {
        
        inline def setFile(value: ExtensionURL): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      }
    }
    
    trait ExtensionFileOrCodeC2Type
      extends StObject
         with ExtensionFileOrCode {
      
      var code: String
    }
    object ExtensionFileOrCodeC2Type {
      
      inline def apply(code: String): ExtensionFileOrCodeC2Type = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExtensionFileOrCodeC2Type]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ExtensionFileOrCodeC2Type] (val x: Self) extends AnyVal {
        
        inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Details about the format, quality, area and scale of the capture.
      */
    trait ImageDetails extends StObject {
      
      /**
        * The format of the resulting image.  Default is <code>"jpeg"</code>.
        * Optional.
        */
      var format: js.UndefOr[ImageFormat] = js.undefined
      
      /**
        * When format is <code>"jpeg"</code>, controls the quality of the resulting image.  This value is ignored for PNG images.
        * As quality is decreased, the resulting image will have more visual artifacts, and the number of bytes needed to store
        * it will decrease.
        * Optional.
        */
      var quality: js.UndefOr[Double] = js.undefined
      
      /**
        * The area of the document to capture, in CSS pixels, relative to the page.  If omitted, capture the visible viewport.
        * Optional.
        */
      var rect: js.UndefOr[ImageDetailsRectType] = js.undefined
      
      /**
        * If true, temporarily resets the scroll position of the document to 0. Only takes effect if rect is also specified.
        * Optional.
        */
      var resetScrollPosition: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The scale of the resulting image.  Defaults to <code>devicePixelRatio</code>.
        * Optional.
        */
      var scale: js.UndefOr[Double] = js.undefined
    }
    object ImageDetails {
      
      inline def apply(): ImageDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ImageDetails]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ImageDetails] (val x: Self) extends AnyVal {
        
        inline def setFormat(value: ImageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
        
        inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
        
        inline def setRect(value: ImageDetailsRectType): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
        
        inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
        
        inline def setResetScrollPosition(value: Boolean): Self = StObject.set(x, "resetScrollPosition", value.asInstanceOf[js.Any])
        
        inline def setResetScrollPositionUndefined: Self = StObject.set(x, "resetScrollPosition", js.undefined)
        
        inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
        
        inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      }
    }
    
    /**
      * The area of the document to capture, in CSS pixels, relative to the page.  If omitted, capture the visible viewport.
      */
    trait ImageDetailsRectType extends StObject {
      
      var height: Double
      
      var width: Double
      
      var x: Double
      
      var y: Double
    }
    object ImageDetailsRectType {
      
      inline def apply(height: Double, width: Double, x: Double, y: Double): ImageDetailsRectType = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[ImageDetailsRectType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ImageDetailsRectType] (val x: Self) extends AnyVal {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The format of an image.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.jpeg
      - typings.webextensionPolyfill.webextensionPolyfillStrings.png
    */
    trait ImageFormat extends StObject
    object ImageFormat {
      
      inline def jpeg: typings.webextensionPolyfill.webextensionPolyfillStrings.jpeg = "jpeg".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.jpeg]
      
      inline def png: typings.webextensionPolyfill.webextensionPolyfillStrings.png = "png".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.png]
    }
    
    /**
      * Details of the script or CSS to inject. Either the code or the file property must be set,
      * but both may not be set at the same time.
      */
    trait InjectDetails extends StObject {
      
      /**
        * If allFrames is <code>true</code>, implies that the JavaScript or CSS should be injected into all frames of current page.
        * By default, it's <code>false</code> and is only injected into the top frame.
        * Optional.
        */
      var allFrames: js.UndefOr[Boolean] = js.undefined
      
      /**
        * JavaScript or CSS code to inject.<br><br><b>Warning:</b><br>Be careful using the <code>code</code> parameter.
        * Incorrect use of it may open your extension to <a href="https://en.wikipedia.org/wiki/Cross-site_scripting">
        * cross site scripting</a> attacks.
        * Optional.
        */
      var code: js.UndefOr[String] = js.undefined
      
      /**
        * The css origin of the stylesheet to inject. Defaults to "author".
        * Optional.
        */
      var cssOrigin: js.UndefOr[CSSOrigin] = js.undefined
      
      /**
        * JavaScript or CSS file to inject.
        * Optional.
        */
      var file: js.UndefOr[String] = js.undefined
      
      /**
        * The ID of the frame to inject the script into. This may not be used in combination with <code>allFrames</code>.
        * Optional.
        */
      var frameId: js.UndefOr[Double] = js.undefined
      
      /**
        * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has
        * access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is <code>false</code>.
        * Optional.
        */
      var matchAboutBlank: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle".
        * Optional.
        */
      var runAt: js.UndefOr[RunAt] = js.undefined
    }
    object InjectDetails {
      
      inline def apply(): InjectDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InjectDetails]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: InjectDetails] (val x: Self) extends AnyVal {
        
        inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
        
        inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
        
        inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        inline def setCssOrigin(value: CSSOrigin): Self = StObject.set(x, "cssOrigin", value.asInstanceOf[js.Any])
        
        inline def setCssOriginUndefined: Self = StObject.set(x, "cssOrigin", js.undefined)
        
        inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
        
        inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
        
        inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
        
        inline def setMatchAboutBlank(value: Boolean): Self = StObject.set(x, "matchAboutBlank", value.asInstanceOf[js.Any])
        
        inline def setMatchAboutBlankUndefined: Self = StObject.set(x, "matchAboutBlank", js.undefined)
        
        inline def setRunAt(value: RunAt): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
        
        inline def setRunAtUndefined: Self = StObject.set(x, "runAt", js.undefined)
      }
    }
    
    /**
      * A plain JSON value
      */
    type PlainJSONValue = StringDictionary[Any]
    
    /**
      * The soonest that the JavaScript or CSS will be injected into the tab.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.document_start
      - typings.webextensionPolyfill.webextensionPolyfillStrings.document_end
      - typings.webextensionPolyfill.webextensionPolyfillStrings.document_idle
    */
    trait RunAt extends StObject
    object RunAt {
      
      inline def document_end: typings.webextensionPolyfill.webextensionPolyfillStrings.document_end = "document_end".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.document_end]
      
      inline def document_idle: typings.webextensionPolyfill.webextensionPolyfillStrings.document_idle = "document_idle".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.document_idle]
      
      inline def document_start: typings.webextensionPolyfill.webextensionPolyfillStrings.document_start = "document_start".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.document_start]
    }
    
    type Static = StringDictionary[Any]
  }
}
