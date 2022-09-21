package typings.styledComponents

import typings.styledComponents.distDistTypesMod.ExtensibleObject
import typings.styledComponents.distDistTypesMod.IInlineStyleConstructor
import typings.styledComponents.distDistTypesMod.IStyledNativeComponent
import typings.styledComponents.distDistTypesMod.NativeTarget
import typings.styledComponents.distDistTypesMod.RuleSet
import typings.styledComponents.distDistTypesMod.StyledNativeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModelsStyledNativeComponentMod {
  
  @JSImport("styled-components/primitives/dist/dist/models/StyledNativeComponent", JSImport.Namespace)
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
