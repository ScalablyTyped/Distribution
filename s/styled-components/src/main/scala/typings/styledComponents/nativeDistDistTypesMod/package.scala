package typings.styledComponents.nativeDistDistTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.HTMLAttributes
import typings.std.Omit
import typings.std.Record
import typings.std.TemplateStringsArray
import typings.styledComponents.anon.As
import typings.styledComponents.anon.`173`
import typings.styledComponents.styledComponentsStrings.$as
import typings.styledComponents.styledComponentsStrings.as
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyComponent[P] = ExoticComponentWithDisplayName[P] | ComponentType[P]

type Attrs[Props] = (ExtensibleObject & Props) | (js.Function1[/* props */ ExecutionContext & Props, ExecutionContext & Props])

type BaseExtensibleObject = StringDictionary[Any]

type CustomComponentProps[ActualComponent /* <: StyledTarget */, PropsToBeInjectedIntoActualComponent /* <: js.Object */, ActualComponentProps] = (As[ActualComponent] & HTMLAttributes[ActualComponent] & (Omit[
PropsToBeInjectedIntoActualComponent, 
(/* keyof ActualComponentProps */ String) | as | $as]) & ActualComponentProps) | (`173`[ActualComponent] & HTMLAttributes[ActualComponent] & (Omit[
PropsToBeInjectedIntoActualComponent, 
(/* keyof ActualComponentProps */ String) | as | $as]) & ActualComponentProps)

/* Rewritten from type alias, can be one of: 
  - typings.styledComponents.nativeDistDistTypesMod.RuleSet[Props]
  - scala.Double
  - java.lang.String
  - js.Array[java.lang.String]
  - typings.styledComponents.nativeDistDistTypesMod.IStyledComponent[scala.Any, scala.Any]
  - typings.styledComponents.nativeDistDistTypesMod.Keyframes
*/
type FlattenerResult[Props] = _FlattenerResult[Props] | js.Array[String] | (IStyledComponent[Any, Any]) | Double | String

/** 
NOTE: Rewritten from type alias:
{{{
type Interpolation = styled-components.styled-components/native/dist/dist/types.StyleFunction<Props> | styled-components.styled-components/native/dist/dist/types.StyledObject | string | number | styled-components.styled-components/native/dist/dist/types.Keyframes | styled-components.styled-components/native/dist/dist/types.IStyledComponent<any, any> | std.Array<styled-components.styled-components/native/dist/dist/types.Interpolation<Props>>
}}}
to avoid circular code involving: 
- styled-components.styled-components/native/dist/dist/types.Interpolation
*/
/* Rewritten from type alias, can be one of: 
  - typings.styledComponents.nativeDistDistTypesMod.StyleFunction[Props]
  - typings.styledComponents.nativeDistDistTypesMod.StyledObject
  - java.lang.String
  - scala.Double
  - typings.styledComponents.nativeDistDistTypesMod.Keyframes
  - typings.styledComponents.nativeDistDistTypesMod.IStyledComponent[scala.Any, scala.Any]
  - js.Array[scala.Any]
*/
type Interpolation[Props] = _Interpolation[Props] | (IStyledComponent[Any, Any]) | js.Array[Any] | StyledObject | String | Double

