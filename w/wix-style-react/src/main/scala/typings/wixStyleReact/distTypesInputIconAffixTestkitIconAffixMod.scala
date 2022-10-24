package typings.wixStyleReact

import typings.wixStyleReact.anon.DataHookWrapper
import typings.wixStyleReact.anon.ElementAny
import typings.wixStyleReact.anon.HasChild
import typings.wixStyleReact.anon.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputIconAffixTestkitIconAffixMod {
  
  @JSImport("wix-style-react/dist/types/Input/IconAffix/testkit/IconAffix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def componentFactory(): Wrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")().asInstanceOf[Wrapper]
  inline def componentFactory(props: js.Object): Wrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any]).asInstanceOf[Wrapper]
  inline def componentFactory(props: js.Object, context: js.Object): Wrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Wrapper]
  inline def componentFactory(props: Unit, context: js.Object): Wrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Wrapper]
  
  inline def iconDriverFactory(param0: ElementAny): HasChild = ^.asInstanceOf[js.Dynamic].applyDynamic("iconDriverFactory")(param0.asInstanceOf[js.Any]).asInstanceOf[HasChild]
  
  inline def iconTestkitFactory(param0: DataHookWrapper): HasChild = ^.asInstanceOf[js.Dynamic].applyDynamic("iconTestkitFactory")(param0.asInstanceOf[js.Any]).asInstanceOf[HasChild]
}
