package typings
package winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a collection of nodes. */
@JSGlobal("Windows.Data.Xml.Dom.XmlNodeList")
@js.native
abstract class XmlNodeList ()
  extends stdLib.Array[IXmlNode] {
  /** Gets the number of elements in the vector view. */
  var size: scala.Double = js.native
  /**
                       * Returns an iterator that iterates over the items in the collection.
                       * @return The iterator.
                       */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[IXmlNode] = js.native
  /**
                       * Returns the item at the specified index in the vector view.
                       * @param index The zero-based index of the item in the vector view to return.
                       * @return The item in the vector view at the specified index.
                       */
  def getAt(index: scala.Double): IXmlNode = js.native
  /**
                       * Returns the items that start at the specified index of the vector view.
                       * @param startIndex The zero-based index of the start of the items in the vector to return.
                       */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueIXmlNode = js.native
  def indexOf(value: IXmlNode, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
                       * Returns the index of a specified item in the vector.
                       * @param value The item to find in the vector.
                       */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: IXmlNode): winrtDashUwpLib.Anon_Index = js.native
  /**
                       * Returns the item in the list at the specified index.
                       * @param index The zero-based index of the requested item.
                       * @return The requested item. This method returns NULL if the index is not valid.
                       */
  def item(index: scala.Double): IXmlNode = js.native
}

