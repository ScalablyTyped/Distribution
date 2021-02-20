package typings.strtok3

import typings.node.Buffer
import typings.node.anon.AutoClose
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadStream
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsPromiseMod {
  
  @JSImport("strtok3/lib/FsPromise", "close")
  @js.native
  def close(fd: Double): js.Promise[Unit] = js.native
  
  @JSImport("strtok3/lib/FsPromise", "createReadStream")
  @js.native
  def createReadStream(path: PathLike): ReadStream = js.native
  @JSImport("strtok3/lib/FsPromise", "createReadStream")
  @js.native
  def createReadStream(path: PathLike, options: String): ReadStream = js.native
  @JSImport("strtok3/lib/FsPromise", "createReadStream")
  @js.native
  def createReadStream(path: PathLike, options: AutoClose): ReadStream = js.native
  
  @JSImport("strtok3/lib/FsPromise", "open")
  @js.native
  def open(path: PathLike): js.Promise[Double] = js.native
  @JSImport("strtok3/lib/FsPromise", "open")
  @js.native
  def open(path: PathLike, mode: String): js.Promise[Double] = js.native
  
  @JSImport("strtok3/lib/FsPromise", "pathExists")
  @js.native
  val pathExists: js.Function1[/* path */ PathLike, Boolean] = js.native
  
  @JSImport("strtok3/lib/FsPromise", "read")
  @js.native
  def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[IReadResult] = js.native
  
  @JSImport("strtok3/lib/FsPromise", "readFile")
  @js.native
  def readFile(path: PathLike): js.Promise[Buffer] = js.native
  
  @JSImport("strtok3/lib/FsPromise", "stat")
  @js.native
  def stat(path: PathLike): js.Promise[Stats] = js.native
  
  @JSImport("strtok3/lib/FsPromise", "writeFile")
  @js.native
  def writeFile(path: PathLike, data: String): js.Promise[Unit] = js.native
  @JSImport("strtok3/lib/FsPromise", "writeFile")
  @js.native
  def writeFile(path: PathLike, data: Buffer): js.Promise[Unit] = js.native
  
  @JSImport("strtok3/lib/FsPromise", "writeFileSync")
  @js.native
  def writeFileSync(path: PathLike, data: String): Unit = js.native
  @JSImport("strtok3/lib/FsPromise", "writeFileSync")
  @js.native
  def writeFileSync(path: PathLike, data: Buffer): Unit = js.native
  
  @js.native
  trait IReadResult extends StObject {
    
    var buffer: Buffer = js.native
    
    var bytesRead: Double = js.native
  }
  object IReadResult {
    
    @scala.inline
    def apply(buffer: Buffer, bytesRead: Double): IReadResult = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReadResult]
    }
    
    @scala.inline
    implicit class IReadResultMutableBuilder[Self <: IReadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    }
  }
}
