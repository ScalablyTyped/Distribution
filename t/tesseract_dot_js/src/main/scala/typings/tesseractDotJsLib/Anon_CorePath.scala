package typings
package tesseractDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CorePath extends js.Object {
  var corePath: java.lang.String
  var langPath: java.lang.String
  var workerPath: java.lang.String
}

object Anon_CorePath {
  @scala.inline
  def apply(corePath: java.lang.String, langPath: java.lang.String, workerPath: java.lang.String): Anon_CorePath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("corePath")(corePath)
    __obj.updateDynamic("langPath")(langPath)
    __obj.updateDynamic("workerPath")(workerPath)
    __obj.asInstanceOf[Anon_CorePath]
  }
}

