package typings.tensorflowTfjsLayers.distLayersCoreMod

import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.DataFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlattenLayerArgs
  extends StObject
     with LayerArgs {
  
  /** Image data format: channelsLast (default) or channelsFirst. */
  var dataFormat: js.UndefOr[DataFormat] = js.undefined
}
object FlattenLayerArgs {
  
  inline def apply(): FlattenLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlattenLayerArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlattenLayerArgs] (val x: Self) extends AnyVal {
    
    inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
  }
}
