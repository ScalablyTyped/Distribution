package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `compareDocuments` operation. */
object CompareDocumentsConstants {
  
  @js.native
  sealed trait File1ContentType extends StObject
  /** The content type of file_1. */
  @JSImport("watson-developer-cloud/compare-comply/v1", "CompareDocumentsConstants.File1ContentType")
  @js.native
  object File1ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[File1ContentType with String] = js.native
    
    @js.native
    sealed trait APPLICATION_JSON extends File1ContentType
    /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_JSON with String = js.native
    
    @js.native
    sealed trait APPLICATION_MSWORD extends File1ContentType
    /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_MSWORD with String = js.native
    
    @js.native
    sealed trait APPLICATION_PDF extends File1ContentType
    /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_PDF with String = js.native
    
    @js.native
    sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends File1ContentType
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
    
    @js.native
    sealed trait IMAGE_BMP extends File1ContentType
    /* "image/bmp" */ val IMAGE_BMP: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_BMP with String = js.native
    
    @js.native
    sealed trait IMAGE_GIF extends File1ContentType
    /* "image/gif" */ val IMAGE_GIF: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_GIF with String = js.native
    
    @js.native
    sealed trait IMAGE_JPEG extends File1ContentType
    /* "image/jpeg" */ val IMAGE_JPEG: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_JPEG with String = js.native
    
    @js.native
    sealed trait IMAGE_PNG extends File1ContentType
    /* "image/png" */ val IMAGE_PNG: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_PNG with String = js.native
    
    @js.native
    sealed trait IMAGE_TIFF extends File1ContentType
    /* "image/tiff" */ val IMAGE_TIFF: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File1ContentType.IMAGE_TIFF with String = js.native
  }
  
  @js.native
  sealed trait File2ContentType extends StObject
  /** The content type of file_2. */
  @JSImport("watson-developer-cloud/compare-comply/v1", "CompareDocumentsConstants.File2ContentType")
  @js.native
  object File2ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[File2ContentType with String] = js.native
    
    @js.native
    sealed trait APPLICATION_JSON extends File2ContentType
    /* "application/json" */ val APPLICATION_JSON: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_JSON with String = js.native
    
    @js.native
    sealed trait APPLICATION_MSWORD extends File2ContentType
    /* "application/msword" */ val APPLICATION_MSWORD: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_MSWORD with String = js.native
    
    @js.native
    sealed trait APPLICATION_PDF extends File2ContentType
    /* "application/pdf" */ val APPLICATION_PDF: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_PDF with String = js.native
    
    @js.native
    sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT extends File2ContentType
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
    
    @js.native
    sealed trait IMAGE_BMP extends File2ContentType
    /* "image/bmp" */ val IMAGE_BMP: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_BMP with String = js.native
    
    @js.native
    sealed trait IMAGE_GIF extends File2ContentType
    /* "image/gif" */ val IMAGE_GIF: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_GIF with String = js.native
    
    @js.native
    sealed trait IMAGE_JPEG extends File2ContentType
    /* "image/jpeg" */ val IMAGE_JPEG: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_JPEG with String = js.native
    
    @js.native
    sealed trait IMAGE_PNG extends File2ContentType
    /* "image/png" */ val IMAGE_PNG: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_PNG with String = js.native
    
    @js.native
    sealed trait IMAGE_TIFF extends File2ContentType
    /* "image/tiff" */ val IMAGE_TIFF: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.File2ContentType.IMAGE_TIFF with String = js.native
  }
  
  @js.native
  sealed trait Model extends StObject
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @JSImport("watson-developer-cloud/compare-comply/v1", "CompareDocumentsConstants.Model")
  @js.native
  object Model extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model with String] = js.native
    
    @js.native
    sealed trait CONTRACTS extends Model
    /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.Model.CONTRACTS with String = js.native
    
    @js.native
    sealed trait TABLES extends Model
    /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.CompareDocumentsConstants.Model.TABLES with String = js.native
  }
}
