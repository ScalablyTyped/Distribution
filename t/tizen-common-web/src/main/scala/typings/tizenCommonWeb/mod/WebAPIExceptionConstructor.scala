package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
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

@js.native
trait WebAPIExceptionConstructor
  extends StObject
     with Instantiable0[WebAPIException]
     with Instantiable1[/* code */ Double, WebAPIException]
     with Instantiable2[(/* code */ Double) | (/* code */ Null), /* message */ String, WebAPIException]
     with Instantiable3[
      (/* code */ Double) | (/* code */ Null), 
      (/* message */ Null) | (/* message */ String), 
      /* name */ String, 
      WebAPIException
    ] {
  
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
}
