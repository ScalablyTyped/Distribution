package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `addDocument` operation. */
object AddDocumentConstants {
  
  @js.native
  sealed trait FileContentType extends StObject
  /** The content type of file. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "AddDocumentConstants.FileContentType")
  @js.native
  object FileContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FileContentType & String] = js.native
    
    @js.native
    sealed trait APPLICATION_JSON
      extends StObject
         with FileContentType
    /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.AddDocumentConstants.FileContentType.APPLICATION_JSON & String = js.native
    
    @js.native
    sealed trait APPLICATION_MSWORD
      extends StObject
         with FileContentType
    /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.AddDocumentConstants.FileContentType.APPLICATION_MSWORD & String = js.native
    
    @js.native
    sealed trait APPLICATION_PDF
      extends StObject
         with FileContentType
    /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.AddDocumentConstants.FileContentType.APPLICATION_PDF & String = js.native
    
    @js.native
    sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT
      extends StObject
         with FileContentType
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.AddDocumentConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT & String = js.native
    
    @js.native
    sealed trait APPLICATION_XHTML_XML
      extends StObject
         with FileContentType
    /* "application/xhtml+xml" */ val APPLICATION_XHTML_XML: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.AddDocumentConstants.FileContentType.APPLICATION_XHTML_XML & String = js.native
    
    @js.native
    sealed trait TEXT_HTML
      extends StObject
         with FileContentType
    /* "text/html" */ val TEXT_HTML: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.AddDocumentConstants.FileContentType.TEXT_HTML & String = js.native
  }
}
