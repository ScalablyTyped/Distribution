package typings.tslint.libRulesCompletedDashDocsTagExclusionMod

import typings.tslint.Anon_Content
import typings.tslint.libRulesCompletedDashDocsExclusionDescriptorsMod.ExclusionDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagExclusionDescriptor extends ExclusionDescriptor {
  var tags: js.UndefOr[Anon_Content] = js.undefined
}

object ITagExclusionDescriptor {
  @scala.inline
  def apply(tags: Anon_Content = null): ITagExclusionDescriptor = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagExclusionDescriptor]
  }
}

