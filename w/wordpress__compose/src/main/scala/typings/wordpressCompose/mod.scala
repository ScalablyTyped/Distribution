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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable:no-unnecessary-generics
  // prettier-ignore
  @JSImport("@wordpress/compose", "createHigherOrderComponent")
  @js.native
  def createHigherOrderComponent[EP](
    mapComponentToEnhancedComponent: js.Function1[/* component */ ComponentType[_], ComponentType[_]],
    modifierName: String
  ): js.Function1[/* component */ ComponentType[_], ComponentType[Omit[_, /* keyof EP */ String]]] = js.native
  
  @JSImport("@wordpress/compose", "ifCondition")
  @js.native
  def ifCondition[P](predicate: js.Function1[/* props */ P, Boolean]): js.Function1[/* component */ ComponentType[P], FC[P]] = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/compose", "pure")
  @js.native
  def pure[T /* <: ComponentType[_] */](component: T): ComponentType[_] = js.native
  
  @JSImport("@wordpress/compose", "useMediaQuery")
  @js.native
  def useMediaQuery(query: String): Boolean = js.native
  
  @JSImport("@wordpress/compose", "useReducedMotion")
  @js.native
  def useReducedMotion(): Boolean = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/compose", "withGlobalEvents")
  @js.native
  def withGlobalEvents(eventMapper: kinkeyofWindowEventMapstr): js.Function1[/* component */ ComponentClass[_, ComponentState], ComponentType[_]] = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/compose", "withInstanceId")
  @js.native
  def withInstanceId[T /* <: ComponentType[_] */](wrapped: T): ComponentType[Omit[_, instanceId]] = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/compose", "withSafeTimeout")
  @js.native
  def withSafeTimeout[T /* <: ComponentType[_] */](component: T): ComponentType[Omit[_, setTimeout]] = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/compose", "withState")
  @js.native
  def withState[SP /* <: js.Object */](
    initialState: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof SP ]: SP[k]}
    */ typings.wordpressCompose.wordpressComposeStrings.withState with TopLevel[SP]
  ): js.Function1[
    /* component */ ComponentType[_], 
    ComponentClass[Omit[_, (/* keyof SP */ String) | setState], SP]
  ] = js.native
}
