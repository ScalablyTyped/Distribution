package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.wordpressBlocks.anon.HTML
import typings.wordpressBlocks.anon.Mode
import typings.wordpressBlocks.anon.`0`
import typings.wordpressBlocks.wordpressBlocksStrings.AUTO
import typings.wordpressBlocks.wordpressBlocksStrings.BLOCKS
import typings.wordpressBlocks.wordpressBlocksStrings.INLINE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiRawHandlingMod {
  
  @JSImport("@wordpress/blocks/api/raw-handling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPhrasingContentSchema(): PhrasingContentSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("getPhrasingContentSchema")().asInstanceOf[PhrasingContentSchema]
  
  object pasteHandler {
    
    inline def apply(options: Options & `0`): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
    inline def apply(options: Options & Mode): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(options: Options): js.Array[BlockInstance[StringDictionary[Any]]] | String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]] | String]
    
    @JSImport("@wordpress/blocks/api/raw-handling", "pasteHandler")
    @js.native
    val ^ : js.Any = js.native
    
    trait BaseOptions extends StObject {
      
      /**
        * Whether or not the user can use unfiltered HTML.
        */
      var canUserUseUnfilteredHTML: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Handle content as blocks or inline content.
        *  - `AUTO`: Decide based on the content passed.
        *  - `INLINE`: Always handle as inline content, and return string.
        *  - `BLOCKS`: Always handle as blocks, and return array of blocks.
        */
      var mode: js.UndefOr[AUTO | INLINE | BLOCKS] = js.undefined
      
      /**
        * The tag into which content will be inserted.
        */
      var tagName: js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 112, starting with typings.wordpressBlocks.wordpressBlocksStrings.a, typings.wordpressBlocks.wordpressBlocksStrings.abbr, typings.wordpressBlocks.wordpressBlocksStrings.address */ Any
          ] = js.undefined
    }
    object BaseOptions {
      
      inline def apply(): BaseOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
        
        inline def setCanUserUseUnfilteredHTML(value: Boolean): Self = StObject.set(x, "canUserUseUnfilteredHTML", value.asInstanceOf[js.Any])
        
        inline def setCanUserUseUnfilteredHTMLUndefined: Self = StObject.set(x, "canUserUseUnfilteredHTML", js.undefined)
        
        inline def setMode(value: AUTO | INLINE | BLOCKS): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setTagName(
          value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 112, starting with typings.wordpressBlocks.wordpressBlocksStrings.a, typings.wordpressBlocks.wordpressBlocksStrings.abbr, typings.wordpressBlocks.wordpressBlocksStrings.address */ Any
        ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
        
        inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      }
    }
    
    trait HTMLOptions
      extends StObject
         with BaseOptions
         with Options {
      
      /**
        * The HTML to convert.
        */
      var HTML: String
    }
    object HTMLOptions {
      
      inline def apply(HTML: String): HTMLOptions = {
        val __obj = js.Dynamic.literal(HTML = HTML.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLOptions] (val x: Self) extends AnyVal {
        
        inline def setHTML(value: String): Self = StObject.set(x, "HTML", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressBlocks.apiRawHandlingMod.pasteHandler.HTMLOptions
      - typings.wordpressBlocks.apiRawHandlingMod.pasteHandler.PlainTextOptions
    */
    trait Options extends StObject
    object Options {
      
      inline def HTMLOptions(HTML: String): typings.wordpressBlocks.apiRawHandlingMod.pasteHandler.HTMLOptions = {
        val __obj = js.Dynamic.literal(HTML = HTML.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressBlocks.apiRawHandlingMod.pasteHandler.HTMLOptions]
      }
      
      inline def PlainTextOptions(plainText: String): typings.wordpressBlocks.apiRawHandlingMod.pasteHandler.PlainTextOptions = {
        val __obj = js.Dynamic.literal(plainText = plainText.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressBlocks.apiRawHandlingMod.pasteHandler.PlainTextOptions]
      }
    }
    
    trait PlainTextOptions
      extends StObject
         with BaseOptions
         with Options {
      
      /**
        * Plain text version.
        */
      var plainText: String
    }
    object PlainTextOptions {
      
      inline def apply(plainText: String): PlainTextOptions = {
        val __obj = js.Dynamic.literal(plainText = plainText.asInstanceOf[js.Any])
        __obj.asInstanceOf[PlainTextOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PlainTextOptions] (val x: Self) extends AnyVal {
        
        inline def setPlainText(value: String): Self = StObject.set(x, "plainText", value.asInstanceOf[js.Any])
      }
    }
  }
  
  inline def rawHandler(options: HTML): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("rawHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  
  /* Inlined {readonly [ k in '#text' | 'a' | 'abbr' | 'br' | 'code' | 'del' | 'em' | 'ins' | 's' | 'strong' | 'sub' | 'sup' ]: k extends '#text' | 'br'? {} : k extends 'a'? { readonly attributes :std.ReadonlyArray<keyof std.HTMLAnchorElement>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : k extends 'abbr'? { readonly attributes :std.ReadonlyArray<keyof std.HTMLElement>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema}} */
  trait PhrasingContentSchema extends StObject {
    
    @JSName("#text")
    val Numbersigntext: /* import warning: importer.ImportType#apply Failed type conversion: '#text' extends '#text' | 'br' ? {} : '#text' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : '#text' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
    
    val a: /* import warning: importer.ImportType#apply Failed type conversion: 'a' extends '#text' | 'br' ? {} : 'a' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'a' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
    
    val abbr: /* import warning: importer.ImportType#apply Failed type conversion: 'abbr' extends '#text' | 'br' ? {} : 'abbr' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'abbr' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
    
    val br: /* import warning: importer.ImportType#apply Failed type conversion: 'br' extends '#text' | 'br' ? {} : 'br' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'br' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
    
    val code: /* import warning: importer.ImportType#apply Failed type conversion: 'code' extends '#text' | 'br' ? {} : 'code' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'code' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
    
    val del: /* import warning: importer.ImportType#apply Failed type conversion: 'del' extends '#text' | 'br' ? {} : 'del' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'del' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
    
    val em: /* import warning: importer.ImportType#apply Failed type conversion: 'em' extends '#text' | 'br' ? {} : 'em' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'em' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
    
    val ins: /* import warning: importer.ImportType#apply Failed type conversion: 'ins' extends '#text' | 'br' ? {} : 'ins' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'ins' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
    
    val s: /* import warning: importer.ImportType#apply Failed type conversion: 's' extends '#text' | 'br' ? {} : 's' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 's' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
    
    val strong: /* import warning: importer.ImportType#apply Failed type conversion: 'strong' extends '#text' | 'br' ? {} : 'strong' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'strong' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
    
    val sub: /* import warning: importer.ImportType#apply Failed type conversion: 'sub' extends '#text' | 'br' ? {} : 'sub' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'sub' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
    
    val sup: /* import warning: importer.ImportType#apply Failed type conversion: 'sup' extends '#text' | 'br' ? {} : 'sup' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'sup' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
  }
  object PhrasingContentSchema {
    
    inline def apply(
      Numbersigntext: /* import warning: importer.ImportType#apply Failed type conversion: '#text' extends '#text' | 'br' ? {} : '#text' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : '#text' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any,
      a: /* import warning: importer.ImportType#apply Failed type conversion: 'a' extends '#text' | 'br' ? {} : 'a' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'a' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any,
      abbr: /* import warning: importer.ImportType#apply Failed type conversion: 'abbr' extends '#text' | 'br' ? {} : 'abbr' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'abbr' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any,
      br: /* import warning: importer.ImportType#apply Failed type conversion: 'br' extends '#text' | 'br' ? {} : 'br' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'br' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any,
      code: /* import warning: importer.ImportType#apply Failed type conversion: 'code' extends '#text' | 'br' ? {} : 'code' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'code' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any,
      del: /* import warning: importer.ImportType#apply Failed type conversion: 'del' extends '#text' | 'br' ? {} : 'del' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'del' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any,
      em: /* import warning: importer.ImportType#apply Failed type conversion: 'em' extends '#text' | 'br' ? {} : 'em' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'em' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any,
      ins: /* import warning: importer.ImportType#apply Failed type conversion: 'ins' extends '#text' | 'br' ? {} : 'ins' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'ins' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any,
      s: /* import warning: importer.ImportType#apply Failed type conversion: 's' extends '#text' | 'br' ? {} : 's' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 's' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any,
      strong: /* import warning: importer.ImportType#apply Failed type conversion: 'strong' extends '#text' | 'br' ? {} : 'strong' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'strong' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any,
      sub: /* import warning: importer.ImportType#apply Failed type conversion: 'sub' extends '#text' | 'br' ? {} : 'sub' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'sub' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any,
      sup: /* import warning: importer.ImportType#apply Failed type conversion: 'sup' extends '#text' | 'br' ? {} : 'sup' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'sup' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
    ): PhrasingContentSchema = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any])
      __obj.updateDynamic("#text")(Numbersigntext.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhrasingContentSchema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhrasingContentSchema] (val x: Self) extends AnyVal {
      
      inline def setA(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'a' extends '#text' | 'br' ? {} : 'a' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'a' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
      ): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAbbr(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'abbr' extends '#text' | 'br' ? {} : 'abbr' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'abbr' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
      ): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      inline def setBr(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'br' extends '#text' | 'br' ? {} : 'br' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'br' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
      ): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setCode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'code' extends '#text' | 'br' ? {} : 'code' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'code' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
      ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'del' extends '#text' | 'br' ? {} : 'del' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'del' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
      ): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      inline def setEm(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'em' extends '#text' | 'br' ? {} : 'em' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'em' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
      ): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setIns(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'ins' extends '#text' | 'br' ? {} : 'ins' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'ins' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
      ): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
      
      inline def setNumbersigntext(
        value: /* import warning: importer.ImportType#apply Failed type conversion: '#text' extends '#text' | 'br' ? {} : '#text' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : '#text' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
      ): Self = StObject.set(x, "#text", value.asInstanceOf[js.Any])
      
      inline def setS(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 's' extends '#text' | 'br' ? {} : 's' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 's' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
      ): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setStrong(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'strong' extends '#text' | 'br' ? {} : 'strong' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'strong' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
      ): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setSub(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'sub' extends '#text' | 'br' ? {} : 'sub' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'sub' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
      ): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSup(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'sup' extends '#text' | 'br' ? {} : 'sup' extends 'a' ? { readonly attributes :std.ReadonlyArray<'charset' | 'coords' | 'download' | 'hreflang' | 'name' | 'ping' | 'referrerPolicy' | 'rel' | 'relList' | 'rev' | 'shape' | 'target' | 'text' | 'type'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : 'sup' extends 'abbr' ? { readonly attributes :std.ReadonlyArray<'accessKey' | 'accessKeyLabel' | 'autocapitalize' | 'dir' | 'draggable' | 'hidden' | 'inert' | 'innerText' | 'lang' | 'offsetHeight' | 'offsetLeft' | 'offsetParent' | 'offsetTop' | 'offsetWidth' | 'outerText' | 'spellcheck' | 'title' | 'translate'>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} */ js.Any
      ): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
    }
  }
}
