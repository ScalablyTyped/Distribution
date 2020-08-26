package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonEmpty[NotFound, Tuple /* <: js.Array[_] */, Type, Count /* <: js.Array[_] */] extends js.Object {
  var empty: NotFound = js.native
  var infinite: js.Any = js.native
  var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: Count['length'] */ js.Any = js.native
}

object NonEmpty {
  @scala.inline
  def apply[NotFound, /* <: js.Array[_] */ Tuple, Type, /* <: js.Array[_] */ Count](
    empty: NotFound,
    infinite: js.Any,
    nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: Count['length'] */ js.Any
  ): NonEmpty[NotFound, Tuple, Type, Count] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonEmpty[NotFound, Tuple, Type, Count]]
  }
  @scala.inline
  implicit class NonEmptyOps[Self <: NonEmpty[_, _, _, _], NotFound, /* <: js.Array[_] */ Tuple, Type, /* <: js.Array[_] */ Count] (val x: Self with (NonEmpty[NotFound, Tuple, Type, Count])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmpty(value: NotFound): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfinite(value: js.Any): Self = this.set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonEmpty(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Count['length'] */ js.Any
    ): Self = this.set("nonEmpty", value.asInstanceOf[js.Any])
  }
  
}

