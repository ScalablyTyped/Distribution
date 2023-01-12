package typings.v8ToIstanbul

import typings.istanbulLibCoverage.mod.CoverageMapData
import typings.node.inspectorMod.Profiler.FunctionCoverage
import typings.v8ToIstanbul.anon.Sourcemap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(scriptPath: String): V8ToIstanbul = ^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any]).asInstanceOf[V8ToIstanbul]
  inline def apply(scriptPath: String, wrapperLength: Double): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  inline def apply(
    scriptPath: String,
    wrapperLength: Double,
    sources: Unit,
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], excludePath.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  inline def apply(scriptPath: String, wrapperLength: Double, sources: Sources): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  inline def apply(
    scriptPath: String,
    wrapperLength: Double,
    sources: Sources,
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], excludePath.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  inline def apply(
    scriptPath: String,
    wrapperLength: Unit,
    sources: Unit,
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], excludePath.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  inline def apply(scriptPath: String, wrapperLength: Unit, sources: Sources): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  inline def apply(
    scriptPath: String,
    wrapperLength: Unit,
    sources: Sources,
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = (^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any], wrapperLength.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], excludePath.asInstanceOf[js.Any])).asInstanceOf[V8ToIstanbul]
  
  @JSImport("v8-to-istanbul", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.v8ToIstanbul.anon.Source
    - typings.v8ToIstanbul.anon.OriginalSource
  */
  trait Sources extends StObject
  object Sources {
    
    inline def OriginalSource(originalSource: String, source: String, sourceMap: Sourcemap): typings.v8ToIstanbul.anon.OriginalSource = {
      val __obj = js.Dynamic.literal(originalSource = originalSource.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.v8ToIstanbul.anon.OriginalSource]
    }
    
    inline def Source(source: String): typings.v8ToIstanbul.anon.Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.v8ToIstanbul.anon.Source]
    }
  }
  
  trait V8ToIstanbul extends StObject {
    
    def applyCoverage(blocks: js.Array[FunctionCoverage]): Unit
    
    def destroy(): Unit
    
    def load(): js.Promise[Unit]
    
    def toIstanbul(): CoverageMapData
  }
  object V8ToIstanbul {
    
    inline def apply(
      applyCoverage: js.Array[FunctionCoverage] => Unit,
      destroy: () => Unit,
      load: () => js.Promise[Unit],
      toIstanbul: () => CoverageMapData
    ): V8ToIstanbul = {
      val __obj = js.Dynamic.literal(applyCoverage = js.Any.fromFunction1(applyCoverage), destroy = js.Any.fromFunction0(destroy), load = js.Any.fromFunction0(load), toIstanbul = js.Any.fromFunction0(toIstanbul))
      __obj.asInstanceOf[V8ToIstanbul]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: V8ToIstanbul] (val x: Self) extends AnyVal {
      
      inline def setApplyCoverage(value: js.Array[FunctionCoverage] => Unit): Self = StObject.set(x, "applyCoverage", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setLoad(value: () => js.Promise[Unit]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      inline def setToIstanbul(value: () => CoverageMapData): Self = StObject.set(x, "toIstanbul", js.Any.fromFunction0(value))
    }
  }
}
