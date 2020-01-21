package typings.tesseractJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCorePath extends js.Object {
  var corePath: String
  var langPath: String
  var workerPath: String
}

object AnonCorePath {
  @scala.inline
  def apply(corePath: String, langPath: String, workerPath: String): AnonCorePath = {
    val __obj = js.Dynamic.literal(corePath = corePath.asInstanceOf[js.Any], langPath = langPath.asInstanceOf[js.Any], workerPath = workerPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCorePath]
  }
}

