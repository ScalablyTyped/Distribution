package typings.tensorflowTfjsConverter.distDataCompiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAssetFileDef extends StObject {
  
  /** AssetFileDef filename */
  var filename: js.UndefOr[String | Null] = js.undefined
  
  /** AssetFileDef tensorInfo */
  var tensorInfo: js.UndefOr[ITensorInfo | Null] = js.undefined
}
object IAssetFileDef {
  
  inline def apply(): IAssetFileDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAssetFileDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAssetFileDef] (val x: Self) extends AnyVal {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameNull: Self = StObject.set(x, "filename", null)
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setTensorInfo(value: ITensorInfo): Self = StObject.set(x, "tensorInfo", value.asInstanceOf[js.Any])
    
    inline def setTensorInfoNull: Self = StObject.set(x, "tensorInfo", null)
    
    inline def setTensorInfoUndefined: Self = StObject.set(x, "tensorInfo", js.undefined)
  }
}
