package typings.strtok3

import typings.strtok3.abstractTokenizerMod.AbstractTokenizer
import typings.strtok3.typesMod.IFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileTokenizerMod {
  
  @JSImport("strtok3/lib/FileTokenizer", "FileTokenizer")
  @js.native
  class FileTokenizer protected () extends AbstractTokenizer {
    def this(fd: Double, fileInfo: IFileInfo) = this()
    
    var fd: js.Any = js.native
  }
  
  @JSImport("strtok3/lib/FileTokenizer", "fromFile")
  @js.native
  def fromFile(sourceFilePath: String): js.Promise[FileTokenizer] = js.native
}
