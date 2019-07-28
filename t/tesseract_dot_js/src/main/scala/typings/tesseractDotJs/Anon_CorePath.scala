package typings.tesseractDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CorePath extends js.Object {
  var corePath: String
  var langPath: String
  var workerPath: String
}

object Anon_CorePath {
  @scala.inline
  def apply(corePath: String, langPath: String, workerPath: String): Anon_CorePath = {
    val __obj = js.Dynamic.literal(corePath = corePath, langPath = langPath, workerPath = workerPath)
  
    __obj.asInstanceOf[Anon_CorePath]
  }
}

