package typings.webResourceInliner

import typings.request.mod.CoreOptions
import typings.request.mod.RequiredUriUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web-resource-inliner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def css(options: Options, callback: Callback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("css")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def html(options: Options, callback: Callback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Callback = js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]
  
  trait Options extends StObject {
    
    /**
      * This is the HTML or CSS content to be inlined, you should provide HTML to the html() method and CSS to the css() method or you will get errors or garbage output.
      */
    var fileContent: String
    
    /**
      * When true, inline images unless they have an exclusion attribute (see inlineAttribute option).
      *
      * When false, exclude images unless they have an inclusion attribute (see inlineAttribute option).
      *
      * When a number, inline images only when the base64 content size is less than the number of KBs.
      *
      * For example, the default is to only inline images less than 8KB.
      *
      * @default 8
      */
    var images: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Sets the attribute that is used to include/exclude specific resources based on the default behavior for the resource type.
      *
      * For example, if scripts is set to false, an individual script can be inlined by adding the attribute to the script tag like <script src="myscript.js" data-inline></script>.
      * On the other hand, if images are set to be inlined by default,
      * a specific image can be excluded by adding -ignore to the end of the inlineAttribute like <img src="myimg.png" data-inline-ignore />.
      *
      * In CSS, a comment is required at the end of the line to perform the same thing, such as \/ *data-inline*\/ or \/ *data-inline-ignore*\/.
      *
      * @default "data-inline"
      */
    var inlineAttribute: js.UndefOr[String] = js.undefined
    
    /**
      * Allows to make changes to links before they are inlined, such as CSS pre-and-post-processors.
      *
      * Callback is standard node error first, second argument is transformed value.
      */
    var linkTransform: js.UndefOr[js.Function2[/* content */ String, /* done */ Callback, js.Any]] = js.undefined
    
    /**
      * When true, inline stylesheet links unless they have an exclusion attribute (see inlineAttribute option).
      *
      * When false, exclude stylesheet links unless they have an inclusion attribute (see inlineAttribute option).
      *
      * When a number, inline stylesheet links only when the base64 content size is less than the number of KBs.
      *
      * @default true
      */
    var links: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Describes the path relationship between CSS content and the context it will be loaded in.
      *
      * For example, when a CSS file contains url(some-file.png) and the file is moved from a location in a folder like /css to /
      * then the path to the image needs to be changed to url(css/some-file.png).
      * In this case, rebaseRelativeTo would be css. You probably don't want to set this when you are using html().
      *
      * @default ""
      */
    var rebaseRelativeTo: js.UndefOr[String] = js.undefined
    
    /**
      * Describes the path relationship between where web-resource-inliner is running and what the relative paths in fileContent or href/src urls refer to.
      *
      * For example, the tests cases in this package are in test/cases/ so their relative paths start by referring to that folder,
      * but the root of this project and where npm test runs from is 2 folders up, so relativeTo is set to test/cases/ in test/spec.js.
      * Likewise, with href="content.css" and a relativeTo of http://github.com/ the resource retrieved would be http://github.com/content.css.
      *
      * @default ""
      */
    var relativeTo: js.UndefOr[String] = js.undefined
    
    /**
      * Allows to adjust issued requests.
      *
      * E.g., add authentication tokens to requested URLs.
      *
      * The function is called with the request options object as its parameter.
      *
      * It can modify this object or return a new one.
      *
      * See the [list of available options](https://www.npmjs.com/package/request#request-options-callback).
      */
    var requestTransform: js.UndefOr[
        js.Function1[/* requestOptions */ RequiredUriUrl & CoreOptions, RequiredUriUrl & CoreOptions]
      ] = js.undefined
    
    /**
      * Allows to make changes to scripts before they are inlined, such as minifying.
      *
      * Callback is standard node error first, second argument is transformed value.
      */
    var scriptTransform: js.UndefOr[js.Function2[/* content */ String, /* done */ Callback, js.Any]] = js.undefined
    
    /**
      * When true, inline scripts unless they have an exclusion attribute (see inlineAttribute option).
      *
      * When false, exclude scripts unless they have an inclusion attribute (see inlineAttribute option).
      *
      * When a number, inline scripts only when the base64 content size is less than the number of KBs.
      *
      * @default true
      */
    var scripts: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * When strict is true, a missing resource will cause the inliner to halt and return an error in the callback.
      *
      * The default behavior is to log a warning to the console and continue inlining with the available resources, which is more similar to how a web page behaves.
      *
      * @default false
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, inline SVG <use> unless they have an exclusion attribute (see inlineAttribute option).
      *
      * When false, exclude SVG <use> unless they have an inclusion attribute (see inlineAttribute option).
      *
      * When a number, inline SVG <use> only when the content size is less than the number of KBs.
      *
      * For example, the default is to only inline SVGs less than 8KB.
      *
      * @default 8
      */
    var svgs: js.UndefOr[Boolean | Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(fileContent: String): Options = {
      val __obj = js.Dynamic.literal(fileContent = fileContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileContent(value: String): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImages(value: Boolean | Double): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      @scala.inline
      def setInlineAttribute(value: String): Self = StObject.set(x, "inlineAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineAttributeUndefined: Self = StObject.set(x, "inlineAttribute", js.undefined)
      
      @scala.inline
      def setLinkTransform(value: (/* content */ String, /* done */ Callback) => js.Any): Self = StObject.set(x, "linkTransform", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLinkTransformUndefined: Self = StObject.set(x, "linkTransform", js.undefined)
      
      @scala.inline
      def setLinks(value: Boolean | Double): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      @scala.inline
      def setRebaseRelativeTo(value: String): Self = StObject.set(x, "rebaseRelativeTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRebaseRelativeToUndefined: Self = StObject.set(x, "rebaseRelativeTo", js.undefined)
      
      @scala.inline
      def setRelativeTo(value: String): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
      
      @scala.inline
      def setRequestTransform(value: /* requestOptions */ RequiredUriUrl & CoreOptions => RequiredUriUrl & CoreOptions): Self = StObject.set(x, "requestTransform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestTransformUndefined: Self = StObject.set(x, "requestTransform", js.undefined)
      
      @scala.inline
      def setScriptTransform(value: (/* content */ String, /* done */ Callback) => js.Any): Self = StObject.set(x, "scriptTransform", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScriptTransformUndefined: Self = StObject.set(x, "scriptTransform", js.undefined)
      
      @scala.inline
      def setScripts(value: Boolean | Double): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setSvgs(value: Boolean | Double): Self = StObject.set(x, "svgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgsUndefined: Self = StObject.set(x, "svgs", js.undefined)
    }
  }
}
