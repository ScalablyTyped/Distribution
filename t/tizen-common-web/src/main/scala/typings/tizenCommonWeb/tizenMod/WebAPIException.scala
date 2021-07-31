package typings.tizenCommonWeb.tizenMod

import typings.tizenCommonWeb.tizenCommonWebNumbers.`10`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`11`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`12`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`13`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`14`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`15`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`16`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`17`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`18`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`19`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`1`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`20`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`21`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`22`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`23`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`24`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`25`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`2`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`3`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`4`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`5`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`6`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`7`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`8`
import typings.tizenCommonWeb.tizenCommonWebNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAPIException extends StObject {
  
  /**
    * The operation has been aborted.
    */
  val ABORT_ERR: `20`
  
  /**
    * The object cannot be cloned.
    */
  val DATA_CLONE_ERR: `25`
  
  /**
    * The specified range of text is too large.
    */
  val DOMSTRING_SIZE_ERR: `2`
  
  // historical.
  /**
    * The operation would yield an incorrect node tree.
    */
  val HIERARCHY_REQUEST_ERR: `3`
  
  /**
    * The index is not in the allowed range.
    */
  val INDEX_SIZE_ERR: `1`
  
  /**
    * The specified attribute is already in use elsewhere.
    */
  val INUSE_ATTRIBUTE_ERR: `10`
  
  /**
    * The object does not support the operation or argument.
    */
  val INVALID_ACCESS_ERR: `15`
  
  /**
    * The string contains invalid characters.
    */
  val INVALID_CHARACTER_ERR: `5`
  
  /**
    * The object cannot be modified in this way.
    */
  val INVALID_MODIFICATION_ERR: `13`
  
  /**
    * The supplied node is incorrect or has an incorrect ancestor for this operation.
    */
  val INVALID_NODE_TYPE_ERR: `24`
  
  // historical.
  /**
    * The object is in an invalid state.
    */
  val INVALID_STATE_ERR: `11`
  
  /**
    * The operation is not allowed by Namespaces in XML.
    */
  val NAMESPACE_ERR: `14`
  
  /**
    * A network error occurred.
    */
  val NETWORK_ERR: `19`
  
  /**
    * The object cannot be found here.
    */
  val NOT_FOUND_ERR: `8`
  
  /**
    * The operation is not supported.
    */
  val NOT_SUPPORTED_ERR: `9`
  
  /**
    * Data is specified for a node that does not support data.
    */
  val NO_DATA_ALLOWED_ERR: `6`
  
  // historical.
  /**
    * The object cannot be modified.
    */
  val NO_MODIFICATION_ALLOWED_ERR: `7`
  
  /**
    * The quota has been exceeded.
    */
  val QUOTA_EXCEEDED_ERR: `22`
  
  /**
    * The operation is insecure.
    */
  val SECURITY_ERR: `18`
  
  /**
    * The string did not match the expected pattern.
    */
  val SYNTAX_ERR: `12`
  
  /**
    * The operation has timed out.
    */
  val TIMEOUT_ERR: `23`
  
  // historical.
  /**
    * The type of the object does not match the expected type.
    */
  val TYPE_MISMATCH_ERR: `17`
  
  /**
    * The given URL does not match another URL.
    */
  val URL_MISMATCH_ERR: `21`
  
  /**
    * The operation would cause the node to fail validation.
    */
  val VALIDATION_ERR: `16`
  
  /**
    * The object is in the wrong document.
    */
  val WRONG_DOCUMENT_ERR: `4`
  
  /**
    * 16-bit error code.
    *
    * For the possible values of this attribute, see [DOMException](http://www.w3.org/TR/dom/#domexception).
    */
  val code: Double
  
  /**
    * An error message that describes the details of an encountered error.
    *
    * This attribute is mainly intended to be used for developers rather than end users, so it should not be used directly in the user interfaces as it is.
    */
  val message: String
  
  /**
    * An error type. The name attribute must return the value it had been initialized with.
    *
    *  This attribute can have one of the following value
    * - UnknownError : An unknown error has occurred.
    * - InvalidValuesError : The content of an object does not contain valid values.
    * - IOError : An error occurred in communication with the underlying implementation and so the requested method cannot be completed.
    * - ServiceNotAvailableError : The requested service is not available.
    * - VerificationError : An error occurred in authentication and so the requested method cannot be completed.
    * For other possible values of this attribute, see the values defined in [DOM error names](http://www.w3.org/TR/dom/#error-names-0).
    */
  val name: String
}
object WebAPIException {
  
