package typings.writeFileAtomic

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.writeFileAtomic.anon.Gid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filename: String, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(filename: String, data: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(filename: String, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    filename: String,
    data: String,
    options: BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(filename: String, data: String, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    filename: String,
    data: String,
    options: Options,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(filename: String, data: Buffer): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(filename: String, data: Buffer, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(filename: String, data: Buffer, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    filename: String,
    data: Buffer,
    options: BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(filename: String, data: Buffer, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(
    filename: String,
    data: Buffer,
    options: Options,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("write-file-atomic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(filename: String, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sync(filename: String, data: String, options: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sync(filename: String, data: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sync(filename: String, data: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sync(filename: String, data: Buffer, options: BufferEncoding): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sync(filename: String, data: Buffer, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var chown: js.UndefOr[Gid] = js.undefined
    
    /**
      * @default 'utf8'
      */
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var fsync: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var tmpfileCreated: js.UndefOr[js.Function1[/* tmpfile */ String, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setChown(value: Gid): Self = StObject.set(x, "chown", value.asInstanceOf[js.Any])
      
      inline def setChownUndefined: Self = StObject.set(x, "chown", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
      
      inline def setFsyncUndefined: Self = StObject.set(x, "fsync", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTmpfileCreated(value: /* tmpfile */ String => Unit): Self = StObject.set(x, "tmpfileCreated", js.Any.fromFunction1(value))
      
      inline def setTmpfileCreatedUndefined: Self = StObject.set(x, "tmpfileCreated", js.undefined)
    }
  }
}
