package typings.strtok3

import typings.node.streamMod.Readable
import typings.strtok3.abstractTokenizerMod.AbstractTokenizer
import typings.strtok3.typesMod.IFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readStreamTokenizerMod {
  
  @JSImport("strtok3/lib/ReadStreamTokenizer", "ReadStreamTokenizer")
  @js.native
  class ReadStreamTokenizer protected () extends AbstractTokenizer {
    def this(stream: Readable) = this()
    def this(stream: Readable, fileInfo: IFileInfo) = this()
    
    /**
      * Get file information, an HTTP-client may implement this doing a HEAD request
      * @return Promise with file information
      */
    def getFileInfo(): js.Promise[IFileInfo] = js.native
    
    var streamReader: js.Any = js.native
  }
}
