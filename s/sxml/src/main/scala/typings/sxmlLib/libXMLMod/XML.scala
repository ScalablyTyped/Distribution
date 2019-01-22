package typings
package sxmlLib.libXMLMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sxml/lib/XML", "XML")
@js.native
class XML ()
  extends tstlLib.tstlMod.HashMap[java.lang.String, sxmlLib.libXMLListMod.XMLList] {
  def this(str: java.lang.String) = this()
  def this(xml: XML) = this()
  /**
    * @hidden
    */
  var _Copy_constructor: js.Any = js.native
  /**
    * @hidden
    */
  var _Parse: js.Any = js.native
  /**
    * @hidden
    */
  var _Parse_children: js.Any = js.native
  /**
    * @hidden
    */
  var _Parse_properties: js.Any = js.native
  /**
    * @hidden
    */
  var _Parse_tag: js.Any = js.native
  /**
    * @hidden
    */
  var _Parse_value: js.Any = js.native
  /**
    * @hidden
    */
  var _Parser_constructor: js.Any = js.native
  /**
    * @hidden
    */
  var `property_map_`: js.Any = js.native
  /**
    * @hidden
    */
  var `tag_`: js.Any = js.native
  /**
    * @hidden
    */
  var `value_`: js.Any = js.native
  def eraseProperty(key: java.lang.String): scala.Unit = js.native
  def findProperty(key: java.lang.String): tstlLib.containerHashMapMod.HashMapNs.Iterator[java.lang.String, java.lang.String] = js.native
  def getProperty(key: java.lang.String): java.lang.String = js.native
  def getPropertyMap(): tstlLib.tstlMod.HashMap[java.lang.String, java.lang.String] = js.native
  def getTag(): java.lang.String = js.native
  def getValue(): java.lang.String = js.native
  def hasProperty(key: java.lang.String): scala.Boolean = js.native
  def insertValue(tag: java.lang.String, value: java.lang.String): XML = js.native
  def setProperty(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setTag(`val`: java.lang.String): scala.Unit = js.native
  def setValue(`val`: java.lang.String): scala.Unit = js.native
  def toString(tab: scala.Double): java.lang.String = js.native
}

@JSImport("sxml/lib/XML", "XML")
@js.native
object XML extends js.Object {
  /**
    * @hidden
    */
  var _Compute_min_index: js.Any = js.native
  /**
    * @hidden
    */
  var _Repeat: js.Any = js.native
}

