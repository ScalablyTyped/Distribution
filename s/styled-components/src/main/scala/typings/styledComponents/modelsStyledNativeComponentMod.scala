package typings.styledComponents

import typings.styledComponents.nativeDistTypesMod.ExtensibleObject
import typings.styledComponents.nativeDistTypesMod.IInlineStyleConstructor
import typings.styledComponents.nativeDistTypesMod.IStyledNativeComponent
import typings.styledComponents.nativeDistTypesMod.NativeTarget
import typings.styledComponents.nativeDistTypesMod.RuleSet
import typings.styledComponents.nativeDistTypesMod.StyledNativeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsStyledNativeComponentMod {
  
  @JSImport("styled-components/native/dist/models/StyledNativeComponent", JSImport.Namespace)
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
