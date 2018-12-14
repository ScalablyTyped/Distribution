package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharacterData
  extends ChildNode
     with NonDocumentTypeChildNode {
  var data: java.lang.String = js.native
  val length: scala.Double = js.native
  def appendData(data: java.lang.String): scala.Unit = js.native
  def deleteData(offset: scala.Double, count: scala.Double): scala.Unit = js.native
  def insertData(offset: scala.Double, data: java.lang.String): scala.Unit = js.native
  def replaceData(offset: scala.Double, count: scala.Double, data: java.lang.String): scala.Unit = js.native
  def substringData(offset: scala.Double, count: scala.Double): java.lang.String = js.native
}

@JSGlobal("CharacterData")
@js.native
object CharacterData
  extends org.scalablytyped.runtime.Instantiable0[CharacterData]

