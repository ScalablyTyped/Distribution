package typings.tstl

import typings.tstl.entryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tstl.tstl/utility/Entry.Entry</ * import warning: RewrittenClass.unapply cls was tparam Key * / any, / * import warning: RewrittenClass.unapply cls was tparam T * / any> */
trait Entryanyany extends js.Object {
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
  def equals(
    obj: Entry[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _
    ]
  ): Boolean
  /**
    * @inheritDoc
    */
  def less(
    obj: Entry[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _
    ]
  ): Boolean
}

object Entryanyany {
  @scala.inline
  def apply(
    equals: Entry[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _
    ] => Boolean,
    first: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any,
    less: Entry[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _
    ] => Boolean,
    second: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
  ): Entryanyany = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), first = first.asInstanceOf[js.Any], less = js.Any.fromFunction1(less), second = second.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Entryanyany]
  }
}

