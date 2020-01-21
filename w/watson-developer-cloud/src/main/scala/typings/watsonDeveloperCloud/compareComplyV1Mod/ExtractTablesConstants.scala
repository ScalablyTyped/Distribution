package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `extractTables` operation. */
@JSImport("watson-developer-cloud/compare-comply/v1", "ExtractTablesConstants")
@js.native
object ExtractTablesConstants extends js.Object {
  @js.native
  sealed trait FileContentType extends js.Object
  
  @js.native
  sealed trait Model extends js.Object
  
  /** The content type of file. */
  @js.native
  object FileContentType extends js.Object {
    @js.native
    sealed trait APPLICATION_MSWORD extends FileContentType
    
    @js.native
    sealed trait APPLICATION_PDF extends FileContentType
    
    @js.native
    sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends FileContentType
    
    @js.native
    sealed trait IMAGE_BMP extends FileContentType
    
    @js.native
    sealed trait IMAGE_GIF extends FileContentType
    
    @js.native
    sealed trait IMAGE_JPEG extends FileContentType
    
    @js.native
    sealed trait IMAGE_PNG extends FileContentType
    
    @js.native
    sealed trait IMAGE_TIFF extends FileContentType
    
    @js.native
    sealed trait TEXT_PLAIN extends FileContentType
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FileContentType with String] = js.native
    /* "application/msword" */ @js.native
    object APPLICATION_MSWORD extends TopLevel[APPLICATION_MSWORD with String]
    
    /* "application/pdf" */ @js.native
    object APPLICATION_PDF extends TopLevel[APPLICATION_PDF with String]
    
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ @js.native
    object APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends TopLevel[
              APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String
            ]
    
    /* "image/bmp" */ @js.native
    object IMAGE_BMP extends TopLevel[IMAGE_BMP with String]
    
    /* "image/gif" */ @js.native
    object IMAGE_GIF extends TopLevel[IMAGE_GIF with String]
    
    /* "image/jpeg" */ @js.native
    object IMAGE_JPEG extends TopLevel[IMAGE_JPEG with String]
    
    /* "image/png" */ @js.native
    object IMAGE_PNG extends TopLevel[IMAGE_PNG with String]
    
    /* "image/tiff" */ @js.native
    object IMAGE_TIFF extends TopLevel[IMAGE_TIFF with String]
    
    /* "text/plain" */ @js.native
    object TEXT_PLAIN extends TopLevel[TEXT_PLAIN with String]
    
  }
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    @js.native
    sealed trait CONTRACTS extends Model
    
    @js.native
    sealed trait TABLES extends Model
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model with String] = js.native
    /* "contracts" */ @js.native
    object CONTRACTS extends TopLevel[CONTRACTS with String]
    
    /* "tables" */ @js.native
    object TABLES extends TopLevel[TABLES with String]
    
  }
  
}

