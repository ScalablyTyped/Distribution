package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptAccountMod.SelectFeeLevel
import typings.trezorConnect.libTypescriptNetworksCoinInfoMod.BitcoinNetworkInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoinInfo extends StObject {
  
  var coinInfo: BitcoinNetworkInfo
  
  var feeLevels: js.Array[SelectFeeLevel]
}
object CoinInfo {
  
  inline def apply(coinInfo: BitcoinNetworkInfo, feeLevels: js.Array[SelectFeeLevel]): CoinInfo = {
    val __obj = js.Dynamic.literal(coinInfo = coinInfo.asInstanceOf[js.Any], feeLevels = feeLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinInfo]
  }
  
  extension [Self <: CoinInfo](x: Self) {
    
    inline def setCoinInfo(value: BitcoinNetworkInfo): Self = StObject.set(x, "coinInfo", value.asInstanceOf[js.Any])
    
    inline def setFeeLevels(value: js.Array[SelectFeeLevel]): Self = StObject.set(x, "feeLevels", value.asInstanceOf[js.Any])
    
    inline def setFeeLevelsVarargs(value: SelectFeeLevel*): Self = StObject.set(x, "feeLevels", js.Array(value*))
  }
}
