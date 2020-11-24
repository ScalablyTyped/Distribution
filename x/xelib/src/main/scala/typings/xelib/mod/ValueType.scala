package typings.xelib.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueType extends js.Object
@JSImport("xelib", "ValueType")
@js.native
object ValueType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
  
  @js.native
  sealed trait vtArray extends ValueType
  /* 9 */ @js.native
  object vtArray extends TopLevel[vtArray with Double]
  
  @js.native
  sealed trait vtBytes extends ValueType
  /* 1 */ @js.native
  object vtBytes extends TopLevel[vtBytes with Double]
  
  @js.native
  sealed trait vtColor extends ValueType
  /* 8 */ @js.native
  object vtColor extends TopLevel[vtColor with Double]
  
  @js.native
  sealed trait vtEnum extends ValueType
  /* 7 */ @js.native
  object vtEnum extends TopLevel[vtEnum with Double]
  
  @js.native
  sealed trait vtFlags extends ValueType
  /* 6 */ @js.native
  object vtFlags extends TopLevel[vtFlags with Double]
  
  @js.native
  sealed trait vtNumber extends ValueType
  /* 2 */ @js.native
  object vtNumber extends TopLevel[vtNumber with Double]
  
  @js.native
  sealed trait vtReference extends ValueType
  /* 5 */ @js.native
  object vtReference extends TopLevel[vtReference with Double]
  
  @js.native
  sealed trait vtString extends ValueType
  /* 3 */ @js.native
  object vtString extends TopLevel[vtString with Double]
  
  @js.native
  sealed trait vtStruct extends ValueType
  /* 10 */ @js.native
  object vtStruct extends TopLevel[vtStruct with Double]
  
  @js.native
  sealed trait vtText extends ValueType
  /* 4 */ @js.native
  object vtText extends TopLevel[vtText with Double]
  
  @js.native
  sealed trait vtUnknown extends ValueType
  /* 0 */ @js.native
  object vtUnknown extends TopLevel[vtUnknown with Double]
}
