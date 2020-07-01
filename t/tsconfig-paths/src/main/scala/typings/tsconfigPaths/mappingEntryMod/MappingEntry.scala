package typings.tsconfigPaths.mappingEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingEntry extends js.Object {
  val paths: js.Array[String]
  val pattern: String
}

object MappingEntry {
  @scala.inline
  def apply(paths: js.Array[String], pattern: String): MappingEntry = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingEntry]
  }
}

