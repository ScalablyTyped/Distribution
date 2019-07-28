package typings.w3cDashCssDashTypedDashObjectDashModelDashLevelDash1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CSSNumericBaseType extends js.Object

@JSGlobal("CSSNumericBaseType")
@js.native
object CSSNumericBaseType extends js.Object {
  @js.native
  sealed trait angle extends CSSNumericBaseType
  
  @js.native
  sealed trait flex extends CSSNumericBaseType
  
  @js.native
  sealed trait frequency extends CSSNumericBaseType
  
  @js.native
  sealed trait length extends CSSNumericBaseType
  
  @js.native
  sealed trait percent extends CSSNumericBaseType
  
  @js.native
  sealed trait resolution extends CSSNumericBaseType
  
  @js.native
  sealed trait time extends CSSNumericBaseType
  
  /* 1 */ val angle: typings.w3cDashCssDashTypedDashObjectDashModelDashLevelDash1.CSSNumericBaseType.angle with Double = js.native
  /* 5 */ val flex: typings.w3cDashCssDashTypedDashObjectDashModelDashLevelDash1.CSSNumericBaseType.flex with Double = js.native
  /* 3 */ val frequency: typings.w3cDashCssDashTypedDashObjectDashModelDashLevelDash1.CSSNumericBaseType.frequency with Double = js.native
  /* 0 */ val length: typings.w3cDashCssDashTypedDashObjectDashModelDashLevelDash1.CSSNumericBaseType.length with Double = js.native
  /* 6 */ val percent: typings.w3cDashCssDashTypedDashObjectDashModelDashLevelDash1.CSSNumericBaseType.percent with Double = js.native
  /* 4 */ val resolution: typings.w3cDashCssDashTypedDashObjectDashModelDashLevelDash1.CSSNumericBaseType.resolution with Double = js.native
  /* 2 */ val time: typings.w3cDashCssDashTypedDashObjectDashModelDashLevelDash1.CSSNumericBaseType.time with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CSSNumericBaseType with Double] = js.native
}

