package typings.wordpressCompose

import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHigherOrderIfConditionMod {
  
  @JSImport("@wordpress/compose/build-types/higher-order/if-condition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Higher-order component creator, creating a new component which renders if
    * the given condition is satisfied or with the given optional prop name.
    *
    * @example
    * ```ts
    * type Props = { foo: string };
    * const Component = ( props: Props ) => <div>{ props.foo }</div>;
    * const ConditionalComponent = ifCondition( ( props: Props ) => props.foo.length !== 0 )( Component );
    * <ConditionalComponent foo="" />; // => null
    * <ConditionalComponent foo="bar" />; // => <div>bar</div>;
    * ```
    *
    * @param predicate Function to test condition.
    *
    * @return Higher-order component.
    */
  inline def default[Props /* <: js.Object */](predicate: js.Function1[/* props */ Props, Boolean]): js.Function1[/* Inner */ ComponentType[Props], js.Function1[/* props */ Props, Element | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Inner */ ComponentType[Props], js.Function1[/* props */ Props, Element | Null]]]
}
