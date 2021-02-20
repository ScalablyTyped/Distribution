package typings.vegaLite.anon

import typings.vegaLite.vegaSchemaMod.VgEncodeChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VgChannel extends StObject {
  
  var vgChannel: js.UndefOr[VgEncodeChannel] = js.native
}
object VgChannel {
  
  @scala.inline
  def apply(): VgChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VgChannel]
  }
  
  @scala.inline
  implicit class VgChannelMutableBuilder[Self <: VgChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVgChannel(value: VgEncodeChannel): Self = StObject.set(x, "vgChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVgChannelUndefined: Self = StObject.set(x, "vgChannel", js.undefined)
  }
}
