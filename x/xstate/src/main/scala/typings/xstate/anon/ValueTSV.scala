package typings.xstate.anon

import typings.xstate.typesMod.Typestate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueTSV[TSV /* <: /* import warning: importer.ImportType#apply Failed type conversion: TTypestate['value'] */ js.Any */, TTypestate /* <: Typestate[TContext] */] extends js.Object {
  var value: TSV
}

object ValueTSV {
  @scala.inline
  def apply[/* <: / * import warning: importer.ImportType#apply Failed type conversion: TTypestate['value'] * / js.Any */ TSV, /* <: typings.xstate.typesMod.Typestate[TContext] */ TTypestate](value: TSV): ValueTSV[TSV, TTypestate] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTSV[TSV, TTypestate]]
  }
}

