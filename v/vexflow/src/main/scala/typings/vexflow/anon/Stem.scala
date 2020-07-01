package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stem extends js.Object {
  var clef: String
  var stem: String
  var time: String
}

object Stem {
  @scala.inline
  def apply(clef: String, stem: String, time: String): Stem = {
    val __obj = js.Dynamic.literal(clef = clef.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stem]
  }
}

