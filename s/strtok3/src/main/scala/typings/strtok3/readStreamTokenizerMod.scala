package typings.strtok3

import typings.node.streamMod.Readable
import typings.strtok3.abstractTokenizerMod.AbstractTokenizer
import typings.strtok3.typesMod.IFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strtok3/lib/ReadStreamTokenizer", JSImport.Namespace)
@js.native
object readStreamTokenizerMod extends js.Object {
  @js.native
  class ReadStreamTokenizer protected () extends AbstractTokenizer {
    def this(stream: Readable) = this()
    def this(stream: Readable, fileInfo: IFileInfo) = this()
    var streamReader: js.Any = js.native
    /**
      * Get file information, an HTTP-client may implement this doing a HEAD request
      * @return Promise with file information
      */
    def getFileInfo(): js.Promise[IFileInfo] = js.native
  }
  
}

