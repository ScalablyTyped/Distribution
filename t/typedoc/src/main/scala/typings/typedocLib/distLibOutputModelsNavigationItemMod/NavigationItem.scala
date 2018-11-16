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
  var children: js.Array[NavigationItem] = js.native
  var cssClasses: java.lang.String = js.native
  var dedicatedUrls: js.Array[java.lang.String] = js.native
  var isCurrent: scala.Boolean = js.native
  var isGlobals: scala.Boolean = js.native
  var isInPath: scala.Boolean = js.native
  var isLabel: scala.Boolean = js.native
  var isVisible: scala.Boolean = js.native
  var parent: NavigationItem = js.native
  var reflection: typedocLib.distLibModelsReflectionsAbstractMod.Reflection = js.native
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

