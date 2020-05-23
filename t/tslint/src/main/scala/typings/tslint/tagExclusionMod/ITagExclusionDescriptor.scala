package typings.tslint.tagExclusionMod

import typings.tslint.anon.Content
import typings.tslint.exclusionDescriptorsMod.ExclusionDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagExclusionDescriptor extends ExclusionDescriptor {
  var tags: js.UndefOr[Content] = js.undefined
}

object ITagExclusionDescriptor {
  @scala.inline
  def apply(tags: Content = null): ITagExclusionDescriptor = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagExclusionDescriptor]
  }
}

