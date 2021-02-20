package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAssetFileDef extends StObject {
  
  /** AssetFileDef filename */
  var filename: js.UndefOr[String | Null] = js.native
  
  /** AssetFileDef tensorInfo */
  var tensorInfo: js.UndefOr[ITensorInfo | Null] = js.native
}
object IAssetFileDef {
  
  @scala.inline
  def apply(): IAssetFileDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAssetFileDef]
  }
  
  @scala.inline
  implicit class IAssetFileDefMutableBuilder[Self <: IAssetFileDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameNull: Self = StObject.set(x, "filename", null)
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setTensorInfo(value: ITensorInfo): Self = StObject.set(x, "tensorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensorInfoNull: Self = StObject.set(x, "tensorInfo", null)
    
    @scala.inline
    def setTensorInfoUndefined: Self = StObject.set(x, "tensorInfo", js.undefined)
  }
}
