package typings.vegaLite.anon

import typings.vegaLite.vegaSchemaMod.VgEncodeChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreVgConfig extends StObject {
  
  var ignoreVgConfig: js.UndefOr[Boolean] = js.undefined
  
  var vgChannel: js.UndefOr[VgEncodeChannel] = js.undefined
}
object IgnoreVgConfig {
  
  inline def apply(): IgnoreVgConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreVgConfig]
  }
  
  extension [Self <: IgnoreVgConfig](x: Self) {
    
    inline def setIgnoreVgConfig(value: Boolean): Self = StObject.set(x, "ignoreVgConfig", value.asInstanceOf[js.Any])
    
    inline def setIgnoreVgConfigUndefined: Self = StObject.set(x, "ignoreVgConfig", js.undefined)
    
    inline def setVgChannel(value: VgEncodeChannel): Self = StObject.set(x, "vgChannel", value.asInstanceOf[js.Any])
    
    inline def setVgChannelUndefined: Self = StObject.set(x, "vgChannel", js.undefined)
  }
}
