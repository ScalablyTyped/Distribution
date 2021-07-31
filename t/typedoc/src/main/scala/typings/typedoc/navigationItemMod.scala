package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationItemMod {
  
  @JSImport("typedoc/dist/lib/output/models/NavigationItem", "NavigationItem")
  @js.native
  class NavigationItem () extends StObject {
    def this(title: String) = this()
    def this(title: String, url: String) = this()
    def this(title: Unit, url: String) = this()
    def this(title: String, url: String, parent: NavigationItem) = this()
    def this(title: String, url: Unit, parent: NavigationItem) = this()
    def this(title: Unit, url: String, parent: NavigationItem) = this()
    def this(title: Unit, url: Unit, parent: NavigationItem) = this()
    def this(title: String, url: String, parent: Unit, cssClasses: String) = this()
    def this(title: String, url: String, parent: NavigationItem, cssClasses: String) = this()
    def this(title: String, url: Unit, parent: Unit, cssClasses: String) = this()
    def this(title: String, url: Unit, parent: NavigationItem, cssClasses: String) = this()
    def this(title: Unit, url: String, parent: Unit, cssClasses: String) = this()
    def this(title: Unit, url: String, parent: NavigationItem, cssClasses: String) = this()
    def this(title: Unit, url: Unit, parent: Unit, cssClasses: String) = this()
    def this(title: Unit, url: Unit, parent: NavigationItem, cssClasses: String) = this()
    def this(title: String, url: String, parent: Unit, cssClasses: String, reflection: Reflection) = this()
    def this(title: String, url: String, parent: Unit, cssClasses: Unit, reflection: Reflection) = this()
    def this(title: String, url: String, parent: NavigationItem, cssClasses: String, reflection: Reflection) = this()
    def this(title: String, url: String, parent: NavigationItem, cssClasses: Unit, reflection: Reflection) = this()
    def this(title: String, url: Unit, parent: Unit, cssClasses: String, reflection: Reflection) = this()
    def this(title: String, url: Unit, parent: Unit, cssClasses: Unit, reflection: Reflection) = this()
    def this(title: String, url: Unit, parent: NavigationItem, cssClasses: String, reflection: Reflection) = this()
    def this(title: String, url: Unit, parent: NavigationItem, cssClasses: Unit, reflection: Reflection) = this()
    def this(title: Unit, url: String, parent: Unit, cssClasses: String, reflection: Reflection) = this()
    def this(title: Unit, url: String, parent: Unit, cssClasses: Unit, reflection: Reflection) = this()
    def this(title: Unit, url: String, parent: NavigationItem, cssClasses: String, reflection: Reflection) = this()
    def this(title: Unit, url: String, parent: NavigationItem, cssClasses: Unit, reflection: Reflection) = this()
    def this(title: Unit, url: Unit, parent: Unit, cssClasses: String, reflection: Reflection) = this()
    def this(title: Unit, url: Unit, parent: Unit, cssClasses: Unit, reflection: Reflection) = this()
    def this(title: Unit, url: Unit, parent: NavigationItem, cssClasses: String, reflection: Reflection) = this()
    def this(title: Unit, url: Unit, parent: NavigationItem, cssClasses: Unit, reflection: Reflection) = this()
    
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
  object NavigationItem {
    
    @JSImport("typedoc/dist/lib/output/models/NavigationItem", "NavigationItem")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(reflection: Reflection): NavigationItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(reflection.asInstanceOf[js.Any]).asInstanceOf[NavigationItem]
    @scala.inline
    def create(reflection: Reflection, parent: Unit, useShortNames: Boolean): NavigationItem = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(reflection.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], useShortNames.asInstanceOf[js.Any])).asInstanceOf[NavigationItem]
    @scala.inline
    def create(reflection: Reflection, parent: NavigationItem): NavigationItem = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(reflection.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[NavigationItem]
    @scala.inline
    def create(reflection: Reflection, parent: NavigationItem, useShortNames: Boolean): NavigationItem = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(reflection.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], useShortNames.asInstanceOf[js.Any])).asInstanceOf[NavigationItem]
  }
}
