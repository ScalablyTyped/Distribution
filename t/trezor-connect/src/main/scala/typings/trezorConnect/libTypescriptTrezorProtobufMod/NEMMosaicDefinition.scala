package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMMosaicDefinition extends StObject {
  
  var description: String
  
  var divisibility: js.UndefOr[Double] = js.undefined
  
  var fee: js.UndefOr[UintType] = js.undefined
  
  var levy: js.UndefOr[NEMMosaicLevy] = js.undefined
  
  var levy_address: js.UndefOr[String] = js.undefined
  
  var levy_mosaic: js.UndefOr[String] = js.undefined
  
  var levy_namespace: js.UndefOr[String] = js.undefined
  
  var mosaic: String
  
  var mutable_supply: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespace: String
  
  var networks: js.UndefOr[js.Array[Double]] = js.undefined
  
  var supply: js.UndefOr[Double] = js.undefined
  
  var ticker: js.UndefOr[String] = js.undefined
  
  var transferable: js.UndefOr[Boolean] = js.undefined
}
object NEMMosaicDefinition {
  
  inline def apply(description: String, mosaic: String, namespace: String): NEMMosaicDefinition = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], mosaic = mosaic.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMMosaicDefinition]
  }
  
  extension [Self <: NEMMosaicDefinition](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDivisibility(value: Double): Self = StObject.set(x, "divisibility", value.asInstanceOf[js.Any])
    
    inline def setDivisibilityUndefined: Self = StObject.set(x, "divisibility", js.undefined)
    
    inline def setFee(value: UintType): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFeeUndefined: Self = StObject.set(x, "fee", js.undefined)
    
    inline def setLevy(value: NEMMosaicLevy): Self = StObject.set(x, "levy", value.asInstanceOf[js.Any])
    
    inline def setLevyUndefined: Self = StObject.set(x, "levy", js.undefined)
    
    inline def setLevy_address(value: String): Self = StObject.set(x, "levy_address", value.asInstanceOf[js.Any])
    
    inline def setLevy_addressUndefined: Self = StObject.set(x, "levy_address", js.undefined)
    
    inline def setLevy_mosaic(value: String): Self = StObject.set(x, "levy_mosaic", value.asInstanceOf[js.Any])
    
    inline def setLevy_mosaicUndefined: Self = StObject.set(x, "levy_mosaic", js.undefined)
    
    inline def setLevy_namespace(value: String): Self = StObject.set(x, "levy_namespace", value.asInstanceOf[js.Any])
    
    inline def setLevy_namespaceUndefined: Self = StObject.set(x, "levy_namespace", js.undefined)
    
    inline def setMosaic(value: String): Self = StObject.set(x, "mosaic", value.asInstanceOf[js.Any])
    
    inline def setMutable_supply(value: Boolean): Self = StObject.set(x, "mutable_supply", value.asInstanceOf[js.Any])
    
    inline def setMutable_supplyUndefined: Self = StObject.set(x, "mutable_supply", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNetworks(value: js.Array[Double]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: Double*): Self = StObject.set(x, "networks", js.Array(value*))
    
    inline def setSupply(value: Double): Self = StObject.set(x, "supply", value.asInstanceOf[js.Any])
    
    inline def setSupplyUndefined: Self = StObject.set(x, "supply", js.undefined)
    
    inline def setTicker(value: String): Self = StObject.set(x, "ticker", value.asInstanceOf[js.Any])
    
    inline def setTickerUndefined: Self = StObject.set(x, "ticker", js.undefined)
    
    inline def setTransferable(value: Boolean): Self = StObject.set(x, "transferable", value.asInstanceOf[js.Any])
    
    inline def setTransferableUndefined: Self = StObject.set(x, "transferable", js.undefined)
  }
}
