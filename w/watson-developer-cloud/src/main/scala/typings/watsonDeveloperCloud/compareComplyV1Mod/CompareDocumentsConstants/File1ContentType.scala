package typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait File1ContentType extends js.Object
/** The content type of file_1. */
@JSImport("watson-developer-cloud/compare-comply/v1", "CompareDocumentsConstants.File1ContentType")
@js.native
object File1ContentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[File1ContentType with String] = js.native
  
  @js.native
  sealed trait APPLICATION_JSON extends File1ContentType
  /* "application/json" */ @js.native
  object APPLICATION_JSON extends TopLevel[APPLICATION_JSON with String]
  
  @js.native
  sealed trait APPLICATION_MSWORD extends File1ContentType
  /* "application/msword" */ @js.native
  object APPLICATION_MSWORD extends TopLevel[APPLICATION_MSWORD with String]
  
  @js.native
  sealed trait APPLICATION_PDF extends File1ContentType
  /* "application/pdf" */ @js.native
  object APPLICATION_PDF extends TopLevel[APPLICATION_PDF with String]
  
  @js.native
  sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends File1ContentType
  /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ @js.native
  object APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends TopLevel[
          APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String
        ]
  
  @js.native
  sealed trait IMAGE_BMP extends File1ContentType
  /* "image/bmp" */ @js.native
  object IMAGE_BMP extends TopLevel[IMAGE_BMP with String]
  
  @js.native
  sealed trait IMAGE_GIF extends File1ContentType
  /* "image/gif" */ @js.native
  object IMAGE_GIF extends TopLevel[IMAGE_GIF with String]
  
  @js.native
  sealed trait IMAGE_JPEG extends File1ContentType
  /* "image/jpeg" */ @js.native
  object IMAGE_JPEG extends TopLevel[IMAGE_JPEG with String]
  
  @js.native
  sealed trait IMAGE_PNG extends File1ContentType
  /* "image/png" */ @js.native
  object IMAGE_PNG extends TopLevel[IMAGE_PNG with String]
  
  @js.native
  sealed trait IMAGE_TIFF extends File1ContentType
  /* "image/tiff" */ @js.native
  object IMAGE_TIFF extends TopLevel[IMAGE_TIFF with String]
}
