package typings.wixStyleReact

import typings.wixStyleReact.anon.DataHookWrapper
import typings.wixStyleReact.anon.ElementAny
import typings.wixStyleReact.anon.GetValue
import typings.wixStyleReact.anon.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputAffixTestkitAffixMod {
  
  @JSImport("wix-style-react/dist/types/Input/Affix/testkit/Affix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def componentFactory(): Wrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")().asInstanceOf[Wrapper]
  inline def componentFactory(props: js.Object): Wrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any]).asInstanceOf[Wrapper]
  inline def componentFactory(props: js.Object, context: js.Object): Wrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Wrapper]
  inline def componentFactory(props: Unit, context: js.Object): Wrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Wrapper]
  
  inline def customDriverFactory(param0: ElementAny): GetValue = ^.asInstanceOf[js.Dynamic].applyDynamic("customDriverFactory")(param0.asInstanceOf[js.Any]).asInstanceOf[GetValue]
  
  inline def customTestkitFactory(param0: DataHookWrapper): GetValue = ^.asInstanceOf[js.Dynamic].applyDynamic("customTestkitFactory")(param0.asInstanceOf[js.Any]).asInstanceOf[GetValue]
}
