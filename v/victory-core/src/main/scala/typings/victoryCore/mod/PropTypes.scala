package typings.victoryCore.mod

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.victoryCore.propTypesMod.D3Scale
import typings.victoryCore.propTypesMod.ScaleName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PropTypes {
  
  @JSImport("victory-core/lib", "PropTypes")
  @js.native
  val ^ : js.Any = js.native
  
  inline def allOfType[T](validators: js.Array[Validator[T]]): Requireable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allOfType")(validators.asInstanceOf[js.Any]).asInstanceOf[Requireable[js.UndefOr[T]]]
  
  inline def deprecated[T](propType: Validator[T], explanation: String): Validator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(propType.asInstanceOf[js.Any], explanation.asInstanceOf[js.Any])).asInstanceOf[Validator[T]]
  
  @JSImport("victory-core/lib", "PropTypes.domain")
  @js.native
  val domain: Requireable[js.UndefOr[js.Tuple2[Double, Double]]] = js.native
  
  @JSImport("victory-core/lib", "PropTypes.greaterThanZero")
  @js.native
  val greaterThanZero: Requireable[js.UndefOr[Double]] = js.native
  
  @JSImport("victory-core/lib", "PropTypes.homogeneousArray")
  @js.native
  val homogeneousArray: Requireable[js.UndefOr[js.Array[Any]]] = js.native
  
  @JSImport("victory-core/lib", "PropTypes.integer")
  @js.native
  val integer: Requireable[js.UndefOr[Double]] = js.native
  
  @JSImport("victory-core/lib", "PropTypes.matchDataLength")
  @js.native
  val matchDataLength: Requireable[js.UndefOr[js.Array[Any]]] = js.native
  
  @JSImport("victory-core/lib", "PropTypes.nonNegative")
  @js.native
  val nonNegative: Requireable[js.UndefOr[Double]] = js.native
  
  @JSImport("victory-core/lib", "PropTypes.regExp")
  @js.native
  val regExp: Requireable[js.UndefOr[js.RegExp]] = js.native
  
  @JSImport("victory-core/lib", "PropTypes.scale")
  @js.native
  val scale: Requireable[js.UndefOr[ScaleName | D3Scale[Any]]] = js.native
}
