package typings.through2

import typings.node.BufferEncoding
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(opts: Unit, transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(opts: Unit, transform: TransformFunction): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(opts: Unit, transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(opts: DuplexOptions): Transform = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(opts: DuplexOptions, transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(opts: DuplexOptions, transform: TransformFunction): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(opts: DuplexOptions, transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].apply(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def apply(transform: TransformFunction): Transform = ^.asInstanceOf[js.Dynamic].apply(transform.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def apply(transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].apply(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  @JSImport("through2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a constructor for a custom Transform. This is useful when you
    * want to use the same transform logic in multiple instances.
    */
  inline def ctor(): Through2Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("ctor")().asInstanceOf[Through2Constructor]
  inline def ctor(opts: Unit, transform: Unit, flush: FlushCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  inline def ctor(opts: Unit, transform: TransformFunction): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  inline def ctor(opts: Unit, transform: TransformFunction, flush: FlushCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  inline def ctor(opts: DuplexOptions): Through2Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(opts.asInstanceOf[js.Any]).asInstanceOf[Through2Constructor]
  inline def ctor(opts: DuplexOptions, transform: Unit, flush: FlushCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  inline def ctor(opts: DuplexOptions, transform: TransformFunction): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  inline def ctor(opts: DuplexOptions, transform: TransformFunction, flush: FlushCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(opts.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  inline def ctor(transform: Unit, flush: FlushCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  inline def ctor(transform: TransformFunction): Through2Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(transform.asInstanceOf[js.Any]).asInstanceOf[Through2Constructor]
  inline def ctor(transform: TransformFunction, flush: FlushCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  
  /**
    * Convenvience method for creating object streams
    */
  inline def obj(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")().asInstanceOf[Transform]
  inline def obj(transform: Unit, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  inline def obj(transform: TransformFunction): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(transform.asInstanceOf[js.Any]).asInstanceOf[Transform]
  inline def obj(transform: TransformFunction, flush: FlushCallback): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(transform.asInstanceOf[js.Any], flush.asInstanceOf[js.Any])).asInstanceOf[Transform]
  
  type FlushCallback = js.ThisFunction1[/* this */ Transform, /* flushCallback */ js.Function0[Unit], Unit]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable0 because Inheritance from two classes. Inlined  */ @js.native
  trait Through2Constructor extends Transform {
    
    def apply(): Transform = js.native
    def apply(opts: DuplexOptions): Transform = js.native
  }
  
  type TransformCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any], Unit]
  
  type TransformFunction = js.ThisFunction3[
    /* this */ Transform, 
    /* chunk */ js.Any, 
    /* enc */ BufferEncoding, 
    /* callback */ TransformCallback, 
    Unit
  ]
}
