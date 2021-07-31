package typings.through2Concurrent

import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Transform
import typings.through2.mod.FlushCallback
import typings.through2.mod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  @scala.inline
  def apply(opts: Unit, transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def apply(opts: Unit, transform: TransformFunction): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def apply(opts: Unit, transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def apply(opts: Through2ConcurrentOptions): Transform = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  @scala.inline
  def apply(opts: Through2ConcurrentOptions, transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def apply(opts: Through2ConcurrentOptions, transform: TransformFunction): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def apply(opts: Through2ConcurrentOptions, transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def apply(transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].apply(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def apply(transform: TransformFunction): Transform = ^.asInstanceOf[js.Dynamic].apply(transform.asInstanceOf[js.Any]).asInstanceOf[Transform]
  @scala.inline
  def apply(transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].apply(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  @JSImport("through2-concurrent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def obj(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")().asInstanceOf[Transform]
  @scala.inline
  def obj(opts: Unit, transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def obj(opts: Unit, transform: TransformFunction): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def obj(opts: Unit, transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def obj(opts: Through2ConcurrentOptions): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  @scala.inline
  def obj(opts: Through2ConcurrentOptions, transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def obj(opts: Through2ConcurrentOptions, transform: TransformFunction): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def obj(opts: Through2ConcurrentOptions, transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def obj(transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  @scala.inline
  def obj(transform: TransformFunction): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(transform.asInstanceOf[js.Any]).asInstanceOf[Transform]
  @scala.inline
  def obj(transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  trait Through2ConcurrentOptions
    extends StObject
       with DuplexOptions {
    
    var maxConcurrency: js.UndefOr[Double] = js.undefined
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
