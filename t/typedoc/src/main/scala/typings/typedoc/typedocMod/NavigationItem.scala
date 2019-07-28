package typings.typedoc.typedocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "NavigationItem")
@js.native
class NavigationItem ()
  extends typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem {
  def this(title: String) = this()
  def this(title: String, url: String) = this()
  def this(
    title: String,
    url: String,
    parent: typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
  ) = this()
  def this(
    title: String,
    url: String,
    parent: typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem,
    cssClasses: String
  ) = this()
  def this(
    title: String,
    url: String,
    parent: typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem,
    cssClasses: String,
    reflection: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
  ) = this()
}

/* static members */
@JSImport("typedoc", "NavigationItem")
@js.native
object NavigationItem extends js.Object {
  def create(reflection: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection): typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem = js.native
  def create(
    reflection: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
    parent: typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
  ): typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem = js.native
  def create(
    reflection: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
    parent: typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem,
    useShortNames: Boolean
  ): typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem = js.native
}

