package typings.vegaLite.anon

import typings.vegaLite.buildSrcVegaDotschemaMod.VgEncodeChannel
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VgChannel] (val x: Self) extends AnyVal {
    
    inline def setVgChannel(value: VgEncodeChannel): Self = StObject.set(x, "vgChannel", value.asInstanceOf[js.Any])
    
    inline def setVgChannelUndefined: Self = StObject.set(x, "vgChannel", js.undefined)
  }
}
