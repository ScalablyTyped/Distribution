package typings.webpackSources.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replacement extends js.Object {
  val content: String
  val end: Double
  val insertIndex: Double
  val name: String
  val start: Double
}

object Replacement {
  @scala.inline
  def apply(content: String, end: Double, insertIndex: Double, name: String, start: Double): Replacement = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], insertIndex = insertIndex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacement]
  }
}

