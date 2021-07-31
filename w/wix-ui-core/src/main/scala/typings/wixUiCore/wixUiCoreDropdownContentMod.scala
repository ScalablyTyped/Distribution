package typings.wixUiCore

import typings.wixUiCore.dropdownContentDropdownContentMod.DropdownContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiCoreDropdownContentMod {
  
  @JSImport("wix-ui-core/dropdown-content", "DropdownContent")
  @js.native
  class DropdownContent protected ()
    extends typings.wixUiCore.dropdownContentMod.DropdownContent {
    def this(props: DropdownContentProps) = this()
  }
  /* static members */
  object DropdownContent {
    
    @JSImport("wix-ui-core/dropdown-content", "DropdownContent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dropdown-content", "DropdownContent.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
