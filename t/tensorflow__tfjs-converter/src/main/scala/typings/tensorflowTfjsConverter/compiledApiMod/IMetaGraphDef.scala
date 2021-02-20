package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.compiledApiMod.MetaGraphDef.IMetaInfoDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetaGraphDef extends StObject {
  
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
  implicit class IMetaGraphDefMutableBuilder[Self <: IMetaGraphDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetFileDef(value: js.Array[IAssetFileDef]): Self = StObject.set(x, "assetFileDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetFileDefNull: Self = StObject.set(x, "assetFileDef", null)
    
    @scala.inline
    def setAssetFileDefUndefined: Self = StObject.set(x, "assetFileDef", js.undefined)
    
    @scala.inline
    def setAssetFileDefVarargs(value: IAssetFileDef*): Self = StObject.set(x, "assetFileDef", js.Array(value :_*))
    
    @scala.inline
    def setCollectionDef(value: StringDictionary[ICollectionDef]): Self = StObject.set(x, "collectionDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionDefNull: Self = StObject.set(x, "collectionDef", null)
    
    @scala.inline
    def setCollectionDefUndefined: Self = StObject.set(x, "collectionDef", js.undefined)
    
    @scala.inline
    def setGraphDef(value: IGraphDef): Self = StObject.set(x, "graphDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphDefNull: Self = StObject.set(x, "graphDef", null)
    
    @scala.inline
    def setGraphDefUndefined: Self = StObject.set(x, "graphDef", js.undefined)
    
    @scala.inline
    def setMetaInfoDef(value: IMetaInfoDef): Self = StObject.set(x, "metaInfoDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaInfoDefNull: Self = StObject.set(x, "metaInfoDef", null)
    
    @scala.inline
    def setMetaInfoDefUndefined: Self = StObject.set(x, "metaInfoDef", js.undefined)
    
    @scala.inline
    def setSaverDef(value: ISaverDef): Self = StObject.set(x, "saverDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaverDefNull: Self = StObject.set(x, "saverDef", null)
    
    @scala.inline
    def setSaverDefUndefined: Self = StObject.set(x, "saverDef", js.undefined)
    
    @scala.inline
    def setSignatureDef(value: StringDictionary[ISignatureDef]): Self = StObject.set(x, "signatureDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureDefNull: Self = StObject.set(x, "signatureDef", null)
    
    @scala.inline
    def setSignatureDefUndefined: Self = StObject.set(x, "signatureDef", js.undefined)
  }
}
