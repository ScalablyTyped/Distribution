package typings.thrift.mod.Thrift

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TProtocolExceptionType extends js.Object
@JSImport("thrift", "Thrift.TProtocolExceptionType")
@js.native
object TProtocolExceptionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TProtocolExceptionType with Double] = js.native
  
  @js.native
  sealed trait BAD_VERSION extends TProtocolExceptionType
  /* 4 */ @js.native
  object BAD_VERSION extends TopLevel[BAD_VERSION with Double]
  
  @js.native
  sealed trait DEPTH_LIMIT extends TProtocolExceptionType
  /* 6 */ @js.native
  object DEPTH_LIMIT extends TopLevel[DEPTH_LIMIT with Double]
  
  @js.native
  sealed trait INVALID_DATA extends TProtocolExceptionType
  /* 1 */ @js.native
  object INVALID_DATA extends TopLevel[INVALID_DATA with Double]
  
  @js.native
  sealed trait NEGATIVE_SIZE extends TProtocolExceptionType
  /* 2 */ @js.native
  object NEGATIVE_SIZE extends TopLevel[NEGATIVE_SIZE with Double]
  
  @js.native
  sealed trait NOT_IMPLEMENTED extends TProtocolExceptionType
  /* 5 */ @js.native
  object NOT_IMPLEMENTED extends TopLevel[NOT_IMPLEMENTED with Double]
  
  @js.native
  sealed trait SIZE_LIMIT extends TProtocolExceptionType
  /* 3 */ @js.native
  object SIZE_LIMIT extends TopLevel[SIZE_LIMIT with Double]
  
  @js.native
  sealed trait UNKNOWN extends TProtocolExceptionType
  /* 0 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
}
