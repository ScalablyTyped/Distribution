package typings
package typedocLib.typedocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "NavigationItem")
@js.native
class NavigationItem ()
  extends typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem {
  def this(title: java.lang.String) = this()
  def this(title: java.lang.String, url: java.lang.String) = this()
  def this(title: java.lang.String, url: java.lang.String, parent: typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem) = this()
  def this(title: java.lang.String, url: java.lang.String, parent: typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem, cssClasses: java.lang.String) = this()
  def this(title: java.lang.String, url: java.lang.String, parent: typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem, cssClasses: java.lang.String, reflection: typedocLib.distLibModelsReflectionsAbstractMod.Reflection) = this()
}

/* static members */
@JSImport("typedoc", "NavigationItem")
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

