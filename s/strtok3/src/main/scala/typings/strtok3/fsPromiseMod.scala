package typings.strtok3

import typings.node.Buffer
import typings.node.anon.AutoClose
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadStream
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsPromiseMod {
  
  @JSImport("strtok3/lib/FsPromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def close(fd: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def createReadStream(path: PathLike): ReadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[ReadStream]
  inline def createReadStream(path: PathLike, options: String): ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadStream]
  inline def createReadStream(path: PathLike, options: AutoClose): ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadStream]
  
  inline def open(path: PathLike): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def open(path: PathLike, mode: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @JSImport("strtok3/lib/FsPromise", "pathExists")
  @js.native
  val pathExists: js.Function1[/* path */ PathLike, Boolean] = js.native
  
  inline def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[IReadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IReadResult]]
  
  inline def readFile(path: PathLike): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def stat(path: PathLike): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
  
  inline def writeFile(path: PathLike, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(path: PathLike, data: Buffer): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeFileSync(path: PathLike, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(path: PathLike, data: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IReadResult extends StObject {
    
    var buffer: Buffer
    
    var bytesRead: Double
  }
  object IReadResult {
    
    inline def apply(buffer: Buffer, bytesRead: Double): IReadResult = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReadResult]
    }
    
    extension [Self <: IReadResult](x: Self) {
      
      inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    }
  }
}