  @scala.inline
  def apply(code: Double, message: String, name: String): WebAPIException = {
    val __obj = js.Dynamic.literal(ABORT_ERR = 20, DATA_CLONE_ERR = 25, DOMSTRING_SIZE_ERR = 2, HIERARCHY_REQUEST_ERR = 3, INDEX_SIZE_ERR = 1, INUSE_ATTRIBUTE_ERR = 10, INVALID_ACCESS_ERR = 15, INVALID_CHARACTER_ERR = 5, INVALID_MODIFICATION_ERR = 13, INVALID_NODE_TYPE_ERR = 24, INVALID_STATE_ERR = 11, NAMESPACE_ERR = 14, NETWORK_ERR = 19, NOT_FOUND_ERR = 8, NOT_SUPPORTED_ERR = 9, NO_DATA_ALLOWED_ERR = 6, NO_MODIFICATION_ALLOWED_ERR = 7, QUOTA_EXCEEDED_ERR = 22, SECURITY_ERR = 18, SYNTAX_ERR = 12, TIMEOUT_ERR = 23, TYPE_MISMATCH_ERR = 17, URL_MISMATCH_ERR = 21, VALIDATION_ERR = 16, WRONG_DOCUMENT_ERR = 4, code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAPIException]
  }
  
  @scala.inline
  implicit class WebAPIExceptionMutableBuilder[Self <: WebAPIException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setABORT_ERR(value: `20`): Self = StObject.set(x, "ABORT_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDATA_CLONE_ERR(value: `25`): Self = StObject.set(x, "DATA_CLONE_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMSTRING_SIZE_ERR(value: `2`): Self = StObject.set(x, "DOMSTRING_SIZE_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHIERARCHY_REQUEST_ERR(value: `3`): Self = StObject.set(x, "HIERARCHY_REQUEST_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINDEX_SIZE_ERR(value: `1`): Self = StObject.set(x, "INDEX_SIZE_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINUSE_ATTRIBUTE_ERR(value: `10`): Self = StObject.set(x, "INUSE_ATTRIBUTE_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINVALID_ACCESS_ERR(value: `15`): Self = StObject.set(x, "INVALID_ACCESS_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINVALID_CHARACTER_ERR(value: `5`): Self = StObject.set(x, "INVALID_CHARACTER_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINVALID_MODIFICATION_ERR(value: `13`): Self = StObject.set(x, "INVALID_MODIFICATION_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINVALID_NODE_TYPE_ERR(value: `24`): Self = StObject.set(x, "INVALID_NODE_TYPE_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINVALID_STATE_ERR(value: `11`): Self = StObject.set(x, "INVALID_STATE_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNAMESPACE_ERR(value: `14`): Self = StObject.set(x, "NAMESPACE_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNETWORK_ERR(value: `19`): Self = StObject.set(x, "NETWORK_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_FOUND_ERR(value: `8`): Self = StObject.set(x, "NOT_FOUND_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_SUPPORTED_ERR(value: `9`): Self = StObject.set(x, "NOT_SUPPORTED_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_DATA_ALLOWED_ERR(value: `6`): Self = StObject.set(x, "NO_DATA_ALLOWED_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_MODIFICATION_ALLOWED_ERR(value: `7`): Self = StObject.set(x, "NO_MODIFICATION_ALLOWED_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUOTA_EXCEEDED_ERR(value: `22`): Self = StObject.set(x, "QUOTA_EXCEEDED_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSECURITY_ERR(value: `18`): Self = StObject.set(x, "SECURITY_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSYNTAX_ERR(value: `12`): Self = StObject.set(x, "SYNTAX_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTIMEOUT_ERR(value: `23`): Self = StObject.set(x, "TIMEOUT_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTYPE_MISMATCH_ERR(value: `17`): Self = StObject.set(x, "TYPE_MISMATCH_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL_MISMATCH_ERR(value: `21`): Self = StObject.set(x, "URL_MISMATCH_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVALIDATION_ERR(value: `16`): Self = StObject.set(x, "VALIDATION_ERR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWRONG_DOCUMENT_ERR(value: `4`): Self = StObject.set(x, "WRONG_DOCUMENT_ERR", value.asInstanceOf[js.Any])
  }
}
