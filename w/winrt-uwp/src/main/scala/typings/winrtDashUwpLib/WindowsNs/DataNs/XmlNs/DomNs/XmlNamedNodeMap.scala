package typings
package winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates iteration through the collection of attribute nodes. */
@JSGlobal("Windows.Data.Xml.Dom.XmlNamedNodeMap")
@js.native
abstract class XmlNamedNodeMap ()
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
  /**
    * Retrieves the attribute with the specified name.
    * @param name The name of the attribute.
    * @return The returned attribute with the specified name. This method returns Null if the attribute node is not in this collection.
    */
  def getNamedItem(name: java.lang.String): IXmlNode = js.native
  /**
    * Retrieves the attribute with the specified namespace and name.
    * @param namespaceUri The namespace name of the attribute.
    * @param name The name of the attribute.
    * @return The attribute with the specified namespace and name. This method returns Null if the attribute node is not in this collection.
    */
  def getNamedItemNS(namespaceUri: js.Any, name: java.lang.String): IXmlNode = js.native
  def indexOf(value: IXmlNode, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Returns the index of a specified item in the vector view.
    * @param value The item to find in the vector view.
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: IXmlNode): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Allows random access to individual nodes within the collection.
    * @param index The index of the item within the collection. The first item is zero.
    * @return The object to access. This method returns null if the index is out of range.
    */
  def item(index: scala.Double): IXmlNode = js.native
  /**
    * Removes the specified item.
    * @param name The name of the attribute to remove from the collection.
    * @return The node removed from the collection. This method returns Null if the named node is not an attribute.
    */
  def removeNamedItem(name: java.lang.String): IXmlNode = js.native
  /**
    * Removes an item that is specified by a namespace and local name.
    * @param namespaceUri The namespace name of the attribute.
    * @param name The name of the attribute.
    * @return The node removed from the collection. This method returns Null if the named node is not an attribute.
    */
  def removeNamedItemNS(namespaceUri: js.Any, name: java.lang.String): IXmlNode = js.native
  /**
    * Adds the specified node to the collection.
    * @param node The node to add to the collection.
    * @return The attribute successfully added to the collection. If Null, no object is created.
    */
  def setNamedItem(node: IXmlNode): IXmlNode = js.native
  /**
    * Adds the specified node to the collection in the specified namespace. If you are not using any namespaces, then use the SetNamedItem method.
    * @param node The node to add to the collection.
    * @return The attribute successfully added to the collection. If Null, no object is created.
    */
  def setNamedItemNS(node: IXmlNode): IXmlNode = js.native
}

