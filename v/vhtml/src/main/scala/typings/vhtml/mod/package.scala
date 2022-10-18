package typings.vhtml.mod

import typings.std.Exclude
import typings.std.Pick
import typings.vhtml.anon.ChildrenChildren
import typings.vhtml.anon.Dictattr
import typings.vhtml.mod.^
import typings.vhtml.vhtmlStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply[T /* <: String */](name: T, attrs: Null, children: Any*): String = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[String]
inline def apply[T /* <: String */](name: T, attrs: Unit, children: Any*): String = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[String]
/**
  * Converts Hyperscript/JSX to a plain string.
  * @param name Element name
  * @param attrs Attributes
  * @param children Child elements
  */
inline def apply[T /* <: String */](name: T, attrs: HtmlElementAttr[T], children: Any*): String = (^.asInstanceOf[js.Dynamic].apply((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[String]
/**
  * Converts Hyperscript/JSX to a plain string.
  * @param component Functional pseudo-component
  * @param attrs Attributes
  * @param children Child elements
  */
inline def apply[Props, Children /* <: js.Array[Any] */](
  component: js.Function1[/* props */ Props & ChildrenChildren[Children], String],
  attrs: Props,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type Children is not an array type */ children: Children
): String = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def apply[Props, Children /* <: js.Array[Any] */](
  component: js.Function1[/* props */ Props & ChildrenChildren[Children], String],
  attrs: Null,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type Children is not an array type */ children: Children
): String = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def apply[Props, Children /* <: js.Array[Any] */](
  component: js.Function1[/* props */ Props & ChildrenChildren[Children], String],
  attrs: Unit,
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type Children is not an array type */ children: Children
): String = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]

/**
  * @internal
  * Type alias that transforms the type of `props.children` of a vhtml component
  * to a type that TypeScript expects.
  *
  * Currently, this supports:
  * - Empty components (no props.children)
  * - Empty components (props.children is an empty tuple)
  * - Components with exactly one child (props.children is a 1-length tuple)
  * - Components with exactly zero or one child
  * - Components with arbitrary number of children (props.children is an array)
  * - Forbidding components whose props.children is not an array
  */
type ComponentPropTransform[TComp, TProps] = (SafeEmptyType[typings.std.Omit[TProps, children]]) & (/* import warning: importer.ImportType#apply Failed type conversion: TProps extends {  children :[]} ? {} : TProps extends {  children :[infer ChildType]} ? {  children :ChildType} : TProps extends {  children :[infer ChildType | undefined]} ? {  children :ChildType | undefined} : TProps extends {  children :std.Array<infer ChildrenType>} ? {  children :ChildrenType | std.Array<ChildrenType> | undefined} : TProps extends {  children :any} ? never : {} */ js.Any)

/**
  * @internal
  * Attributes supported on HTML tags.
  * This type alias allows custom tags to have any attribute, while still
  * enforcing type-checks on known HTML attributes.
  *
  * Notes:
  *  - Because TypeScript forbids unknown tag names in JSX, custom string tags
  *    can be used only with hyperscript-style code.
  *  - There is no need to add `{ [attr: string]: any }` to known attributes,
  *    since TypeScript already supports arbitrary `data-*` attributes in JSX
  *    (see "Note" in https://www.typescriptlang.org/docs/handbook/jsx.html#attribute-type-checking)
  */
type HtmlElementAttr[Tag /* <: String */] = (/* import warning: importer.ImportType#apply Failed type conversion: Tag extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ? vhtml.vhtml.JSX.IntrinsicElements[Tag] : {} */ js.Any) & Dictattr

/**
  * @internal
  * Same as `Omit<T, K>` introduced in TypeScript 3.4.
  * Added here so that we can support older versions of TypeScript.
  */
type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
