package typings.sumchecker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sumchecker", "ChecksumValidator")
@js.native
class ChecksumValidator protected () extends js.Object {
  def this(algorithm: String, checksumFilename: String) = this()
  def this(algorithm: String, checksumFilename: String, options: ChecksumOptions) = this()
  def encoding(binary: Boolean): String = js.native
  def parseChecksumFile(data: String): Unit = js.native
  def readFile(filename: String, binary: Boolean): js.Promise[String] = js.native
  def validate(baseDir: String, filesToCheck: String): js.Promise[Unit] = js.native
  def validate(baseDir: String, filesToCheck: js.Array[String]): js.Promise[Unit] = js.native
  def validateFile(baseDir: String, filename: String): js.Promise[Unit] = js.native
  def validateFiles(baseDir: String, filesToCheck: js.Array[String]): js.Promise[Unit] = js.native
}

