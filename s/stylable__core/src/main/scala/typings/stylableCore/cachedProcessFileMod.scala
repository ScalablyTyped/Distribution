package typings.stylableCore

import typings.std.Record
import typings.stylableCore.anon.Mtime
import typings.stylableCore.stylableCoreStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cachedProcessFileMod {
  
  @JSImport("@stylable/core/cjs/cached-process-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cachedProcessFile[T](
    processor: processFn[T],
    fs: MinimalFS,
    resolvePath: js.Function2[/* path */ String, /* context */ js.UndefOr[String], String]
  ): FileProcessor[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cachedProcessFile")(processor.asInstanceOf[js.Any], fs.asInstanceOf[js.Any], resolvePath.asInstanceOf[js.Any])).asInstanceOf[FileProcessor[T]]
  
  trait CacheItem[T] extends StObject {
    
    var stat: Mtime
    
    var value: T
  }
  object CacheItem {
    
    inline def apply[T](stat: Mtime, value: T): CacheItem[T] = {
      val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheItem[T]]
    }
    
    extension [Self <: CacheItem[?], T](x: Self & CacheItem[T]) {
      
      inline def setStat(value: Mtime): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileProcessor[T] extends StObject {
    
    def add(fullpath: String, value: T): Unit = js.native
    
    var cache: Record[String, CacheItem[T]] = js.native
    
    var postProcessors: js.Array[js.Function2[/* value */ T, /* path */ String, T]] = js.native
    
    def process(fullpath: String): T = js.native
    def process(fullpath: String, ignoreCache: Boolean): T = js.native
    def process(fullpath: String, ignoreCache: Boolean, context: String): T = js.native
    def process(fullpath: String, ignoreCache: Unit, context: String): T = js.native
    
    def processContent(content: String, fullpath: String): T = js.native
    
    def resolvePath(path: String): String = js.native
    def resolvePath(path: String, context: String): String = js.native
  }
  
  trait MinimalFS extends StObject {
    
    @JSName("readFileSync")
    def readFileSync_utf8(fullpath: String, encoding: utf8): String
    
    def readlinkSync(path: String): String
    
    def statSync(fullpath: String): Mtime
  }
  object MinimalFS {
    
    inline def apply(readFileSync: (String, utf8) => String, readlinkSync: String => String, statSync: String => Mtime): MinimalFS = {
      val __obj = js.Dynamic.literal(readFileSync = js.Any.fromFunction2(readFileSync), readlinkSync = js.Any.fromFunction1(readlinkSync), statSync = js.Any.fromFunction1(statSync))
      __obj.asInstanceOf[MinimalFS]
    }
    
    extension [Self <: MinimalFS](x: Self) {
      
      inline def setReadFileSync(value: (String, utf8) => String): Self = StObject.set(x, "readFileSync", js.Any.fromFunction2(value))
      
      inline def setReadlinkSync(value: String => String): Self = StObject.set(x, "readlinkSync", js.Any.fromFunction1(value))
      
      inline def setStatSync(value: String => Mtime): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
    }
  }
  
  type processFn[T] = js.Function2[/* fullpath */ String, /* content */ String, T]
}
