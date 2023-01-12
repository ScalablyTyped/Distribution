package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectStat extends StObject {
  
  var BlockSize: Double
  
  var CumulativeSize: Double
  
  var DataSize: Double
  
  var Hash: Multihash
  
  var LinksSize: Double
  
  var NumLinks: Double
}
object ObjectStat {
  
  inline def apply(
    BlockSize: Double,
    CumulativeSize: Double,
    DataSize: Double,
    Hash: Multihash,
    LinksSize: Double,
    NumLinks: Double
  ): ObjectStat = {
    val __obj = js.Dynamic.literal(BlockSize = BlockSize.asInstanceOf[js.Any], CumulativeSize = CumulativeSize.asInstanceOf[js.Any], DataSize = DataSize.asInstanceOf[js.Any], Hash = Hash.asInstanceOf[js.Any], LinksSize = LinksSize.asInstanceOf[js.Any], NumLinks = NumLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectStat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectStat] (val x: Self) extends AnyVal {
    
    inline def setBlockSize(value: Double): Self = StObject.set(x, "BlockSize", value.asInstanceOf[js.Any])
    
    inline def setCumulativeSize(value: Double): Self = StObject.set(x, "CumulativeSize", value.asInstanceOf[js.Any])
    
    inline def setDataSize(value: Double): Self = StObject.set(x, "DataSize", value.asInstanceOf[js.Any])
    
    inline def setHash(value: Multihash): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
    
    inline def setLinksSize(value: Double): Self = StObject.set(x, "LinksSize", value.asInstanceOf[js.Any])
    
    inline def setNumLinks(value: Double): Self = StObject.set(x, "NumLinks", value.asInstanceOf[js.Any])
  }
}
