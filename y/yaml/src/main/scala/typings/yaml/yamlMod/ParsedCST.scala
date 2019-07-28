package typings.yaml.yamlMod

import typings.std.Array
import typings.yaml.yamlMod.cstNs.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedCST extends Array[Document] {
  def setOrigRanges(): Boolean = js.native
}