/* Rewritten from type alias, can be one of: 
  - typings.styledComponents.styledComponentsStrings.a
  - typings.styledComponents.styledComponentsStrings.abbr
  - typings.styledComponents.styledComponentsStrings.address
  - typings.styledComponents.styledComponentsStrings.area
  - typings.styledComponents.styledComponentsStrings.article
  - typings.styledComponents.styledComponentsStrings.aside
  - typings.styledComponents.styledComponentsStrings.audio
  - typings.styledComponents.styledComponentsStrings.b
  - typings.styledComponents.styledComponentsStrings.base
  - typings.styledComponents.styledComponentsStrings.bdi
  - typings.styledComponents.styledComponentsStrings.bdo
  - typings.styledComponents.styledComponentsStrings.big
  - typings.styledComponents.styledComponentsStrings.blockquote
  - typings.styledComponents.styledComponentsStrings.body
  - typings.styledComponents.styledComponentsStrings.br
  - typings.styledComponents.styledComponentsStrings.button
  - typings.styledComponents.styledComponentsStrings.canvas
  - typings.styledComponents.styledComponentsStrings.caption
  - typings.styledComponents.styledComponentsStrings.cite
  - typings.styledComponents.styledComponentsStrings.code
  - typings.styledComponents.styledComponentsStrings.col
  - typings.styledComponents.styledComponentsStrings.colgroup
  - typings.styledComponents.styledComponentsStrings.data
  - typings.styledComponents.styledComponentsStrings.datalist
  - typings.styledComponents.styledComponentsStrings.dd
  - typings.styledComponents.styledComponentsStrings.del
  - typings.styledComponents.styledComponentsStrings.details
  - typings.styledComponents.styledComponentsStrings.dfn
  - typings.styledComponents.styledComponentsStrings.dialog
  - typings.styledComponents.styledComponentsStrings.div
  - typings.styledComponents.styledComponentsStrings.dl
  - typings.styledComponents.styledComponentsStrings.dt
  - typings.styledComponents.styledComponentsStrings.em
  - typings.styledComponents.styledComponentsStrings.embed
  - typings.styledComponents.styledComponentsStrings.fieldset
  - typings.styledComponents.styledComponentsStrings.figcaption
  - typings.styledComponents.styledComponentsStrings.figure
  - typings.styledComponents.styledComponentsStrings.footer
  - typings.styledComponents.styledComponentsStrings.form
  - typings.styledComponents.styledComponentsStrings.h1
  - typings.styledComponents.styledComponentsStrings.h2
  - typings.styledComponents.styledComponentsStrings.h3
  - typings.styledComponents.styledComponentsStrings.h4
  - typings.styledComponents.styledComponentsStrings.h5
  - typings.styledComponents.styledComponentsStrings.h6
  - typings.styledComponents.styledComponentsStrings.head
  - typings.styledComponents.styledComponentsStrings.header
  - typings.styledComponents.styledComponentsStrings.hgroup
  - typings.styledComponents.styledComponentsStrings.hr
  - typings.styledComponents.styledComponentsStrings.html
  - typings.styledComponents.styledComponentsStrings.i
  - typings.styledComponents.styledComponentsStrings.iframe
  - typings.styledComponents.styledComponentsStrings.img
  - typings.styledComponents.styledComponentsStrings.input
  - typings.styledComponents.styledComponentsStrings.ins
  - typings.styledComponents.styledComponentsStrings.kbd
  - typings.styledComponents.styledComponentsStrings.keygen
  - typings.styledComponents.styledComponentsStrings.label
  - typings.styledComponents.styledComponentsStrings.legend
  - typings.styledComponents.styledComponentsStrings.li
  - typings.styledComponents.styledComponentsStrings.link
  - typings.styledComponents.styledComponentsStrings.main
  - typings.styledComponents.styledComponentsStrings.map
  - typings.styledComponents.styledComponentsStrings.mark
  - typings.styledComponents.styledComponentsStrings.menu
  - typings.styledComponents.styledComponentsStrings.menuitem
  - typings.styledComponents.styledComponentsStrings.meta
  - typings.styledComponents.styledComponentsStrings.meter
  - typings.styledComponents.styledComponentsStrings.nav
  - typings.styledComponents.styledComponentsStrings.noindex
  - typings.styledComponents.styledComponentsStrings.noscript
  - typings.styledComponents.styledComponentsStrings.`object`
  - typings.styledComponents.styledComponentsStrings.ol
  - typings.styledComponents.styledComponentsStrings.optgroup
  - typings.styledComponents.styledComponentsStrings.option
  - typings.styledComponents.styledComponentsStrings.output
  - typings.styledComponents.styledComponentsStrings.p
  - typings.styledComponents.styledComponentsStrings.param
  - typings.styledComponents.styledComponentsStrings.picture
  - typings.styledComponents.styledComponentsStrings.pre
  - typings.styledComponents.styledComponentsStrings.progress
  - typings.styledComponents.styledComponentsStrings.q
  - typings.styledComponents.styledComponentsStrings.rp
  - typings.styledComponents.styledComponentsStrings.rt
  - typings.styledComponents.styledComponentsStrings.ruby
  - typings.styledComponents.styledComponentsStrings.s
  - typings.styledComponents.styledComponentsStrings.samp
  - typings.styledComponents.styledComponentsStrings.slot
  - typings.styledComponents.styledComponentsStrings.script
  - typings.styledComponents.styledComponentsStrings.section
  - typings.styledComponents.styledComponentsStrings.select
  - typings.styledComponents.styledComponentsStrings.small
  - typings.styledComponents.styledComponentsStrings.source
  - typings.styledComponents.styledComponentsStrings.span
  - typings.styledComponents.styledComponentsStrings.strong
  - typings.styledComponents.styledComponentsStrings.style
  - typings.styledComponents.styledComponentsStrings.sub
  - typings.styledComponents.styledComponentsStrings.summary
  - typings.styledComponents.styledComponentsStrings.sup
  - typings.styledComponents.styledComponentsStrings.table
  - typings.styledComponents.styledComponentsStrings.template
  - typings.styledComponents.styledComponentsStrings.tbody
  - typings.styledComponents.styledComponentsStrings.td
  - typings.styledComponents.styledComponentsStrings.textarea
  - typings.styledComponents.styledComponentsStrings.tfoot
  - typings.styledComponents.styledComponentsStrings.th
  - typings.styledComponents.styledComponentsStrings.thead
  - typings.styledComponents.styledComponentsStrings.time
  - typings.styledComponents.styledComponentsStrings.title
  - typings.styledComponents.styledComponentsStrings.tr
  - typings.styledComponents.styledComponentsStrings.track
  - typings.styledComponents.styledComponentsStrings.u
  - typings.styledComponents.styledComponentsStrings.ul
  - typings.styledComponents.styledComponentsStrings.`var`
  - typings.styledComponents.styledComponentsStrings.video
  - typings.styledComponents.styledComponentsStrings.wbr
  - typings.styledComponents.styledComponentsStrings.webview
  - typings.styledComponents.styledComponentsStrings.svg
  - typings.styledComponents.styledComponentsStrings.animate
  - typings.styledComponents.styledComponentsStrings.animateMotion
  - typings.styledComponents.styledComponentsStrings.animateTransform
  - typings.styledComponents.styledComponentsStrings.circle
  - typings.styledComponents.styledComponentsStrings.clipPath
  - typings.styledComponents.styledComponentsStrings.defs
  - typings.styledComponents.styledComponentsStrings.desc
  - typings.styledComponents.styledComponentsStrings.ellipse
  - typings.styledComponents.styledComponentsStrings.feBlend
  - typings.styledComponents.styledComponentsStrings.feColorMatrix
  - typings.styledComponents.styledComponentsStrings.feComponentTransfer
  - typings.styledComponents.styledComponentsStrings.feComposite
  - typings.styledComponents.styledComponentsStrings.feConvolveMatrix
  - typings.styledComponents.styledComponentsStrings.feDiffuseLighting
  - typings.styledComponents.styledComponentsStrings.feDisplacementMap
  - typings.styledComponents.styledComponentsStrings.feDistantLight
  - typings.styledComponents.styledComponentsStrings.feDropShadow
  - typings.styledComponents.styledComponentsStrings.feFlood
  - typings.styledComponents.styledComponentsStrings.feFuncA
  - typings.styledComponents.styledComponentsStrings.feFuncB
  - typings.styledComponents.styledComponentsStrings.feFuncG
  - typings.styledComponents.styledComponentsStrings.feFuncR
  - typings.styledComponents.styledComponentsStrings.feGaussianBlur
  - typings.styledComponents.styledComponentsStrings.feImage
  - typings.styledComponents.styledComponentsStrings.feMerge
  - typings.styledComponents.styledComponentsStrings.feMergeNode
  - typings.styledComponents.styledComponentsStrings.feMorphology
  - typings.styledComponents.styledComponentsStrings.feOffset
  - typings.styledComponents.styledComponentsStrings.fePointLight
  - typings.styledComponents.styledComponentsStrings.feSpecularLighting
  - typings.styledComponents.styledComponentsStrings.feSpotLight
  - typings.styledComponents.styledComponentsStrings.feTile
  - typings.styledComponents.styledComponentsStrings.feTurbulence
  - typings.styledComponents.styledComponentsStrings.filter
  - typings.styledComponents.styledComponentsStrings.foreignObject
  - typings.styledComponents.styledComponentsStrings.g
  - typings.styledComponents.styledComponentsStrings.image
  - typings.styledComponents.styledComponentsStrings.line
  - typings.styledComponents.styledComponentsStrings.linearGradient
  - typings.styledComponents.styledComponentsStrings.marker
  - typings.styledComponents.styledComponentsStrings.mask
  - typings.styledComponents.styledComponentsStrings.metadata
  - typings.styledComponents.styledComponentsStrings.mpath
  - typings.styledComponents.styledComponentsStrings.path
  - typings.styledComponents.styledComponentsStrings.pattern
  - typings.styledComponents.styledComponentsStrings.polygon
  - typings.styledComponents.styledComponentsStrings.polyline
  - typings.styledComponents.styledComponentsStrings.radialGradient
  - typings.styledComponents.styledComponentsStrings.rect
  - typings.styledComponents.styledComponentsStrings.stop
  - typings.styledComponents.styledComponentsStrings.switch
  - typings.styledComponents.styledComponentsStrings.symbol
  - typings.styledComponents.styledComponentsStrings.text
  - typings.styledComponents.styledComponentsStrings.textPath
  - typings.styledComponents.styledComponentsStrings.tspan
  - typings.styledComponents.styledComponentsStrings.use
  - typings.styledComponents.styledComponentsStrings.view
  - typings.styledComponents.nativeDistDistTypesMod.AnyComponent[scala.Any]
*/
type KnownWebTarget = _KnownWebTarget | AnyComponent[Any]

type NameGenerator = js.Function1[/* hash */ Double, String]

type NativeTarget = AnyComponent[Any]

type ShouldForwardProp = js.Function3[
/* prop */ String, 
/* isValidAttr */ js.Function1[/* prop */ String, Boolean], 
/* elementToBeCreated */ js.UndefOr[WebTarget | NativeTarget], 
Boolean]

type StyledObject = StringDictionary[(Record[String, Any]) | String | Double | StyleFunction[ExecutionContext]]

type StyledTarget = WebTarget | NativeTarget

type Styles[Props] = TemplateStringsArray | StyledObject | StyleFunction[Props]

type WebTarget = String | KnownWebTarget
