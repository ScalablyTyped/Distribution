package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashComponentsLib {
  type AnyIfEmpty[T /* <: js.Object */] = java.lang.String
  type Attrs[P, A /* <: stdLib.Partial[P] */, T] = (js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ThemedStyledProps<P, T> */ /* props */ js.Any, 
    A
  ]) | A
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((stdLib.Pick[P, stdLib.Exclude[java.lang.String, java.lang.String]]) with (stdLib.Partial[stdLib.Pick[P, stdLib.Extract[java.lang.String, java.lang.String]]]) with (stdLib.Partial[stdLib.Pick[D, stdLib.Exclude[java.lang.String, java.lang.String]]])) | P
  type DeprecatedAttrs[P, A /* <: stdLib.Partial[P] */, T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof A ]: (props : any): A[K] | A[K]}
    */ styledDashComponentsLib.styledDashComponentsLibStrings.DeprecatedAttrs with js.Any
  // abuse Pick to strip the call signature from ForwardRefExoticComponent
  type ForwardRefExoticBase[P] = stdLib.Pick[reactLib.reactMod.ReactNs.ForwardRefExoticComponent[P], java.lang.String]
  // Helper type operators
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  // extracts React defaultProps
  type ReactDefaultProps[C] = js.Any
  type ReactDefaultizedProps[C, P] = P | (Defaultize[P, js.Any])
  type StyleSheetManagerProps = Anon_Sheet | Anon_SheetTarget
  // remove the call signature from StyledComponent so Interpolation can still infer InterpolationFunction
  type StyledComponentInterpolation = stdLib.Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StyledComponentBase<any, any, any, any> */ js.Any, 
    java.lang.String
  ]
  type StyledComponentPropsWithAs[C /* <: java.lang.String */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] = (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StyledComponentProps<C, T, O, A> */ js.Any) with Anon_As[C]
  type ThemedStyledComponentFactories[T /* <: js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ TTag in 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ]: any}
    */ styledDashComponentsLib.styledDashComponentsLibStrings.ThemedStyledComponentFactories with js.Any
  // Because of React typing quirks, when getting props from a React.ComponentClass,
  // we need to manually add a `children` field.
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/pull/31945
  // and https://github.com/DefinitelyTyped/DefinitelyTyped/pull/32843
  type WithChildrenIfReactComponentClass[C /* <: java.lang.String */] = js.Object | Anon_Children
  type WithOptionalTheme[P /* <: Anon_Theme[T] */, T] = P with Anon_Theme[T]
}
