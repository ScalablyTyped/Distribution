package typings.xstate

import typings.xstate.typesMod.Typestate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TTypestate['value'] */ js.Any */, TTypestate /* <: Typestate[TContext] */] extends js.Object {
  var value: TSV
}

object AnonValue {
  @scala.inline
  def apply[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TTypestate['value'] */ js.Any */, TTypestate /* <: Typestate[TContext] */](value: TSV): AnonValue[TSV, TTypestate] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue[TSV, TTypestate]]
  }
}

