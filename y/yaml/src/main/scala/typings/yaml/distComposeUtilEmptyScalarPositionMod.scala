package typings.yaml

import typings.yaml.distParseCstMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeUtilEmptyScalarPositionMod {
  
  @JSImport("yaml/dist/compose/util-empty-scalar-position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def emptyScalarPosition(offset: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyScalarPosition")(offset.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def emptyScalarPosition(offset: Double, before: js.Array[Token]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyScalarPosition")(offset.asInstanceOf[js.Any], before.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def emptyScalarPosition(offset: Double, before: js.Array[Token], pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyScalarPosition")(offset.asInstanceOf[js.Any], before.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def emptyScalarPosition(offset: Double, before: Unit, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyScalarPosition")(offset.asInstanceOf[js.Any], before.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
}
