package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointAssignment extends js.Object {
  var configuration: ShallowReference
  var tester: IdentityRef
}

object PointAssignment {
  @scala.inline
  def apply(configuration: ShallowReference, tester: IdentityRef): PointAssignment = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], tester = tester.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PointAssignment]
  }
}

