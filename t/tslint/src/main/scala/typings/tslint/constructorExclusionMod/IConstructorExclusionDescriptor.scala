package typings.tslint.constructorExclusionMod

import typings.tslint.completedDocsRuleMod.Privacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstructorExclusionDescriptor extends js.Object {
  var privacies: js.UndefOr[js.Array[Privacy]] = js.undefined
}

object IConstructorExclusionDescriptor {
  @scala.inline
  def apply(privacies: js.Array[Privacy] = null): IConstructorExclusionDescriptor = {
    val __obj = js.Dynamic.literal()
    if (privacies != null) __obj.updateDynamic("privacies")(privacies.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConstructorExclusionDescriptor]
  }
}

