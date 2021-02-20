package typings.through2Concurrent

import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Transform
import typings.through2.mod.FlushCallback
import typings.through2.mod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("through2-concurrent", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("through2-concurrent", JSImport.Namespace)
  @js.native
  def apply(opts: js.UndefOr[scala.Nothing], transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Transform = js.native
  @JSImport("through2-concurrent", JSImport.Namespace)
  @js.native
  def apply(opts: js.UndefOr[scala.Nothing], transform: TransformFunction): Transform = js.native
  @JSImport("through2-concurrent", JSImport.Namespace)
  @js.native
  def apply(opts: js.UndefOr[scala.Nothing], transform: TransformFunction, flush: FlushCallback): Transform = js.native
  @JSImport("through2-concurrent", JSImport.Namespace)
  @js.native
  def apply(opts: Through2ConcurrentOptions): Transform = js.native
  @JSImport("through2-concurrent", JSImport.Namespace)
  @js.native
  def apply(opts: Through2ConcurrentOptions, transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Transform = js.native
  @JSImport("through2-concurrent", JSImport.Namespace)
  @js.native
  def apply(opts: Through2ConcurrentOptions, transform: TransformFunction): Transform = js.native
  @JSImport("through2-concurrent", JSImport.Namespace)
  @js.native
  def apply(opts: Through2ConcurrentOptions, transform: TransformFunction, flush: FlushCallback): Transform = js.native
  @JSImport("through2-concurrent", JSImport.Namespace)
  @js.native
  def apply(transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Transform = js.native
  @JSImport("through2-concurrent", JSImport.Namespace)
  @js.native
  def apply(transform: TransformFunction): Transform = js.native
  @JSImport("through2-concurrent", JSImport.Namespace)
  @js.native
  def apply(transform: TransformFunction, flush: FlushCallback): Transform = js.native
  
  @JSImport("through2-concurrent", "obj")
  @js.native
  def obj(): Transform = js.native
  @JSImport("through2-concurrent", "obj")
  @js.native
  def obj(opts: js.UndefOr[scala.Nothing], transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Transform = js.native
  @JSImport("through2-concurrent", "obj")
  @js.native
  def obj(opts: js.UndefOr[scala.Nothing], transform: TransformFunction): Transform = js.native
  @JSImport("through2-concurrent", "obj")
  @js.native
  def obj(opts: js.UndefOr[scala.Nothing], transform: TransformFunction, flush: FlushCallback): Transform = js.native
  @JSImport("through2-concurrent", "obj")
  @js.native
  def obj(opts: Through2ConcurrentOptions): Transform = js.native
  @JSImport("through2-concurrent", "obj")
  @js.native
  def obj(opts: Through2ConcurrentOptions, transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Transform = js.native
  @JSImport("through2-concurrent", "obj")
  @js.native
  def obj(opts: Through2ConcurrentOptions, transform: TransformFunction): Transform = js.native
  @JSImport("through2-concurrent", "obj")
  @js.native
  def obj(opts: Through2ConcurrentOptions, transform: TransformFunction, flush: FlushCallback): Transform = js.native
  @JSImport("through2-concurrent", "obj")
  @js.native
  def obj(transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Transform = js.native
  @JSImport("through2-concurrent", "obj")
  @js.native
  def obj(transform: TransformFunction): Transform = js.native
  @JSImport("through2-concurrent", "obj")
  @js.native
  def obj(transform: TransformFunction, flush: FlushCallback): Transform = js.native
  
  @js.native
  trait Through2ConcurrentOptions extends DuplexOptions {
    
    var maxConcurrency: js.UndefOr[Double] = js.native
  }
  object Through2ConcurrentOptions {
    
    @scala.inline
    def apply(): Through2ConcurrentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Through2ConcurrentOptions]
    }
    
    @scala.inline
    implicit class Through2ConcurrentOptionsMutableBuilder[Self <: Through2ConcurrentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
    }
  }
}
