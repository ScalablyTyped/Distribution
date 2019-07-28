package typings.yargs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arg extends js.Object {
  def coerce(arg: js.Any): /* import warning: ImportType.apply Failed type conversion: infer T */ js.Any
}

object Anon_Arg {
  @scala.inline
  def apply(coerce: js.Any => /* import warning: ImportType.apply Failed type conversion: infer T */ js.Any): Anon_Arg = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce))
  
    __obj.asInstanceOf[Anon_Arg]
  }
}

