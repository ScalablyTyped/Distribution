package typings.undici.typesErrorsMod

import typings.std.Error
import typings.std.Record
import typings.undici.typesClientMod.Client.SocketInfo
import typings.undici.typesHeaderMod.IncomingHttpHeaders
import typings.undici.undiciStrings.AbortError
import typings.undici.undiciStrings.MissingUpstreamError
import typings.undici.undiciStrings.UND_ERR_ABORTED
import typings.undici.undiciStrings.UND_ERR_BODY_TIMEOUT
import typings.undici.undiciStrings.UND_ERR_BPL_MISSING_UPSTREAM
import typings.undici.undiciStrings.UND_ERR_CLOSED
import typings.undici.undiciStrings.UND_ERR_CONNECT_TIMEOUT
import typings.undici.undiciStrings.UND_ERR_DESTROYED
import typings.undici.undiciStrings.UND_ERR_HEADERS_OVERFLOW
import typings.undici.undiciStrings.UND_ERR_HEADERS_TIMEOUT
import typings.undici.undiciStrings.UND_ERR_INFO
import typings.undici.undiciStrings.UND_ERR_INVALID_ARG
import typings.undici.undiciStrings.UND_ERR_INVALID_RETURN_VALUE
import typings.undici.undiciStrings.UND_ERR_NOT_SUPPORTED
import typings.undici.undiciStrings.UND_ERR_REQ_CONTENT_LENGTH_MISMATCH
import typings.undici.undiciStrings.UND_ERR_RESPONSE_STATUS_CODE
import typings.undici.undiciStrings.UND_ERR_RES_CONTENT_LENGTH_MISMATCH
import typings.undici.undiciStrings.UND_ERR_RES_EXCEEDED_MAX_SIZE
import typings.undici.undiciStrings.UND_ERR_SOCKET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("undici/types/errors", "default.BalancedPoolMissingUpstreamError")
  @js.native
  open class BalancedPoolMissingUpstreamError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.BalancedPoolMissingUpstreamError {
    
    /* CompleteClass */
    var code: UND_ERR_BPL_MISSING_UPSTREAM = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_BalancedPoolMissingUpstreamError: MissingUpstreamError = js.native
  }
  
  @JSImport("undici/types/errors", "default.BodyTimeoutError")
  @js.native
  open class BodyTimeoutError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.BodyTimeoutError {
    
    /* CompleteClass */
    var code: UND_ERR_BODY_TIMEOUT = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_BodyTimeoutError: typings.undici.undiciStrings.BodyTimeoutError = js.native
  }
  
  @JSImport("undici/types/errors", "default.ClientClosedError")
  @js.native
  open class ClientClosedError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.ClientClosedError {
    
    /* CompleteClass */
    var code: UND_ERR_CLOSED = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_ClientClosedError: typings.undici.undiciStrings.ClientClosedError = js.native
  }
  
  @JSImport("undici/types/errors", "default.ClientDestroyedError")
  @js.native
  open class ClientDestroyedError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.ClientDestroyedError {
    
    /* CompleteClass */
    var code: UND_ERR_DESTROYED = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_ClientDestroyedError: typings.undici.undiciStrings.ClientDestroyedError = js.native
  }
  
  @JSImport("undici/types/errors", "default.ConnectTimeoutError")
  @js.native
  open class ConnectTimeoutError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.ConnectTimeoutError {
    
    /* CompleteClass */
    var code: UND_ERR_CONNECT_TIMEOUT = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_ConnectTimeoutError: typings.undici.undiciStrings.ConnectTimeoutError = js.native
  }
  
  @JSImport("undici/types/errors", "default.HTTPParserError")
  @js.native
  open class HTTPParserError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.HTTPParserError {
    
    /* CompleteClass */
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_HTTPParserError: typings.undici.undiciStrings.HTTPParserError = js.native
  }
  
  @JSImport("undici/types/errors", "default.HeadersOverflowError")
  @js.native
  open class HeadersOverflowError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.HeadersOverflowError {
    
    /* CompleteClass */
    var code: UND_ERR_HEADERS_OVERFLOW = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_HeadersOverflowError: typings.undici.undiciStrings.HeadersOverflowError = js.native
  }
  
  @JSImport("undici/types/errors", "default.HeadersTimeoutError")
  @js.native
  open class HeadersTimeoutError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.HeadersTimeoutError {
    
    /* CompleteClass */
    var code: UND_ERR_HEADERS_TIMEOUT = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_HeadersTimeoutError: typings.undici.undiciStrings.HeadersTimeoutError = js.native
  }
  
  @JSImport("undici/types/errors", "default.InformationalError")
  @js.native
  open class InformationalError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.InformationalError {
    
    /* CompleteClass */
    var code: UND_ERR_INFO = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_InformationalError: typings.undici.undiciStrings.InformationalError = js.native
  }
  
  @JSImport("undici/types/errors", "default.InvalidArgumentError")
  @js.native
  open class InvalidArgumentError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.InvalidArgumentError {
    
    /* CompleteClass */
    var code: UND_ERR_INVALID_ARG = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_InvalidArgumentError: typings.undici.undiciStrings.InvalidArgumentError = js.native
  }
  
  @JSImport("undici/types/errors", "default.InvalidReturnValueError")
  @js.native
  open class InvalidReturnValueError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.InvalidReturnValueError {
    
    /* CompleteClass */
    var code: UND_ERR_INVALID_RETURN_VALUE = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_InvalidReturnValueError: typings.undici.undiciStrings.InvalidReturnValueError = js.native
  }
  
  @JSImport("undici/types/errors", "default.NotSupportedError")
  @js.native
  open class NotSupportedError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.NotSupportedError {
    
    /* CompleteClass */
    var code: UND_ERR_NOT_SUPPORTED = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_NotSupportedError: typings.undici.undiciStrings.NotSupportedError = js.native
  }
  
  @JSImport("undici/types/errors", "default.RequestAbortedError")
  @js.native
  open class RequestAbortedError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.RequestAbortedError {
    
    /* CompleteClass */
    var code: UND_ERR_ABORTED = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_RequestAbortedError: AbortError = js.native
  }
  
  @JSImport("undici/types/errors", "default.RequestContentLengthMismatchError")
  @js.native
  open class RequestContentLengthMismatchError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.RequestContentLengthMismatchError {
    
    /* CompleteClass */
    var code: UND_ERR_REQ_CONTENT_LENGTH_MISMATCH = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_RequestContentLengthMismatchError: typings.undici.undiciStrings.RequestContentLengthMismatchError = js.native
  }
  
  @JSImport("undici/types/errors", "default.ResponseContentLengthMismatchError")
  @js.native
  open class ResponseContentLengthMismatchError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.ResponseContentLengthMismatchError {
    
    /* CompleteClass */
    var code: UND_ERR_RES_CONTENT_LENGTH_MISMATCH = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_ResponseContentLengthMismatchError: typings.undici.undiciStrings.ResponseContentLengthMismatchError = js.native
  }
  
  @JSImport("undici/types/errors", "default.ResponseExceededMaxSizeError")
  @js.native
  open class ResponseExceededMaxSizeError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.ResponseExceededMaxSizeError {
    
    /* CompleteClass */
    var code: UND_ERR_RES_EXCEEDED_MAX_SIZE = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_ResponseExceededMaxSizeError: typings.undici.undiciStrings.ResponseExceededMaxSizeError = js.native
  }
  
  @JSImport("undici/types/errors", "default.ResponseStatusCodeError")
  @js.native
  open class ResponseStatusCodeError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.ResponseStatusCodeError {
    
    /* CompleteClass */
    var body: Null | (Record[String, Any]) | String = js.native
    
    /* CompleteClass */
    var code: UND_ERR_RESPONSE_STATUS_CODE = js.native
    
    /* CompleteClass */
    var headers: IncomingHttpHeaders | js.Array[String] | Null = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_ResponseStatusCodeError: typings.undici.undiciStrings.ResponseStatusCodeError = js.native
    
    /* CompleteClass */
    var status: Double = js.native
    
    /* CompleteClass */
    var statusCode: Double = js.native
  }
  
  @JSImport("undici/types/errors", "default.SocketError")
  @js.native
  open class SocketError ()
    extends StObject
       with typings.undici.typesErrorsMod.Errors.SocketError {
    
    /* CompleteClass */
    var code: UND_ERR_SOCKET = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_SocketError: typings.undici.undiciStrings.SocketError = js.native
    
    /* CompleteClass */
    var socket: SocketInfo | Null = js.native
  }
  
  @JSImport("undici/types/errors", "default.UndiciError")
  @js.native
  open class UndiciError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
