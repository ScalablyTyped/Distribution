package typings.vegaLite.anon

import typings.vegaLite.vegaSchemaMod.VgEncodeChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreVgConfig extends StObject {
  
  var ignoreVgConfig: js.UndefOr[Boolean] = js.native
  
  var vgChannel: js.UndefOr[VgEncodeChannel] = js.native
}
object IgnoreVgConfig {
  
  @scala.inline
  def apply(): IgnoreVgConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreVgConfig]
  }
  
  @scala.inline
  implicit class IgnoreVgConfigMutableBuilder[Self <: IgnoreVgConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreVgConfig(value: Boolean): Self = StObject.set(x, "ignoreVgConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreVgConfigUndefined: Self = StObject.set(x, "ignoreVgConfig", js.undefined)
    
    @scala.inline
    def setVgChannel(value: VgEncodeChannel): Self = StObject.set(x, "vgChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVgChannelUndefined: Self = StObject.set(x, "vgChannel", js.undefined)
  }
}
