package typings.tape

import typings.std.ReturnType
import typings.tape.mod.TestCase
import typings.tape.mod.TestOptions
import typings.through.anon.AutoDestroy
import typings.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Autoclose extends StObject {
    
    var autoclose: js.UndefOr[Boolean] = js.undefined
    
    var noOnly: js.UndefOr[Boolean] = js.undefined
  }
  object Autoclose {
    
    inline def apply(): Autoclose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Autoclose]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Autoclose] (val x: Self) extends AnyVal {
      
      inline def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
      
      inline def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
      
      inline def setNoOnly(value: Boolean): Self = StObject.set(x, "noOnly", value.asInstanceOf[js.Any])
      
      inline def setNoOnlyUndefined: Self = StObject.set(x, "noOnly", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(cb: TestCase): Unit = js.native
    def apply(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
    def apply(opts: TestOptions, cb: TestCase): Unit = js.native
  }
  
  @js.native
  trait FnCallWriteEndOpts extends StObject {
    
    def apply(): ThroughStream = js.native
    def apply(write: js.Function1[/* data */ Any, Unit]): ThroughStream = js.native
    def apply(write: js.Function1[/* data */ Any, Unit], end: js.Function0[Unit]): ThroughStream = js.native
    def apply(write: js.Function1[/* data */ Any, Unit], end: js.Function0[Unit], opts: AutoDestroy): ThroughStream = js.native
    def apply(write: js.Function1[/* data */ Any, Unit], end: Unit, opts: AutoDestroy): ThroughStream = js.native
    def apply(write: Unit, end: js.Function0[Unit]): ThroughStream = js.native
    def apply(write: Unit, end: js.Function0[Unit], opts: AutoDestroy): ThroughStream = js.native
    def apply(write: Unit, end: Unit, opts: AutoDestroy): ThroughStream = js.native
  }
  
  /* Inlined {  noOnly :boolean | undefined,   exit :boolean | undefined,   stream :std.ReturnType<{None (write : undefined, end : undefined, opts : through.anon.AutoDestroy): through.through.ThroughStream, None (write : (data : any): void, end : undefined, opts : through.anon.AutoDestroy): through.through.ThroughStream, None (write : undefined, end : (): void, opts : through.anon.AutoDestroy): through.through.ThroughStream, None (write : (data : any): void, end : (): void, opts : through.anon.AutoDestroy): through.through.ThroughStream, None (write : undefined, end : (): void): through.through.ThroughStream, None (write : (data : any): void, end : (): void): through.through.ThroughStream, None (write : (data : any): void): through.through.ThroughStream, None (): through.through.ThroughStream}> | undefined} & tape.tape.StreamOptions */
  trait noOnlybooleanundefinedexi extends StObject {
    
    var exit: js.UndefOr[Boolean] = js.undefined
    
    var noOnly: js.UndefOr[Boolean] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    var stream: js.UndefOr[ReturnType[FnCallWriteEndOpts]] = js.undefined
  }
  object noOnlybooleanundefinedexi {
    
    inline def apply(): noOnlybooleanundefinedexi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[noOnlybooleanundefinedexi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: noOnlybooleanundefinedexi] (val x: Self) extends AnyVal {
      
      inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setNoOnly(value: Boolean): Self = StObject.set(x, "noOnly", value.asInstanceOf[js.Any])
      
      inline def setNoOnlyUndefined: Self = StObject.set(x, "noOnly", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setStream(value: ReturnType[FnCallWriteEndOpts]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
}
