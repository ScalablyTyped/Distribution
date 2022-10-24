package typings.wixStyleReact

import typings.wixStyleReact.anon.ClickUp
import typings.wixStyleReact.anon.WrapperAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputTickerTestkitTickerMod {
  
  @JSImport("wix-style-react/dist/types/Input/Ticker/testkit/Ticker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def componentFactory(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")().asInstanceOf[Any]
  inline def componentFactory(props: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def componentFactory(props: js.Object, context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def componentFactory(props: Unit, context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def tickerDriverFactory(component: Any): ClickUp = ^.asInstanceOf[js.Dynamic].applyDynamic("tickerDriverFactory")(component.asInstanceOf[js.Any]).asInstanceOf[ClickUp]
  
  inline def tickerTestkitFactory(param0: WrapperAny): ClickUp = ^.asInstanceOf[js.Dynamic].applyDynamic("tickerTestkitFactory")(param0.asInstanceOf[js.Any]).asInstanceOf[ClickUp]
}
