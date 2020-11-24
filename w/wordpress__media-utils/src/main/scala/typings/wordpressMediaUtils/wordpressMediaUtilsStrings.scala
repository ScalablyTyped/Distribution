package typings.wordpressMediaUtils

import typings.wordpressMediaUtils.uploadMediaMod.UploadMediaErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressMediaUtilsStrings {
  
  @scala.inline
  def EMPTY_FILE: EMPTY_FILE = "EMPTY_FILE".asInstanceOf[EMPTY_FILE]
  
  @scala.inline
  def GENERAL: GENERAL = "GENERAL".asInstanceOf[GENERAL]
  
  @scala.inline
  def MIME_TYPE_NOT_ALLOWED_FOR_USER: MIME_TYPE_NOT_ALLOWED_FOR_USER = "MIME_TYPE_NOT_ALLOWED_FOR_USER".asInstanceOf[MIME_TYPE_NOT_ALLOWED_FOR_USER]
  
  @scala.inline
  def MIME_TYPE_NOT_SUPPORTED: MIME_TYPE_NOT_SUPPORTED = "MIME_TYPE_NOT_SUPPORTED".asInstanceOf[MIME_TYPE_NOT_SUPPORTED]
  
  @scala.inline
  def SIZE_ABOVE_LIMIT: SIZE_ABOVE_LIMIT = "SIZE_ABOVE_LIMIT".asInstanceOf[SIZE_ABOVE_LIMIT]
  
  @js.native
  sealed trait EMPTY_FILE extends UploadMediaErrorCode
  
  @js.native
  sealed trait GENERAL extends UploadMediaErrorCode
  
  @js.native
  sealed trait MIME_TYPE_NOT_ALLOWED_FOR_USER extends UploadMediaErrorCode
  
  @js.native
  sealed trait MIME_TYPE_NOT_SUPPORTED extends UploadMediaErrorCode
  
  @js.native
  sealed trait SIZE_ABOVE_LIMIT extends UploadMediaErrorCode
}
