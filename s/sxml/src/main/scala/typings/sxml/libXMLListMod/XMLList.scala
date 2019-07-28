package typings.sxml.libXMLListMod

import typings.sxml.libXMLMod.XML
import typings.tstl.tstlMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sxml/lib/XMLList", "XMLList")
@js.native
class XMLList () extends Vector[XML] {
  def getTag(): String = js.native
  def toString(level: Double): String = js.native
}

