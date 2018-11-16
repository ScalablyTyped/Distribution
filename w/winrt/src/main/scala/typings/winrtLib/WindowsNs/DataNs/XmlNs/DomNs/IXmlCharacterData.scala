package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IXmlCharacterData extends IXmlNode {
  var data: java.lang.String
  var length: scala.Double
  def appendData(data: java.lang.String): scala.Unit
  def deleteData(offset: scala.Double, count: scala.Double): scala.Unit
  def insertData(offset: scala.Double, data: java.lang.String): scala.Unit
  def replaceData(offset: scala.Double, count: scala.Double, data: java.lang.String): scala.Unit
  def substringData(offset: scala.Double, count: scala.Double): java.lang.String
}

