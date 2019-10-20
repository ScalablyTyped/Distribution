package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateDocumentConstants.FileContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `updateDocument` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "UpdateDocumentConstants")
@js.native
object UpdateDocumentConstants extends js.Object {
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
    
    /* "application/json" */ val APPLICATION_JSON: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_JSON with String = js.native
    /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_MSWORD with String = js.native
    /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_PDF with String = js.native
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
    /* "application/xhtml+xml" */ val APPLICATION_XHTML_XML: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateDocumentConstants.FileContentType.APPLICATION_XHTML_XML with String = js.native
    /* "text/html" */ val TEXT_HTML: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.UpdateDocumentConstants.FileContentType.TEXT_HTML with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FileContentType with String] = js.native
  }
  
}

