package typings.uirouterAngularjs.viewDirectiveMod

import typings.uirouterAngularjs.anon.Resolve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIViewAnimData extends js.Object {
  @JSName("$animEnter")
  var $animEnter: js.Promise[_]
  @JSName("$animLeave")
  var $animLeave: js.Promise[_]
  @JSName("$$animLeave")
  var DollarDollaranimLeave: Resolve
}

object UIViewAnimData {
  @scala.inline
  def apply($animEnter: js.Promise[_], $animLeave: js.Promise[_], DollarDollaranimLeave: Resolve): UIViewAnimData = {
    val __obj = js.Dynamic.literal($animEnter = $animEnter.asInstanceOf[js.Any], $animLeave = $animLeave.asInstanceOf[js.Any])
    __obj.updateDynamic("$$animLeave")(DollarDollaranimLeave.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIViewAnimData]
  }
}

