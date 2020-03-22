package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tstl.tstl/utility/Entry.Entry</ * import warning: RewrittenClass.unapply cls was tparam Key * / any, / * import warning: RewrittenClass.unapply cls was tparam T * / any> */
trait EntryanyanyConstructor extends js.Object {
  /**
    * The first, key element.
    */
  val first: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any
  /**
    * The second, mapped element.
    */
  var second: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
  /**
    * @inheritDoc
    */
  def equals(obj: Entryanyany): Boolean
  /**
    * @inheritDoc
    */
  def less(obj: Entryanyany): Boolean
}

object EntryanyanyConstructor {
  @scala.inline
  def apply(
    equals: Entryanyany => Boolean,
    first: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any,
    less: Entryanyany => Boolean,
    second: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
  ): EntryanyanyConstructor = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), first = first.asInstanceOf[js.Any], less = js.Any.fromFunction1(less), second = second.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntryanyanyConstructor]
  }
}

