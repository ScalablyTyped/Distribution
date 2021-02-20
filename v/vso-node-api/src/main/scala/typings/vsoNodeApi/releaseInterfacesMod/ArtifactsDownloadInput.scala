package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactsDownloadInput extends StObject {
  
  var downloadInputs: js.Array[ArtifactDownloadInputBase] = js.native
}
object ArtifactsDownloadInput {
  
  @scala.inline
  def apply(downloadInputs: js.Array[ArtifactDownloadInputBase]): ArtifactsDownloadInput = {
    val __obj = js.Dynamic.literal(downloadInputs = downloadInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactsDownloadInput]
  }
  
  @scala.inline
  implicit class ArtifactsDownloadInputMutableBuilder[Self <: ArtifactsDownloadInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadInputs(value: js.Array[ArtifactDownloadInputBase]): Self = StObject.set(x, "downloadInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadInputsVarargs(value: ArtifactDownloadInputBase*): Self = StObject.set(x, "downloadInputs", js.Array(value :_*))
  }
}
