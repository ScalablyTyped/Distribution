package typings.writeFileAtomic.mod

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("write-file-atomic", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(filename: String, data: String): js.Promise[Unit] = js.native
  def apply(filename: String, data: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(filename: String, data: String, options: BufferEncoding): js.Promise[Unit] = js.native
  def apply(
    filename: String,
    data: String,
    options: BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def apply(filename: String, data: String, options: Options): js.Promise[Unit] = js.native
  def apply(
    filename: String,
    data: String,
    options: Options,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def apply(filename: String, data: Buffer): js.Promise[Unit] = js.native
  def apply(filename: String, data: Buffer, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(filename: String, data: Buffer, options: BufferEncoding): js.Promise[Unit] = js.native
  def apply(
    filename: String,
    data: Buffer,
    options: BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def apply(filename: String, data: Buffer, options: Options): js.Promise[Unit] = js.native
  def apply(
    filename: String,
    data: Buffer,
    options: Options,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
}
