package typings.wixUiCore

import typings.react.mod.Component
import typings.wixUiCore.signingPadSigningPadMod.SigningPadOwnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureInputTestFixtureMod {
  
  @JSImport("wix-ui-core/dist/src/components/signature-input/test/SignatureInputTestFixture", "SignatureInputTestFixture")
  @js.native
  class SignatureInputTestFixture protected ()
    extends Component[SignatureInputTestFixtureProps, js.Object, js.Any] {
    def this(props: SignatureInputTestFixtureProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SignatureInputTestFixtureProps, context: js.Any) = this()
  }
  
  object TEST_IDS {
    
    @JSImport("wix-ui-core/dist/src/components/signature-input/test/SignatureInputTestFixture", "TEST_IDS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/signature-input/test/SignatureInputTestFixture", "TEST_IDS.CLEAR_BUTTON")
    @js.native
    def CLEAR_BUTTON: String = js.native
    @scala.inline
    def CLEAR_BUTTON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLEAR_BUTTON")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/signature-input/test/SignatureInputTestFixture", "TEST_IDS.PAD")
    @js.native
    def PAD: String = js.native
    @scala.inline
    def PAD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAD")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/signature-input/test/SignatureInputTestFixture", "TEST_IDS.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/signature-input/test/SignatureInputTestFixture", "TEST_IDS.TITLE")
    @js.native
    def TITLE: String = js.native
    @scala.inline
    def TITLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TITLE")(x.asInstanceOf[js.Any])
  }
  
  trait SignatureInputTestFixtureProps
    extends StObject
       with SigningPadOwnProps {
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var titleText: js.UndefOr[String] = js.undefined
  }
  object SignatureInputTestFixtureProps {
    
    @scala.inline
    def apply(): SignatureInputTestFixtureProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignatureInputTestFixtureProps]
    }
    
    @scala.inline
    implicit class SignatureInputTestFixturePropsMutableBuilder[Self <: SignatureInputTestFixtureProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
    }
  }
}
