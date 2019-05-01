package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashComponentsMod {
  type AnyIfEmpty[T /* <: js.Object */] = java.lang.String
  type AnyStyledComponent = (StyledComponent[js.Any, js.Any, js.Any, js.Any]) | (StyledComponent[js.Any, js.Any, js.Any, scala.Nothing])
  type Attrs[P, A /* <: stdLib.Partial[P] */, T] = (js.Function1[/* props */ ThemedStyledProps[P, T], A]) | A
  type BaseThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = reactLib.reactMod.ComponentClass[ThemeProviderProps[T, U], reactLib.reactMod.ComponentState]
  type BaseWithThemeFnInterface[T /* <: js.Object */] = js.Function1[
    /* component */ reactLib.reactMod.ComponentType[js.Any], 
    reactLib.reactMod.ForwardRefExoticComponent[
      WithOptionalTheme[
        reactLib.reactMod.ComponentPropsWithRef[reactLib.reactMod.ComponentType[js.Any]], 
        T
      ]
    ]
  ]
  type CSSKeyframes = js.Object with org.scalablytyped.runtime.StringDictionary[CSSObject]
  type CSSObject = (csstypeLib.csstypeMod.Properties[java.lang.String | scala.Double]) with styledDashComponentsLib.styledDashComponentsLibStrings.CSSObject with js.Any
  type CSSProp[T] = java.lang.String | FlattenInterpolation[ThemeProps[T]]
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((stdLib.Pick[P, stdLib.Exclude[java.lang.String, java.lang.String]]) with (stdLib.Partial[stdLib.Pick[P, stdLib.Extract[java.lang.String, java.lang.String]]]) with (stdLib.Partial[stdLib.Pick[D, stdLib.Exclude[java.lang.String, java.lang.String]]])) | P
  type DeprecatedAttrs[P, A /* <: stdLib.Partial[P] */, T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof A ]: (props : styled-components.styled-components.ThemedStyledProps<P, T>): A[K] | A[K]}
    */ styledDashComponentsLib.styledDashComponentsLibStrings.DeprecatedAttrs with js.Any
  type FalseyValue = js.UndefOr[scala.Null | styledDashComponentsLib.styledDashComponentsLibNumbers.`false`]
  type GlobalStyleComponent[P, T] = reactLib.reactMod.ComponentClass[ThemedGlobalStyledClassProps[P, T], reactLib.reactMod.ComponentState]
  /* Rewritten from type alias, can be one of: 
    - InterpolationValue
    - FlattenInterpolation[P]
    - InterpolationFunction[P]
  */
  type Interpolation[P] = _Interpolation[P] | InterpolationValue
  type InterpolationValue = java.lang.String | scala.Double | FalseyValue | Keyframes | StyledComponentInterpolation | CSSObject
  // extracts React defaultProps
  type ReactDefaultProps[C] = js.Any
  type ReactDefaultizedProps[C, P] = P | (Defaultize[P, js.Any])
  type SimpleInterpolation = InterpolationValue | FlattenSimpleInterpolation
  type StyledComponent[C /* <: java.lang.String */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] = (// the "string" allows this to be used as an object key
  // I really want to avoid this if possible but it's the only way to use nesting with object styles...
  java.lang.String) with (StyledComponentBase[C, T, O, A])
  type StyledComponentInnerAttrs[C /* <: AnyStyledComponent */] = js.Any
  type StyledComponentInnerComponent[C /* <: reactLib.reactMod.ComponentType[_] */] = C
  type StyledComponentInnerOtherProps[C /* <: AnyStyledComponent */] = js.Any
  // remove the call signature from StyledComponent so Interpolation can still infer InterpolationFunction
  type StyledComponentInterpolation = (stdLib.Pick[StyledComponentBase[js.Any, js.Any, js.Any, js.Any], java.lang.String]) | (stdLib.Pick[StyledComponentBase[js.Any, js.Any, js.Any, scala.Nothing], java.lang.String])
  type StyledComponentProps[// The Component from whose props are derived
  C /* <: java.lang.String */, // The Theme from the current context
  T /* <: js.Object */, // The other props added by the template
  O /* <: js.Object */, // The props that are made optional by .attrs
  A /* <: java.lang.String */] = (WithOptionalTheme[
    (styledDashComponentsLib.Omit[(ReactDefaultizedProps[C, reactLib.reactMod.ComponentPropsWithRef[C]]) with O, A]) with (stdLib.Partial[stdLib.Pick[reactLib.reactMod.ComponentPropsWithRef[C] with O, A]]), 
    T
  ]) with WithChildrenIfReactComponentClass[C]
  type StyledComponentPropsWithAs[C /* <: java.lang.String */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] = (StyledComponentProps[C, T, O, A]) with styledDashComponentsLib.Anon_AsC[C]
  type StyledComponentPropsWithRef[C /* <: java.lang.String */] = reactLib.reactMod.ComponentPropsWithRef[C] | reactLib.reactMod.ComponentPropsWithRef[StyledComponentInnerComponent[C]]
  type StyledFunction[C /* <: java.lang.String */] = ThemedStyledFunction[C, js.Any, js.Object, scala.Nothing]
  type StyledInterface = ThemedStyledInterface[DefaultTheme]
  type StyledProps[P] = ThemedStyledProps[P, AnyIfEmpty[DefaultTheme]]
  type ThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = BaseThemeProviderComponent[AnyIfEmpty[T], AnyIfEmpty[U]]
  type ThemedCssFunction[T /* <: js.Object */] = BaseThemedCssFunction[AnyIfEmpty[T]]
  type ThemedGlobalStyledClassProps[P, T] = (WithOptionalTheme[P, T]) with styledDashComponentsLib.Anon_SuppressMultiMountWarning
  type ThemedStyledComponentFactories[T /* <: js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ TTag in 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ]: styled-components.styled-components.ThemedStyledFunction<TTag, T, {}, never>}
    */ styledDashComponentsLib.styledDashComponentsLibStrings.ThemedStyledComponentFactories with js.Any
  type ThemedStyledInterface[T /* <: js.Object */] = ThemedBaseStyledInterface[AnyIfEmpty[T]]
  type ThemedStyledProps[P, T] = P with ThemeProps[T]
  // Because of React typing quirks, when getting props from a React.ComponentClass,
  // we need to manually add a `children` field.
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/pull/31945
  // and https://github.com/DefinitelyTyped/DefinitelyTyped/pull/32843
  type WithChildrenIfReactComponentClass[C /* <: java.lang.String */] = js.Object | styledDashComponentsLib.Anon_Children
  type WithOptionalTheme[P /* <: styledDashComponentsLib.Anon_Theme[T] */, T] = P with styledDashComponentsLib.Anon_Theme[T]
  type WithThemeFnInterface[T /* <: js.Object */] = BaseWithThemeFnInterface[AnyIfEmpty[T]]
}
