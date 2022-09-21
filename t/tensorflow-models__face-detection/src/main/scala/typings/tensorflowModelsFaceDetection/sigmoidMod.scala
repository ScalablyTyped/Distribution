package typings.tensorflowModelsFaceDetection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sigmoidMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/sigmoid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sigmoid(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sigmoid")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}
