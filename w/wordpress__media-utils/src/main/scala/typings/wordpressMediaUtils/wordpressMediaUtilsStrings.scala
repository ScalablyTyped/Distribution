package typings.wordpressMediaUtils

import typings.wordpressMediaUtils.uploadMediaMod.UploadMediaErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressMediaUtilsStrings {
  
  @js.native
  sealed trait EMPTY_FILE
    extends StObject
       with UploadMediaErrorCode
  @scala.inline
  def EMPTY_FILE: EMPTY_FILE = "EMPTY_FILE".asInstanceOf[EMPTY_FILE]
  
  @js.native
  sealed trait GENERAL
    extends StObject
       with UploadMediaErrorCode
  @scala.inline
  def GENERAL: GENERAL = "GENERAL".asInstanceOf[GENERAL]
  
  @js.native
  sealed trait MIME_TYPE_NOT_ALLOWED_FOR_USER
    extends StObject
       with UploadMediaErrorCode
  @scala.inline
  def MIME_TYPE_NOT_ALLOWED_FOR_USER: MIME_TYPE_NOT_ALLOWED_FOR_USER = "MIME_TYPE_NOT_ALLOWED_FOR_USER".asInstanceOf[MIME_TYPE_NOT_ALLOWED_FOR_USER]
  
  @js.native
  sealed trait MIME_TYPE_NOT_SUPPORTED
    extends StObject
       with UploadMediaErrorCode
  @scala.inline
  def MIME_TYPE_NOT_SUPPORTED: MIME_TYPE_NOT_SUPPORTED = "MIME_TYPE_NOT_SUPPORTED".asInstanceOf[MIME_TYPE_NOT_SUPPORTED]
  
  @js.native
  sealed trait SIZE_ABOVE_LIMIT
    extends StObject
       with UploadMediaErrorCode
  @scala.inline
  def SIZE_ABOVE_LIMIT: SIZE_ABOVE_LIMIT = "SIZE_ABOVE_LIMIT".asInstanceOf[SIZE_ABOVE_LIMIT]
}
