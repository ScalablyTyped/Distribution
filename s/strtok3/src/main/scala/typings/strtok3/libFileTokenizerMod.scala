package typings.strtok3

import typings.strtok3.libAbstractTokenizerMod.AbstractTokenizer
import typings.strtok3.libTypesMod.IFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileTokenizerMod {
  
  @JSImport("strtok3/lib/FileTokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("strtok3/lib/FileTokenizer", "FileTokenizer")
  @js.native
  open class FileTokenizer protected () extends AbstractTokenizer {
    def this(fd: Double, fileInfo: IFileInfo) = this()
    
    /* private */ var fd: Any = js.native
  }
  
  inline def fromFile(sourceFilePath: String): js.Promise[FileTokenizer] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(sourceFilePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileTokenizer]]
}
