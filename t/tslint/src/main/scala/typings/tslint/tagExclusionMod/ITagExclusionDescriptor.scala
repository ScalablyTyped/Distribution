package typings.tslint.tagExclusionMod

import typings.tslint.AnonContent
import typings.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagExclusionDescriptor extends ExclusionDescriptor {
  var tags: js.UndefOr[AnonContent] = js.undefined
}

object ITagExclusionDescriptor {
  @scala.inline
  def apply(tags: AnonContent = null): ITagExclusionDescriptor = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagExclusionDescriptor]
  }
}

