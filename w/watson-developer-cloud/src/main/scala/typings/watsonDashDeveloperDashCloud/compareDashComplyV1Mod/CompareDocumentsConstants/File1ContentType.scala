package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait File1ContentType extends js.Object

/** The content type of file_1. */
@JSImport("watson-developer-cloud/compare-comply/v1", "CompareDocumentsConstants.File1ContentType")
@js.native
object File1ContentType extends js.Object {
  @js.native
  sealed trait APPLICATION_JSON extends File1ContentType
  
  @js.native
  sealed trait APPLICATION_MSWORD extends File1ContentType
  
  @js.native
  sealed trait APPLICATION_PDF extends File1ContentType
  
  @js.native
  sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends File1ContentType
  
  @js.native
  sealed trait IMAGE_BMP extends File1ContentType
  
  @js.native
  sealed trait IMAGE_GIF extends File1ContentType
  
  @js.native
  sealed trait IMAGE_JPEG extends File1ContentType
  
  @js.native
  sealed trait IMAGE_PNG extends File1ContentType
  
  @js.native
  sealed trait IMAGE_TIFF extends File1ContentType
  
  /* "application/json" */ val APPLICATION_JSON: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_JSON with String = js.native
  /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_MSWORD with String = js.native
  /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_PDF with String = js.native
  /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
  /* "image/bmp" */ val IMAGE_BMP: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_BMP with String = js.native
  /* "image/gif" */ val IMAGE_GIF: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_GIF with String = js.native
  /* "image/jpeg" */ val IMAGE_JPEG: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_JPEG with String = js.native
  /* "image/png" */ val IMAGE_PNG: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_PNG with String = js.native
  /* "image/tiff" */ val IMAGE_TIFF: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_TIFF with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[File1ContentType with String] = js.native
}

