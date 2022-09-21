package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorSourceImpl
  extends StObject
     with VectorSource
     with AnySourceImpl {
  
  /**
    * Sets the source `tiles` property and re-renders the map.
    *
    * @param tiles An array of one or more tile source URLs, as in the TileJSON spec.
    * @returns this
    */
  def setTiles(tiles: js.Array[String]): VectorSourceImpl
  
  /**
    * Sets the source `url` property and re-renders the map.
    *
    * @param url A URL to a TileJSON resource. Supported protocols are `http:` and `https:`.
    * @returns this
    */
  def setUrl(url: String): VectorSourceImpl
}
object VectorSourceImpl {
  
  inline def apply(setTiles: js.Array[String] => VectorSourceImpl, setUrl: String => VectorSourceImpl): VectorSourceImpl = {
    val __obj = js.Dynamic.literal(setTiles = js.Any.fromFunction1(setTiles), setUrl = js.Any.fromFunction1(setUrl))
    __obj.updateDynamic("type")("vector")
    __obj.asInstanceOf[VectorSourceImpl]
  }
  
  extension [Self <: VectorSourceImpl](x: Self) {
    
    inline def setSetTiles(value: js.Array[String] => VectorSourceImpl): Self = StObject.set(x, "setTiles", js.Any.fromFunction1(value))
    
    inline def setSetUrl(value: String => VectorSourceImpl): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
  }
}
