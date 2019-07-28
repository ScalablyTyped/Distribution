package typings.thrift.thriftMod

import typings.std.Error
import typings.thrift.thriftMod.ThriftNs.MessageType
import typings.thrift.thriftMod.ThriftNs.TApplicationExceptionType
import typings.thrift.thriftMod.ThriftNs.TException
import typings.thrift.thriftMod.ThriftNs.TProtocolExceptionType
import typings.thrift.thriftMod.ThriftNs.Type
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
    def this(`type`: TApplicationExceptionType, message: String) = this()
    var code: Double = js.native
    def getCode(): Double = js.native
    def read(input: TProtocol): Unit = js.native
    def write(output: TProtocol): Unit = js.native
  }
  
  @js.native
  sealed trait TApplicationExceptionType extends js.Object
  
  @js.native
  class TException protected () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    def getMessage(): String = js.native
  }
  
  @js.native
  class TProtocolException protected () extends Error {
    def this(`type`: TProtocolExceptionType, message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var `type`: TProtocolExceptionType = js.native
  }
  
  @js.native
  sealed trait TProtocolExceptionType extends js.Object
  
  @js.native
  sealed trait Type extends js.Object
  
  def objectLength(obj: js.Any): Double = js.native
  @js.native
  object MessageType extends js.Object {
    @js.native
    sealed trait CALL extends MessageType
    
    @js.native
    sealed trait EXCEPTION extends MessageType
    
    @js.native
    sealed trait ONEWAY extends MessageType
    
    @js.native
    sealed trait REPLY extends MessageType
    
    /* 1 */ val CALL: typings.thrift.thriftMod.ThriftNs.MessageType.CALL with Double = js.native
    /* 3 */ val EXCEPTION: typings.thrift.thriftMod.ThriftNs.MessageType.EXCEPTION with Double = js.native
    /* 4 */ val ONEWAY: typings.thrift.thriftMod.ThriftNs.MessageType.ONEWAY with Double = js.native
    /* 2 */ val REPLY: typings.thrift.thriftMod.ThriftNs.MessageType.REPLY with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageType with Double] = js.native
  }
  
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
    
    /* 4 */ val BAD_SEQUENCE_ID: typings.thrift.thriftMod.ThriftNs.TApplicationExceptionType.BAD_SEQUENCE_ID with Double = js.native
    /* 6 */ val INTERNAL_ERROR: typings.thrift.thriftMod.ThriftNs.TApplicationExceptionType.INTERNAL_ERROR with Double = js.native
    /* 2 */ val INVALID_MESSAGE_TYPE: typings.thrift.thriftMod.ThriftNs.TApplicationExceptionType.INVALID_MESSAGE_TYPE with Double = js.native
    /* 9 */ val INVALID_PROTOCOL: typings.thrift.thriftMod.ThriftNs.TApplicationExceptionType.INVALID_PROTOCOL with Double = js.native
    /* 8 */ val INVALID_TRANSFORM: typings.thrift.thriftMod.ThriftNs.TApplicationExceptionType.INVALID_TRANSFORM with Double = js.native
    /* 5 */ val MISSING_RESULT: typings.thrift.thriftMod.ThriftNs.TApplicationExceptionType.MISSING_RESULT with Double = js.native
    /* 7 */ val PROTOCOL_ERROR: typings.thrift.thriftMod.ThriftNs.TApplicationExceptionType.PROTOCOL_ERROR with Double = js.native
    /* 0 */ val UNKNOWN: typings.thrift.thriftMod.ThriftNs.TApplicationExceptionType.UNKNOWN with Double = js.native
    /* 1 */ val UNKNOWN_METHOD: typings.thrift.thriftMod.ThriftNs.TApplicationExceptionType.UNKNOWN_METHOD with Double = js.native
    /* 10 */ val UNSUPPORTED_CLIENT_TYPE: typings.thrift.thriftMod.ThriftNs.TApplicationExceptionType.UNSUPPORTED_CLIENT_TYPE with Double = js.native
    /* 3 */ val WRONG_METHOD_NAME: typings.thrift.thriftMod.ThriftNs.TApplicationExceptionType.WRONG_METHOD_NAME with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TApplicationExceptionType with Double] = js.native
  }
  
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
    
    /* 4 */ val BAD_VERSION: typings.thrift.thriftMod.ThriftNs.TProtocolExceptionType.BAD_VERSION with Double = js.native
    /* 6 */ val DEPTH_LIMIT: typings.thrift.thriftMod.ThriftNs.TProtocolExceptionType.DEPTH_LIMIT with Double = js.native
    /* 1 */ val INVALID_DATA: typings.thrift.thriftMod.ThriftNs.TProtocolExceptionType.INVALID_DATA with Double = js.native
    /* 2 */ val NEGATIVE_SIZE: typings.thrift.thriftMod.ThriftNs.TProtocolExceptionType.NEGATIVE_SIZE with Double = js.native
    /* 5 */ val NOT_IMPLEMENTED: typings.thrift.thriftMod.ThriftNs.TProtocolExceptionType.NOT_IMPLEMENTED with Double = js.native
    /* 3 */ val SIZE_LIMIT: typings.thrift.thriftMod.ThriftNs.TProtocolExceptionType.SIZE_LIMIT with Double = js.native
    /* 0 */ val UNKNOWN: typings.thrift.thriftMod.ThriftNs.TProtocolExceptionType.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TProtocolExceptionType with Double] = js.native
  }
  
  @js.native
  object Type extends js.Object {
    @js.native
    sealed trait BOOL extends Type
    
    @js.native
    sealed trait BYTE extends Type
    
    @js.native
    sealed trait DOUBLE extends Type
    
    @js.native
    sealed trait I08 extends Type
    
    @js.native
    sealed trait I16 extends Type
    
    @js.native
    sealed trait I32 extends Type
    
    @js.native
    sealed trait I64 extends Type
    
    @js.native
    sealed trait LIST extends Type
    
    @js.native
    sealed trait MAP extends Type
    
    @js.native
    sealed trait SET extends Type
    
    @js.native
    sealed trait STOP extends Type
    
    @js.native
    sealed trait STRING extends Type
    
    @js.native
    sealed trait STRUCT extends Type
    
    @js.native
    sealed trait UTF16 extends Type
    
    @js.native
    sealed trait UTF7 extends Type
    
    @js.native
    sealed trait UTF8 extends Type
    
    @js.native
    sealed trait VOID extends Type
    
    /* 2 */ val BOOL: typings.thrift.thriftMod.ThriftNs.Type.BOOL with Double = js.native
    /* 3 */ val BYTE: typings.thrift.thriftMod.ThriftNs.Type.BYTE with Double = js.native
    /* 4 */ val DOUBLE: typings.thrift.thriftMod.ThriftNs.Type.DOUBLE with Double = js.native
    /* 3 */ val I08: typings.thrift.thriftMod.ThriftNs.Type.I08 with Double = js.native
    /* 6 */ val I16: typings.thrift.thriftMod.ThriftNs.Type.I16 with Double = js.native
    /* 8 */ val I32: typings.thrift.thriftMod.ThriftNs.Type.I32 with Double = js.native
    /* 10 */ val I64: typings.thrift.thriftMod.ThriftNs.Type.I64 with Double = js.native
    /* 15 */ val LIST: typings.thrift.thriftMod.ThriftNs.Type.LIST with Double = js.native
    /* 13 */ val MAP: typings.thrift.thriftMod.ThriftNs.Type.MAP with Double = js.native
    /* 14 */ val SET: typings.thrift.thriftMod.ThriftNs.Type.SET with Double = js.native
    /* 0 */ val STOP: typings.thrift.thriftMod.ThriftNs.Type.STOP with Double = js.native
    /* 11 */ val STRING: typings.thrift.thriftMod.ThriftNs.Type.STRING with Double = js.native
    /* 12 */ val STRUCT: typings.thrift.thriftMod.ThriftNs.Type.STRUCT with Double = js.native
    /* 17 */ val UTF16: typings.thrift.thriftMod.ThriftNs.Type.UTF16 with Double = js.native
    /* 11 */ val UTF7: typings.thrift.thriftMod.ThriftNs.Type.UTF7 with Double = js.native
    /* 16 */ val UTF8: typings.thrift.thriftMod.ThriftNs.Type.UTF8 with Double = js.native
    /* 1 */ val VOID: typings.thrift.thriftMod.ThriftNs.Type.VOID with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Type with Double] = js.native
  }
  
}

