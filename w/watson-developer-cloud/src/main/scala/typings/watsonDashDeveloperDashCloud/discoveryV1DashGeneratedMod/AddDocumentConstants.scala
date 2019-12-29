package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `addDocument` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "AddDocumentConstants")
@js.native
object AddDocumentConstants extends js.Object {
  @js.native
  sealed trait FileContentType extends js.Object
  
  /** The content type of file. */
  @js.native
  object FileContentType extends js.Object {
    @js.native
    sealed trait APPLICATION_JSON extends FileContentType
    
    @js.native
    sealed trait APPLICATION_MSWORD extends FileContentType
    
    @js.native
    sealed trait APPLICATION_PDF extends FileContentType
    
    @js.native
    sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends FileContentType
    
    @js.native
    sealed trait APPLICATION_XHTML_XML extends FileContentType
    
    @js.native
    sealed trait TEXT_HTML extends FileContentType
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FileContentType with String] = js.native
    /* "application/json" */ @js.native
    object APPLICATION_JSON extends TopLevel[APPLICATION_JSON with String]
    
    /* "application/msword" */ @js.native
    object APPLICATION_MSWORD extends TopLevel[APPLICATION_MSWORD with String]
    
    /* "application/pdf" */ @js.native
    object APPLICATION_PDF extends TopLevel[APPLICATION_PDF with String]
    
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ @js.native
    object APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends TopLevel[
              APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String
            ]
    
    /* "application/xhtml+xml" */ @js.native
    object APPLICATION_XHTML_XML extends TopLevel[APPLICATION_XHTML_XML with String]
    
    /* "text/html" */ @js.native
    object TEXT_HTML extends TopLevel[TEXT_HTML with String]
    
  }
  
}

