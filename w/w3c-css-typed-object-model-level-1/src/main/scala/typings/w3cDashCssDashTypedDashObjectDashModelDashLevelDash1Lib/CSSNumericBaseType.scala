package typings
package w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CSSNumericBaseType extends js.Object

@JSGlobal("CSSNumericBaseType")
@js.native
object CSSNumericBaseType extends js.Object {
  @js.native
  sealed trait angle
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSNumericBaseType
  
  @js.native
  sealed trait flex
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSNumericBaseType
  
  @js.native
  sealed trait frequency
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSNumericBaseType
  
  @js.native
  sealed trait length
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSNumericBaseType
  
  @js.native
  sealed trait percent
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSNumericBaseType
  
  @js.native
  sealed trait resolution
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSNumericBaseType
  
  @js.native
  sealed trait time
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSNumericBaseType
  
  /* 1 */ val angle: angle with scala.Double = js.native
  /* 5 */ val flex: flex with scala.Double = js.native
  /* 3 */ val frequency: frequency with scala.Double = js.native
  /* 0 */ val length: length with scala.Double = js.native
  /* 6 */ val percent: percent with scala.Double = js.native
  /* 4 */ val resolution: resolution with scala.Double = js.native
  /* 2 */ val time: time with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSNumericBaseType with scala.Double
  ] = js.native
}

