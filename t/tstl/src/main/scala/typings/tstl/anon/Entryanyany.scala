package typings.tstl.anon

import typings.tstl.entryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tstl.tstl/utility/Entry.Entry</ * import warning: RewrittenClass.unapply cls was tparam Key * / any, / * import warning: RewrittenClass.unapply cls was tparam T * / any> */
@js.native
trait Entryanyany extends js.Object {
  
  /**
    * @inheritDoc
    */
  def equals(
    obj: Entry[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _
    ]
  ): Boolean = js.native
  
  /**
    * The first, key element.
    */
  val first: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any = js.native
  
  /**
    * @inheritDoc
    */
  def less(
    obj: Entry[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _
    ]
  ): Boolean = js.native
  
  /**
    * The second, mapped element.
    */
  var second: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any = js.native
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
  
  @scala.inline
  implicit class EntryanyanyOps[Self <: Entryanyany] (val x: Self) extends AnyVal {
    
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
    def setEquals(
      value: Entry[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
          /* import warning: RewrittenClass.unapply cls was tparam T */ _
        ] => Boolean
    ): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirst(value: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLess(
      value: Entry[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
          /* import warning: RewrittenClass.unapply cls was tparam T */ _
        ] => Boolean
    ): Self = this.set("less", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSecond(value: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any): Self = this.set("second", value.asInstanceOf[js.Any])
  }
}
