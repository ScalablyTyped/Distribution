package typings.thrift.thriftMod.Thrift

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TProtocolExceptionType extends js.Object

@JSImport("thrift", "Thrift.TProtocolExceptionType")
@js.native
object TProtocolExceptionType extends js.Object {
  @js.native
  sealed trait BAD_VERSION extends TProtocolExceptionType
  
  @js.native
  sealed trait DEPTH_LIMIT extends TProtocolExceptionType
  
  @js.native
  sealed trait INVALID_DATA extends TProtocolExceptionType
  
  @js.native
  sealed trait NEGATIVE_SIZE extends TProtocolExceptionType
  
  @js.native
  sealed trait NOT_IMPLEMENTED extends TProtocolExceptionType
  
  @js.native
  sealed trait SIZE_LIMIT extends TProtocolExceptionType
  
  @js.native
  sealed trait UNKNOWN extends TProtocolExceptionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TProtocolExceptionType with Double] = js.native
  /* 4 */ @js.native
  object BAD_VERSION extends TopLevel[BAD_VERSION with Double]
  
  /* 6 */ @js.native
  object DEPTH_LIMIT extends TopLevel[DEPTH_LIMIT with Double]
  
  /* 1 */ @js.native
  object INVALID_DATA extends TopLevel[INVALID_DATA with Double]
  
  /* 2 */ @js.native
  object NEGATIVE_SIZE extends TopLevel[NEGATIVE_SIZE with Double]
  
  /* 5 */ @js.native
  object NOT_IMPLEMENTED extends TopLevel[NOT_IMPLEMENTED with Double]
  
  /* 3 */ @js.native
  object SIZE_LIMIT extends TopLevel[SIZE_LIMIT with Double]
  
  /* 0 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
}

