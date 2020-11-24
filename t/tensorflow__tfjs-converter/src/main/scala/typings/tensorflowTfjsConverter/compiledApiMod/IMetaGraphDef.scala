package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.compiledApiMod.MetaGraphDef.IMetaInfoDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetaGraphDef extends js.Object {
  
  /** MetaGraphDef assetFileDef */
  var assetFileDef: js.UndefOr[js.Array[IAssetFileDef] | Null] = js.native
  
  /** MetaGraphDef collectionDef */
  var collectionDef: js.UndefOr[StringDictionary[ICollectionDef] | Null] = js.native
  
  /** MetaGraphDef graphDef */
  var graphDef: js.UndefOr[IGraphDef | Null] = js.native
  
  /** MetaGraphDef metaInfoDef */
  var metaInfoDef: js.UndefOr[IMetaInfoDef | Null] = js.native
  
  /** MetaGraphDef saverDef */
  var saverDef: js.UndefOr[ISaverDef | Null] = js.native
  
  /** MetaGraphDef signatureDef */
  var signatureDef: js.UndefOr[StringDictionary[ISignatureDef] | Null] = js.native
}
object IMetaGraphDef {
  
  @scala.inline
  def apply(): IMetaGraphDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMetaGraphDef]
  }
  
  @scala.inline
  implicit class IMetaGraphDefOps[Self <: IMetaGraphDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssetFileDefVarargs(value: IAssetFileDef*): Self = this.set("assetFileDef", js.Array(value :_*))
    
    @scala.inline
    def setAssetFileDef(value: js.Array[IAssetFileDef]): Self = this.set("assetFileDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetFileDef: Self = this.set("assetFileDef", js.undefined)
    
    @scala.inline
    def setAssetFileDefNull: Self = this.set("assetFileDef", null)
    
    @scala.inline
    def setCollectionDef(value: StringDictionary[ICollectionDef]): Self = this.set("collectionDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionDef: Self = this.set("collectionDef", js.undefined)
    
    @scala.inline
    def setCollectionDefNull: Self = this.set("collectionDef", null)
    
    @scala.inline
    def setGraphDef(value: IGraphDef): Self = this.set("graphDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphDef: Self = this.set("graphDef", js.undefined)
    
    @scala.inline
    def setGraphDefNull: Self = this.set("graphDef", null)
    
    @scala.inline
    def setMetaInfoDef(value: IMetaInfoDef): Self = this.set("metaInfoDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaInfoDef: Self = this.set("metaInfoDef", js.undefined)
    
    @scala.inline
    def setMetaInfoDefNull: Self = this.set("metaInfoDef", null)
    
    @scala.inline
    def setSaverDef(value: ISaverDef): Self = this.set("saverDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaverDef: Self = this.set("saverDef", js.undefined)
    
    @scala.inline
    def setSaverDefNull: Self = this.set("saverDef", null)
    
    @scala.inline
    def setSignatureDef(value: StringDictionary[ISignatureDef]): Self = this.set("signatureDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureDef: Self = this.set("signatureDef", js.undefined)
    
    @scala.inline
    def setSignatureDefNull: Self = this.set("signatureDef", null)
  }
}
