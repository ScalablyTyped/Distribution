package typings.styletronEngineAtomic

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.HTMLCollectionOf
import typings.std.HTMLStyleElement
import typings.std.NodeListOf
import typings.styletronEngineAtomic.anon.Block
import typings.styletronStandard.mod.FontFace
import typings.styletronStandard.mod.KeyframesObject
import typings.styletronStandard.mod.StandardEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("styletron-engine-atomic", "Cache")
  @js.native
  class Cache[T] protected () extends StObject {
    def this(
      idGenerator: SequentialIDGenerator,
      onNewValue: js.Function3[/* cache */ Cache[T], /* id */ String, /* value */ js.Any, _]
    ) = this()
    
    def addValue(key: String, value: T): Double = js.native
    
    var cache: StringDictionary[String] = js.native
    
    var idGenerator: SequentialIDGenerator = js.native
    
    var key: String = js.native
    
    def onNewValue(cache: Cache[T], id: String, value: js.Any): js.Any = js.native
  }
  
  @JSImport("styletron-engine-atomic", "Client")
  @js.native
  class Client () extends StandardEngine {
    def this(opts: ClientOptions) = this()
    
    var fontFaceCache: Cache[FontFace] = js.native
    
    var fontFaceSheet: HTMLStyleElement = js.native
    
    var keyframesCache: Cache[KeyframesObject] = js.native
    
    var keyframesSheet: HTMLStyleElement = js.native
    
    var styleCache: MultiCache[Block] = js.native
    
    var styleElements: StringDictionary[HTMLStyleElement] = js.native
  }
  
  @JSImport("styletron-engine-atomic", "MultiCache")
  @js.native
  class MultiCache[T] protected () extends StObject {
    def this(idGenerator: SequentialIDGenerator, onNewCache: js.Function0[_], onNewValue: js.Function0[_]) = this()
    
    var caches: StringDictionary[Cache[T]] = js.native
    
    def getCache(key: String): Cache[T] = js.native
    
    def getSortedCacheKeys(): js.Array[String] = js.native
    
    var idGenerator: SequentialIDGenerator = js.native
    
    def onNewCache(key: String, cache: Cache[T], insertAtIndex: Double): js.Any = js.native
    
    def onNewValue(cache: Cache[T], id: String, value: T): js.Any = js.native
    
    var sortedCacheKeys: js.Array[String] = js.native
  }
  
  @JSImport("styletron-engine-atomic", "SequentialIDGenerator")
  @js.native
  class SequentialIDGenerator protected () extends StObject {
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
  class Server () extends StandardEngine {
    def this(opts: ServerOptions) = this()
    
    var fontFaceRules: String = js.native
    
    def getCss(): String = js.native
    
    def getStylesheets(): js.Array[Sheet] = js.native
    
    def getStylesheetsHtml(): String = js.native
    def getStylesheetsHtml(className: String): String = js.native
    
    var keyframesRules: String = js.native
    
    var styleRules: StringDictionary[String] = js.native
  }
  
  @js.native
  trait ClientOptions extends StObject {
    
    var container: js.UndefOr[Element] = js.native
    
    var hydrate: js.UndefOr[hydrateType] = js.native
    
    var prefix: js.UndefOr[String] = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setHydrate(value: hydrateType): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
      
      @scala.inline
      def setHydrateVarargs(value: HTMLStyleElement*): Self = StObject.set(x, "hydrate", js.Array(value :_*))
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  @js.native
  trait ServerOptions extends StObject {
    
    var prefix: js.UndefOr[String] = js.native
  }
  object ServerOptions {
    
    @scala.inline
    def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    @scala.inline
    implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  @js.native
  trait Sheet extends StObject {
    
    var attrs: StringDictionary[String] = js.native
    
    var css: String = js.native
  }
  object Sheet {
    
    @scala.inline
    def apply(attrs: StringDictionary[String], css: String): Sheet = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sheet]
    }
    
    @scala.inline
    implicit class SheetMutableBuilder[Self <: Sheet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: StringDictionary[String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    }
  }
  
  type hydrateType = HTMLCollectionOf[HTMLStyleElement] | js.Array[HTMLStyleElement] | NodeListOf[HTMLStyleElement]
}
