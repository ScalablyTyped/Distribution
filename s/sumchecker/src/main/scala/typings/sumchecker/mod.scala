package typings.sumchecker

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sumchecker", JSImport.Namespace)
  @js.native
  def apply(algorithm: String, checksumFilename: String, baseDir: String, filesToCheck: String): js.Promise[Unit] = js.native
  @JSImport("sumchecker", JSImport.Namespace)
  @js.native
  def apply(algorithm: String, checksumFilename: String, baseDir: String, filesToCheck: js.Array[String]): js.Promise[Unit] = js.native
  
  @JSImport("sumchecker", "ChecksumMismatchError")
  @js.native
  class ChecksumMismatchError protected () extends ErrorWithFilename {
    def this(filename: String) = this()
  }
  
  @JSImport("sumchecker", "ChecksumParseError")
  @js.native
  class ChecksumParseError protected () extends Error {
    def this(lineNumber: Double, line: String) = this()
  }
  
  @JSImport("sumchecker", "ChecksumValidator")
  @js.native
  class ChecksumValidator protected () extends StObject {
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
  
  @JSImport("sumchecker", "ErrorWithFilename")
  @js.native
  class ErrorWithFilename protected () extends Error {
    def this(filename: String) = this()
  }
  
  @JSImport("sumchecker", "NoChecksumFoundError")
  @js.native
  class NoChecksumFoundError protected () extends ErrorWithFilename {
    def this(filename: String) = this()
  }
  
  @js.native
  trait ChecksumOptions extends StObject {
    
    var defaultTextEncoding: js.UndefOr[String] = js.native
  }
  object ChecksumOptions {
    
    @scala.inline
    def apply(): ChecksumOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChecksumOptions]
    }
    
    @scala.inline
    implicit class ChecksumOptionsMutableBuilder[Self <: ChecksumOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultTextEncoding(value: String): Self = StObject.set(x, "defaultTextEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTextEncodingUndefined: Self = StObject.set(x, "defaultTextEncoding", js.undefined)
    }
  }
}
