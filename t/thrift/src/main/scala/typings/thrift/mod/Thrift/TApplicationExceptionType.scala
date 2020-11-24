package typings.thrift.mod.Thrift

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TApplicationExceptionType extends js.Object
@JSImport("thrift", "Thrift.TApplicationExceptionType")
@js.native
object TApplicationExceptionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TApplicationExceptionType with Double] = js.native
  
  @js.native
  sealed trait BAD_SEQUENCE_ID extends TApplicationExceptionType
  /* 4 */ @js.native
  object BAD_SEQUENCE_ID extends TopLevel[BAD_SEQUENCE_ID with Double]
  
  @js.native
  sealed trait INTERNAL_ERROR extends TApplicationExceptionType
  /* 6 */ @js.native
  object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with Double]
  
  @js.native
  sealed trait INVALID_MESSAGE_TYPE extends TApplicationExceptionType
  /* 2 */ @js.native
  object INVALID_MESSAGE_TYPE extends TopLevel[INVALID_MESSAGE_TYPE with Double]
  
  @js.native
  sealed trait INVALID_PROTOCOL extends TApplicationExceptionType
  /* 9 */ @js.native
  object INVALID_PROTOCOL extends TopLevel[INVALID_PROTOCOL with Double]
  
  @js.native
  sealed trait INVALID_TRANSFORM extends TApplicationExceptionType
  /* 8 */ @js.native
  object INVALID_TRANSFORM extends TopLevel[INVALID_TRANSFORM with Double]
  
  @js.native
  sealed trait MISSING_RESULT extends TApplicationExceptionType
  /* 5 */ @js.native
  object MISSING_RESULT extends TopLevel[MISSING_RESULT with Double]
  
  @js.native
  sealed trait PROTOCOL_ERROR extends TApplicationExceptionType
  /* 7 */ @js.native
  object PROTOCOL_ERROR extends TopLevel[PROTOCOL_ERROR with Double]
  
  @js.native
  sealed trait UNKNOWN extends TApplicationExceptionType
  /* 0 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  @js.native
  sealed trait UNKNOWN_METHOD extends TApplicationExceptionType
  /* 1 */ @js.native
  object UNKNOWN_METHOD extends TopLevel[UNKNOWN_METHOD with Double]
  
  @js.native
  sealed trait UNSUPPORTED_CLIENT_TYPE extends TApplicationExceptionType
  /* 10 */ @js.native
  object UNSUPPORTED_CLIENT_TYPE extends TopLevel[UNSUPPORTED_CLIENT_TYPE with Double]
  
  @js.native
  sealed trait WRONG_METHOD_NAME extends TApplicationExceptionType
  /* 3 */ @js.native
  object WRONG_METHOD_NAME extends TopLevel[WRONG_METHOD_NAME with Double]
}
