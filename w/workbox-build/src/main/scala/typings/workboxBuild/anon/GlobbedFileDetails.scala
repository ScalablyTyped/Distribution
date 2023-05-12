package typings.workboxBuild.anon

import typings.workboxBuild.buildLibGetFileDetailsMod.FileDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobbedFileDetails extends StObject {
  
  var globbedFileDetails: js.Array[FileDetails]
  
  var warning: String
}
object GlobbedFileDetails {
  
  inline def apply(globbedFileDetails: js.Array[FileDetails], warning: String): GlobbedFileDetails = {
    val __obj = js.Dynamic.literal(globbedFileDetails = globbedFileDetails.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobbedFileDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobbedFileDetails] (val x: Self) extends AnyVal {
    
    inline def setGlobbedFileDetails(value: js.Array[FileDetails]): Self = StObject.set(x, "globbedFileDetails", value.asInstanceOf[js.Any])
    
    inline def setGlobbedFileDetailsVarargs(value: FileDetails*): Self = StObject.set(x, "globbedFileDetails", js.Array(value*))
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
