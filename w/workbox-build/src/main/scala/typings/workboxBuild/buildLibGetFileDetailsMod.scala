package typings.workboxBuild

import typings.workboxBuild.anon.GlobbedFileDetails
import typings.workboxBuild.anon.OmitGlobPartialglobDirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibGetFileDetailsMod {
  
  @JSImport("workbox-build/build/lib/get-file-details", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFileDetails(param0: OmitGlobPartialglobDirect): GlobbedFileDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileDetails")(param0.asInstanceOf[js.Any]).asInstanceOf[GlobbedFileDetails]
  
  trait FileDetails extends StObject {
    
    var file: String
    
    var hash: String
    
    var size: Double
  }
  object FileDetails {
    
    inline def apply(file: String, hash: String, size: Double): FileDetails = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileDetails] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
