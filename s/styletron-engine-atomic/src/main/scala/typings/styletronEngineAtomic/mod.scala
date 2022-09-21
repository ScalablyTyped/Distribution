package typings.styletronEngineAtomic

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.FontFace
import typings.std.HTMLCollectionOf
import typings.std.HTMLStyleElement
import typings.std.NodeListOf
import typings.styletronEngineAtomic.anon.Block
import typings.styletronStandard.mod.StandardEngine
import typings.styletronStandard.mod.StyleObject
import typings.styletronStandard.styleTypesMod.KeyframesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("styletron-engine-atomic", "Cache")
  @js.native
  open class Cache[T] protected () extends StObject {
    def this(
      idGenerator: SequentialIDGenerator,
      onNewValue: js.Function3[/* cache */ Cache[T], /* id */ String, /* value */ Any, Any]
    ) = this()
    
    def addValue(key: String, value: T): Double = js.native
    
    var cache: StringDictionary[String] = js.native
    
    var idGenerator: SequentialIDGenerator = js.native
    
    var key: String = js.native
    
    def onNewValue(cache: Cache[T], id: String, value: Any): Any = js.native
  }
  
  @JSImport("styletron-engine-atomic", "Client")
  @js.native
  open class Client ()
    extends StObject
       with StandardEngine {
    def this(opts: ClientOptions) = this()
    
    var fontFaceCache: Cache[FontFace] = js.native
    
    var fontFaceSheet: HTMLStyleElement = js.native
    
    var keyframesCache: Cache[KeyframesObject] = js.native
    
    var keyframesSheet: HTMLStyleElement = js.native
    
    def renderFontFace(fontFace: FontFace): String = js.native
    /* CompleteClass */
    override def renderFontFace(fontFace: typings.styletronStandard.styleTypesMod.FontFace): String = js.native
    
    /* CompleteClass */
    override def renderKeyframes(keyframes: KeyframesObject): String = js.native
    
    /* CompleteClass */
    override def renderStyle(style: StyleObject): String = js.native
    
    var styleCache: MultiCache[Block] = js.native
    
    var styleElements: StringDictionary[HTMLStyleElement] = js.native
  }
  
  @JSImport("styletron-engine-atomic", "MultiCache")
  @js.native
  open class MultiCache[T] protected () extends StObject {
    def this(idGenerator: SequentialIDGenerator, onNewCache: js.Function0[Any], onNewValue: js.Function0[Any]) = this()
    
    var caches: StringDictionary[Cache[T]] = js.native
    
    def getCache(key: String): Cache[T] = js.native
    
    def getSortedCacheKeys(): js.Array[String] = js.native
    
    var idGenerator: SequentialIDGenerator = js.native
    
    def onNewCache(key: String, cache: Cache[T], insertAtIndex: Double): Any = js.native
    
    def onNewValue(cache: Cache[T], id: String, value: T): Any = js.native
    
    var sortedCacheKeys: js.Array[String] = js.native
  }
  
  @JSImport("styletron-engine-atomic", "SequentialIDGenerator")
  @js.native
  open class SequentialIDGenerator protected () extends StObject {
    def this(prefix: String) = this()
    
    var count: Double = js.native
    
    def increment(): Double = js.native
    
    var msb: Double = js.native
    
    def next(): String = js.native
    
    var offset: Double = js.native
    
    var power: Double = js.native
    
    var prefix: String = js.native
  }
  
  @JSImport("styletron-engine-atomic", "Server")
  @js.native
  open class Server ()
    extends StObject
       with StandardEngine {
    def this(opts: ServerOptions) = this()
    
    var fontFaceRules: String = js.native
    
    def getCss(): String = js.native
    
    def getStylesheets(): js.Array[Sheet] = js.native
    
    def getStylesheetsHtml(): String = js.native
    def getStylesheetsHtml(className: String): String = js.native
    
    var keyframesRules: String = js.native
    
    def renderFontFace(fontFace: FontFace): String = js.native
    /* CompleteClass */
    override def renderFontFace(fontFace: typings.styletronStandard.styleTypesMod.FontFace): String = js.native
    
    /* CompleteClass */
    override def renderKeyframes(keyframes: KeyframesObject): String = js.native
    
    /* CompleteClass */
    override def renderStyle(style: StyleObject): String = js.native
    
    var styleRules: StringDictionary[String] = js.native
  }
  
  trait ClientOptions extends StObject {
    
    var container: js.UndefOr[Element] = js.undefined
    
    var hydrate: js.UndefOr[hydrateType] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setHydrate(value: hydrateType): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
      
      inline def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
      
      inline def setHydrateVarargs(value: HTMLStyleElement*): Self = StObject.set(x, "hydrate", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait ServerOptions extends StObject {
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    extension [Self <: ServerOptions](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait Sheet extends StObject {
    
    var attrs: StringDictionary[String]
    
    var css: String
  }
  object Sheet {
    
    inline def apply(attrs: StringDictionary[String], css: String): Sheet = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sheet]
    }
    
    extension [Self <: Sheet](x: Self) {
      
      inline def setAttrs(value: StringDictionary[String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    }
  }
  
  type hydrateType = HTMLCollectionOf[HTMLStyleElement] | js.Array[HTMLStyleElement] | NodeListOf[HTMLStyleElement]
}
