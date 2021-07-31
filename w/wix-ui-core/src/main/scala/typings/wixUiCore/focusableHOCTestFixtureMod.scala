package typings.wixUiCore

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusableHOCTestFixtureMod {
  
  @js.native
  sealed trait DataHook extends StObject
  @JSImport("wix-ui-core/dist/src/hocs/Focusable/test/FocusableHOCTestFixture", "DataHook")
  @js.native
  object DataHook extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DataHook & String] = js.native
    
    @js.native
    sealed trait FirstButton
      extends StObject
         with DataHook
    /* "first-button" */ val FirstButton: typings.wixUiCore.focusableHOCTestFixtureMod.DataHook.FirstButton & String = js.native
    
    @js.native
    sealed trait SecondButton
      extends StObject
         with DataHook
    /* "second-button" */ val SecondButton: typings.wixUiCore.focusableHOCTestFixtureMod.DataHook.SecondButton & String = js.native
  }
  
  @JSImport("wix-ui-core/dist/src/hocs/Focusable/test/FocusableHOCTestFixture", "FocusableHOCTestFixture")
  @js.native
  class FocusableHOCTestFixture protected ()
    extends Component[js.Object, js.Object, js.Any] {
    def this(props: js.Any) = this()
    
    val _onFirstButtonClick: js.Any = js.native
    
    val firstButtonRef: js.Any = js.native
    
    val secondButtonRef: js.Any = js.native
  }
}
