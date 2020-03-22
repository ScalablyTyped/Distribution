package typings.strtok3

import typings.strtok3.abstractTokenizerMod.AbstractTokenizer
import typings.strtok3.typesMod.IFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strtok3/lib/FileTokenizer", JSImport.Namespace)
@js.native
object fileTokenizerMod extends js.Object {
  @js.native
  class FileTokenizer protected () extends AbstractTokenizer {
    def this(fd: Double, fileInfo: IFileInfo) = this()
    var fd: js.Any = js.native
  }
  
  def fromFile(sourceFilePath: String): js.Promise[FileTokenizer] = js.native
}

