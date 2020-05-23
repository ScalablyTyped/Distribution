package typings.yaml.parseCstMod

import typings.std.Array
import typings.yaml.parseCstMod.CST.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedCST extends Array[Document] {
  def setOrigRanges(): Boolean = js.native
}

