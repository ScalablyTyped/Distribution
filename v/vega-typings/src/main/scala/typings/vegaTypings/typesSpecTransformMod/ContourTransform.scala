package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.anon.countnumberSignalRefundef
  - typings.vegaTypings.anon.thresholdsArraynumberSign
*/
trait ContourTransform
  extends StObject
     with Transforms
object ContourTransform {
  
  inline def countnumberSignalRefundef(size: (js.Array[Double | SignalRef]) | SignalRef): typings.vegaTypings.anon.countnumberSignalRefundef = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contour")
    __obj.asInstanceOf[typings.vegaTypings.anon.countnumberSignalRefundef]
  }
  
  inline def thresholdsArraynumberSign(size: (js.Array[Double | SignalRef]) | SignalRef): typings.vegaTypings.anon.thresholdsArraynumberSign = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contour")
    __obj.asInstanceOf[typings.vegaTypings.anon.thresholdsArraynumberSign]
  }
}
