package typings
package typedocLib.distLibOutputModelsNavigationItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/models/NavigationItem", "NavigationItem")
@js.native
class NavigationItem () extends js.Object {
  def this(title: java.lang.String) = this()
  def this(title: java.lang.String, url: java.lang.String) = this()
  def this(title: java.lang.String, url: java.lang.String, parent: NavigationItem) = this()
  def this(title: java.lang.String, url: java.lang.String, parent: NavigationItem, cssClasses: java.lang.String) = this()
  def this(title: java.lang.String, url: java.lang.String, parent: NavigationItem, cssClasses: java.lang.String, reflection: typedocLib.distLibModelsReflectionsAbstractMod.Reflection) = this()
  var children: js.UndefOr[js.Array[NavigationItem]] = js.native
  var cssClasses: java.lang.String = js.native
  var dedicatedUrls: js.UndefOr[js.Array[java.lang.String]] = js.native
  var isCurrent: js.UndefOr[scala.Boolean] = js.native
  var isGlobals: js.UndefOr[scala.Boolean] = js.native
  var isInPath: js.UndefOr[scala.Boolean] = js.native
  var isLabel: js.UndefOr[scala.Boolean] = js.native
  var isVisible: js.UndefOr[scala.Boolean] = js.native
  var parent: js.UndefOr[NavigationItem] = js.native
  var reflection: js.UndefOr[typedocLib.distLibModelsReflectionsAbstractMod.Reflection] = js.native
  var title: java.lang.String = js.native
  var url: java.lang.String = js.native
}

@JSImport("typedoc/dist/lib/output/models/NavigationItem", "NavigationItem")
@js.native
object NavigationItem extends js.Object {
  def create(reflection: typedocLib.distLibModelsReflectionsAbstractMod.Reflection): typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem = js.native
  def create(
    reflection: typedocLib.distLibModelsReflectionsAbstractMod.Reflection,
    parent: typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem
  ): typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem = js.native
  def create(
    reflection: typedocLib.distLibModelsReflectionsAbstractMod.Reflection,
    parent: typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem,
    useShortNames: scala.Boolean
  ): typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem = js.native
}

