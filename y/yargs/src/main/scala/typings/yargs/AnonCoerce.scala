package typings.yargs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoerce extends js.Object {
  def coerce(arg: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}

object AnonCoerce {
  @scala.inline
  def apply(
    coerce: js.Any => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ): AnonCoerce = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce))
    __obj.asInstanceOf[AnonCoerce]
  }
}

