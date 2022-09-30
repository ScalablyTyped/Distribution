package typings.victoryCore

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.victoryCore.propTypesMod.D3Scale
import typings.victoryCore.propTypesMod.ScaleName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object victoryUtilPropTypesMod {
  
  @JSImport("victory-core/lib/victory-util/prop-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allOfType[T](validators: js.Array[Validator[T]]): Requireable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allOfType")(validators.asInstanceOf[js.Any]).asInstanceOf[Requireable[js.UndefOr[T]]]
  
  inline def deprecated[T](propType: Validator[T], explanation: String): Validator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(propType.asInstanceOf[js.Any], explanation.asInstanceOf[js.Any])).asInstanceOf[Validator[T]]
  
  @JSImport("victory-core/lib/victory-util/prop-types", "domain")
  @js.native
  val domain: Requireable[js.UndefOr[js.Tuple2[Double, Double]]] = js.native
  
  @JSImport("victory-core/lib/victory-util/prop-types", "greaterThanZero")
  @js.native
  val greaterThanZero: Requireable[js.UndefOr[Double]] = js.native
  
  @JSImport("victory-core/lib/victory-util/prop-types", "homogeneousArray")
  @js.native
  val homogeneousArray: Requireable[js.UndefOr[js.Array[Any]]] = js.native
  
  @JSImport("victory-core/lib/victory-util/prop-types", "integer")
  @js.native
  val integer: Requireable[js.UndefOr[Double]] = js.native
  
  @JSImport("victory-core/lib/victory-util/prop-types", "matchDataLength")
  @js.native
  val matchDataLength: Requireable[js.UndefOr[js.Array[Any]]] = js.native
  
  @JSImport("victory-core/lib/victory-util/prop-types", "nonNegative")
  @js.native
  val nonNegative: Requireable[js.UndefOr[Double]] = js.native
  
  @JSImport("victory-core/lib/victory-util/prop-types", "regExp")
  @js.native
  val regExp: Requireable[js.UndefOr[js.RegExp]] = js.native
  
  @JSImport("victory-core/lib/victory-util/prop-types", "scale")
  @js.native
  val scale: Requireable[js.UndefOr[ScaleName | D3Scale[Any]]] = js.native
}
