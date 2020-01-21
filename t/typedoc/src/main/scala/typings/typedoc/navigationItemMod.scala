package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/models/NavigationItem", JSImport.Namespace)
@js.native
object navigationItemMod extends js.Object {
  @js.native
  class NavigationItem () extends js.Object {
    def this(title: String) = this()
    def this(title: String, url: String) = this()
    def this(title: String, url: String, parent: NavigationItem) = this()
    def this(title: String, url: String, parent: NavigationItem, cssClasses: String) = this()
    def this(title: String, url: String, parent: NavigationItem, cssClasses: String, reflection: Reflection) = this()
    var children: js.UndefOr[js.Array[NavigationItem]] = js.native
    var cssClasses: String = js.native
    var dedicatedUrls: js.UndefOr[js.Array[String]] = js.native
    var isCurrent: js.UndefOr[Boolean] = js.native
    var isGlobals: js.UndefOr[Boolean] = js.native
    var isInPath: js.UndefOr[Boolean] = js.native
    var isLabel: js.UndefOr[Boolean] = js.native
    var isVisible: js.UndefOr[Boolean] = js.native
    var parent: js.UndefOr[NavigationItem] = js.native
    var reflection: js.UndefOr[Reflection] = js.native
    var title: String = js.native
    var url: String = js.native
  }
  
  /* static members */
  @js.native
  object NavigationItem extends js.Object {
    def create(reflection: Reflection): NavigationItem = js.native
    def create(reflection: Reflection, parent: NavigationItem): NavigationItem = js.native
    def create(reflection: Reflection, parent: NavigationItem, useShortNames: Boolean): NavigationItem = js.native
  }
  
}

