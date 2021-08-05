package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.compiledApiMod.MetaGraphDef.IMetaInfoDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetaGraphDef extends StObject {
  
  /** MetaGraphDef assetFileDef */
  var assetFileDef: js.UndefOr[js.Array[IAssetFileDef] | Null] = js.undefined
  
  /** MetaGraphDef collectionDef */
  var collectionDef: js.UndefOr[StringDictionary[ICollectionDef] | Null] = js.undefined
  
  /** MetaGraphDef graphDef */
  var graphDef: js.UndefOr[IGraphDef | Null] = js.undefined
  
  /** MetaGraphDef metaInfoDef */
  var metaInfoDef: js.UndefOr[IMetaInfoDef | Null] = js.undefined
  
  /** MetaGraphDef saverDef */
  var saverDef: js.UndefOr[ISaverDef | Null] = js.undefined
  
  /** MetaGraphDef signatureDef */
  var signatureDef: js.UndefOr[StringDictionary[ISignatureDef] | Null] = js.undefined
}
object IMetaGraphDef {
  
  inline def apply(): IMetaGraphDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMetaGraphDef]
  }
  
  extension [Self <: IMetaGraphDef](x: Self) {
    
    inline def setAssetFileDef(value: js.Array[IAssetFileDef]): Self = StObject.set(x, "assetFileDef", value.asInstanceOf[js.Any])
    
    inline def setAssetFileDefNull: Self = StObject.set(x, "assetFileDef", null)
    
    inline def setAssetFileDefUndefined: Self = StObject.set(x, "assetFileDef", js.undefined)
    
    inline def setAssetFileDefVarargs(value: IAssetFileDef*): Self = StObject.set(x, "assetFileDef", js.Array(value :_*))
    
    inline def setCollectionDef(value: StringDictionary[ICollectionDef]): Self = StObject.set(x, "collectionDef", value.asInstanceOf[js.Any])
    
    inline def setCollectionDefNull: Self = StObject.set(x, "collectionDef", null)
    
    inline def setCollectionDefUndefined: Self = StObject.set(x, "collectionDef", js.undefined)
    
    inline def setGraphDef(value: IGraphDef): Self = StObject.set(x, "graphDef", value.asInstanceOf[js.Any])
    
    inline def setGraphDefNull: Self = StObject.set(x, "graphDef", null)
    
    inline def setGraphDefUndefined: Self = StObject.set(x, "graphDef", js.undefined)
    
    inline def setMetaInfoDef(value: IMetaInfoDef): Self = StObject.set(x, "metaInfoDef", value.asInstanceOf[js.Any])
    
    inline def setMetaInfoDefNull: Self = StObject.set(x, "metaInfoDef", null)
    
    inline def setMetaInfoDefUndefined: Self = StObject.set(x, "metaInfoDef", js.undefined)
    
    inline def setSaverDef(value: ISaverDef): Self = StObject.set(x, "saverDef", value.asInstanceOf[js.Any])
    
    inline def setSaverDefNull: Self = StObject.set(x, "saverDef", null)
    
    inline def setSaverDefUndefined: Self = StObject.set(x, "saverDef", js.undefined)
    
    inline def setSignatureDef(value: StringDictionary[ISignatureDef]): Self = StObject.set(x, "signatureDef", value.asInstanceOf[js.Any])
    
    inline def setSignatureDefNull: Self = StObject.set(x, "signatureDef", null)
    
    inline def setSignatureDefUndefined: Self = StObject.set(x, "signatureDef", js.undefined)
  }
}
