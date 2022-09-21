package typings.styledComponents

import typings.styledComponents.distTypesMod.ExtensibleObject
import typings.styledComponents.distTypesMod.IInlineStyleConstructor
import typings.styledComponents.distTypesMod.IStyledNativeComponent
import typings.styledComponents.distTypesMod.NativeTarget
import typings.styledComponents.distTypesMod.RuleSet
import typings.styledComponents.distTypesMod.StyledNativeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledNativeComponentMod {
  
  @JSImport("styled-components/native/dist/dist/models/StyledNativeComponent", JSImport.Namespace)
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
