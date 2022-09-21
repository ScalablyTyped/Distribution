package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "SearchFilter")
@js.native
open class SearchFilter protected () extends StObject {
  def this(contentType: MediaControllerContentType) = this()
  def this(contentType: MediaControllerContentType, category: MediaControllerSearchCategory) = this()
  def this(contentType: MediaControllerContentType, category: Unit, keyword: String) = this()
  def this(contentType: MediaControllerContentType, category: MediaControllerSearchCategory, keyword: String) = this()
  def this(contentType: MediaControllerContentType, category: Unit, keyword: String, extraData: Bundle) = this()
  def this(contentType: MediaControllerContentType, category: Unit, keyword: Null, extraData: Bundle) = this()
  def this(contentType: MediaControllerContentType, category: Unit, keyword: Unit, extraData: Bundle) = this()
  def this(
    contentType: MediaControllerContentType,
    category: MediaControllerSearchCategory,
    keyword: String,
    extraData: Bundle
  ) = this()
  def this(
    contentType: MediaControllerContentType,
    category: MediaControllerSearchCategory,
    keyword: Null,
    extraData: Bundle
  ) = this()
  def this(
    contentType: MediaControllerContentType,
    category: MediaControllerSearchCategory,
    keyword: Unit,
    extraData: Bundle
  ) = this()
  
  /**
    * Specifies filter's search category parameter.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    * @throw WebAPIException with error type InvalidValuesError, if keyword is null and new category value is not NO\_CATEGORY.
    */
  var category: MediaControllerSearchCategory = js.native
  
  /**
    * Specifies filter's content type parameter.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter is not compatible with the expected type.
    */
  var contentType: MediaControllerContentType = js.native
  
  /**
    * Additional application-dependent search parameters.
    */
  var extraData: Bundle | Null = js.native
  
  /**
    * Specifies filter's search keyword parameter.
    *
    * @remark Keyword can only be null or empty if the category is set to NO\_CATEGORY.
    *
    * @throw WebAPIException with error type InvalidValuesError, if the category is not NO\_CATEGORY and the keyword is null.
    */
  var keyword: String | Null = js.native
}
