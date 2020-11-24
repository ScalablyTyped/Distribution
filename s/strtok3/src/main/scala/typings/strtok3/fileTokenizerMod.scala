package typings.strtok3

import typings.strtok3.abstractTokenizerMod.AbstractTokenizer
import typings.strtok3.typesMod.IFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("strtok3/lib/FileTokenizer", JSImport.Namespace)
@js.native
object fileTokenizerMod extends js.Object {
  
  def fromFile(sourceFilePath: String): js.Promise[FileTokenizer] = js.native
  
  @js.native
  class FileTokenizer protected () extends AbstractTokenizer {
    def this(fd: Double, fileInfo: IFileInfo) = this()
    
    var fd: js.Any = js.native
  }
}
