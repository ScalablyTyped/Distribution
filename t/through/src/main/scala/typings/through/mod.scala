package typings.through

import typings.node.streamMod.Transform
import typings.through.anon.AutoDestroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ThroughStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ThroughStream]
  inline def apply(write: js.Function1[/* data */ js.Any, Unit]): ThroughStream = ^.asInstanceOf[js.Dynamic].apply(write.asInstanceOf[js.Any]).asInstanceOf[ThroughStream]
  inline def apply(write: js.Function1[/* data */ js.Any, Unit], end: js.Function0[Unit]): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(write.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(write: js.Function1[/* data */ js.Any, Unit], end: js.Function0[Unit], opts: AutoDestroy): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(write.asInstanceOf[js.Any], end.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(write: js.Function1[/* data */ js.Any, Unit], end: Unit, opts: AutoDestroy): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(write.asInstanceOf[js.Any], end.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(write: Unit, end: js.Function0[Unit]): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(write.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(write: Unit, end: js.Function0[Unit], opts: AutoDestroy): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(write.asInstanceOf[js.Any], end.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  inline def apply(write: Unit, end: Unit, opts: AutoDestroy): ThroughStream = (^.asInstanceOf[js.Dynamic].apply(write.asInstanceOf[js.Any], end.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ThroughStream]
  
  @JSImport("through", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait ThroughStream extends Transform {
    
    var autoDestroy: Boolean = js.native
    
    def queue(chunk: js.Any): js.Any = js.native
  }
}
