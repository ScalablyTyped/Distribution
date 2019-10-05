package typings.thrift.thriftMod.Thrift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TApplicationExceptionType extends js.Object

@JSImport("thrift", "Thrift.TApplicationExceptionType")
@js.native
object TApplicationExceptionType extends js.Object {
  @js.native
  sealed trait BAD_SEQUENCE_ID extends TApplicationExceptionType
  
  @js.native
  sealed trait INTERNAL_ERROR extends TApplicationExceptionType
  
  @js.native
  sealed trait INVALID_MESSAGE_TYPE extends TApplicationExceptionType
  
  @js.native
  sealed trait INVALID_PROTOCOL extends TApplicationExceptionType
  
  @js.native
  sealed trait INVALID_TRANSFORM extends TApplicationExceptionType
  
  @js.native
  sealed trait MISSING_RESULT extends TApplicationExceptionType
  
  @js.native
  sealed trait PROTOCOL_ERROR extends TApplicationExceptionType
  
  @js.native
  sealed trait UNKNOWN extends TApplicationExceptionType
  
  @js.native
  sealed trait UNKNOWN_METHOD extends TApplicationExceptionType
  
  @js.native
  sealed trait UNSUPPORTED_CLIENT_TYPE extends TApplicationExceptionType
  
  @js.native
  sealed trait WRONG_METHOD_NAME extends TApplicationExceptionType
  
  /* 4 */ val BAD_SEQUENCE_ID: typings.thrift.thriftMod.Thrift.TApplicationExceptionType.BAD_SEQUENCE_ID with Double = js.native
  /* 6 */ val INTERNAL_ERROR: typings.thrift.thriftMod.Thrift.TApplicationExceptionType.INTERNAL_ERROR with Double = js.native
  /* 2 */ val INVALID_MESSAGE_TYPE: typings.thrift.thriftMod.Thrift.TApplicationExceptionType.INVALID_MESSAGE_TYPE with Double = js.native
  /* 9 */ val INVALID_PROTOCOL: typings.thrift.thriftMod.Thrift.TApplicationExceptionType.INVALID_PROTOCOL with Double = js.native
  /* 8 */ val INVALID_TRANSFORM: typings.thrift.thriftMod.Thrift.TApplicationExceptionType.INVALID_TRANSFORM with Double = js.native
  /* 5 */ val MISSING_RESULT: typings.thrift.thriftMod.Thrift.TApplicationExceptionType.MISSING_RESULT with Double = js.native
  /* 7 */ val PROTOCOL_ERROR: typings.thrift.thriftMod.Thrift.TApplicationExceptionType.PROTOCOL_ERROR with Double = js.native
  /* 0 */ val UNKNOWN: typings.thrift.thriftMod.Thrift.TApplicationExceptionType.UNKNOWN with Double = js.native
  /* 1 */ val UNKNOWN_METHOD: typings.thrift.thriftMod.Thrift.TApplicationExceptionType.UNKNOWN_METHOD with Double = js.native
  /* 10 */ val UNSUPPORTED_CLIENT_TYPE: typings.thrift.thriftMod.Thrift.TApplicationExceptionType.UNSUPPORTED_CLIENT_TYPE with Double = js.native
  /* 3 */ val WRONG_METHOD_NAME: typings.thrift.thriftMod.Thrift.TApplicationExceptionType.WRONG_METHOD_NAME with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TApplicationExceptionType with Double] = js.native
}

