package typings.writeFileAtomic

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.std.Error
import typings.writeFileAtomic.anon.Gid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("write-file-atomic", JSImport.Namespace)
  @js.native
  def apply(filename: String, data: String): js.Promise[Unit] = js.native
  @JSImport("write-file-atomic", JSImport.Namespace)
  @js.native
  def apply(filename: String, data: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  @JSImport("write-file-atomic", JSImport.Namespace)
  @js.native
  def apply(filename: String, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
  @JSImport("write-file-atomic", JSImport.Namespace)
  @js.native
  def apply(
    filename: String,
    data: String,
    options: BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  @JSImport("write-file-atomic", JSImport.Namespace)
  @js.native
  def apply(filename: String, data: String, options: Options): js.Promise[Unit] = js.native
  @JSImport("write-file-atomic", JSImport.Namespace)
  @js.native
  def apply(
    filename: String,
    data: String,
    options: Options,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  @JSImport("write-file-atomic", JSImport.Namespace)
  @js.native
  def apply(filename: String, data: Buffer): js.Promise[Unit] = js.native
  @JSImport("write-file-atomic", JSImport.Namespace)
  @js.native
  def apply(filename: String, data: Buffer, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  @JSImport("write-file-atomic", JSImport.Namespace)
  @js.native
  def apply(filename: String, data: Buffer, options: BufferEncoding): js.Promise[Unit] = js.native
  @JSImport("write-file-atomic", JSImport.Namespace)
  @js.native
  def apply(
    filename: String,
    data: Buffer,
    options: BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  @JSImport("write-file-atomic", JSImport.Namespace)
  @js.native
  def apply(filename: String, data: Buffer, options: Options): js.Promise[Unit] = js.native
  @JSImport("write-file-atomic", JSImport.Namespace)
  @js.native
  def apply(
    filename: String,
    data: Buffer,
    options: Options,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  
  @JSImport("write-file-atomic", "sync")
  @js.native
  def sync(filename: String, data: String): Unit = js.native
  @JSImport("write-file-atomic", "sync")
  @js.native
  def sync(filename: String, data: String, options: BufferEncoding): Unit = js.native
  @JSImport("write-file-atomic", "sync")
  @js.native
  def sync(filename: String, data: String, options: Options): Unit = js.native
  @JSImport("write-file-atomic", "sync")
  @js.native
  def sync(filename: String, data: Buffer): Unit = js.native
  @JSImport("write-file-atomic", "sync")
  @js.native
  def sync(filename: String, data: Buffer, options: BufferEncoding): Unit = js.native
  @JSImport("write-file-atomic", "sync")
  @js.native
  def sync(filename: String, data: Buffer, options: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var chown: js.UndefOr[Gid] = js.native
    
    /**
      * @default 'utf8'
      */
    var encoding: js.UndefOr[BufferEncoding] = js.native
    
    var fsync: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChown(value: Gid): Self = StObject.set(x, "chown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChownUndefined: Self = StObject.set(x, "chown", js.undefined)
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsyncUndefined: Self = StObject.set(x, "fsync", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
