package typings.thrift.mod.Thrift

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TApplicationExceptionType extends StObject
@JSImport("thrift", "Thrift.TApplicationExceptionType")
@js.native
object TApplicationExceptionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TApplicationExceptionType & Double] = js.native
  
  @js.native
  sealed trait BAD_SEQUENCE_ID
    extends StObject
       with TApplicationExceptionType
  /* 4 */ val BAD_SEQUENCE_ID: typings.thrift.mod.Thrift.TApplicationExceptionType.BAD_SEQUENCE_ID & Double = js.native
  
  @js.native
  sealed trait INTERNAL_ERROR
    extends StObject
       with TApplicationExceptionType
  /* 6 */ val INTERNAL_ERROR: typings.thrift.mod.Thrift.TApplicationExceptionType.INTERNAL_ERROR & Double = js.native
  
  @js.native
  sealed trait INVALID_MESSAGE_TYPE
    extends StObject
       with TApplicationExceptionType
  /* 2 */ val INVALID_MESSAGE_TYPE: typings.thrift.mod.Thrift.TApplicationExceptionType.INVALID_MESSAGE_TYPE & Double = js.native
  
  @js.native
  sealed trait INVALID_PROTOCOL
    extends StObject
       with TApplicationExceptionType
  /* 9 */ val INVALID_PROTOCOL: typings.thrift.mod.Thrift.TApplicationExceptionType.INVALID_PROTOCOL & Double = js.native
  
  @js.native
  sealed trait INVALID_TRANSFORM
    extends StObject
       with TApplicationExceptionType
  /* 8 */ val INVALID_TRANSFORM: typings.thrift.mod.Thrift.TApplicationExceptionType.INVALID_TRANSFORM & Double = js.native
  
  @js.native
  sealed trait MISSING_RESULT
    extends StObject
       with TApplicationExceptionType
  /* 5 */ val MISSING_RESULT: typings.thrift.mod.Thrift.TApplicationExceptionType.MISSING_RESULT & Double = js.native
  
  @js.native
  sealed trait PROTOCOL_ERROR
    extends StObject
       with TApplicationExceptionType
  /* 7 */ val PROTOCOL_ERROR: typings.thrift.mod.Thrift.TApplicationExceptionType.PROTOCOL_ERROR & Double = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with TApplicationExceptionType
  /* 0 */ val UNKNOWN: typings.thrift.mod.Thrift.TApplicationExceptionType.UNKNOWN & Double = js.native
  
  @js.native
  sealed trait UNKNOWN_METHOD
    extends StObject
       with TApplicationExceptionType
  /* 1 */ val UNKNOWN_METHOD: typings.thrift.mod.Thrift.TApplicationExceptionType.UNKNOWN_METHOD & Double = js.native
  
  @js.native
  sealed trait UNSUPPORTED_CLIENT_TYPE
    extends StObject
       with TApplicationExceptionType
  /* 10 */ val UNSUPPORTED_CLIENT_TYPE: typings.thrift.mod.Thrift.TApplicationExceptionType.UNSUPPORTED_CLIENT_TYPE & Double = js.native
  
  @js.native
  sealed trait WRONG_METHOD_NAME
    extends StObject
       with TApplicationExceptionType
  /* 3 */ val WRONG_METHOD_NAME: typings.thrift.mod.Thrift.TApplicationExceptionType.WRONG_METHOD_NAME & Double = js.native
}
