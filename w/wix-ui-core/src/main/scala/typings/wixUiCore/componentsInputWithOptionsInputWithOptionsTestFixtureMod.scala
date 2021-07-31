package typings.wixUiCore

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsInputWithOptionsInputWithOptionsTestFixtureMod {
  
  @js.native
  sealed trait DataHook extends StObject
  @JSImport("wix-ui-core/src/components/input-with-options/InputWithOptionsTestFixture", "DataHook")
  @js.native
  object DataHook extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DataHook & String] = js.native
    
    @js.native
    sealed trait inputWithOptions
      extends StObject
         with DataHook
    /* "storybook-input-with-options" */ val inputWithOptions: typings.wixUiCore.componentsInputWithOptionsInputWithOptionsTestFixtureMod.DataHook.inputWithOptions & String = js.native
    
    @js.native
    sealed trait onManualInputCount
      extends StObject
         with DataHook
    /* "on-manual-input-count" */ val onManualInputCount: typings.wixUiCore.componentsInputWithOptionsInputWithOptionsTestFixtureMod.DataHook.onManualInputCount & String = js.native
    
    @js.native
    sealed trait onSelectCount
      extends StObject
         with DataHook
    /* "on-select-count" */ val onSelectCount: typings.wixUiCore.componentsInputWithOptionsInputWithOptionsTestFixtureMod.DataHook.onSelectCount & String = js.native
  }
  
  @JSImport("wix-ui-core/src/components/input-with-options/InputWithOptionsTestFixture", "InputWithOptionsTestFixture")
  @js.native
  class InputWithOptionsTestFixture protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(props: js.Any) = this()
    
    def handleOnChange(e: js.Any): Unit = js.native
    
    def handleOnManualInput(): Unit = js.native
    
    def handleOnSelect(): Unit = js.native
  }
}
