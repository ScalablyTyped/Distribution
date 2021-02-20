package typings.v8ToIstanbul

import typings.istanbulLibCoverage.mod.CoverageMapData
import typings.node.inspectorMod.Profiler.FunctionCoverage
import typings.v8ToIstanbul.anon.Sourcemap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("v8-to-istanbul", JSImport.Namespace)
  @js.native
  def apply(scriptPath: String): V8ToIstanbul = js.native
  @JSImport("v8-to-istanbul", JSImport.Namespace)
  @js.native
  def apply(
    scriptPath: String,
    wrapperLength: js.UndefOr[scala.Nothing],
    sources: js.UndefOr[scala.Nothing],
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = js.native
  @JSImport("v8-to-istanbul", JSImport.Namespace)
  @js.native
  def apply(scriptPath: String, wrapperLength: js.UndefOr[scala.Nothing], sources: Sources): V8ToIstanbul = js.native
  @JSImport("v8-to-istanbul", JSImport.Namespace)
  @js.native
  def apply(
    scriptPath: String,
    wrapperLength: js.UndefOr[scala.Nothing],
    sources: Sources,
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = js.native
  @JSImport("v8-to-istanbul", JSImport.Namespace)
  @js.native
  def apply(scriptPath: String, wrapperLength: Double): V8ToIstanbul = js.native
  @JSImport("v8-to-istanbul", JSImport.Namespace)
  @js.native
  def apply(
    scriptPath: String,
    wrapperLength: Double,
    sources: js.UndefOr[scala.Nothing],
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = js.native
  @JSImport("v8-to-istanbul", JSImport.Namespace)
  @js.native
  def apply(scriptPath: String, wrapperLength: Double, sources: Sources): V8ToIstanbul = js.native
  @JSImport("v8-to-istanbul", JSImport.Namespace)
  @js.native
  def apply(
    scriptPath: String,
    wrapperLength: Double,
    sources: Sources,
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.v8ToIstanbul.anon.Source
    - typings.v8ToIstanbul.anon.OriginalSource
  */
  trait Sources extends StObject
  object Sources {
    
    @scala.inline
    def OriginalSource(originalSource: String, source: String, sourceMap: Sourcemap): typings.v8ToIstanbul.anon.OriginalSource = {
      val __obj = js.Dynamic.literal(originalSource = originalSource.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.v8ToIstanbul.anon.OriginalSource]
    }
    
    @scala.inline
    def Source(source: String): typings.v8ToIstanbul.anon.Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.v8ToIstanbul.anon.Source]
    }
  }
  
  @js.native
  trait V8ToIstanbul extends StObject {
    
    def applyCoverage(blocks: js.Array[FunctionCoverage]): Unit = js.native
    
    def load(): js.Promise[Unit] = js.native
    
    def toIstanbul(): CoverageMapData = js.native
  }
  object V8ToIstanbul {
    
    @scala.inline
    def apply(
      applyCoverage: js.Array[FunctionCoverage] => Unit,
      load: () => js.Promise[Unit],
      toIstanbul: () => CoverageMapData
    ): V8ToIstanbul = {
      val __obj = js.Dynamic.literal(applyCoverage = js.Any.fromFunction1(applyCoverage), load = js.Any.fromFunction0(load), toIstanbul = js.Any.fromFunction0(toIstanbul))
      __obj.asInstanceOf[V8ToIstanbul]
    }
    
    @scala.inline
    implicit class V8ToIstanbulMutableBuilder[Self <: V8ToIstanbul] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyCoverage(value: js.Array[FunctionCoverage] => Unit): Self = StObject.set(x, "applyCoverage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoad(value: () => js.Promise[Unit]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToIstanbul(value: () => CoverageMapData): Self = StObject.set(x, "toIstanbul", js.Any.fromFunction0(value))
    }
  }
}
