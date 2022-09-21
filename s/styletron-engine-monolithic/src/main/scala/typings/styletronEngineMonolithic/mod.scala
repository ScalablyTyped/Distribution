package typings.styletronEngineMonolithic

import org.scalablytyped.runtime.StringDictionary
import typings.std.FontFace
import typings.std.HTMLCollectionOf
import typings.std.HTMLStyleElement
import typings.std.NodeListOf
import typings.styletronEngineMonolithic.anon.Block
import typings.styletronStandard.mod.StandardEngine
import typings.styletronStandard.mod.StyleObject
import typings.styletronStandard.styleTypesMod.KeyframesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("styletron-engine-monolithic", "Client")
  @js.native
  open class Client ()
    extends StObject
       with StandardEngine {
    
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
  
  @JSImport("styletron-engine-monolithic", "Server")
  @js.native
  open class Server ()
    extends StObject
       with StandardEngine {
    
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
  
  trait Cache[T] extends StObject {
    
    def addValue(key: String, value: T): Double
    
    var cache: StringDictionary[String]
    
    var idGenerator: SequentialIDGenerator
    
    var key: String
    
    def onNewValue(cache: Cache[T], id: String, value: Any): Any
  }
  object Cache {
    
    inline def apply[T](
      addValue: (String, T) => Double,
      cache: StringDictionary[String],
      idGenerator: SequentialIDGenerator,
      key: String,
      onNewValue: (Cache[T], String, Any) => Any
    ): Cache[T] = {
      val __obj = js.Dynamic.literal(addValue = js.Any.fromFunction2(addValue), cache = cache.asInstanceOf[js.Any], idGenerator = idGenerator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onNewValue = js.Any.fromFunction3(onNewValue))
      __obj.asInstanceOf[Cache[T]]
    }
    
    extension [Self <: Cache[?], T](x: Self & Cache[T]) {
      
      inline def setAddValue(value: (String, T) => Double): Self = StObject.set(x, "addValue", js.Any.fromFunction2(value))
      
      inline def setCache(value: StringDictionary[String]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setIdGenerator(value: SequentialIDGenerator): Self = StObject.set(x, "idGenerator", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOnNewValue(value: (Cache[T], String, Any) => Any): Self = StObject.set(x, "onNewValue", js.Any.fromFunction3(value))
    }
  }
  
  type HydrateType = HTMLCollectionOf[HTMLStyleElement] | js.Array[HTMLStyleElement] | NodeListOf[HTMLStyleElement]
  
  trait MultiCache[T] extends StObject {
    
    var caches: StringDictionary[Cache[T]]
    
    def getCache(key: String): Cache[T]
    
    def getSortedCacheKeys(): js.Array[String]
    
    var idGenerator: SequentialIDGenerator
    
    def onNewCache(key: String, cache: Cache[T], insertAtIndex: Double): Any
    
    def onNewValue(cache: Cache[T], id: String, value: T): Any
    
    var sortedCacheKeys: js.Array[String]
  }
  object MultiCache {
    
    inline def apply[T](
      caches: StringDictionary[Cache[T]],
      getCache: String => Cache[T],
      getSortedCacheKeys: () => js.Array[String],
      idGenerator: SequentialIDGenerator,
      onNewCache: (String, Cache[T], Double) => Any,
      onNewValue: (Cache[T], String, T) => Any,
      sortedCacheKeys: js.Array[String]
    ): MultiCache[T] = {
      val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any], getCache = js.Any.fromFunction1(getCache), getSortedCacheKeys = js.Any.fromFunction0(getSortedCacheKeys), idGenerator = idGenerator.asInstanceOf[js.Any], onNewCache = js.Any.fromFunction3(onNewCache), onNewValue = js.Any.fromFunction3(onNewValue), sortedCacheKeys = sortedCacheKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiCache[T]]
    }
    
    extension [Self <: MultiCache[?], T](x: Self & MultiCache[T]) {
      
      inline def setCaches(value: StringDictionary[Cache[T]]): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      inline def setGetCache(value: String => Cache[T]): Self = StObject.set(x, "getCache", js.Any.fromFunction1(value))
      
      inline def setGetSortedCacheKeys(value: () => js.Array[String]): Self = StObject.set(x, "getSortedCacheKeys", js.Any.fromFunction0(value))
      
      inline def setIdGenerator(value: SequentialIDGenerator): Self = StObject.set(x, "idGenerator", value.asInstanceOf[js.Any])
      
      inline def setOnNewCache(value: (String, Cache[T], Double) => Any): Self = StObject.set(x, "onNewCache", js.Any.fromFunction3(value))
      
      inline def setOnNewValue(value: (Cache[T], String, T) => Any): Self = StObject.set(x, "onNewValue", js.Any.fromFunction3(value))
      
      inline def setSortedCacheKeys(value: js.Array[String]): Self = StObject.set(x, "sortedCacheKeys", value.asInstanceOf[js.Any])
      
      inline def setSortedCacheKeysVarargs(value: String*): Self = StObject.set(x, "sortedCacheKeys", js.Array(value*))
    }
  }
  
  trait SequentialIDGenerator extends StObject {
    
    var count: Double
    
    def increment(): Double
    
    var msb: Double
    
    def next(): String
    
    var offset: Double
    
    var power: Double
    
    var prefix: String
  }
  object SequentialIDGenerator {
    
    inline def apply(
      count: Double,
      increment: () => Double,
      msb: Double,
      next: () => String,
      offset: Double,
      power: Double,
      prefix: String
    ): SequentialIDGenerator = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], increment = js.Any.fromFunction0(increment), msb = msb.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), offset = offset.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[SequentialIDGenerator]
    }
    
    extension [Self <: SequentialIDGenerator](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setIncrement(value: () => Double): Self = StObject.set(x, "increment", js.Any.fromFunction0(value))
      
      inline def setMsb(value: Double): Self = StObject.set(x, "msb", value.asInstanceOf[js.Any])
      
      inline def setNext(value: () => String): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
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
}
