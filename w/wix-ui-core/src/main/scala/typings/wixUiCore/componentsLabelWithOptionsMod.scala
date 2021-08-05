package typings.wixUiCore

import typings.wixUiCore.anon.InitialSelectedIds
import typings.wixUiCore.anon.PartialOption
import typings.wixUiCore.componentsLabelWithOptionsLabelWithOptionsMod.LabelWithOptionsProps
import typings.wixUiCore.dropdownOptionOptionFactoryMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsLabelWithOptionsMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/label-with-options", "LabelWithOptions")
  @js.native
  class LabelWithOptions protected ()
    extends typings.wixUiCore.componentsLabelWithOptionsLabelWithOptionsMod.LabelWithOptions {
    def this(props: LabelWithOptionsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LabelWithOptionsProps, context: js.Any) = this()
  }
  /* static members */
  object LabelWithOptions {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/label-with-options", "LabelWithOptions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createDivider(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")().asInstanceOf[Option]
    inline def createDivider(value: js.Any): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")(value.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    inline def createOption(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")().asInstanceOf[Option]
    inline def createOption(option: PartialOption): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")(option.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    @JSImport("wix-ui-core/dist/standalone/src/components/label-with-options", "LabelWithOptions.defaultProps")
    @js.native
    def defaultProps: InitialSelectedIds = js.native
    inline def defaultProps_=(x: InitialSelectedIds): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/label-with-options", "LabelWithOptions.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
