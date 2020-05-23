package typings.wordpressComponents.treeSelectMod.TreeSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @wordpress/components.@wordpress/components/select-control.SelectControl.Props<string>, 'options' | 'value'> ]: @wordpress/components.@wordpress/components/select-control.SelectControl.Props<string>[P]} */ trait Props extends js.Object {
  /**
    * If this property is added, an option will be added with this label
    * to represent empty selection.
    */
  var noOptionLabel: js.UndefOr[String] = js.undefined
  var selectedId: js.UndefOr[String] = js.undefined
  /**
    * A `Tree` with the possible nodes the user can select.
    */
  var tree: js.UndefOr[Tree] = js.undefined
}

object Props {
  @scala.inline
  def apply(noOptionLabel: String = null, selectedId: String = null, tree: Tree = null): Props = {
    val __obj = js.Dynamic.literal()
    if (noOptionLabel != null) __obj.updateDynamic("noOptionLabel")(noOptionLabel.asInstanceOf[js.Any])
    if (selectedId != null) __obj.updateDynamic("selectedId")(selectedId.asInstanceOf[js.Any])
    if (tree != null) __obj.updateDynamic("tree")(tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

