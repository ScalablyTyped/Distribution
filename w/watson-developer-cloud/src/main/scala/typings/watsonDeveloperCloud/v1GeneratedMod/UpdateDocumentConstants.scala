package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `updateDocument` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "UpdateDocumentConstants")
@js.native
object UpdateDocumentConstants extends js.Object {
  
  @js.native
  sealed trait FileContentType extends js.Object
  /** The content type of file. */
  @js.native
  object FileContentType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FileContentType with String] = js.native
    
    @js.native
    sealed trait APPLICATION_JSON extends FileContentType
    /* "application/json" */ @js.native
    object APPLICATION_JSON extends TopLevel[APPLICATION_JSON with String]
    
    @js.native
    sealed trait APPLICATION_MSWORD extends FileContentType
    /* "application/msword" */ @js.native
    object APPLICATION_MSWORD extends TopLevel[APPLICATION_MSWORD with String]
    
    @js.native
    sealed trait APPLICATION_PDF extends FileContentType
    /* "application/pdf" */ @js.native
    object APPLICATION_PDF extends TopLevel[APPLICATION_PDF with String]
    
    @js.native
    sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends FileContentType
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ @js.native
    object APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends TopLevel[
              APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String
            ]
    
    @js.native
    sealed trait APPLICATION_XHTML_XML extends FileContentType
    /* "application/xhtml+xml" */ @js.native
    object APPLICATION_XHTML_XML extends TopLevel[APPLICATION_XHTML_XML with String]
    
    @js.native
    sealed trait TEXT_HTML extends FileContentType
    /* "text/html" */ @js.native
    object TEXT_HTML extends TopLevel[TEXT_HTML with String]
  }
}
