package typings.thrift.mod.Thrift

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TApplicationExceptionType extends StObject
@JSImport("thrift", "Thrift.TApplicationExceptionType")
@js.native
object TApplicationExceptionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TApplicationExceptionType with Double] = js.native
  
  @js.native
  sealed trait BAD_SEQUENCE_ID extends TApplicationExceptionType
  /* 4 */ val BAD_SEQUENCE_ID: typings.thrift.mod.Thrift.TApplicationExceptionType.BAD_SEQUENCE_ID with Double = js.native
  
  @js.native
  sealed trait INTERNAL_ERROR extends TApplicationExceptionType
  /* 6 */ val INTERNAL_ERROR: typings.thrift.mod.Thrift.TApplicationExceptionType.INTERNAL_ERROR with Double = js.native
  
  @js.native
  sealed trait INVALID_MESSAGE_TYPE extends TApplicationExceptionType
  /* 2 */ val INVALID_MESSAGE_TYPE: typings.thrift.mod.Thrift.TApplicationExceptionType.INVALID_MESSAGE_TYPE with Double = js.native
  
  @js.native
  sealed trait INVALID_PROTOCOL extends TApplicationExceptionType
  /* 9 */ val INVALID_PROTOCOL: typings.thrift.mod.Thrift.TApplicationExceptionType.INVALID_PROTOCOL with Double = js.native
  
  @js.native
  sealed trait INVALID_TRANSFORM extends TApplicationExceptionType
  /* 8 */ val INVALID_TRANSFORM: typings.thrift.mod.Thrift.TApplicationExceptionType.INVALID_TRANSFORM with Double = js.native
  
  @js.native
  sealed trait MISSING_RESULT extends TApplicationExceptionType
  /* 5 */ val MISSING_RESULT: typings.thrift.mod.Thrift.TApplicationExceptionType.MISSING_RESULT with Double = js.native
  
  @js.native
  sealed trait PROTOCOL_ERROR extends TApplicationExceptionType
  /* 7 */ val PROTOCOL_ERROR: typings.thrift.mod.Thrift.TApplicationExceptionType.PROTOCOL_ERROR with Double = js.native
  
  @js.native
  sealed trait UNKNOWN extends TApplicationExceptionType
  /* 0 */ val UNKNOWN: typings.thrift.mod.Thrift.TApplicationExceptionType.UNKNOWN with Double = js.native
  
  @js.native
  sealed trait UNKNOWN_METHOD extends TApplicationExceptionType
  /* 1 */ val UNKNOWN_METHOD: typings.thrift.mod.Thrift.TApplicationExceptionType.UNKNOWN_METHOD with Double = js.native
  
  @js.native
  sealed trait UNSUPPORTED_CLIENT_TYPE extends TApplicationExceptionType
  /* 10 */ val UNSUPPORTED_CLIENT_TYPE: typings.thrift.mod.Thrift.TApplicationExceptionType.UNSUPPORTED_CLIENT_TYPE with Double = js.native
  
  @js.native
  sealed trait WRONG_METHOD_NAME extends TApplicationExceptionType
  /* 3 */ val WRONG_METHOD_NAME: typings.thrift.mod.Thrift.TApplicationExceptionType.WRONG_METHOD_NAME with Double = js.native
}
