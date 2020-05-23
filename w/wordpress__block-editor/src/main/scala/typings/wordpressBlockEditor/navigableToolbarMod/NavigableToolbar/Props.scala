package typings.wordpressBlockEditor.navigableToolbarMod.NavigableToolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigableMenu.Props * / any */ trait Props extends js.Object {
  var focusOnMount: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(focusOnMount: js.UndefOr[Boolean] = js.undefined): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focusOnMount)) __obj.updateDynamic("focusOnMount")(focusOnMount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

