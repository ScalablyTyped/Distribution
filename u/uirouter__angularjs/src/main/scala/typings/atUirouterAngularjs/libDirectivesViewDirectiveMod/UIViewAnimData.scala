package typings.atUirouterAngularjs.libDirectivesViewDirectiveMod

import typings.atUirouterAngularjs.Anon_Resolve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIViewAnimData extends js.Object {
  @JSName("$$animLeave")
  var $$animLeave: Anon_Resolve
  @JSName("$animEnter")
  var $animEnter: js.Promise[_]
  @JSName("$animLeave")
  var $animLeave: js.Promise[_]
}

object UIViewAnimData {
  @scala.inline
  def apply($$animLeave: Anon_Resolve, $animEnter: js.Promise[_], $animLeave: js.Promise[_]): UIViewAnimData = {
    val __obj = js.Dynamic.literal($$animLeave = $$animLeave.asInstanceOf[js.Any], $animEnter = $animEnter.asInstanceOf[js.Any], $animLeave = $animLeave.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UIViewAnimData]
  }
}

