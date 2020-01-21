package typings.winrtUwp.Windows.Foundation

import typings.std.Array
import typings.winrtUwp.AnonIndex
import typings.winrtUwp.AnonItemsReturnValue
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parses a URL query string, and exposes the results as a read-only vector (list) of name-value pairs from the query string. */
@JSGlobal("Windows.Foundation.WwwFormUrlDecoder")
@js.native
class WwwFormUrlDecoder protected () extends Array[IWwwFormUrlDecoderEntry] {
  /**
    * Creates and initializes a new instance of the WwwFormUrlDecoder class.
    * @param query The URL to parse.
    */
  def this(query: String) = this()
  /** Gets the number of the name-value pairs in the current URL query string. */
  var size: Double = js.native
  /**
    * Gets an iterator that represents the first name-value pair in the current URL query string.
    * @return The first name-value pair.
    */
  def first(): IIterator[IWwwFormUrlDecoderEntry] = js.native
  /**
    * Gets the name-value pair at the specified index in the current URL query string.
    * @param index The index of the name-value pair.
    * @return The name-value pair at the position specified by index.
    */
  def getAt(index: Double): IWwwFormUrlDecoderEntry = js.native
  /**
    * Gets the first name-value pair that has the specified name, as obtained from the constructing Uniform Resource Identifier (URI) query string.
    * @param name The name of the value to get.
    * @return The first value in list order that corresponds with name.
    */
  def getFirstValueByName(name: String): String = js.native
  /**
    * Gets name-value pairs starting at the specified index in the current URL query string.
    * @param startIndex The index to start getting name-value pairs at.
    */
  def getMany(startIndex: Double): AnonItemsReturnValue = js.native
  def indexOf(value: IWwwFormUrlDecoderEntry, extra: js.Any*): AnonIndex = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: IWwwFormUrlDecoderEntry): Double = js.native
}

