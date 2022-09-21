package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AVPlaySoundAnalysisCallback extends StObject {
  
  /**
    * Provide the Band Array[32] having sound effect information.
    *
    * @param band long Band Array[32] having sound effect information
    *
    * @returns void
    *
    * @version 1.0
    *
    * @note `deprecated` 2.4
    *
    * @since 2.3
    */
  def ongetbandsarray(band: js.Array[Double]): Unit
  
  /**
    * Required forerror handling.
    *
    * @param err WebAPIError
    *
    * @returns void
    *
    * @version 1.0
    *
    * @note `deprecated` 2.4
    *
    * @since 2.3
    */
  def ongetexception(err: WebAPIError): Unit
  
  /**
    * set for error handling.
    *
    * @param err WebAPIError
    *
    * @returns void
    *
    * @version 1.0
    *
    * @note `deprecated` 2.4
    *
    * @since 2.3
    */
  def onsetexception(err: WebAPIError): Unit
}
object AVPlaySoundAnalysisCallback {
  
  inline def apply(
    ongetbandsarray: js.Array[Double] => Unit,
    ongetexception: WebAPIError => Unit,
    onsetexception: WebAPIError => Unit
  ): AVPlaySoundAnalysisCallback = {
    val __obj = js.Dynamic.literal(ongetbandsarray = js.Any.fromFunction1(ongetbandsarray), ongetexception = js.Any.fromFunction1(ongetexception), onsetexception = js.Any.fromFunction1(onsetexception))
    __obj.asInstanceOf[AVPlaySoundAnalysisCallback]
  }
  
  extension [Self <: AVPlaySoundAnalysisCallback](x: Self) {
    
    inline def setOngetbandsarray(value: js.Array[Double] => Unit): Self = StObject.set(x, "ongetbandsarray", js.Any.fromFunction1(value))
    
    inline def setOngetexception(value: WebAPIError => Unit): Self = StObject.set(x, "ongetexception", js.Any.fromFunction1(value))
    
    inline def setOnsetexception(value: WebAPIError => Unit): Self = StObject.set(x, "onsetexception", js.Any.fromFunction1(value))
  }
}
