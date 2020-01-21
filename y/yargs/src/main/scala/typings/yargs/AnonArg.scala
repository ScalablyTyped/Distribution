package typings.yargs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArg extends js.Object {
  def coerce(arg: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}

object AnonArg {
  @scala.inline
  def apply(
    coerce: js.Any => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ): AnonArg = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce))
  
    __obj.asInstanceOf[AnonArg]
  }
}

