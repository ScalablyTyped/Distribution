package typings.sumchecker

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(algorithm: String, checksumFilename: String, baseDir: String, filesToCheck: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(algorithm.asInstanceOf[js.Any], checksumFilename.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filesToCheck.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(algorithm: String, checksumFilename: String, baseDir: String, filesToCheck: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(algorithm.asInstanceOf[js.Any], checksumFilename.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filesToCheck.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("sumchecker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sumchecker", "ChecksumMismatchError")
  @js.native
  class ChecksumMismatchError protected () extends ErrorWithFilename {
    def this(filename: String) = this()
  }
  
  @JSImport("sumchecker", "ChecksumParseError")
  @js.native
  class ChecksumParseError protected ()
    extends StObject
       with Error {
    def this(lineNumber: Double, line: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
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
  class ErrorWithFilename protected ()
    extends StObject
       with Error {
    def this(filename: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sumchecker", "NoChecksumFoundError")
  @js.native
  class NoChecksumFoundError protected () extends ErrorWithFilename {
    def this(filename: String) = this()
  }
  
  trait ChecksumOptions extends StObject {
    
    var defaultTextEncoding: js.UndefOr[String] = js.undefined
  }
  object ChecksumOptions {
    
    inline def apply(): ChecksumOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChecksumOptions]
    }
    
    extension [Self <: ChecksumOptions](x: Self) {
      
      inline def setDefaultTextEncoding(value: String): Self = StObject.set(x, "defaultTextEncoding", value.asInstanceOf[js.Any])
      
      inline def setDefaultTextEncodingUndefined: Self = StObject.set(x, "defaultTextEncoding", js.undefined)
    }
  }
}
