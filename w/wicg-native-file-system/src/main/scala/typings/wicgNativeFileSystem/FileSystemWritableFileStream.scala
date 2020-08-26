package typings.wicgNativeFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemWritableFileStream extends WritableStream {
  def seek(position: Double): js.Promise[Unit] = js.native
  def truncate(size: Double): js.Promise[Unit] = js.native
  def write(data: FileSystemWriteChunkType): js.Promise[Unit] = js.native
}

object FileSystemWritableFileStream {
  @scala.inline
  def apply(
    close: () => js.Promise[Unit],
    seek: Double => js.Promise[Unit],
    truncate: Double => js.Promise[Unit],
    write: FileSystemWriteChunkType => js.Promise[Unit]
  ): FileSystemWritableFileStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), seek = js.Any.fromFunction1(seek), truncate = js.Any.fromFunction1(truncate), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[FileSystemWritableFileStream]
  }
  @scala.inline
  implicit class FileSystemWritableFileStreamOps[Self <: FileSystemWritableFileStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSeek(value: Double => js.Promise[Unit]): Self = this.set("seek", js.Any.fromFunction1(value))
    @scala.inline
    def setTruncate(value: Double => js.Promise[Unit]): Self = this.set("truncate", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: FileSystemWriteChunkType => js.Promise[Unit]): Self = this.set("write", js.Any.fromFunction1(value))
  }
  
}

