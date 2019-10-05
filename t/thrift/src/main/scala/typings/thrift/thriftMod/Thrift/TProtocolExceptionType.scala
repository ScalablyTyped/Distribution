package typings.thrift.thriftMod.Thrift

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
  
  /* 4 */ val BAD_VERSION: typings.thrift.thriftMod.Thrift.TProtocolExceptionType.BAD_VERSION with Double = js.native
  /* 6 */ val DEPTH_LIMIT: typings.thrift.thriftMod.Thrift.TProtocolExceptionType.DEPTH_LIMIT with Double = js.native
  /* 1 */ val INVALID_DATA: typings.thrift.thriftMod.Thrift.TProtocolExceptionType.INVALID_DATA with Double = js.native
  /* 2 */ val NEGATIVE_SIZE: typings.thrift.thriftMod.Thrift.TProtocolExceptionType.NEGATIVE_SIZE with Double = js.native
  /* 5 */ val NOT_IMPLEMENTED: typings.thrift.thriftMod.Thrift.TProtocolExceptionType.NOT_IMPLEMENTED with Double = js.native
  /* 3 */ val SIZE_LIMIT: typings.thrift.thriftMod.Thrift.TProtocolExceptionType.SIZE_LIMIT with Double = js.native
  /* 0 */ val UNKNOWN: typings.thrift.thriftMod.Thrift.TProtocolExceptionType.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TProtocolExceptionType with Double] = js.native
}

