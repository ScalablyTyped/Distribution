package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactsDownloadInput extends StObject {
  
  var downloadInputs: js.Array[ArtifactDownloadInputBase]
}
object ArtifactsDownloadInput {
  
  inline def apply(downloadInputs: js.Array[ArtifactDownloadInputBase]): ArtifactsDownloadInput = {
    val __obj = js.Dynamic.literal(downloadInputs = downloadInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactsDownloadInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtifactsDownloadInput] (val x: Self) extends AnyVal {
    
    inline def setDownloadInputs(value: js.Array[ArtifactDownloadInputBase]): Self = StObject.set(x, "downloadInputs", value.asInstanceOf[js.Any])
    
    inline def setDownloadInputsVarargs(value: ArtifactDownloadInputBase*): Self = StObject.set(x, "downloadInputs", js.Array(value*))
  }
}
