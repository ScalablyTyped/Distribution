package typings.stylableCore

import typings.std.Record
import typings.stylableCore.anon.Mtime
import typings.stylableCore.stylableCoreStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cachedProcessFileMod {
  
  @JSImport("@stylable/core/cjs/cached-process-file", "cachedProcessFile")
  @js.native
  def cachedProcessFile[T](
    processor: processFn[T],
    fs: MinimalFS,
    resolvePath: js.Function2[/* path */ String, /* context */ js.UndefOr[String], String]
  ): FileProcessor[T] = js.native
  
  @js.native
  trait CacheItem[T] extends StObject {
    
    var stat: Mtime = js.native
    
    var value: T = js.native
  }
  object CacheItem {
    
    @scala.inline
    def apply[T](stat: Mtime, value: T): CacheItem[T] = {
      val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheItem[T]]
    }
    
    @scala.inline
    implicit class CacheItemMutableBuilder[Self <: CacheItem[_], T] (val x: Self with CacheItem[T]) extends AnyVal {
      
      @scala.inline
      def setStat(value: Mtime): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileProcessor[T] extends StObject {
    
    def add(fullpath: String, value: T): Unit = js.native
    
    var cache: Record[String, CacheItem[T]] = js.native
    
    var postProcessors: js.Array[js.Function2[/* value */ T, /* path */ String, T]] = js.native
    
    def process(fullpath: String): T = js.native
    def process(fullpath: String, ignoreCache: js.UndefOr[scala.Nothing], context: String): T = js.native
    def process(fullpath: String, ignoreCache: Boolean): T = js.native
    def process(fullpath: String, ignoreCache: Boolean, context: String): T = js.native
    
    def processContent(content: String, fullpath: String): T = js.native
    
    def resolvePath(path: String): String = js.native
    def resolvePath(path: String, context: String): String = js.native
  }
  
  @js.native
  trait MinimalFS extends StObject {
    
    @JSName("readFileSync")
    def readFileSync_utf8(fullpath: String, encoding: utf8): String = js.native
    
    def readlinkSync(path: String): String = js.native
    
    def statSync(fullpath: String): Mtime = js.native
  }
  object MinimalFS {
    
    @scala.inline
    def apply(readFileSync: (String, utf8) => String, readlinkSync: String => String, statSync: String => Mtime): MinimalFS = {
      val __obj = js.Dynamic.literal(readFileSync = js.Any.fromFunction2(readFileSync), readlinkSync = js.Any.fromFunction1(readlinkSync), statSync = js.Any.fromFunction1(statSync))
      __obj.asInstanceOf[MinimalFS]
    }
    
    @scala.inline
    implicit class MinimalFSMutableBuilder[Self <: MinimalFS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadFileSync(value: (String, utf8) => String): Self = StObject.set(x, "readFileSync", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReadlinkSync(value: String => String): Self = StObject.set(x, "readlinkSync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStatSync(value: String => Mtime): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
    }
  }
  
  type processFn[T] = js.Function2[/* fullpath */ String, /* content */ String, T]
}
