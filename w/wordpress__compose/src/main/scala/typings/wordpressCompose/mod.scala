package typings.wordpressCompose

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.std.Omit
import typings.wordpressCompose.anon.kinkeyofWindowEventMapstr
import typings.wordpressCompose.wordpressComposeStrings.instanceId
import typings.wordpressCompose.wordpressComposeStrings.setState
import typings.wordpressCompose.wordpressComposeStrings.setTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/compose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // tslint:disable:no-unnecessary-generics
  // prettier-ignore
  @scala.inline
  def createHigherOrderComponent[EP](
    mapComponentToEnhancedComponent: js.Function1[/* component */ ComponentType[js.Any], ComponentType[js.Any]],
    modifierName: String
  ): js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentType[Omit[js.Any, /* keyof EP */ String]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHigherOrderComponent")(mapComponentToEnhancedComponent.asInstanceOf[js.Any], modifierName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentType[Omit[js.Any, /* keyof EP */ String]]
  ]]
  
  @scala.inline
  def ifCondition[P](predicate: js.Function1[/* props */ P, Boolean]): js.Function1[/* component */ ComponentType[P], FC[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifCondition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[P], FC[P]]]
  
  // prettier-ignore
  @scala.inline
  def pure[T /* <: ComponentType[js.Any] */](component: T): ComponentType[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pure")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[js.Any]]
  
  @scala.inline
  def useMediaQuery(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def useReducedMotion(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useReducedMotion")().asInstanceOf[Boolean]
  
  // prettier-ignore
  @scala.inline
  def withGlobalEvents(eventMapper: kinkeyofWindowEventMapstr): js.Function1[/* component */ ComponentClass[js.Any, ComponentState], ComponentType[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withGlobalEvents")(eventMapper.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentClass[js.Any, ComponentState], ComponentType[js.Any]]]
  
  // prettier-ignore
  @scala.inline
  def withInstanceId[T /* <: ComponentType[js.Any] */](wrapped: T): ComponentType[Omit[js.Any, instanceId]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withInstanceId")(wrapped.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Omit[js.Any, instanceId]]]
  
  // prettier-ignore
  @scala.inline
  def withSafeTimeout[T /* <: ComponentType[js.Any] */](component: T): ComponentType[Omit[js.Any, setTimeout]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSafeTimeout")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Omit[js.Any, setTimeout]]]
  
  // prettier-ignore
  @scala.inline
  def withState[SP /* <: js.Object */](
    initialState: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof SP ]: SP[k]}
    */ typings.wordpressCompose.wordpressComposeStrings.withState & TopLevel[SP]
  ): js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentClass[Omit[js.Any, (/* keyof SP */ String) | setState], SP]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentClass[Omit[js.Any, (/* keyof SP */ String) | setState], SP]
  ]]
}
