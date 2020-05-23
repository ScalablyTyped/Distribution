package typings.winrtUwp.Windows.Web.Http

import typings.std.Array
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.ItemsHttpCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a collection container for instances of the HttpCookie class. */
@js.native
trait HttpCookieCollection extends Array[HttpCookie] {
  /** Gets the number of cookies in the HttpCookieCollection . */
  var size: Double = js.native
  /**
    * Retrieves an iterator to the first HttpCookie item in the HttpCookieCollection .
    * @return An iterator to the first HttpCookie item in the HttpCookieCollection .
    */
  def first(): IIterator[HttpCookie] = js.native
  /**
    * Returns the HttpCookie at the specified index from the HttpCookieCollection .
    * @param index The zero-based index of a specified item in the HttpCookieCollection .
    * @return The HTTP cookie at the specified index from the HttpCookieCollection .
    */
  def getAt(index: Double): HttpCookie = js.native
  /**
    * Retrieves the HttpCookie items that start at the specified index in the HttpCookieCollection .
    * @param startIndex The zero-based index of the start of the HttpCookie items in the HttpCookieCollection .
    */
  def getMany(startIndex: Double): ItemsHttpCookie = js.native
  def indexOf(value: HttpCookie, extra: js.Any*): Index = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: HttpCookie): Double = js.native
}

