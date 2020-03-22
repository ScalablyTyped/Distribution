package typings.tstl

import typings.tstl.setElementListMod.SetElementList.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tstl.tstl/internal/container/associative/SetElementList.SetElementList.Iterator</ * import warning: RewrittenClass.unapply cls was tparam Key * / any, / * import warning: RewrittenClass.unapply cls was tparam Unique * / any, / * import warning: RewrittenClass.unapply cls was tparam Source * / any> */
@js.native
trait IteratoranyanyanyConstructor extends js.Object {
  var next_ : js.Any = js.native
  var prev_ : js.Any = js.native
  var source_ : js.Any = js.native
  var value_ : /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any = js.native
  @JSName("value")
  val value_FIteratoranyanyanyConstructor: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any = js.native
  /* protected */ def _Try_value(): Unit = js.native
  def equals(obj: Iteratoranyanyany): Boolean = js.native
  def next(): Iteratoranyanyany = js.native
  def prev(): Iteratoranyanyany = js.native
  /**
    * @inheritDoc
    */
  def reverse(): ReverseIterator[
    /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Unique */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Source */ _
  ] = js.native
  /**
    * @inheritDoc
    */
  def source(): js.Any = js.native
  /**
    * @inheritDoc
    */
  def value(): js.Any = js.native
}

