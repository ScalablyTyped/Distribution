package typings.uirouterAngularjs.viewDirectiveMod

import typings.uirouterAngularjs.anon.Resolve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIViewAnimData extends js.Object {
  @JSName("$animEnter")
  var $animEnter: js.Promise[_] = js.native
  @JSName("$animLeave")
  var $animLeave: js.Promise[_] = js.native
  @JSName("$$animLeave")
  var DollarDollaranimLeave: Resolve = js.native
}

object UIViewAnimData {
  @scala.inline
  def apply($animEnter: js.Promise[_], $animLeave: js.Promise[_], DollarDollaranimLeave: Resolve): UIViewAnimData = {
    val __obj = js.Dynamic.literal($animEnter = $animEnter.asInstanceOf[js.Any], $animLeave = $animLeave.asInstanceOf[js.Any])
    __obj.updateDynamic("$$animLeave")(DollarDollaranimLeave.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIViewAnimData]
  }
  @scala.inline
  implicit class UIViewAnimDataOps[Self <: UIViewAnimData] (val x: Self) extends AnyVal {
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
    def set$animEnter(value: js.Promise[_]): Self = this.set("$animEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def set$animLeave(value: js.Promise[_]): Self = this.set("$animLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def setDollarDollaranimLeave(value: Resolve): Self = this.set("$$animLeave", value.asInstanceOf[js.Any])
  }
  
}

