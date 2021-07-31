package typings.v8ToIstanbul

import typings.sourceMap.mod.RawSourceMap
import typings.v8ToIstanbul.mod.Sources
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait OriginalSource
    extends StObject
       with Sources {
    
    var originalSource: String
    
    var source: String
    
    var sourceMap: Sourcemap
  }
  object OriginalSource {
    
    @scala.inline
    def apply(originalSource: String, source: String, sourceMap: Sourcemap): OriginalSource = {
      val __obj = js.Dynamic.literal(originalSource = originalSource.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalSource]
    }
    
    @scala.inline
    implicit class OriginalSourceMutableBuilder[Self <: OriginalSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalSource(value: String): Self = StObject.set(x, "originalSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMap(value: Sourcemap): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait Source
    extends StObject
       with Sources {
    
    var source: String
  }
  object Source {
    
    @scala.inline
    def apply(source: String): Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sourcemap extends StObject {
    
    var sourcemap: RawSourceMap
  }
  object Sourcemap {
    
    @scala.inline
    def apply(sourcemap: RawSourceMap): Sourcemap = {
      val __obj = js.Dynamic.literal(sourcemap = sourcemap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sourcemap]
    }
    
    @scala.inline
    implicit class SourcemapMutableBuilder[Self <: Sourcemap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourcemap(value: RawSourceMap): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    }
  }
}
