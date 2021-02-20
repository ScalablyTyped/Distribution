package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlattenLayerArgs extends LayerArgs {
  
  /** Image data format: channeLast (default) or channelFirst. */
  var dataFormat: js.UndefOr[DataFormat] = js.native
}
object FlattenLayerArgs {
  
  @scala.inline
  def apply(): FlattenLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlattenLayerArgs]
  }
  
  @scala.inline
  implicit class FlattenLayerArgsMutableBuilder[Self <: FlattenLayerArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
  }
}
