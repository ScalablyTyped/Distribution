package typings.styledComponents

import typings.styledComponents.primitivesDistTypesMod.ExtensibleObject
import typings.styledComponents.primitivesDistTypesMod.IInlineStyleConstructor
import typings.styledComponents.primitivesDistTypesMod.IStyledNativeComponent
import typings.styledComponents.primitivesDistTypesMod.NativeTarget
import typings.styledComponents.primitivesDistTypesMod.RuleSet
import typings.styledComponents.primitivesDistTypesMod.StyledNativeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesDistModelsStyledNativeComponentMod {
  
  @JSImport("styled-components/primitives/dist/models/StyledNativeComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(InlineStyle: IInlineStyleConstructor[Any]): js.Function3[
    /* target */ NativeTarget, 
    /* options */ StyledNativeOptions[ExtensibleObject], 
    /* rules */ RuleSet[ExtensibleObject], 
    (IStyledNativeComponent[NativeTarget, ExtensibleObject]) & Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(InlineStyle.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ NativeTarget, 
    /* options */ StyledNativeOptions[ExtensibleObject], 
    /* rules */ RuleSet[ExtensibleObject], 
    (IStyledNativeComponent[NativeTarget, ExtensibleObject]) & Any
  ]]
}
