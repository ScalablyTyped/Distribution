package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "Thrift")
@js.native
object ThriftNs extends js.Object {
  @js.native
  sealed trait MessageType extends js.Object
  
  @js.native
  class TApplicationException () extends TException {
    def this(`type`: TApplicationExceptionType) = this()
    def this(`type`: TApplicationExceptionType, message: java.lang.String) = this()
    var code: scala.Double = js.native
    def getCode(): scala.Double = js.native
    def read(input: thriftLib.thriftMod.TProtocol): scala.Unit = js.native
    def write(output: thriftLib.thriftMod.TProtocol): scala.Unit = js.native
  }
  
  @js.native
  sealed trait TApplicationExceptionType extends js.Object
  
  @js.native
  class TException protected ()
    extends nodeLib.Error {
    def this(message: java.lang.String) = this()
    var message: java.lang.String = js.native
    var name: java.lang.String = js.native
    def getMessage(): java.lang.String = js.native
  }
  
  @js.native
  class TProtocolException protected ()
    extends nodeLib.Error {
    def this(`type`: TProtocolExceptionType, message: java.lang.String) = this()
    var message: java.lang.String = js.native
    var name: java.lang.String = js.native
    var `type`: TProtocolExceptionType = js.native
  }
  
  @js.native
  sealed trait TProtocolExceptionType extends js.Object
  
  @js.native
  sealed trait Type extends js.Object
  
  def objectLength(obj: js.Any): scala.Double = js.native
  @js.native
  object MessageType extends js.Object {
    @js.native
    sealed trait CALL
      extends thriftLib.thriftMod.ThriftNs.MessageType
    
    @js.native
    sealed trait EXCEPTION
      extends thriftLib.thriftMod.ThriftNs.MessageType
    
    @js.native
    sealed trait ONEWAY
      extends thriftLib.thriftMod.ThriftNs.MessageType
    
    @js.native
    sealed trait REPLY
      extends thriftLib.thriftMod.ThriftNs.MessageType
    
    /* 1 */ val CALL: CALL with scala.Double = js.native
    /* 3 */ val EXCEPTION: EXCEPTION with scala.Double = js.native
    /* 4 */ val ONEWAY: ONEWAY with scala.Double = js.native
    /* 2 */ val REPLY: REPLY with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[thriftLib.thriftMod.ThriftNs.MessageType with scala.Double] = js.native
  }
  
  @js.native
  object TApplicationExceptionType extends js.Object {
    @js.native
    sealed trait BAD_SEQUENCE_ID
      extends thriftLib.thriftMod.ThriftNs.TApplicationExceptionType
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends thriftLib.thriftMod.ThriftNs.TApplicationExceptionType
    
    @js.native
    sealed trait INVALID_MESSAGE_TYPE
      extends thriftLib.thriftMod.ThriftNs.TApplicationExceptionType
    
    @js.native
    sealed trait INVALID_PROTOCOL
      extends thriftLib.thriftMod.ThriftNs.TApplicationExceptionType
    
    @js.native
    sealed trait INVALID_TRANSFORM
      extends thriftLib.thriftMod.ThriftNs.TApplicationExceptionType
    
    @js.native
    sealed trait MISSING_RESULT
      extends thriftLib.thriftMod.ThriftNs.TApplicationExceptionType
    
    @js.native
    sealed trait PROTOCOL_ERROR
      extends thriftLib.thriftMod.ThriftNs.TApplicationExceptionType
    
    @js.native
    sealed trait UNKNOWN
      extends thriftLib.thriftMod.ThriftNs.TApplicationExceptionType
    
    @js.native
    sealed trait UNKNOWN_METHOD
      extends thriftLib.thriftMod.ThriftNs.TApplicationExceptionType
    
    @js.native
    sealed trait UNSUPPORTED_CLIENT_TYPE
      extends thriftLib.thriftMod.ThriftNs.TApplicationExceptionType
    
    @js.native
    sealed trait WRONG_METHOD_NAME
      extends thriftLib.thriftMod.ThriftNs.TApplicationExceptionType
    
