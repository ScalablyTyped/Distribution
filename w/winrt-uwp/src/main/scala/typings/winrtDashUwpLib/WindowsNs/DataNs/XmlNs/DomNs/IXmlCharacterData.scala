package typings
package winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides text manipulation methods that are used by several objects. */

trait IXmlCharacterData extends IXmlNode {
  /** Gets or sets the node data depending on the node type. */
  var data: java.lang.String
  /** Gets the length of the data, in Unicode characters. */
  var length: scala.Double
  /**
                       * Appends the supplied string to the existing string data.
                       * @param data The data to be appended to the existing string.
                       */
  def appendData(data: java.lang.String): scala.Unit
  /**
                       * Deletes specified data.
                       * @param offset The offset, in characters, at which to start deleting the string data.
                       * @param count The number of characters to delete.
                       */
  def deleteData(offset: scala.Double, count: scala.Double): scala.Unit
  /**
                       * Inserts a string at the specified offset.
                       * @param offset The offset, in characters, at which to insert the supplied string data.
                       * @param data The data to be inserted into the existing string.
                       */
  def insertData(offset: scala.Double, data: java.lang.String): scala.Unit
  /**
                       * Replaces the specified number of characters with the supplied string.
                       * @param offset The offset, in characters, at which to start replacing string data.
                       * @param count The number of characters to replace.
                       * @param data The new data that replaces the old string data.
                       */
  def replaceData(offset: scala.Double, count: scala.Double, data: java.lang.String): scala.Unit
  /**
                       * Retrieves a substring of the full string from the specified range.
                       * @param offset Specifies the offset, in characters, from the beginning of the string. An offset of zero indicates copying from the start of the data.
                       * @param count Specifies the number of characters to retrieve from the specified offset.
                       * @return The returned substring.
                       */
  def substringData(offset: scala.Double, count: scala.Double): java.lang.String
}

