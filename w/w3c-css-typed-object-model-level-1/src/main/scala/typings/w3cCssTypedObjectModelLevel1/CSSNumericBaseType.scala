package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CSSNumericBaseType with Double] = js.native
  /* 1 */ @js.native
  object angle extends TopLevel[angle with Double]
  
  /* 5 */ @js.native
  object flex extends TopLevel[flex with Double]
  
  /* 3 */ @js.native
  object frequency extends TopLevel[frequency with Double]
  
  /* 0 */ @js.native
  object length extends TopLevel[length with Double]
  
  /* 6 */ @js.native
  object percent extends TopLevel[percent with Double]
  
  /* 4 */ @js.native
  object resolution extends TopLevel[resolution with Double]
  
  /* 2 */ @js.native
  object time extends TopLevel[time with Double]
  
}

