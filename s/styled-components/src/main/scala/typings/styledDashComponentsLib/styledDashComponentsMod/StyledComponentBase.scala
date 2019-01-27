package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react.react.ForwardRefExoticComponent<any> ]: react.react.ForwardRefExoticComponent<styled-components.styled-components.StyledComponentProps<C, react.react.ForwardRefExoticComponent<styled-components.styled-components.StyledComponentProps<C, T, O, A>>, O, A>>[P]} */ @js.native
trait StyledComponentBase[C /* <: java.lang.String */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] extends js.Object {
  // add our own fake call signature to implement the polymorphic 'as' prop
  // NOTE: TS <3.2 will refuse to infer the generic and this component becomes impossible to use in JSX
  // just the presence of the overload is enough to break JSX
  //
  // TODO (TypeScript 3.2): actually makes the 'as' prop polymorphic
  // (
  //     props: StyledComponentProps<C, T, O, A> & { as?: never }
  //   ): React.ReactElement<StyledComponentProps<C, T, O, A>>
  // <AsC extends keyof JSX.IntrinsicElements | React.ComponentType<any> = C>(
  //   props: StyledComponentPropsWithAs<AsC, T, O, A>
  // ): React.ReactElement<StyledComponentPropsWithAs<AsC, T, O, A>>
  // TODO (TypeScript 3.2): delete this overload
  def apply(props: (StyledComponentProps[C, T, O, A]) with styledDashComponentsLib.Anon_AsAny): reactLib.reactMod.ReactNs.ReactElement[StyledComponentProps[C, T, O, A]] = js.native
  def withComponent[WithC /* <: java.lang.String */](component: WithC): StyledComponent[WithC, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_WithCAnyStyledComponent[WithC /* <: AnyStyledComponent */](component: WithC): StyledComponent[
    styledDashComponentsLib.StyledComponentInnerComponent[WithC], 
    T, 
    O with styledDashComponentsLib.StyledComponentInnerOtherProps[WithC], 
    A | styledDashComponentsLib.StyledComponentInnerAttrs[WithC]
  ] = js.native
}

