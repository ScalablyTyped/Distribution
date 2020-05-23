package typings.yargs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coerce extends js.Object {
  def coerce(arg: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}

object Coerce {
  @scala.inline
  def apply(
    coerce: js.Any => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ): Coerce = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce))
    __obj.asInstanceOf[Coerce]
  }
}

