package typings.vegaLite.anon

import typings.vegaLite.vegaSchemaMod.VgEncodeChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VgChannel extends StObject {
  
  var vgChannel: js.UndefOr[VgEncodeChannel] = js.undefined
}
object VgChannel {
  
  inline def apply(): VgChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VgChannel]
  }
  
  extension [Self <: VgChannel](x: Self) {
    
    inline def setVgChannel(value: VgEncodeChannel): Self = StObject.set(x, "vgChannel", value.asInstanceOf[js.Any])
    
    inline def setVgChannelUndefined: Self = StObject.set(x, "vgChannel", js.undefined)
  }
}
