package typings.wixUiCore

import typings.wixUiCore.dropdownContentDropdownContentMod.DropdownContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownContentMod {
  
  @JSImport("wix-ui-core/dist/src/components/dropdown-content", "DropdownContent")
  @js.native
  class DropdownContent protected ()
    extends typings.wixUiCore.dropdownContentDropdownContentMod.DropdownContent {
    def this(props: DropdownContentProps) = this()
  }
  /* static members */
  object DropdownContent {
    
    @JSImport("wix-ui-core/dist/src/components/dropdown-content", "DropdownContent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/dropdown-content", "DropdownContent.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
