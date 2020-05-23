package typings.wordpressEditor.postTaxonomiesMod.PostTaxonomies

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressApiFetch.mod.Schema.Taxonomy
import typings.wordpressEditor.wordpressEditorStrings.edit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var taxonomyWrapper: js.UndefOr[js.Function2[/* content */ ReactNode, /* taxonomy */ Taxonomy[edit], Element]] = js.undefined
}

object Props {
  @scala.inline
  def apply(taxonomyWrapper: (/* content */ ReactNode, /* taxonomy */ Taxonomy[edit]) => Element = null): Props = {
    val __obj = js.Dynamic.literal()
    if (taxonomyWrapper != null) __obj.updateDynamic("taxonomyWrapper")(js.Any.fromFunction2(taxonomyWrapper))
    __obj.asInstanceOf[Props]
  }
}

