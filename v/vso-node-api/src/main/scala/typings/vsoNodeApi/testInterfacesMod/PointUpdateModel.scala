package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointUpdateModel extends js.Object {
  var outcome: String
  var resetToActive: Boolean
  var tester: IdentityRef
}

object PointUpdateModel {
  @scala.inline
  def apply(outcome: String, resetToActive: Boolean, tester: IdentityRef): PointUpdateModel = {
    val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any], resetToActive = resetToActive.asInstanceOf[js.Any], tester = tester.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointUpdateModel]
  }
}

