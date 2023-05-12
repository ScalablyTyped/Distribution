package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OEM extends StObject
@JSImport("tesseract.js", "OEM")
@js.native
object OEM extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OEM & Double] = js.native
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with OEM
  /* 3 */ val DEFAULT: typings.tesseractJs.mod.OEM.DEFAULT & Double = js.native
  
  @js.native
  sealed trait LSTM_ONLY
    extends StObject
       with OEM
  /* 1 */ val LSTM_ONLY: typings.tesseractJs.mod.OEM.LSTM_ONLY & Double = js.native
  
  @js.native
  sealed trait TESSERACT_LSTM_COMBINED
    extends StObject
       with OEM
  /* 2 */ val TESSERACT_LSTM_COMBINED: typings.tesseractJs.mod.OEM.TESSERACT_LSTM_COMBINED & Double = js.native
  
  @js.native
  sealed trait TESSERACT_ONLY
    extends StObject
       with OEM
  /* 0 */ val TESSERACT_ONLY: typings.tesseractJs.mod.OEM.TESSERACT_ONLY & Double = js.native
}
