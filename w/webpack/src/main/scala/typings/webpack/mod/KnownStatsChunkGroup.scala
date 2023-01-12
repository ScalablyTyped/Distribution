package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsChunkGroup extends StObject {
  
  var assets: js.UndefOr[js.Array[Size]] = js.undefined
  
  var assetsSize: js.UndefOr[Double] = js.undefined
  
  var auxiliaryAssets: js.UndefOr[js.Array[Size]] = js.undefined
  
  var auxiliaryAssetsSize: js.UndefOr[Double] = js.undefined
  
  var childAssets: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  var children: js.UndefOr[StringDictionary[js.Array[StatsChunkGroup]]] = js.undefined
  
  var chunks: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var filteredAssets: js.UndefOr[Double] = js.undefined
  
  var filteredAuxiliaryAssets: js.UndefOr[Double] = js.undefined
  
  var isOverSizeLimit: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object KnownStatsChunkGroup {
  
  inline def apply(): KnownStatsChunkGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownStatsChunkGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnownStatsChunkGroup] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: js.Array[Size]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsSize(value: Double): Self = StObject.set(x, "assetsSize", value.asInstanceOf[js.Any])
    
    inline def setAssetsSizeUndefined: Self = StObject.set(x, "assetsSize", js.undefined)
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: Size*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setAuxiliaryAssets(value: js.Array[Size]): Self = StObject.set(x, "auxiliaryAssets", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryAssetsSize(value: Double): Self = StObject.set(x, "auxiliaryAssetsSize", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryAssetsSizeUndefined: Self = StObject.set(x, "auxiliaryAssetsSize", js.undefined)
    
    inline def setAuxiliaryAssetsUndefined: Self = StObject.set(x, "auxiliaryAssets", js.undefined)
    
    inline def setAuxiliaryAssetsVarargs(value: Size*): Self = StObject.set(x, "auxiliaryAssets", js.Array(value*))
    
    inline def setChildAssets(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "childAssets", value.asInstanceOf[js.Any])
    
    inline def setChildAssetsUndefined: Self = StObject.set(x, "childAssets", js.undefined)
    
    inline def setChildren(value: StringDictionary[js.Array[StatsChunkGroup]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChunks(value: js.Array[String | Double]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    inline def setChunksVarargs(value: (String | Double)*): Self = StObject.set(x, "chunks", js.Array(value*))
    
    inline def setFilteredAssets(value: Double): Self = StObject.set(x, "filteredAssets", value.asInstanceOf[js.Any])
    
    inline def setFilteredAssetsUndefined: Self = StObject.set(x, "filteredAssets", js.undefined)
    
    inline def setFilteredAuxiliaryAssets(value: Double): Self = StObject.set(x, "filteredAuxiliaryAssets", value.asInstanceOf[js.Any])
    
    inline def setFilteredAuxiliaryAssetsUndefined: Self = StObject.set(x, "filteredAuxiliaryAssets", js.undefined)
    
    inline def setIsOverSizeLimit(value: Boolean): Self = StObject.set(x, "isOverSizeLimit", value.asInstanceOf[js.Any])
    
    inline def setIsOverSizeLimitUndefined: Self = StObject.set(x, "isOverSizeLimit", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
