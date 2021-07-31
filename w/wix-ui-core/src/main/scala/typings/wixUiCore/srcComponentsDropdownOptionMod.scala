package typings.wixUiCore

import typings.wixUiCore.anon.PartialDividerArgs
import typings.wixUiCore.anon.PartialOption
import typings.wixUiCore.componentsDropdownOptionOptionFactoryMod.Option
import typings.wixUiCore.srcComponentsDropdownOptionDropdownOptionMod.DropdownOptionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsDropdownOptionMod {
  
  @JSImport("wix-ui-core/src/components/dropdown-option", "DropdownOption")
  @js.native
  val DropdownOption: DropdownOptionType = js.native
  
  object OptionFactory {
    
    @JSImport("wix-ui-core/src/components/dropdown-option", "OptionFactory")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Option]
    @scala.inline
    def create(option: PartialOption): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(option.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    @scala.inline
    def createDivider(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")().asInstanceOf[Option]
    @scala.inline
    def createDivider(hasClassNameValue: PartialDividerArgs): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")(hasClassNameValue.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    @scala.inline
    def createHighlighted(option: Option, highlightValue: String): Option = (^.asInstanceOf[js.Dynamic].applyDynamic("createHighlighted")(option.asInstanceOf[js.Any], highlightValue.asInstanceOf[js.Any])).asInstanceOf[Option]
  }
}
