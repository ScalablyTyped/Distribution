package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait File2ContentType extends js.Object

/** The content type of file_2. */
@JSImport("watson-developer-cloud/compare-comply/v1", "CompareDocumentsConstants.File2ContentType")
@js.native
object File2ContentType extends js.Object {
  @js.native
  sealed trait APPLICATION_JSON extends File2ContentType
  
  @js.native
  sealed trait APPLICATION_MSWORD extends File2ContentType
  
  @js.native
  sealed trait APPLICATION_PDF extends File2ContentType
  
  @js.native
  sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends File2ContentType
  
  @js.native
  sealed trait IMAGE_BMP extends File2ContentType
  
  @js.native
  sealed trait IMAGE_GIF extends File2ContentType
  
  @js.native
  sealed trait IMAGE_JPEG extends File2ContentType
  
  @js.native
  sealed trait IMAGE_PNG extends File2ContentType
  
  @js.native
  sealed trait IMAGE_TIFF extends File2ContentType
  
  /* "application/json" */ val APPLICATION_JSON: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_JSON with String = js.native
  /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_MSWORD with String = js.native
  /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_PDF with String = js.native
  /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
  /* "image/bmp" */ val IMAGE_BMP: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_BMP with String = js.native
  /* "image/gif" */ val IMAGE_GIF: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_GIF with String = js.native
  /* "image/jpeg" */ val IMAGE_JPEG: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_JPEG with String = js.native
  /* "image/png" */ val IMAGE_PNG: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_PNG with String = js.native
  /* "image/tiff" */ val IMAGE_TIFF: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_TIFF with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[File2ContentType with String] = js.native
}

