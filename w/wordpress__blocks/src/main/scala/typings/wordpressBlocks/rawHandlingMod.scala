package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.wordpressBlocks.anon.Attributes
import typings.wordpressBlocks.anon.Children
import typings.wordpressBlocks.anon.ChildrenPhrasingContentSchema
import typings.wordpressBlocks.anon.HTML
import typings.wordpressBlocks.anon.Mode
import typings.wordpressBlocks.anon.`0`
import typings.wordpressBlocks.mod.BlockInstance
import typings.wordpressBlocks.wordpressBlocksStrings.AUTO
import typings.wordpressBlocks.wordpressBlocksStrings.BLOCKS
import typings.wordpressBlocks.wordpressBlocksStrings.INLINE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawHandlingMod {
  
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
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 112 */ Any
          ] = js.undefined
    }
    object BaseOptions {
      
      inline def apply(): BaseOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseOptions]
      }
      
      extension [Self <: BaseOptions](x: Self) {
        
        inline def setCanUserUseUnfilteredHTML(value: Boolean): Self = StObject.set(x, "canUserUseUnfilteredHTML", value.asInstanceOf[js.Any])
        
        inline def setCanUserUseUnfilteredHTMLUndefined: Self = StObject.set(x, "canUserUseUnfilteredHTML", js.undefined)
        
        inline def setMode(value: AUTO | INLINE | BLOCKS): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 112 */ Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
        
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
      
      extension [Self <: HTMLOptions](x: Self) {
        
        inline def setHTML(value: String): Self = StObject.set(x, "HTML", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressBlocks.rawHandlingMod.pasteHandler.HTMLOptions
      - typings.wordpressBlocks.rawHandlingMod.pasteHandler.PlainTextOptions
    */
    trait Options extends StObject
    object Options {
      
      inline def HTMLOptions(HTML: String): typings.wordpressBlocks.rawHandlingMod.pasteHandler.HTMLOptions = {
        val __obj = js.Dynamic.literal(HTML = HTML.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressBlocks.rawHandlingMod.pasteHandler.HTMLOptions]
      }
      
      inline def PlainTextOptions(plainText: String): typings.wordpressBlocks.rawHandlingMod.pasteHandler.PlainTextOptions = {
        val __obj = js.Dynamic.literal(plainText = plainText.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressBlocks.rawHandlingMod.pasteHandler.PlainTextOptions]
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
      
      extension [Self <: PlainTextOptions](x: Self) {
        
        inline def setPlainText(value: String): Self = StObject.set(x, "plainText", value.asInstanceOf[js.Any])
      }
    }
  }
  
  inline def rawHandler(options: HTML): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("rawHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  
  /* Inlined {readonly [ k in '#text' | 'a' | 'abbr' | 'br' | 'code' | 'del' | 'em' | 'ins' | 's' | 'strong' | 'sub' | 'sup' ]: k extends '#text' | 'br'? {} : k extends 'a'? { readonly attributes :std.ReadonlyArray<keyof std.HTMLAnchorElement>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : k extends 'abbr'? { readonly attributes :std.ReadonlyArray<keyof std.HTMLElement>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema}} */
  trait PhrasingContentSchema extends StObject {
    
    @JSName("#text")
    val Numbersigntext: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
    
    val a: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
    
    val abbr: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
    
    val br: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
    
    val code: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
    
    val del: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
    
    val em: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
    
    val ins: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
    
    val s: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
    
    val strong: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
    
    val sub: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
    
    val sup: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
  }
  object PhrasingContentSchema {
    
    inline def apply(
      Numbersigntext: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
      a: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
      abbr: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
      br: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
      code: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
      del: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
      em: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
      ins: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
      s: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
      strong: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
      sub: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
      sup: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
    ): PhrasingContentSchema = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any])
      __obj.updateDynamic("#text")(Numbersigntext.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhrasingContentSchema]
    }
    
    extension [Self <: PhrasingContentSchema](x: Self) {
      
      inline def setA(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAbbr(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      inline def setBr(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setCode(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDel(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      inline def setEm(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setIns(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
      
      inline def setNumbersigntext(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = StObject.set(x, "#text", value.asInstanceOf[js.Any])
      
      inline def setS(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setStrong(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setSub(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSup(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
    }
  }
}