    /* 4 */ val BAD_SEQUENCE_ID: BAD_SEQUENCE_ID with scala.Double = js.native
    /* 6 */ val INTERNAL_ERROR: INTERNAL_ERROR with scala.Double = js.native
    /* 2 */ val INVALID_MESSAGE_TYPE: INVALID_MESSAGE_TYPE with scala.Double = js.native
    /* 9 */ val INVALID_PROTOCOL: INVALID_PROTOCOL with scala.Double = js.native
    /* 8 */ val INVALID_TRANSFORM: INVALID_TRANSFORM with scala.Double = js.native
    /* 5 */ val MISSING_RESULT: MISSING_RESULT with scala.Double = js.native
    /* 7 */ val PROTOCOL_ERROR: PROTOCOL_ERROR with scala.Double = js.native
    /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
    /* 1 */ val UNKNOWN_METHOD: UNKNOWN_METHOD with scala.Double = js.native
    /* 10 */ val UNSUPPORTED_CLIENT_TYPE: UNSUPPORTED_CLIENT_TYPE with scala.Double = js.native
    /* 3 */ val WRONG_METHOD_NAME: WRONG_METHOD_NAME with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[thriftLib.thriftMod.ThriftNs.TApplicationExceptionType with scala.Double] = js.native
  }
  
  @js.native
  object TProtocolExceptionType extends js.Object {
    @js.native
    sealed trait BAD_VERSION
      extends thriftLib.thriftMod.ThriftNs.TProtocolExceptionType
    
    @js.native
    sealed trait DEPTH_LIMIT
      extends thriftLib.thriftMod.ThriftNs.TProtocolExceptionType
    
    @js.native
    sealed trait INVALID_DATA
      extends thriftLib.thriftMod.ThriftNs.TProtocolExceptionType
    
    @js.native
    sealed trait NEGATIVE_SIZE
      extends thriftLib.thriftMod.ThriftNs.TProtocolExceptionType
    
    @js.native
    sealed trait NOT_IMPLEMENTED
      extends thriftLib.thriftMod.ThriftNs.TProtocolExceptionType
    
    @js.native
    sealed trait SIZE_LIMIT
      extends thriftLib.thriftMod.ThriftNs.TProtocolExceptionType
    
    @js.native
    sealed trait UNKNOWN
      extends thriftLib.thriftMod.ThriftNs.TProtocolExceptionType
    
    /* 4 */ val BAD_VERSION: BAD_VERSION with scala.Double = js.native
    /* 6 */ val DEPTH_LIMIT: DEPTH_LIMIT with scala.Double = js.native
    /* 1 */ val INVALID_DATA: INVALID_DATA with scala.Double = js.native
    /* 2 */ val NEGATIVE_SIZE: NEGATIVE_SIZE with scala.Double = js.native
    /* 5 */ val NOT_IMPLEMENTED: NOT_IMPLEMENTED with scala.Double = js.native
    /* 3 */ val SIZE_LIMIT: SIZE_LIMIT with scala.Double = js.native
    /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[thriftLib.thriftMod.ThriftNs.TProtocolExceptionType with scala.Double] = js.native
  }
  
  @js.native
  object Type extends js.Object {
    @js.native
    sealed trait BOOL
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait BYTE
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait DOUBLE
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait I08
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait I16
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait I32
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait I64
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait LIST
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait MAP
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait SET
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait STOP
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait STRING
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait STRUCT
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait UTF16
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait UTF7
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait UTF8
      extends thriftLib.thriftMod.ThriftNs.Type
    
    @js.native
    sealed trait VOID
      extends thriftLib.thriftMod.ThriftNs.Type
    
    /* 2 */ val BOOL: BOOL with scala.Double = js.native
    /* 3 */ val BYTE: BYTE with scala.Double = js.native
    /* 4 */ val DOUBLE: DOUBLE with scala.Double = js.native
    /* 3 */ val I08: I08 with scala.Double = js.native
    /* 6 */ val I16: I16 with scala.Double = js.native
    /* 8 */ val I32: I32 with scala.Double = js.native
    /* 10 */ val I64: I64 with scala.Double = js.native
    /* 15 */ val LIST: LIST with scala.Double = js.native
    /* 13 */ val MAP: MAP with scala.Double = js.native
    /* 14 */ val SET: SET with scala.Double = js.native
    /* 0 */ val STOP: STOP with scala.Double = js.native
    /* 11 */ val STRING: STRING with scala.Double = js.native
    /* 12 */ val STRUCT: STRUCT with scala.Double = js.native
    /* 17 */ val UTF16: UTF16 with scala.Double = js.native
    /* 11 */ val UTF7: UTF7 with scala.Double = js.native
    /* 16 */ val UTF8: UTF8 with scala.Double = js.native
    /* 1 */ val VOID: VOID with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[thriftLib.thriftMod.ThriftNs.Type with scala.Double] = js.native
  }
  
}

