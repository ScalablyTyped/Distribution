package typings.styledComponents

import org.scalablytyped.runtime.StringDictionary
import typings.styledComponents.nativeDistDistTypesMod.AnyComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistUtilsHoistMod {
  
  @JSImport("styled-components/native/dist/dist/utils/hoist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: OmniComponent */, S /* <: OmniComponent */, C /* <: ExcludeList */](targetComponent: T, sourceComponent: S): T & (NonReactStatics[S, C]) = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(targetComponent.asInstanceOf[js.Any], sourceComponent.asInstanceOf[js.Any])).asInstanceOf[T & (NonReactStatics[S, C])]
  inline def default[T /* <: OmniComponent */, S /* <: OmniComponent */, C /* <: ExcludeList */](targetComponent: T, sourceComponent: S, excludelist: C): T & (NonReactStatics[S, C]) = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(targetComponent.asInstanceOf[js.Any], sourceComponent.asInstanceOf[js.Any], excludelist.asInstanceOf[js.Any])).asInstanceOf[T & (NonReactStatics[S, C])]
  
  type ExcludeList = StringDictionary[true]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ key in std.Exclude<keyof S, S extends react.react.MemoExoticComponent<any>? keyof {  $$typeof :boolean,   compare :boolean,   defaultProps :boolean,   displayName :boolean,   propTypes :boolean,   type :boolean} | keyof C : S extends react.react.ForwardRefExoticComponent<any>? keyof {  $$typeof :boolean,   render :boolean,   defaultProps :boolean,   displayName :boolean,   propTypes :boolean} | keyof C : keyof {  childContextTypes :boolean,   contextType :boolean,   contextTypes :boolean,   defaultProps :boolean,   displayName :boolean,   getDefaultProps :boolean,   getDerivedStateFromError :boolean,   getDerivedStateFromProps :boolean,   mixins :boolean,   propTypes :boolean,   type :boolean} | keyof {  name :boolean,   length :boolean,   caller :boolean,   callee :boolean,   arguments :boolean,   arity :boolean} | keyof C> ]: S[key]}
    }}}
    */
  type NonReactStatics[S /* <: OmniComponent */, C /* <: ExcludeList */] = S
  
  type OmniComponent = AnyComponent[Any]
}
