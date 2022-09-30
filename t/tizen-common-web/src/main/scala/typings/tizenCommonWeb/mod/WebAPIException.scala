package typings.tizenCommonWeb.mod

import typings.tizenCommonWeb.tizenCommonWebInts.`10`
import typings.tizenCommonWeb.tizenCommonWebInts.`11`
import typings.tizenCommonWeb.tizenCommonWebInts.`12`
import typings.tizenCommonWeb.tizenCommonWebInts.`13`
import typings.tizenCommonWeb.tizenCommonWebInts.`14`
import typings.tizenCommonWeb.tizenCommonWebInts.`15`
import typings.tizenCommonWeb.tizenCommonWebInts.`16`
import typings.tizenCommonWeb.tizenCommonWebInts.`17`
import typings.tizenCommonWeb.tizenCommonWebInts.`18`
import typings.tizenCommonWeb.tizenCommonWebInts.`19`
import typings.tizenCommonWeb.tizenCommonWebInts.`1`
import typings.tizenCommonWeb.tizenCommonWebInts.`20`
import typings.tizenCommonWeb.tizenCommonWebInts.`21`
import typings.tizenCommonWeb.tizenCommonWebInts.`22`
import typings.tizenCommonWeb.tizenCommonWebInts.`23`
import typings.tizenCommonWeb.tizenCommonWebInts.`24`
import typings.tizenCommonWeb.tizenCommonWebInts.`25`
import typings.tizenCommonWeb.tizenCommonWebInts.`2`
import typings.tizenCommonWeb.tizenCommonWebInts.`3`
import typings.tizenCommonWeb.tizenCommonWebInts.`4`
import typings.tizenCommonWeb.tizenCommonWebInts.`5`
import typings.tizenCommonWeb.tizenCommonWebInts.`6`
import typings.tizenCommonWeb.tizenCommonWebInts.`7`
import typings.tizenCommonWeb.tizenCommonWebInts.`8`
import typings.tizenCommonWeb.tizenCommonWebInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "WebAPIException")
@js.native
open class WebAPIException () extends StObject {
  def this(code: Double) = this()
  def this(code: Double, message: String) = this()
  def this(code: Null, message: String) = this()
  def this(code: Double, message: String, name: String) = this()
  def this(code: Double, message: Null, name: String) = this()
  def this(code: Null, message: String, name: String) = this()
  def this(code: Null, message: Null, name: String) = this()
  
  /**
    * The operation has been aborted.
    */
  val ABORT_ERR: `20` = js.native
  
  /**
    * The object cannot be cloned.
    */
  val DATA_CLONE_ERR: `25` = js.native
  
  /**
    * The specified range of text is too large.
    */
  val DOMSTRING_SIZE_ERR: `2` = js.native
  
  /**
    * The operation would yield an incorrect node tree.
    */
  val HIERARCHY_REQUEST_ERR: `3` = js.native
  
  /**
    * The index is not in the allowed range.
    */
  val INDEX_SIZE_ERR: `1` = js.native
  
  /**
    * The specified attribute is already in use elsewhere.
    */
  val INUSE_ATTRIBUTE_ERR: `10` = js.native
  
  /**
    * The object does not support the operation or argument.
    */
  val INVALID_ACCESS_ERR: `15` = js.native
  
  /**
    * The string contains invalid characters.
    */
  val INVALID_CHARACTER_ERR: `5` = js.native
  
  /**
    * The object cannot be modified in this way.
    */
  val INVALID_MODIFICATION_ERR: `13` = js.native
  
  /**
    * The supplied node is incorrect or has an incorrect ancestor for this operation.
    */
  val INVALID_NODE_TYPE_ERR: `24` = js.native
  
  /**
    * The object is in an invalid state.
    */
  val INVALID_STATE_ERR: `11` = js.native
  
  /**
    * The operation is not allowed by Namespaces in XML.
    */
  val NAMESPACE_ERR: `14` = js.native
  
  /**
    * A network error occurred.
    */
  val NETWORK_ERR: `19` = js.native
  
  /**
    * The object cannot be found here.
    */
  val NOT_FOUND_ERR: `8` = js.native
  
  /**
    * The operation is not supported.
    */
  val NOT_SUPPORTED_ERR: `9` = js.native
  
  /**
    * Data is specified for a node that does not support data.
    */
  val NO_DATA_ALLOWED_ERR: `6` = js.native
  
  /**
    * The object cannot be modified.
    */
  val NO_MODIFICATION_ALLOWED_ERR: `7` = js.native
  
  /**
    * The quota has been exceeded.
    */
  val QUOTA_EXCEEDED_ERR: `22` = js.native
  
  /**
    * The operation is insecure.
    */
  val SECURITY_ERR: `18` = js.native
  
  /**
    * The string did not match the expected pattern.
    */
  val SYNTAX_ERR: `12` = js.native
  
  /**
    * The operation has timed out.
    */
  val TIMEOUT_ERR: `23` = js.native
  
  /**
    * The type of the object does not match the expected type.
    */
  val TYPE_MISMATCH_ERR: `17` = js.native
  
  /**
    * The given URL does not match another URL.
    */
  val URL_MISMATCH_ERR: `21` = js.native
  
  /**
    * The operation would cause the node to fail validation.
    */
  val VALIDATION_ERR: `16` = js.native
  
  /**
    * The object is in the wrong document.
    */
  val WRONG_DOCUMENT_ERR: `4` = js.native
  
  /**
    * 16-bit error code.
    *
    * For the possible values of this attribute, see [DOMException](http://www.w3.org/TR/dom/#domexception).
    */
  val code: Double = js.native
  
  /**
    * An error message that describes the details of an encountered error.
    *
    * This attribute is mainly intended to be used for developers rather than end users, so it should not be used directly in the user interfaces as it is.
    */
  val message: String = js.native
  
  /**
    * An error type. The name attribute must return the value it had been initialized with.
    *
    * This attribute can have one of the following values:
    *
    * *   UnknownError - An unknown error has occurred.
    * *   InvalidValuesError - The content of an object does not contain valid values.
    * *   IOError - An error occurred in communication with the underlying implementation and so the requested method cannot be completed.
    * *   ServiceNotAvailableError - The requested service is not available.
    * *   VerificationError - An error occurred in authentication and so the requested method cannot be completed.
    *
    * For other possible values of this attribute, see the values defined in [DOM error names](http://www.w3.org/TR/dom/#error-names-0)
    */
  val name: String = js.native
}
