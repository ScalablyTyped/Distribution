package typings.xstyledStyledComponents

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.TemplateStringsArray
import typings.styledComponents.styledComponentsMod.AnyIfEmpty
import typings.styledComponents.styledComponentsMod.CSSKeyframes
import typings.styledComponents.styledComponentsMod.CSSObject
import typings.styledComponents.styledComponentsMod.DefaultTheme
import typings.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
import typings.styledComponents.styledComponentsMod.GlobalStyleComponent
import typings.styledComponents.styledComponentsMod.Interpolation
import typings.styledComponents.styledComponentsMod.InterpolationFunction
import typings.styledComponents.styledComponentsMod.Keyframes_
import typings.styledComponents.styledComponentsMod.SimpleInterpolation
import typings.styledComponents.styledComponentsMod.StyleSheetManagerProps
import typings.styledComponents.styledComponentsMod.StyledComponent
import typings.styledComponents.styledComponentsMod.ThemeProviderComponent
import typings.styledComponents.styledComponentsMod.ThemeProviderProps
import typings.styledComponents.styledComponentsMod.ThemedCssFunction
import typings.styledComponents.styledComponentsMod.ThemedStyledFunction
import typings.styledComponents.styledComponentsMod.ThemedStyledProps
import typings.styledComponents.styledComponentsMod.WithThemeFnInterface
import typings.xstyledStyledComponents.anon.ReadonlyStyleSheetManager
import typings.xstyledStyledComponents.anon.Target
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.a
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.abbr
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.address
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.animate
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.animateMotion
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.animateTransform
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.area
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.article
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.aside
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.audio
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.b
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.base
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.bdi
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.bdo
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.big
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.blockquote
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.body
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.br
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.button
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.canvas
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.caption
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.circle
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.cite
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.clipPath
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.code
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.col
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.colgroup
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.data
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.datalist
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.dd
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.defs
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.del
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.desc
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.details
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.dfn
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.dialog
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.div
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.dl
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.dt
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.ellipse
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.em
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.embed
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feBlend
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feColorMatrix
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feComponentTransfer
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feComposite
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feConvolveMatrix
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feDiffuseLighting
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feDisplacementMap
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feDistantLight
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feDropShadow
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feFlood
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncA
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncB
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncG
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncR
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feGaussianBlur
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feImage
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feMerge
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feMergeNode
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feMorphology
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feOffset
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.fePointLight
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feSpecularLighting
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feSpotLight
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feTile
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feTurbulence
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.fieldset
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.figcaption
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.figure
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.filter
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.footer
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.foreignObject
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.form
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.g
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.h1
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.h2
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.h3
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.h4
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.h5
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.h6
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.head
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.header
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.hgroup
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.hr
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.html
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.i
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.iframe
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.image
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.img
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.input
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.ins
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.kbd
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.keygen
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.label
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.legend
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.li
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.line
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.linearGradient
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.link
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.main
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.map
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.mark
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.marker
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.mask
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.menu
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.menuitem
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.meta
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.metadata
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.meter
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.mpath
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.nav
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.noindex
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.noscript
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.ol
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.optgroup
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.option
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.output
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.p
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.param
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.path
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.pattern
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.picture
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.polygon
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.polyline
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.pre
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.progress
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.q
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.radialGradient
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.rect
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.rp
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.rt
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.ruby
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.s
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.samp
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.script
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.section
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.select
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.slot
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.small
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.source
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.span
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.stop
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.strong
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.style
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.sub
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.summary
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.sup
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.svg
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.switch
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.symbol
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.table
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.tbody
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.td
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.template
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.text
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.textPath
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.textarea
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.tfoot
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.th
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.thead
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.time
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.title
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.tr
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.track
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.tspan
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.u
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.ul
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.use
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.video
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.view
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.wbr
import typings.xstyledStyledComponents.xstyledStyledComponentsStrings.webview
import typings.xstyledSystem.mod.AliasKey
import typings.xstyledSystem.mod.ResponsiveValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Support for xxBoxes, i.e. aBox, articleBox
    * List of dom elements from Styled Components:
    * https://github.com/styled-components/styled-components/blob/master/packages/styled-components/src/utils/domElements.js */
  /* Inlined styled-components.styled-components.StyledInterface & {  aBox :styled-components.styled-components.ThemedStyledFunction<'a', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   abbrBox :styled-components.styled-components.ThemedStyledFunction<'abbr', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   addressBox :styled-components.styled-components.ThemedStyledFunction<'address', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   areaBox :styled-components.styled-components.ThemedStyledFunction<'area', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   articleBox :styled-components.styled-components.ThemedStyledFunction<'article', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   asideBox :styled-components.styled-components.ThemedStyledFunction<'aside', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   audioBox :styled-components.styled-components.ThemedStyledFunction<'audio', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   bBox :styled-components.styled-components.ThemedStyledFunction<'b', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   baseBox :styled-components.styled-components.ThemedStyledFunction<'base', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   bdiBox :styled-components.styled-components.ThemedStyledFunction<'bdi', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   bdoBox :styled-components.styled-components.ThemedStyledFunction<'bdo', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   bigBox :styled-components.styled-components.ThemedStyledFunction<'big', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   blockquoteBox :styled-components.styled-components.ThemedStyledFunction<'blockquote', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   bodyBox :styled-components.styled-components.ThemedStyledFunction<'body', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   brBox :styled-components.styled-components.ThemedStyledFunction<'br', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   buttonBox :styled-components.styled-components.ThemedStyledFunction<'button', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   canvasBox :styled-components.styled-components.ThemedStyledFunction<'canvas', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   captionBox :styled-components.styled-components.ThemedStyledFunction<'caption', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   citeBox :styled-components.styled-components.ThemedStyledFunction<'cite', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   codeBox :styled-components.styled-components.ThemedStyledFunction<'code', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   colBox :styled-components.styled-components.ThemedStyledFunction<'col', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   colgroupBox :styled-components.styled-components.ThemedStyledFunction<'colgroup', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   dataBox :styled-components.styled-components.ThemedStyledFunction<'data', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   datalistBox :styled-components.styled-components.ThemedStyledFunction<'datalist', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   ddBox :styled-components.styled-components.ThemedStyledFunction<'dd', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   delBox :styled-components.styled-components.ThemedStyledFunction<'del', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   detailsBox :styled-components.styled-components.ThemedStyledFunction<'details', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   dfnBox :styled-components.styled-components.ThemedStyledFunction<'dfn', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   dialogBox :styled-components.styled-components.ThemedStyledFunction<'dialog', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   divBox :styled-components.styled-components.ThemedStyledFunction<'div', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   dlBox :styled-components.styled-components.ThemedStyledFunction<'dl', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   dtBox :styled-components.styled-components.ThemedStyledFunction<'dt', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   emBox :styled-components.styled-components.ThemedStyledFunction<'em', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   embedBox :styled-components.styled-components.ThemedStyledFunction<'embed', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   fieldsetBox :styled-components.styled-components.ThemedStyledFunction<'fieldset', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   figcaptionBox :styled-components.styled-components.ThemedStyledFunction<'figcaption', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   figureBox :styled-components.styled-components.ThemedStyledFunction<'figure', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   footerBox :styled-components.styled-components.ThemedStyledFunction<'footer', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   formBox :styled-components.styled-components.ThemedStyledFunction<'form', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   h1Box :styled-components.styled-components.ThemedStyledFunction<'h1', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   h2Box :styled-components.styled-components.ThemedStyledFunction<'h2', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   h3Box :styled-components.styled-components.ThemedStyledFunction<'h3', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   h4Box :styled-components.styled-components.ThemedStyledFunction<'h4', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   h5Box :styled-components.styled-components.ThemedStyledFunction<'h5', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   h6Box :styled-components.styled-components.ThemedStyledFunction<'h6', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   headBox :styled-components.styled-components.ThemedStyledFunction<'head', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   headerBox :styled-components.styled-components.ThemedStyledFunction<'header', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   hgroupBox :styled-components.styled-components.ThemedStyledFunction<'hgroup', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   hrBox :styled-components.styled-components.ThemedStyledFunction<'hr', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   htmlBox :styled-components.styled-components.ThemedStyledFunction<'html', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   iBox :styled-components.styled-components.ThemedStyledFunction<'i', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   iframeBox :styled-components.styled-components.ThemedStyledFunction<'iframe', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   imgBox :styled-components.styled-components.ThemedStyledFunction<'img', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   inputBox :styled-components.styled-components.ThemedStyledFunction<'input', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   insBox :styled-components.styled-components.ThemedStyledFunction<'ins', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   kbdBox :styled-components.styled-components.ThemedStyledFunction<'kbd', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   keygenBox :styled-components.styled-components.ThemedStyledFunction<'keygen', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   labelBox :styled-components.styled-components.ThemedStyledFunction<'label', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   legendBox :styled-components.styled-components.ThemedStyledFunction<'legend', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   liBox :styled-components.styled-components.ThemedStyledFunction<'li', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   linkBox :styled-components.styled-components.ThemedStyledFunction<'link', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   mainBox :styled-components.styled-components.ThemedStyledFunction<'main', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   mapBox :styled-components.styled-components.ThemedStyledFunction<'map', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   markBox :styled-components.styled-components.ThemedStyledFunction<'mark', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   menuBox :styled-components.styled-components.ThemedStyledFunction<'menu', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   menuitemBox :styled-components.styled-components.ThemedStyledFunction<'menuitem', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   metaBox :styled-components.styled-components.ThemedStyledFunction<'meta', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   meterBox :styled-components.styled-components.ThemedStyledFunction<'meter', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   navBox :styled-components.styled-components.ThemedStyledFunction<'nav', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   noscriptBox :styled-components.styled-components.ThemedStyledFunction<'noscript', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   objectBox :styled-components.styled-components.ThemedStyledFunction<'object', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   olBox :styled-components.styled-components.ThemedStyledFunction<'ol', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   optgroupBox :styled-components.styled-components.ThemedStyledFunction<'optgroup', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   optionBox :styled-components.styled-components.ThemedStyledFunction<'option', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   outputBox :styled-components.styled-components.ThemedStyledFunction<'output', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   pBox :styled-components.styled-components.ThemedStyledFunction<'p', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   paramBox :styled-components.styled-components.ThemedStyledFunction<'param', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   pictureBox :styled-components.styled-components.ThemedStyledFunction<'picture', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   preBox :styled-components.styled-components.ThemedStyledFunction<'pre', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   progressBox :styled-components.styled-components.ThemedStyledFunction<'progress', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   qBox :styled-components.styled-components.ThemedStyledFunction<'q', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   rpBox :styled-components.styled-components.ThemedStyledFunction<'rp', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   rtBox :styled-components.styled-components.ThemedStyledFunction<'rt', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   rubyBox :styled-components.styled-components.ThemedStyledFunction<'ruby', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   sBox :styled-components.styled-components.ThemedStyledFunction<'s', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   sampBox :styled-components.styled-components.ThemedStyledFunction<'samp', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   scriptBox :styled-components.styled-components.ThemedStyledFunction<'script', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   sectionBox :styled-components.styled-components.ThemedStyledFunction<'section', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   selectBox :styled-components.styled-components.ThemedStyledFunction<'select', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   smallBox :styled-components.styled-components.ThemedStyledFunction<'small', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   sourceBox :styled-components.styled-components.ThemedStyledFunction<'source', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   spanBox :styled-components.styled-components.ThemedStyledFunction<'span', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   strongBox :styled-components.styled-components.ThemedStyledFunction<'strong', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   styleBox :styled-components.styled-components.ThemedStyledFunction<'style', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   subBox :styled-components.styled-components.ThemedStyledFunction<'sub', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   summaryBox :styled-components.styled-components.ThemedStyledFunction<'summary', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   supBox :styled-components.styled-components.ThemedStyledFunction<'sup', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   tableBox :styled-components.styled-components.ThemedStyledFunction<'table', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   tbodyBox :styled-components.styled-components.ThemedStyledFunction<'tbody', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   tdBox :styled-components.styled-components.ThemedStyledFunction<'td', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   textareaBox :styled-components.styled-components.ThemedStyledFunction<'textarea', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   tfootBox :styled-components.styled-components.ThemedStyledFunction<'tfoot', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   thBox :styled-components.styled-components.ThemedStyledFunction<'th', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   theadBox :styled-components.styled-components.ThemedStyledFunction<'thead', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   timeBox :styled-components.styled-components.ThemedStyledFunction<'time', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   titleBox :styled-components.styled-components.ThemedStyledFunction<'title', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   trBox :styled-components.styled-components.ThemedStyledFunction<'tr', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   trackBox :styled-components.styled-components.ThemedStyledFunction<'track', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   uBox :styled-components.styled-components.ThemedStyledFunction<'u', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   ulBox :styled-components.styled-components.ThemedStyledFunction<'ul', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   varBox :styled-components.styled-components.ThemedStyledFunction<'var', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   videoBox :styled-components.styled-components.ThemedStyledFunction<'video', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   wbrBox :styled-components.styled-components.ThemedStyledFunction<'wbr', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   circleBox :styled-components.styled-components.ThemedStyledFunction<'circle', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   clipPathBox :styled-components.styled-components.ThemedStyledFunction<'clipPath', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   defsBox :styled-components.styled-components.ThemedStyledFunction<'defs', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   ellipseBox :styled-components.styled-components.ThemedStyledFunction<'ellipse', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   foreignObjectBox :styled-components.styled-components.ThemedStyledFunction<'foreignObject', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   gBox :styled-components.styled-components.ThemedStyledFunction<'g', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   imageBox :styled-components.styled-components.ThemedStyledFunction<'image', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   lineBox :styled-components.styled-components.ThemedStyledFunction<'line', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   linearGradientBox :styled-components.styled-components.ThemedStyledFunction<'linearGradient', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   markerBox :styled-components.styled-components.ThemedStyledFunction<'marker', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   maskBox :styled-components.styled-components.ThemedStyledFunction<'mask', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   pathBox :styled-components.styled-components.ThemedStyledFunction<'path', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   patternBox :styled-components.styled-components.ThemedStyledFunction<'pattern', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   polygonBox :styled-components.styled-components.ThemedStyledFunction<'polygon', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   polylineBox :styled-components.styled-components.ThemedStyledFunction<'polyline', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   radialGradientBox :styled-components.styled-components.ThemedStyledFunction<'radialGradient', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   rectBox :styled-components.styled-components.ThemedStyledFunction<'rect', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   stopBox :styled-components.styled-components.ThemedStyledFunction<'stop', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   svgBox :styled-components.styled-components.ThemedStyledFunction<'svg', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   textBox :styled-components.styled-components.ThemedStyledFunction<'text', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>,   tspanBox :styled-components.styled-components.ThemedStyledFunction<'tspan', styled-components.styled-components.DefaultTheme, @xstyled/styled-components.@xstyled/styled-components.BoxProps, never>} */
  object default {
    
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: typings.xstyledStyledComponents.xstyledStyledComponentsStrings.`object`
    ): ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.`object`, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: typings.xstyledStyledComponents.xstyledStyledComponentsStrings.`var`
    ): ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.`var`, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: a
    ): ThemedStyledFunction[a, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: abbr
    ): ThemedStyledFunction[abbr, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: address
    ): ThemedStyledFunction[address, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: animate
    ): ThemedStyledFunction[animate, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: animateMotion
    ): ThemedStyledFunction[animateMotion, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: animateTransform
    ): ThemedStyledFunction[animateTransform, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: area
    ): ThemedStyledFunction[area, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: article
    ): ThemedStyledFunction[article, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: aside
    ): ThemedStyledFunction[aside, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: audio
    ): ThemedStyledFunction[audio, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: b
    ): ThemedStyledFunction[b, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: base
    ): ThemedStyledFunction[base, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: bdi
    ): ThemedStyledFunction[bdi, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: bdo
    ): ThemedStyledFunction[bdo, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: big
    ): ThemedStyledFunction[big, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: blockquote
    ): ThemedStyledFunction[blockquote, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: body
    ): ThemedStyledFunction[body, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: br
    ): ThemedStyledFunction[br, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: button
    ): ThemedStyledFunction[button, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: canvas
    ): ThemedStyledFunction[canvas, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: caption
    ): ThemedStyledFunction[caption, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: circle
    ): ThemedStyledFunction[circle, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: cite
    ): ThemedStyledFunction[cite, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: clipPath
    ): ThemedStyledFunction[clipPath, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: code
    ): ThemedStyledFunction[code, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: col
    ): ThemedStyledFunction[col, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: colgroup
    ): ThemedStyledFunction[colgroup, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: data
    ): ThemedStyledFunction[data, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: datalist
    ): ThemedStyledFunction[datalist, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: dd
    ): ThemedStyledFunction[dd, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: defs
    ): ThemedStyledFunction[defs, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: del
    ): ThemedStyledFunction[del, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: desc
    ): ThemedStyledFunction[desc, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: details
    ): ThemedStyledFunction[details, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: dfn
    ): ThemedStyledFunction[dfn, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: dialog
    ): ThemedStyledFunction[dialog, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: div
    ): ThemedStyledFunction[div, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: dl
    ): ThemedStyledFunction[dl, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: dt
    ): ThemedStyledFunction[dt, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: ellipse
    ): ThemedStyledFunction[ellipse, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: em
    ): ThemedStyledFunction[em, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: embed
    ): ThemedStyledFunction[embed, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feBlend
    ): ThemedStyledFunction[feBlend, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feColorMatrix
    ): ThemedStyledFunction[feColorMatrix, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feComponentTransfer
    ): ThemedStyledFunction[feComponentTransfer, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feComposite
    ): ThemedStyledFunction[feComposite, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feConvolveMatrix
    ): ThemedStyledFunction[feConvolveMatrix, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feDiffuseLighting
    ): ThemedStyledFunction[feDiffuseLighting, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feDisplacementMap
    ): ThemedStyledFunction[feDisplacementMap, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feDistantLight
    ): ThemedStyledFunction[feDistantLight, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feDropShadow
    ): ThemedStyledFunction[feDropShadow, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feFlood
    ): ThemedStyledFunction[feFlood, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feFuncA
    ): ThemedStyledFunction[feFuncA, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feFuncB
    ): ThemedStyledFunction[feFuncB, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feFuncG
    ): ThemedStyledFunction[feFuncG, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feFuncR
    ): ThemedStyledFunction[feFuncR, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feGaussianBlur
    ): ThemedStyledFunction[feGaussianBlur, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feImage
    ): ThemedStyledFunction[feImage, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feMerge
    ): ThemedStyledFunction[feMerge, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feMergeNode
    ): ThemedStyledFunction[feMergeNode, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feMorphology
    ): ThemedStyledFunction[feMorphology, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feOffset
    ): ThemedStyledFunction[feOffset, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: fePointLight
    ): ThemedStyledFunction[fePointLight, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feSpecularLighting
    ): ThemedStyledFunction[feSpecularLighting, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feSpotLight
    ): ThemedStyledFunction[feSpotLight, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feTile
    ): ThemedStyledFunction[feTile, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: feTurbulence
    ): ThemedStyledFunction[feTurbulence, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: fieldset
    ): ThemedStyledFunction[fieldset, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: figcaption
    ): ThemedStyledFunction[figcaption, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: figure
    ): ThemedStyledFunction[figure, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: filter
    ): ThemedStyledFunction[filter, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: footer
    ): ThemedStyledFunction[footer, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: foreignObject
    ): ThemedStyledFunction[foreignObject, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: form
    ): ThemedStyledFunction[form, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: g
    ): ThemedStyledFunction[g, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: h1
    ): ThemedStyledFunction[h1, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: h2
    ): ThemedStyledFunction[h2, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: h3
    ): ThemedStyledFunction[h3, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: h4
    ): ThemedStyledFunction[h4, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: h5
    ): ThemedStyledFunction[h5, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: h6
    ): ThemedStyledFunction[h6, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: head
    ): ThemedStyledFunction[head, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: header
    ): ThemedStyledFunction[header, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: hgroup
    ): ThemedStyledFunction[hgroup, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: hr
    ): ThemedStyledFunction[hr, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: html
    ): ThemedStyledFunction[html, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: i
    ): ThemedStyledFunction[i, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: iframe
    ): ThemedStyledFunction[iframe, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: image
    ): ThemedStyledFunction[image, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: img
    ): ThemedStyledFunction[img, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: input
    ): ThemedStyledFunction[input, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: ins
    ): ThemedStyledFunction[ins, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: kbd
    ): ThemedStyledFunction[kbd, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: keygen
    ): ThemedStyledFunction[keygen, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: label
    ): ThemedStyledFunction[label, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: legend
    ): ThemedStyledFunction[legend, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: li
    ): ThemedStyledFunction[li, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: line
    ): ThemedStyledFunction[line, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: linearGradient
    ): ThemedStyledFunction[linearGradient, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: link
    ): ThemedStyledFunction[link, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: main
    ): ThemedStyledFunction[main, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: map
    ): ThemedStyledFunction[map, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: mark
    ): ThemedStyledFunction[mark, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: marker
    ): ThemedStyledFunction[marker, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: mask
    ): ThemedStyledFunction[mask, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: menu
    ): ThemedStyledFunction[menu, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: menuitem
    ): ThemedStyledFunction[menuitem, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: meta
    ): ThemedStyledFunction[meta, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: metadata
    ): ThemedStyledFunction[metadata, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: meter
    ): ThemedStyledFunction[meter, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: mpath
    ): ThemedStyledFunction[mpath, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: nav
    ): ThemedStyledFunction[nav, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: noindex
    ): ThemedStyledFunction[noindex, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: noscript
    ): ThemedStyledFunction[noscript, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: ol
    ): ThemedStyledFunction[ol, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: optgroup
    ): ThemedStyledFunction[optgroup, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: option
    ): ThemedStyledFunction[option, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: output
    ): ThemedStyledFunction[output, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: p
    ): ThemedStyledFunction[p, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: param
    ): ThemedStyledFunction[param, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: path
    ): ThemedStyledFunction[path, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: pattern
    ): ThemedStyledFunction[pattern, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: picture
    ): ThemedStyledFunction[picture, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: polygon
    ): ThemedStyledFunction[polygon, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: polyline
    ): ThemedStyledFunction[polyline, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: pre
    ): ThemedStyledFunction[pre, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: progress
    ): ThemedStyledFunction[progress, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: q
    ): ThemedStyledFunction[q, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: radialGradient
    ): ThemedStyledFunction[radialGradient, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: rect
    ): ThemedStyledFunction[rect, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: rp
    ): ThemedStyledFunction[rp, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: rt
    ): ThemedStyledFunction[rt, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: ruby
    ): ThemedStyledFunction[ruby, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: s
    ): ThemedStyledFunction[s, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: samp
    ): ThemedStyledFunction[samp, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: script
    ): ThemedStyledFunction[script, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: section
    ): ThemedStyledFunction[section, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: select
    ): ThemedStyledFunction[select, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: slot
    ): ThemedStyledFunction[slot, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: small
    ): ThemedStyledFunction[small, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: source
    ): ThemedStyledFunction[source, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: span
    ): ThemedStyledFunction[span, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: stop
    ): ThemedStyledFunction[stop, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: strong
    ): ThemedStyledFunction[strong, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: style
    ): ThemedStyledFunction[style, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: sub
    ): ThemedStyledFunction[sub, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: summary
    ): ThemedStyledFunction[summary, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: sup
    ): ThemedStyledFunction[sup, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: svg
    ): ThemedStyledFunction[svg, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: switch
    ): ThemedStyledFunction[switch, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: symbol
    ): ThemedStyledFunction[symbol, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: table
    ): ThemedStyledFunction[table, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: tbody
    ): ThemedStyledFunction[tbody, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: td
    ): ThemedStyledFunction[td, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: template
    ): ThemedStyledFunction[template, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: text
    ): ThemedStyledFunction[text, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: textPath
    ): ThemedStyledFunction[textPath, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: textarea
    ): ThemedStyledFunction[textarea, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: tfoot
    ): ThemedStyledFunction[tfoot, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: th
    ): ThemedStyledFunction[th, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: thead
    ): ThemedStyledFunction[thead, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: time
    ): ThemedStyledFunction[time, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: title
    ): ThemedStyledFunction[title, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: tr
    ): ThemedStyledFunction[tr, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: track
    ): ThemedStyledFunction[track, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: tspan
    ): ThemedStyledFunction[tspan, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: u
    ): ThemedStyledFunction[u, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: ul
    ): ThemedStyledFunction[ul, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: use
    ): ThemedStyledFunction[use, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: video
    ): ThemedStyledFunction[video, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: view
    ): ThemedStyledFunction[view, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: wbr
    ): ThemedStyledFunction[wbr, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply(
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: webview
    ): ThemedStyledFunction[webview, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    def apply[C /* <: (ComponentClass[_, ComponentState]) | FunctionComponent[_] */](
      // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
    // causes tests to fail in TS 3.1
    component: C
    ): ThemedStyledFunction[C, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
    @JSImport("@xstyled/styled-components", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@xstyled/styled-components", "default.a")
    @js.native
    def a: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.a, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.aBox")
    @js.native
    def aBox: ThemedStyledFunction[a, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def aBox_=(x: ThemedStyledFunction[a, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def a_=(x: ThemedStyledFunction[a, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.abbr")
    @js.native
    def abbr: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.abbr, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.abbrBox")
    @js.native
    def abbrBox: ThemedStyledFunction[abbr, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def abbrBox_=(x: ThemedStyledFunction[abbr, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("abbrBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def abbr_=(x: ThemedStyledFunction[abbr, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("abbr")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.address")
    @js.native
    def address: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.address, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.addressBox")
    @js.native
    def addressBox: ThemedStyledFunction[address, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def addressBox_=(x: ThemedStyledFunction[address, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addressBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def address_=(x: ThemedStyledFunction[address, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("address")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.animate")
    @js.native
    def animate: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.animate, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.animateMotion")
    @js.native
    def animateMotion: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.animateMotion, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def animateMotion_=(x: ThemedStyledFunction[animateMotion, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animateMotion")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.animateTransform")
    @js.native
    def animateTransform: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.animateTransform, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def animateTransform_=(x: ThemedStyledFunction[animateTransform, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animateTransform")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def animate_=(x: ThemedStyledFunction[animate, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.area")
    @js.native
    def area: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.area, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.areaBox")
    @js.native
    def areaBox: ThemedStyledFunction[area, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def areaBox_=(x: ThemedStyledFunction[area, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def area_=(x: ThemedStyledFunction[area, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("area")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.article")
    @js.native
    def article: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.article, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.articleBox")
    @js.native
    def articleBox: ThemedStyledFunction[article, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def articleBox_=(x: ThemedStyledFunction[article, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("articleBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def article_=(x: ThemedStyledFunction[article, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("article")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.aside")
    @js.native
    def aside: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.aside, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.asideBox")
    @js.native
    def asideBox: ThemedStyledFunction[aside, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def asideBox_=(x: ThemedStyledFunction[aside, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asideBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def aside_=(x: ThemedStyledFunction[aside, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aside")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.audio")
    @js.native
    def audio: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.audio, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.audioBox")
    @js.native
    def audioBox: ThemedStyledFunction[audio, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def audioBox_=(x: ThemedStyledFunction[audio, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("audioBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def audio_=(x: ThemedStyledFunction[audio, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("audio")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.b")
    @js.native
    def b: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.b, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.bBox")
    @js.native
    def bBox: ThemedStyledFunction[b, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def bBox_=(x: ThemedStyledFunction[b, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def b_=(x: ThemedStyledFunction[b, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.base")
    @js.native
    def base: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.base, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.baseBox")
    @js.native
    def baseBox: ThemedStyledFunction[base, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def baseBox_=(x: ThemedStyledFunction[base, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def base_=(x: ThemedStyledFunction[base, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.bdi")
    @js.native
    def bdi: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.bdi, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.bdiBox")
    @js.native
    def bdiBox: ThemedStyledFunction[bdi, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def bdiBox_=(x: ThemedStyledFunction[bdi, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bdiBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def bdi_=(x: ThemedStyledFunction[bdi, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bdi")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.bdo")
    @js.native
    def bdo: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.bdo, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.bdoBox")
    @js.native
    def bdoBox: ThemedStyledFunction[bdo, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def bdoBox_=(x: ThemedStyledFunction[bdo, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bdoBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def bdo_=(x: ThemedStyledFunction[bdo, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bdo")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.big")
    @js.native
    def big: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.big, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.bigBox")
    @js.native
    def bigBox: ThemedStyledFunction[big, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def bigBox_=(x: ThemedStyledFunction[big, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bigBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def big_=(x: ThemedStyledFunction[big, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("big")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.blockquote")
    @js.native
    def blockquote: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.blockquote, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.blockquoteBox")
    @js.native
    def blockquoteBox: ThemedStyledFunction[blockquote, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def blockquoteBox_=(x: ThemedStyledFunction[blockquote, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockquoteBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def blockquote_=(x: ThemedStyledFunction[blockquote, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockquote")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.body")
    @js.native
    def body: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.body, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.bodyBox")
    @js.native
    def bodyBox: ThemedStyledFunction[body, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def bodyBox_=(x: ThemedStyledFunction[body, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bodyBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def body_=(x: ThemedStyledFunction[body, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("body")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.br")
    @js.native
    def br: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.br, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.brBox")
    @js.native
    def brBox: ThemedStyledFunction[br, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def brBox_=(x: ThemedStyledFunction[br, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def br_=(x: ThemedStyledFunction[br, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("br")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.button")
    @js.native
    def button: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.button, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.buttonBox")
    @js.native
    def buttonBox: ThemedStyledFunction[button, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def buttonBox_=(x: ThemedStyledFunction[button, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buttonBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def button_=(x: ThemedStyledFunction[button, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("button")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.canvas")
    @js.native
    def canvas: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.canvas, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.canvasBox")
    @js.native
    def canvasBox: ThemedStyledFunction[canvas, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def canvasBox_=(x: ThemedStyledFunction[canvas, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canvasBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def canvas_=(x: ThemedStyledFunction[canvas, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canvas")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.caption")
    @js.native
    def caption: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.caption, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.captionBox")
    @js.native
    def captionBox: ThemedStyledFunction[caption, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def captionBox_=(x: ThemedStyledFunction[caption, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("captionBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def caption_=(x: ThemedStyledFunction[caption, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("caption")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.circle")
    @js.native
    def circle: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.circle, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    // SVG
    @JSImport("@xstyled/styled-components", "default.circleBox")
    @js.native
    def circleBox: ThemedStyledFunction[circle, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def circleBox_=(x: ThemedStyledFunction[circle, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circleBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def circle_=(x: ThemedStyledFunction[circle, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circle")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.cite")
    @js.native
    def cite: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.cite, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.citeBox")
    @js.native
    def citeBox: ThemedStyledFunction[cite, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def citeBox_=(x: ThemedStyledFunction[cite, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("citeBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def cite_=(x: ThemedStyledFunction[cite, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cite")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.clipPath")
    @js.native
    def clipPath: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.clipPath, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.clipPathBox")
    @js.native
    def clipPathBox: ThemedStyledFunction[clipPath, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def clipPathBox_=(x: ThemedStyledFunction[clipPath, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clipPathBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def clipPath_=(x: ThemedStyledFunction[clipPath, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clipPath")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.code")
    @js.native
    def code: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.code, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.codeBox")
    @js.native
    def codeBox: ThemedStyledFunction[code, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def codeBox_=(x: ThemedStyledFunction[code, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codeBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def code_=(x: ThemedStyledFunction[code, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("code")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.col")
    @js.native
    def col: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.col, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.colBox")
    @js.native
    def colBox: ThemedStyledFunction[col, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def colBox_=(x: ThemedStyledFunction[col, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def col_=(x: ThemedStyledFunction[col, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("col")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.colgroup")
    @js.native
    def colgroup: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.colgroup, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.colgroupBox")
    @js.native
    def colgroupBox: ThemedStyledFunction[colgroup, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def colgroupBox_=(x: ThemedStyledFunction[colgroup, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colgroupBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def colgroup_=(x: ThemedStyledFunction[colgroup, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colgroup")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.data")
    @js.native
    def data: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.data, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.dataBox")
    @js.native
    def dataBox: ThemedStyledFunction[data, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def dataBox_=(x: ThemedStyledFunction[data, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def data_=(x: ThemedStyledFunction[data, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.datalist")
    @js.native
    def datalist: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.datalist, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.datalistBox")
    @js.native
    def datalistBox: ThemedStyledFunction[datalist, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def datalistBox_=(x: ThemedStyledFunction[datalist, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("datalistBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def datalist_=(x: ThemedStyledFunction[datalist, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("datalist")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.dd")
    @js.native
    def dd: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.dd, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.ddBox")
    @js.native
    def ddBox: ThemedStyledFunction[dd, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def ddBox_=(x: ThemedStyledFunction[dd, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ddBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def dd_=(x: ThemedStyledFunction[dd, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dd")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.defs")
    @js.native
    def defs: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.defs, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.defsBox")
    @js.native
    def defsBox: ThemedStyledFunction[defs, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def defsBox_=(x: ThemedStyledFunction[defs, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defsBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def defs_=(x: ThemedStyledFunction[defs, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defs")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.del")
    @js.native
    def del: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.del, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.delBox")
    @js.native
    def delBox: ThemedStyledFunction[del, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def delBox_=(x: ThemedStyledFunction[del, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def del_=(x: ThemedStyledFunction[del, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("del")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.desc")
    @js.native
    def desc: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.desc, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def desc_=(x: ThemedStyledFunction[desc, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desc")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.details")
    @js.native
    def details: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.details, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.detailsBox")
    @js.native
    def detailsBox: ThemedStyledFunction[details, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def detailsBox_=(x: ThemedStyledFunction[details, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("detailsBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def details_=(x: ThemedStyledFunction[details, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("details")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.dfn")
    @js.native
    def dfn: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.dfn, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.dfnBox")
    @js.native
    def dfnBox: ThemedStyledFunction[dfn, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def dfnBox_=(x: ThemedStyledFunction[dfn, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dfnBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def dfn_=(x: ThemedStyledFunction[dfn, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dfn")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.dialog")
    @js.native
    def dialog: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.dialog, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.dialogBox")
    @js.native
    def dialogBox: ThemedStyledFunction[dialog, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def dialogBox_=(x: ThemedStyledFunction[dialog, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dialogBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def dialog_=(x: ThemedStyledFunction[dialog, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dialog")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.div")
    @js.native
    def div: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.div, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.divBox")
    @js.native
    def divBox: ThemedStyledFunction[div, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def divBox_=(x: ThemedStyledFunction[div, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("divBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def div_=(x: ThemedStyledFunction[div, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("div")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.dl")
    @js.native
    def dl: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.dl, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.dlBox")
    @js.native
    def dlBox: ThemedStyledFunction[dl, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def dlBox_=(x: ThemedStyledFunction[dl, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dlBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def dl_=(x: ThemedStyledFunction[dl, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dl")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.dt")
    @js.native
    def dt: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.dt, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.dtBox")
    @js.native
    def dtBox: ThemedStyledFunction[dt, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def dtBox_=(x: ThemedStyledFunction[dt, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dtBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def dt_=(x: ThemedStyledFunction[dt, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dt")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.ellipse")
    @js.native
    def ellipse: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.ellipse, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.ellipseBox")
    @js.native
    def ellipseBox: ThemedStyledFunction[ellipse, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def ellipseBox_=(x: ThemedStyledFunction[ellipse, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipseBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ellipse_=(x: ThemedStyledFunction[ellipse, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipse")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.em")
    @js.native
    def em: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.em, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.emBox")
    @js.native
    def emBox: ThemedStyledFunction[em, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def emBox_=(x: ThemedStyledFunction[em, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def em_=(x: ThemedStyledFunction[em, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("em")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.embed")
    @js.native
    def embed: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.embed, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.embedBox")
    @js.native
    def embedBox: ThemedStyledFunction[embed, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def embedBox_=(x: ThemedStyledFunction[embed, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("embedBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def embed_=(x: ThemedStyledFunction[embed, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("embed")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feBlend")
    @js.native
    def feBlend: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feBlend, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feBlend_=(x: ThemedStyledFunction[feBlend, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feBlend")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feColorMatrix")
    @js.native
    def feColorMatrix: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feColorMatrix, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feColorMatrix_=(x: ThemedStyledFunction[feColorMatrix, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feColorMatrix")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feComponentTransfer")
    @js.native
    def feComponentTransfer: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feComponentTransfer, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feComponentTransfer_=(x: ThemedStyledFunction[feComponentTransfer, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feComponentTransfer")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feComposite")
    @js.native
    def feComposite: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feComposite, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feComposite_=(x: ThemedStyledFunction[feComposite, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feComposite")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feConvolveMatrix")
    @js.native
    def feConvolveMatrix: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feConvolveMatrix, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feConvolveMatrix_=(x: ThemedStyledFunction[feConvolveMatrix, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feConvolveMatrix")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feDiffuseLighting")
    @js.native
    def feDiffuseLighting: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feDiffuseLighting, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feDiffuseLighting_=(x: ThemedStyledFunction[feDiffuseLighting, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feDiffuseLighting")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feDisplacementMap")
    @js.native
    def feDisplacementMap: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feDisplacementMap, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feDisplacementMap_=(x: ThemedStyledFunction[feDisplacementMap, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feDisplacementMap")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feDistantLight")
    @js.native
    def feDistantLight: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feDistantLight, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feDistantLight_=(x: ThemedStyledFunction[feDistantLight, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feDistantLight")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feDropShadow")
    @js.native
    def feDropShadow: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feDropShadow, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feDropShadow_=(x: ThemedStyledFunction[feDropShadow, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feDropShadow")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feFlood")
    @js.native
    def feFlood: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feFlood, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feFlood_=(x: ThemedStyledFunction[feFlood, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feFlood")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feFuncA")
    @js.native
    def feFuncA: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncA, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feFuncA_=(x: ThemedStyledFunction[feFuncA, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feFuncA")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feFuncB")
    @js.native
    def feFuncB: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncB, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feFuncB_=(x: ThemedStyledFunction[feFuncB, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feFuncB")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feFuncG")
    @js.native
    def feFuncG: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncG, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feFuncG_=(x: ThemedStyledFunction[feFuncG, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feFuncG")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feFuncR")
    @js.native
    def feFuncR: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncR, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feFuncR_=(x: ThemedStyledFunction[feFuncR, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feFuncR")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feGaussianBlur")
    @js.native
    def feGaussianBlur: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feGaussianBlur, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feGaussianBlur_=(x: ThemedStyledFunction[feGaussianBlur, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feGaussianBlur")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feImage")
    @js.native
    def feImage: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feImage, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feImage_=(x: ThemedStyledFunction[feImage, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feImage")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feMerge")
    @js.native
    def feMerge: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feMerge, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.feMergeNode")
    @js.native
    def feMergeNode: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feMergeNode, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feMergeNode_=(x: ThemedStyledFunction[feMergeNode, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feMergeNode")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def feMerge_=(x: ThemedStyledFunction[feMerge, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feMerge")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feMorphology")
    @js.native
    def feMorphology: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feMorphology, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feMorphology_=(x: ThemedStyledFunction[feMorphology, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feMorphology")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feOffset")
    @js.native
    def feOffset: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feOffset, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feOffset_=(x: ThemedStyledFunction[feOffset, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.fePointLight")
    @js.native
    def fePointLight: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.fePointLight, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def fePointLight_=(x: ThemedStyledFunction[fePointLight, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fePointLight")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feSpecularLighting")
    @js.native
    def feSpecularLighting: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feSpecularLighting, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feSpecularLighting_=(x: ThemedStyledFunction[feSpecularLighting, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feSpecularLighting")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feSpotLight")
    @js.native
    def feSpotLight: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feSpotLight, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feSpotLight_=(x: ThemedStyledFunction[feSpotLight, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feSpotLight")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feTile")
    @js.native
    def feTile: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feTile, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feTile_=(x: ThemedStyledFunction[feTile, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feTile")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.feTurbulence")
    @js.native
    def feTurbulence: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.feTurbulence, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def feTurbulence_=(x: ThemedStyledFunction[feTurbulence, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feTurbulence")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.fieldset")
    @js.native
    def fieldset: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.fieldset, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.fieldsetBox")
    @js.native
    def fieldsetBox: ThemedStyledFunction[fieldset, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def fieldsetBox_=(x: ThemedStyledFunction[fieldset, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fieldsetBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def fieldset_=(x: ThemedStyledFunction[fieldset, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fieldset")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.figcaption")
    @js.native
    def figcaption: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.figcaption, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.figcaptionBox")
    @js.native
    def figcaptionBox: ThemedStyledFunction[figcaption, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def figcaptionBox_=(x: ThemedStyledFunction[figcaption, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("figcaptionBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def figcaption_=(x: ThemedStyledFunction[figcaption, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("figcaption")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.figure")
    @js.native
    def figure: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.figure, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.figureBox")
    @js.native
    def figureBox: ThemedStyledFunction[figure, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def figureBox_=(x: ThemedStyledFunction[figure, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("figureBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def figure_=(x: ThemedStyledFunction[figure, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("figure")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.filter")
    @js.native
    def filter: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.filter, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def filter_=(x: ThemedStyledFunction[filter, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filter")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.footer")
    @js.native
    def footer: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.footer, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.footerBox")
    @js.native
    def footerBox: ThemedStyledFunction[footer, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def footerBox_=(x: ThemedStyledFunction[footer, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footerBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def footer_=(x: ThemedStyledFunction[footer, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footer")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.foreignObject")
    @js.native
    def foreignObject: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.foreignObject, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.foreignObjectBox")
    @js.native
    def foreignObjectBox: ThemedStyledFunction[foreignObject, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def foreignObjectBox_=(x: ThemedStyledFunction[foreignObject, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foreignObjectBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def foreignObject_=(x: ThemedStyledFunction[foreignObject, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foreignObject")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.form")
    @js.native
    def form: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.form, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.formBox")
    @js.native
    def formBox: ThemedStyledFunction[form, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def formBox_=(x: ThemedStyledFunction[form, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def form_=(x: ThemedStyledFunction[form, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("form")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.g")
    @js.native
    def g: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.g, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.gBox")
    @js.native
    def gBox: ThemedStyledFunction[g, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def gBox_=(x: ThemedStyledFunction[g, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def g_=(x: ThemedStyledFunction[g, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("g")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.h1")
    @js.native
    def h1: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.h1, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.h1Box")
    @js.native
    def h1Box: ThemedStyledFunction[h1, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def h1Box_=(x: ThemedStyledFunction[h1, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h1Box")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def h1_=(x: ThemedStyledFunction[h1, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h1")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.h2")
    @js.native
    def h2: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.h2, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.h2Box")
    @js.native
    def h2Box: ThemedStyledFunction[h2, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def h2Box_=(x: ThemedStyledFunction[h2, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h2Box")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def h2_=(x: ThemedStyledFunction[h2, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h2")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.h3")
    @js.native
    def h3: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.h3, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.h3Box")
    @js.native
    def h3Box: ThemedStyledFunction[h3, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def h3Box_=(x: ThemedStyledFunction[h3, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h3Box")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def h3_=(x: ThemedStyledFunction[h3, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h3")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.h4")
    @js.native
    def h4: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.h4, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.h4Box")
    @js.native
    def h4Box: ThemedStyledFunction[h4, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def h4Box_=(x: ThemedStyledFunction[h4, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h4Box")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def h4_=(x: ThemedStyledFunction[h4, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h4")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.h5")
    @js.native
    def h5: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.h5, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.h5Box")
    @js.native
    def h5Box: ThemedStyledFunction[h5, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def h5Box_=(x: ThemedStyledFunction[h5, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h5Box")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def h5_=(x: ThemedStyledFunction[h5, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h5")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.h6")
    @js.native
    def h6: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.h6, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.h6Box")
    @js.native
    def h6Box: ThemedStyledFunction[h6, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def h6Box_=(x: ThemedStyledFunction[h6, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h6Box")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def h6_=(x: ThemedStyledFunction[h6, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("h6")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.head")
    @js.native
    def head: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.head, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.headBox")
    @js.native
    def headBox: ThemedStyledFunction[head, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def headBox_=(x: ThemedStyledFunction[head, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def head_=(x: ThemedStyledFunction[head, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("head")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.header")
    @js.native
    def header: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.header, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.headerBox")
    @js.native
    def headerBox: ThemedStyledFunction[header, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def headerBox_=(x: ThemedStyledFunction[header, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def header_=(x: ThemedStyledFunction[header, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("header")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.hgroup")
    @js.native
    def hgroup: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.hgroup, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.hgroupBox")
    @js.native
    def hgroupBox: ThemedStyledFunction[hgroup, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def hgroupBox_=(x: ThemedStyledFunction[hgroup, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hgroupBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hgroup_=(x: ThemedStyledFunction[hgroup, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hgroup")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.hr")
    @js.native
    def hr: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.hr, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.hrBox")
    @js.native
    def hrBox: ThemedStyledFunction[hr, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def hrBox_=(x: ThemedStyledFunction[hr, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hrBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hr_=(x: ThemedStyledFunction[hr, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hr")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.html")
    @js.native
    def html: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.html, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.htmlBox")
    @js.native
    def htmlBox: ThemedStyledFunction[html, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def htmlBox_=(x: ThemedStyledFunction[html, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("htmlBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def html_=(x: ThemedStyledFunction[html, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.i")
    @js.native
    def i: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.i, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.iBox")
    @js.native
    def iBox: ThemedStyledFunction[i, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def iBox_=(x: ThemedStyledFunction[i, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def i_=(x: ThemedStyledFunction[i, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.iframe")
    @js.native
    def iframe: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.iframe, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.iframeBox")
    @js.native
    def iframeBox: ThemedStyledFunction[iframe, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def iframeBox_=(x: ThemedStyledFunction[iframe, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iframeBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def iframe_=(x: ThemedStyledFunction[iframe, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iframe")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.image")
    @js.native
    def image: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.image, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.imageBox")
    @js.native
    def imageBox: ThemedStyledFunction[image, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def imageBox_=(x: ThemedStyledFunction[image, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imageBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def image_=(x: ThemedStyledFunction[image, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.img")
    @js.native
    def img: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.img, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.imgBox")
    @js.native
    def imgBox: ThemedStyledFunction[img, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def imgBox_=(x: ThemedStyledFunction[img, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imgBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def img_=(x: ThemedStyledFunction[img, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("img")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.input")
    @js.native
    def input: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.input, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.inputBox")
    @js.native
    def inputBox: ThemedStyledFunction[input, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def inputBox_=(x: ThemedStyledFunction[input, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def input_=(x: ThemedStyledFunction[input, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.ins")
    @js.native
    def ins: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.ins, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.insBox")
    @js.native
    def insBox: ThemedStyledFunction[ins, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def insBox_=(x: ThemedStyledFunction[ins, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ins_=(x: ThemedStyledFunction[ins, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ins")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.kbd")
    @js.native
    def kbd: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.kbd, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.kbdBox")
    @js.native
    def kbdBox: ThemedStyledFunction[kbd, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def kbdBox_=(x: ThemedStyledFunction[kbd, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kbdBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def kbd_=(x: ThemedStyledFunction[kbd, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kbd")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.keygen")
    @js.native
    def keygen: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.keygen, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.keygenBox")
    @js.native
    def keygenBox: ThemedStyledFunction[keygen, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def keygenBox_=(x: ThemedStyledFunction[keygen, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keygenBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def keygen_=(x: ThemedStyledFunction[keygen, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keygen")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.label")
    @js.native
    def label: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.label, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.labelBox")
    @js.native
    def labelBox: ThemedStyledFunction[label, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def labelBox_=(x: ThemedStyledFunction[label, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def label_=(x: ThemedStyledFunction[label, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.legend")
    @js.native
    def legend: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.legend, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.legendBox")
    @js.native
    def legendBox: ThemedStyledFunction[legend, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def legendBox_=(x: ThemedStyledFunction[legend, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def legend_=(x: ThemedStyledFunction[legend, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legend")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.li")
    @js.native
    def li: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.li, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.liBox")
    @js.native
    def liBox: ThemedStyledFunction[li, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def liBox_=(x: ThemedStyledFunction[li, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("liBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def li_=(x: ThemedStyledFunction[li, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("li")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.line")
    @js.native
    def line: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.line, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.lineBox")
    @js.native
    def lineBox: ThemedStyledFunction[line, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def lineBox_=(x: ThemedStyledFunction[line, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def line_=(x: ThemedStyledFunction[line, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("line")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.linearGradient")
    @js.native
    def linearGradient: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.linearGradient, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.linearGradientBox")
    @js.native
    def linearGradientBox: ThemedStyledFunction[linearGradient, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def linearGradientBox_=(x: ThemedStyledFunction[linearGradient, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linearGradientBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def linearGradient_=(x: ThemedStyledFunction[linearGradient, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linearGradient")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.link")
    @js.native
    def link: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.link, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.linkBox")
    @js.native
    def linkBox: ThemedStyledFunction[link, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def linkBox_=(x: ThemedStyledFunction[link, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def link_=(x: ThemedStyledFunction[link, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("link")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.main")
    @js.native
    def main: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.main, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.mainBox")
    @js.native
    def mainBox: ThemedStyledFunction[main, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def mainBox_=(x: ThemedStyledFunction[main, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def main_=(x: ThemedStyledFunction[main, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("main")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.map")
    @js.native
    def map: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.map, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.mapBox")
    @js.native
    def mapBox: ThemedStyledFunction[map, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def mapBox_=(x: ThemedStyledFunction[map, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def map_=(x: ThemedStyledFunction[map, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.mark")
    @js.native
    def mark: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.mark, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.markBox")
    @js.native
    def markBox: ThemedStyledFunction[mark, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def markBox_=(x: ThemedStyledFunction[mark, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def mark_=(x: ThemedStyledFunction[mark, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mark")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.marker")
    @js.native
    def marker: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.marker, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.markerBox")
    @js.native
    def markerBox: ThemedStyledFunction[marker, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def markerBox_=(x: ThemedStyledFunction[marker, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def marker_=(x: ThemedStyledFunction[marker, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("marker")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.mask")
    @js.native
    def mask: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.mask, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.maskBox")
    @js.native
    def maskBox: ThemedStyledFunction[mask, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def maskBox_=(x: ThemedStyledFunction[mask, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maskBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def mask_=(x: ThemedStyledFunction[mask, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mask")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.menu")
    @js.native
    def menu: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.menu, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    /* This one breaks, it looks like marquee is not supported in JSX.IntrinsicElements */
    // marqueeBox: ThemedStyledFunction<'marquee', DefaultTheme, BoxProps>
    @JSImport("@xstyled/styled-components", "default.menuBox")
    @js.native
    def menuBox: ThemedStyledFunction[menu, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def menuBox_=(x: ThemedStyledFunction[menu, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menuBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def menu_=(x: ThemedStyledFunction[menu, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menu")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.menuitem")
    @js.native
    def menuitem: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.menuitem, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.menuitemBox")
    @js.native
    def menuitemBox: ThemedStyledFunction[menuitem, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def menuitemBox_=(x: ThemedStyledFunction[menuitem, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menuitemBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def menuitem_=(x: ThemedStyledFunction[menuitem, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menuitem")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.meta")
    @js.native
    def meta: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.meta, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.metaBox")
    @js.native
    def metaBox: ThemedStyledFunction[meta, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def metaBox_=(x: ThemedStyledFunction[meta, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metaBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def meta_=(x: ThemedStyledFunction[meta, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("meta")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.metadata")
    @js.native
    def metadata: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.metadata, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def metadata_=(x: ThemedStyledFunction[metadata, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.meter")
    @js.native
    def meter: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.meter, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.meterBox")
    @js.native
    def meterBox: ThemedStyledFunction[meter, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def meterBox_=(x: ThemedStyledFunction[meter, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("meterBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def meter_=(x: ThemedStyledFunction[meter, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("meter")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.mpath")
    @js.native
    def mpath: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.mpath, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def mpath_=(x: ThemedStyledFunction[mpath, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mpath")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.nav")
    @js.native
    def nav: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.nav, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.navBox")
    @js.native
    def navBox: ThemedStyledFunction[nav, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def navBox_=(x: ThemedStyledFunction[nav, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def nav_=(x: ThemedStyledFunction[nav, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nav")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.noindex")
    @js.native
    def noindex: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.noindex, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def noindex_=(x: ThemedStyledFunction[noindex, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noindex")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.noscript")
    @js.native
    def noscript: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.noscript, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.noscriptBox")
    @js.native
    def noscriptBox: ThemedStyledFunction[noscript, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def noscriptBox_=(x: ThemedStyledFunction[noscript, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noscriptBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def noscript_=(x: ThemedStyledFunction[noscript, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noscript")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.objectBox")
    @js.native
    def objectBox: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.`object`, 
        DefaultTheme, 
        BoxProps, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def objectBox_=(
      x: ThemedStyledFunction[
          typings.xstyledStyledComponents.xstyledStyledComponentsStrings.`object`, 
          DefaultTheme, 
          BoxProps, 
          scala.Nothing
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objectBox")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.ol")
    @js.native
    def ol: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.ol, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.olBox")
    @js.native
    def olBox: ThemedStyledFunction[ol, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def olBox_=(x: ThemedStyledFunction[ol, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("olBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ol_=(x: ThemedStyledFunction[ol, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ol")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.optgroup")
    @js.native
    def optgroup: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.optgroup, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.optgroupBox")
    @js.native
    def optgroupBox: ThemedStyledFunction[optgroup, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def optgroupBox_=(x: ThemedStyledFunction[optgroup, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optgroupBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def optgroup_=(x: ThemedStyledFunction[optgroup, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optgroup")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.option")
    @js.native
    def option: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.option, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.optionBox")
    @js.native
    def optionBox: ThemedStyledFunction[option, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def optionBox_=(x: ThemedStyledFunction[option, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def option_=(x: ThemedStyledFunction[option, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("option")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.output")
    @js.native
    def output: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.output, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.outputBox")
    @js.native
    def outputBox: ThemedStyledFunction[output, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def outputBox_=(x: ThemedStyledFunction[output, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outputBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def output_=(x: ThemedStyledFunction[output, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("output")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.p")
    @js.native
    def p: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.p, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.pBox")
    @js.native
    def pBox: ThemedStyledFunction[p, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def pBox_=(x: ThemedStyledFunction[p, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def p_=(x: ThemedStyledFunction[p, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.param")
    @js.native
    def param: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.param, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.paramBox")
    @js.native
    def paramBox: ThemedStyledFunction[param, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def paramBox_=(x: ThemedStyledFunction[param, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paramBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def param_=(x: ThemedStyledFunction[param, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("param")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.path")
    @js.native
    def path: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.path, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.pathBox")
    @js.native
    def pathBox: ThemedStyledFunction[path, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def pathBox_=(x: ThemedStyledFunction[path, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pathBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def path_=(x: ThemedStyledFunction[path, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.pattern")
    @js.native
    def pattern: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.pattern, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.patternBox")
    @js.native
    def patternBox: ThemedStyledFunction[pattern, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def patternBox_=(x: ThemedStyledFunction[pattern, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("patternBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def pattern_=(x: ThemedStyledFunction[pattern, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pattern")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.picture")
    @js.native
    def picture: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.picture, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.pictureBox")
    @js.native
    def pictureBox: ThemedStyledFunction[picture, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def pictureBox_=(x: ThemedStyledFunction[picture, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pictureBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def picture_=(x: ThemedStyledFunction[picture, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("picture")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.polygon")
    @js.native
    def polygon: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.polygon, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.polygonBox")
    @js.native
    def polygonBox: ThemedStyledFunction[polygon, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def polygonBox_=(x: ThemedStyledFunction[polygon, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polygonBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def polygon_=(x: ThemedStyledFunction[polygon, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polygon")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.polyline")
    @js.native
    def polyline: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.polyline, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.polylineBox")
    @js.native
    def polylineBox: ThemedStyledFunction[polyline, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def polylineBox_=(x: ThemedStyledFunction[polyline, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polylineBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def polyline_=(x: ThemedStyledFunction[polyline, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polyline")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.pre")
    @js.native
    def pre: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.pre, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.preBox")
    @js.native
    def preBox: ThemedStyledFunction[pre, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def preBox_=(x: ThemedStyledFunction[pre, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def pre_=(x: ThemedStyledFunction[pre, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pre")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.progress")
    @js.native
    def progress: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.progress, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.progressBox")
    @js.native
    def progressBox: ThemedStyledFunction[progress, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def progressBox_=(x: ThemedStyledFunction[progress, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progressBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def progress_=(x: ThemedStyledFunction[progress, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progress")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.q")
    @js.native
    def q: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.q, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.qBox")
    @js.native
    def qBox: ThemedStyledFunction[q, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def qBox_=(x: ThemedStyledFunction[q, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def q_=(x: ThemedStyledFunction[q, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("q")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.radialGradient")
    @js.native
    def radialGradient: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.radialGradient, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.radialGradientBox")
    @js.native
    def radialGradientBox: ThemedStyledFunction[radialGradient, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def radialGradientBox_=(x: ThemedStyledFunction[radialGradient, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radialGradientBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def radialGradient_=(x: ThemedStyledFunction[radialGradient, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radialGradient")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.rect")
    @js.native
    def rect: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.rect, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.rectBox")
    @js.native
    def rectBox: ThemedStyledFunction[rect, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def rectBox_=(x: ThemedStyledFunction[rect, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rectBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rect_=(x: ThemedStyledFunction[rect, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rect")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.rp")
    @js.native
    def rp: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.rp, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.rpBox")
    @js.native
    def rpBox: ThemedStyledFunction[rp, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def rpBox_=(x: ThemedStyledFunction[rp, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rpBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rp_=(x: ThemedStyledFunction[rp, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rp")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.rt")
    @js.native
    def rt: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.rt, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.rtBox")
    @js.native
    def rtBox: ThemedStyledFunction[rt, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def rtBox_=(x: ThemedStyledFunction[rt, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rtBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def rt_=(x: ThemedStyledFunction[rt, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rt")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.ruby")
    @js.native
    def ruby: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.ruby, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.rubyBox")
    @js.native
    def rubyBox: ThemedStyledFunction[ruby, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def rubyBox_=(x: ThemedStyledFunction[ruby, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rubyBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ruby_=(x: ThemedStyledFunction[ruby, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ruby")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.s")
    @js.native
    def s: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.s, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.sBox")
    @js.native
    def sBox: ThemedStyledFunction[s, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def sBox_=(x: ThemedStyledFunction[s, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def s_=(x: ThemedStyledFunction[s, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("s")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.samp")
    @js.native
    def samp: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.samp, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.sampBox")
    @js.native
    def sampBox: ThemedStyledFunction[samp, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def sampBox_=(x: ThemedStyledFunction[samp, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sampBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def samp_=(x: ThemedStyledFunction[samp, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("samp")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.script")
    @js.native
    def script: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.script, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.scriptBox")
    @js.native
    def scriptBox: ThemedStyledFunction[script, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def scriptBox_=(x: ThemedStyledFunction[script, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scriptBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def script_=(x: ThemedStyledFunction[script, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("script")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.section")
    @js.native
    def section: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.section, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.sectionBox")
    @js.native
    def sectionBox: ThemedStyledFunction[section, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def sectionBox_=(x: ThemedStyledFunction[section, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sectionBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def section_=(x: ThemedStyledFunction[section, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("section")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.select")
    @js.native
    def select: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.select, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.selectBox")
    @js.native
    def selectBox: ThemedStyledFunction[select, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def selectBox_=(x: ThemedStyledFunction[select, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def select_=(x: ThemedStyledFunction[select, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.slot")
    @js.native
    def slot: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.slot, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def slot_=(x: ThemedStyledFunction[slot, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slot")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.small")
    @js.native
    def small: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.small, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.smallBox")
    @js.native
    def smallBox: ThemedStyledFunction[small, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def smallBox_=(x: ThemedStyledFunction[small, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smallBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def small_=(x: ThemedStyledFunction[small, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("small")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.source")
    @js.native
    def source: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.source, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.sourceBox")
    @js.native
    def sourceBox: ThemedStyledFunction[source, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def sourceBox_=(x: ThemedStyledFunction[source, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sourceBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def source_=(x: ThemedStyledFunction[source, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("source")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.span")
    @js.native
    def span: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.span, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.spanBox")
    @js.native
    def spanBox: ThemedStyledFunction[span, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def spanBox_=(x: ThemedStyledFunction[span, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spanBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def span_=(x: ThemedStyledFunction[span, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("span")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.stop")
    @js.native
    def stop: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.stop, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.stopBox")
    @js.native
    def stopBox: ThemedStyledFunction[stop, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def stopBox_=(x: ThemedStyledFunction[stop, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def stop_=(x: ThemedStyledFunction[stop, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stop")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.strong")
    @js.native
    def strong: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.strong, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.strongBox")
    @js.native
    def strongBox: ThemedStyledFunction[strong, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def strongBox_=(x: ThemedStyledFunction[strong, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strongBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def strong_=(x: ThemedStyledFunction[strong, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strong")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.style")
    @js.native
    def style: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.style, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.styleBox")
    @js.native
    def styleBox: ThemedStyledFunction[style, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def styleBox_=(x: ThemedStyledFunction[style, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styleBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def style_=(x: ThemedStyledFunction[style, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.sub")
    @js.native
    def sub: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.sub, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.subBox")
    @js.native
    def subBox: ThemedStyledFunction[sub, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def subBox_=(x: ThemedStyledFunction[sub, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def sub_=(x: ThemedStyledFunction[sub, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sub")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.summary")
    @js.native
    def summary: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.summary, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.summaryBox")
    @js.native
    def summaryBox: ThemedStyledFunction[summary, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def summaryBox_=(x: ThemedStyledFunction[summary, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summaryBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def summary_=(x: ThemedStyledFunction[summary, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summary")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.sup")
    @js.native
    def sup: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.sup, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.supBox")
    @js.native
    def supBox: ThemedStyledFunction[sup, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def supBox_=(x: ThemedStyledFunction[sup, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def sup_=(x: ThemedStyledFunction[sup, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sup")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.svg")
    @js.native
    def svg: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.svg, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.svgBox")
    @js.native
    def svgBox: ThemedStyledFunction[svg, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def svgBox_=(x: ThemedStyledFunction[svg, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svgBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def svg_=(x: ThemedStyledFunction[svg, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svg")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.switch")
    @js.native
    def switch: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.switch, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def switch_=(x: ThemedStyledFunction[switch, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("switch")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.symbol")
    @js.native
    def symbol: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.symbol, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def symbol_=(x: ThemedStyledFunction[symbol, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbol")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.table")
    @js.native
    def table: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.table, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.tableBox")
    @js.native
    def tableBox: ThemedStyledFunction[table, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def tableBox_=(x: ThemedStyledFunction[table, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tableBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def table_=(x: ThemedStyledFunction[table, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("table")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.tbody")
    @js.native
    def tbody: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.tbody, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.tbodyBox")
    @js.native
    def tbodyBox: ThemedStyledFunction[tbody, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def tbodyBox_=(x: ThemedStyledFunction[tbody, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tbodyBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def tbody_=(x: ThemedStyledFunction[tbody, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tbody")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.td")
    @js.native
    def td: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.td, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.tdBox")
    @js.native
    def tdBox: ThemedStyledFunction[td, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def tdBox_=(x: ThemedStyledFunction[td, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tdBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def td_=(x: ThemedStyledFunction[td, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("td")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.template")
    @js.native
    def template: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.template, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def template_=(x: ThemedStyledFunction[template, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.text")
    @js.native
    def text: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.text, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.textBox")
    @js.native
    def textBox: ThemedStyledFunction[text, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def textBox_=(x: ThemedStyledFunction[text, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textBox")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.textPath")
    @js.native
    def textPath: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.textPath, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def textPath_=(x: ThemedStyledFunction[textPath, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textPath")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def text_=(x: ThemedStyledFunction[text, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.textarea")
    @js.native
    def textarea: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.textarea, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.textareaBox")
    @js.native
    def textareaBox: ThemedStyledFunction[textarea, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def textareaBox_=(x: ThemedStyledFunction[textarea, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textareaBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def textarea_=(x: ThemedStyledFunction[textarea, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textarea")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.tfoot")
    @js.native
    def tfoot: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.tfoot, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.tfootBox")
    @js.native
    def tfootBox: ThemedStyledFunction[tfoot, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def tfootBox_=(x: ThemedStyledFunction[tfoot, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tfootBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def tfoot_=(x: ThemedStyledFunction[tfoot, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tfoot")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.th")
    @js.native
    def th: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.th, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.thBox")
    @js.native
    def thBox: ThemedStyledFunction[th, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def thBox_=(x: ThemedStyledFunction[th, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def th_=(x: ThemedStyledFunction[th, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("th")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.thead")
    @js.native
    def thead: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.thead, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.theadBox")
    @js.native
    def theadBox: ThemedStyledFunction[thead, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def theadBox_=(x: ThemedStyledFunction[thead, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theadBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def thead_=(x: ThemedStyledFunction[thead, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thead")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.time")
    @js.native
    def time: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.time, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.timeBox")
    @js.native
    def timeBox: ThemedStyledFunction[time, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def timeBox_=(x: ThemedStyledFunction[time, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def time_=(x: ThemedStyledFunction[time, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.title")
    @js.native
    def title: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.title, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.titleBox")
    @js.native
    def titleBox: ThemedStyledFunction[title, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def titleBox_=(x: ThemedStyledFunction[title, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def title_=(x: ThemedStyledFunction[title, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.tr")
    @js.native
    def tr: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.tr, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.trBox")
    @js.native
    def trBox: ThemedStyledFunction[tr, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def trBox_=(x: ThemedStyledFunction[tr, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def tr_=(x: ThemedStyledFunction[tr, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tr")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.track")
    @js.native
    def track: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.track, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.trackBox")
    @js.native
    def trackBox: ThemedStyledFunction[track, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def trackBox_=(x: ThemedStyledFunction[track, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trackBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def track_=(x: ThemedStyledFunction[track, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("track")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.tspan")
    @js.native
    def tspan: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.tspan, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.tspanBox")
    @js.native
    def tspanBox: ThemedStyledFunction[tspan, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def tspanBox_=(x: ThemedStyledFunction[tspan, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tspanBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def tspan_=(x: ThemedStyledFunction[tspan, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tspan")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.u")
    @js.native
    def u: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.u, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.uBox")
    @js.native
    def uBox: ThemedStyledFunction[u, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def uBox_=(x: ThemedStyledFunction[u, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def u_=(x: ThemedStyledFunction[u, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("u")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.ul")
    @js.native
    def ul: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.ul, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.ulBox")
    @js.native
    def ulBox: ThemedStyledFunction[ul, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def ulBox_=(x: ThemedStyledFunction[ul, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ulBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ul_=(x: ThemedStyledFunction[ul, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ul")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.use")
    @js.native
    def use: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.use, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def use_=(x: ThemedStyledFunction[use, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("use")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.varBox")
    @js.native
    def varBox: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.`var`, 
        DefaultTheme, 
        BoxProps, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def varBox_=(
      x: ThemedStyledFunction[
          typings.xstyledStyledComponents.xstyledStyledComponentsStrings.`var`, 
          DefaultTheme, 
          BoxProps, 
          scala.Nothing
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("varBox")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.video")
    @js.native
    def video: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.video, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.videoBox")
    @js.native
    def videoBox: ThemedStyledFunction[video, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def videoBox_=(x: ThemedStyledFunction[video, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("videoBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def video_=(x: ThemedStyledFunction[video, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("video")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.view")
    @js.native
    def view: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.view, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def view_=(x: ThemedStyledFunction[view, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("view")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.wbr")
    @js.native
    def wbr: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.wbr, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.wbrBox")
    @js.native
    def wbrBox: ThemedStyledFunction[wbr, DefaultTheme, BoxProps, scala.Nothing] = js.native
    @scala.inline
    def wbrBox_=(x: ThemedStyledFunction[wbr, DefaultTheme, BoxProps, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wbrBox")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def wbr_=(x: ThemedStyledFunction[wbr, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wbr")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.webview")
    @js.native
    def webview: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.webview, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    @scala.inline
    def webview_=(x: ThemedStyledFunction[webview, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webview")(x.asInstanceOf[js.Any])
    
    @JSImport("@xstyled/styled-components", "default.object")
    @js.native
    val `object`: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.`object`, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
    
    @JSImport("@xstyled/styled-components", "default.var")
    @js.native
    val `var`: ThemedStyledFunction[
        typings.xstyledStyledComponents.xstyledStyledComponentsStrings.`var`, 
        AnyIfEmpty[DefaultTheme], 
        js.Object, 
        scala.Nothing
      ] = js.native
  }
  
  @JSImport("@xstyled/styled-components", "Box")
  @js.native
  val Box: StyledComponent[div, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  @JSImport("@xstyled/styled-components", "ColorModeProvider")
  @js.native
  class ColorModeProvider protected ()
    extends Component[ColorModeProviderProps, js.Object, js.Any] {
    def this(props: ColorModeProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColorModeProviderProps, context: js.Any) = this()
  }
  
  @JSImport("@xstyled/styled-components", "ServerStyleSheet")
  @js.native
  class ServerStyleSheet ()
    extends typings.styledComponents.styledComponentsMod.ServerStyleSheet
  
  @JSImport("@xstyled/styled-components", "StyleSheetManager")
  @js.native
  class StyleSheetManager protected ()
    extends typings.styledComponents.styledComponentsMod.StyleSheetManager {
    def this(props: StyleSheetManagerProps) = this()
    def this(props: ReadonlyStyleSheetManager) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StyleSheetManagerProps, context: js.Any) = this()
  }
  
  @JSImport("@xstyled/styled-components", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[AnyIfEmpty[DefaultTheme]] = js.native
  
  @JSImport("@xstyled/styled-components", "ThemeContext")
  @js.native
  val ThemeContext: Context[AnyIfEmpty[DefaultTheme]] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@xstyled/styled-components", "ThemeProvider")
  @js.native
  class ThemeProvider protected ()
    extends typings.styledComponents.styledComponentsMod.ThemeProvider {
    def this(props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]]) = this()
    def this(
      props: ThemeProviderProps[AnyIfEmpty[AnyIfEmpty[DefaultTheme]], AnyIfEmpty[AnyIfEmpty[DefaultTheme]]],
      context: js.Any
    ) = this()
  }
  @JSImport("@xstyled/styled-components", "ThemeProvider")
  @js.native
  val ThemeProvider: ThemeProviderComponent[AnyIfEmpty[DefaultTheme], AnyIfEmpty[DefaultTheme]] = js.native
  
  @JSImport("@xstyled/styled-components", "breakpoints")
  @js.native
  def breakpoints(styles: BreakpointObject[FlattenSimpleInterpolation | String]): TemplateStringsArray = js.native
  
  @JSImport("@xstyled/styled-components", "createGlobalStyle")
  @js.native
  def createGlobalStyle[P /* <: js.Object */](first: TemplateStringsArray, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): GlobalStyleComponent[P, DefaultTheme] = js.native
  @JSImport("@xstyled/styled-components", "createGlobalStyle")
  @js.native
  def createGlobalStyle[P /* <: js.Object */](first: CSSObject, interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*): GlobalStyleComponent[P, DefaultTheme] = js.native
  @JSImport("@xstyled/styled-components", "createGlobalStyle")
  @js.native
  def createGlobalStyle[P /* <: js.Object */](
    first: InterpolationFunction[ThemedStyledProps[P, DefaultTheme]],
    interpolations: (Interpolation[ThemedStyledProps[P, DefaultTheme]])*
  ): GlobalStyleComponent[P, DefaultTheme] = js.native
  
  @JSImport("@xstyled/styled-components", "css")
  @js.native
  val css: ThemedCssFunction[DefaultTheme] = js.native
  
  @JSImport("@xstyled/styled-components", "getColorModeInitScriptElement")
  @js.native
  def getColorModeInitScriptElement(): ReactElement = js.native
  
  @JSImport("@xstyled/styled-components", "getColorModeInitScriptTag")
  @js.native
  def getColorModeInitScriptTag(options: Target): String = js.native
  
  @JSImport("@xstyled/styled-components", "isStyledComponent")
  @js.native
  def isStyledComponent(target: js.Any): /* is styled-components.styled-components.StyledComponent<any, any, {}, never> */ Boolean = js.native
  
  @JSImport("@xstyled/styled-components", "keyframes")
  @js.native
  def keyframes(strings: TemplateStringsArray, interpolations: SimpleInterpolation*): Keyframes_ = js.native
  @JSImport("@xstyled/styled-components", "keyframes")
  @js.native
  def keyframes(strings: CSSKeyframes, interpolations: SimpleInterpolation*): Keyframes_ = js.native
  
  @JSImport("@xstyled/styled-components", "useBreakpoint")
  @js.native
  def useBreakpoint(): BreakpointName = js.native
  
  @JSImport("@xstyled/styled-components", "useBreakpoints")
  @js.native
  def useBreakpoints(): DefaultBreakpoints = js.native
  
  @JSImport("@xstyled/styled-components", "useColorMode")
  @js.native
  def useColorMode(): js.Tuple2[String, js.Function1[/* colorMode */ String, Unit]] = js.native
  
  @JSImport("@xstyled/styled-components", "useDown")
  @js.native
  def useDown(_bereakpointName: BreakpointName): Boolean = js.native
  
  @JSImport("@xstyled/styled-components", "useTheme")
  @js.native
  def useTheme(): DefaultTheme = js.native
  
  @JSImport("@xstyled/styled-components", "useUp")
  @js.native
  def useUp(_bereakpointName: BreakpointName): Boolean = js.native
  
  @JSImport("@xstyled/styled-components", "useViewportWidth")
  @js.native
  def useViewportWidth(): Double | String = js.native
  
  @JSImport("@xstyled/styled-components", "withTheme")
  @js.native
  val withTheme: WithThemeFnInterface[DefaultTheme] = js.native
  
  /* Inlined @xstyled/styled-components.@xstyled/styled-components.WithBreakpointArgs<@xstyled/system.@xstyled/system.SystemProps> */
  @js.native
  trait BoxProps extends StObject {
    
    var alignContent: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignContent */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignContent */ _
            ]
          ]
        ])
      ] = js.native
    
    var alignItems: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignItems */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignItems */ _
            ]
          ]
        ])
      ] = js.native
    
    var alignSelf: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ _
            ]
          ]
        ])
      ] = js.native
    
    var background: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<string> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<string> */ _
            ]
          ]
        ])
      ] = js.native
    
    var backgroundColor: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var backgroundImage: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundImage */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundImage */ _
            ]
          ]
        ])
      ] = js.native
    
    var backgroundPosition: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundPosition<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundPosition<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var backgroundRepeat: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundRepeat */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundRepeat */ _
            ]
          ]
        ])
      ] = js.native
    
    var backgroundSize: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundSize<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundSize<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var bg: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var border: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var borderBottom: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottom<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottom<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var borderBottomColor: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
            ]
          ]
        ])
      ] = js.native
    
    var borderColor: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
            ]
          ]
        ])
      ] = js.native
    
    var borderLeft: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeft<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeft<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var borderLeftColor: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
            ]
          ]
        ])
      ] = js.native
    
    var borderRadius: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var borderRight: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRight<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRight<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var borderRightColor: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
            ]
          ]
        ])
      ] = js.native
    
    var borderStyle: js.UndefOr[
        (ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ _) | Double
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ _) | Double
            ]
          ]
        ])
      ] = js.native
    
    var borderTop: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTop<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTop<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var borderTopColor: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
            ]
          ]
        ])
      ] = js.native
    
    var borderWidth: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var bottom: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var boxShadow: js.UndefOr[
        (ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ _) | Double
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ _) | Double
            ]
          ]
        ])
      ] = js.native
    
    var col: js.UndefOr[
        (ResponsiveValue[String | Double | Boolean]) | (BreakpointObject[js.UndefOr[ResponsiveValue[String | Double | Boolean]]])
      ] = js.native
    
    var color: js.UndefOr[js.Any | BreakpointObject[js.UndefOr[_]]] = js.native
    
    var display: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ _
            ]
          ]
        ])
      ] = js.native
    
    var flex: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var flexBasis: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexBasis<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexBasis<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var flexDirection: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ _
            ]
          ]
        ])
      ] = js.native
    
    var flexGrow: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ _
            ]
          ]
        ])
      ] = js.native
    
    var flexShrink: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexShrink */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexShrink */ _
            ]
          ]
        ])
      ] = js.native
    
    var flexWrap: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ _
            ]
          ]
        ])
      ] = js.native
    
    var fontFamily: js.UndefOr[
        (ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ _) | Double
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ _) | Double
            ]
          ]
        ])
      ] = js.native
    
    var fontSize: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var fontStyle: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontStyle */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontStyle */ _
            ]
          ]
        ])
      ] = js.native
    
    var fontWeight: js.UndefOr[
        (ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ _) | AliasKey
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ _) | AliasKey
            ]
          ]
        ])
      ] = js.native
    
    var gridArea: js.UndefOr[ResponsiveValue[String] | BreakpointObject[js.UndefOr[ResponsiveValue[String]]]] = js.native
    
    var gridAutoColumns: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoColumns<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoColumns<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var gridAutoFlow: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ _
            ]
          ]
        ])
      ] = js.native
    
    var gridAutoRows: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var gridColumn: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ _
            ]
          ]
        ])
      ] = js.native
    
    var gridColumnGap: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumnGap<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumnGap<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var gridGap: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var gridRow: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRow */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRow */ _
            ]
          ]
        ])
      ] = js.native
    
    var gridRowGap: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRowGap<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRowGap<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var gridTemplateAreas: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ _
            ]
          ]
        ])
      ] = js.native
    
    var gridTemplateColumns: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateColumns<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateColumns<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var gridTemplateRows: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateRows<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateRows<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var height: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var justifyContent: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ _
            ]
          ]
        ])
      ] = js.native
    
    var justifyItems: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ _
            ]
          ]
        ])
      ] = js.native
    
    var justifySelf: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifySelf */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifySelf */ _
            ]
          ]
        ])
      ] = js.native
    
    var left: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Left<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Left<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var letterSpacing: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var lineHeight: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var m: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var margin: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var marginBottom: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var marginLeft: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var marginRight: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var marginTop: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var maxHeight: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var maxWidth: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var mb: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var minHeight: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var minWidth: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var ml: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var mr: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var mt: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var mx: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var my: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var opacity: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _
            ]
          ]
        ])
      ] = js.native
    
    var order: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ _
            ]
          ]
        ])
      ] = js.native
    
    var overflow: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ _
            ]
          ]
        ])
      ] = js.native
    
    var p: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var padding: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var paddingBottom: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var paddingLeft: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var paddingRight: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingRight<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingRight<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var paddingTop: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var pb: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var pl: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var position: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ _
            ]
          ]
        ])
      ] = js.native
    
    var pr: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingRight<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingRight<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var pt: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var px: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var py: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var right: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Right<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Right<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var row: js.UndefOr[
        (ResponsiveValue[String | Double | Boolean]) | (BreakpointObject[js.UndefOr[ResponsiveValue[String | Double | Boolean]]])
      ] = js.native
    
    var size: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var textAlign: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ _
            ]
          ]
        ])
      ] = js.native
    
    var textShadow: js.UndefOr[
        (ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextShadow */ _) | Double
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextShadow */ _) | Double
            ]
          ]
        ])
      ] = js.native
    
    var textTransform: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextTransform */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextTransform */ _
            ]
          ]
        ])
      ] = js.native
    
    var top: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var transition: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Transition<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Transition<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var verticalAlign: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var width: js.UndefOr[
        (ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLength> */ _
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLength> */ _
            ]
          ]
        ])
      ] = js.native
    
    var zIndex: js.UndefOr[
        (ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _) | AliasKey
        ]) | (BreakpointObject[
          js.UndefOr[
            ResponsiveValue[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _) | AliasKey
            ]
          ]
        ])
      ] = js.native
  }
  object BoxProps {
    
    @scala.inline
    def apply(): BoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxProps]
    }
    
    @scala.inline
    implicit class BoxPropsMutableBuilder[Self <: BoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignContent(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignContent */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignContent */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      @scala.inline
      def setAlignContentVarargs(value: js.Any*): Self = StObject.set(x, "alignContent", js.Array(value :_*))
      
      @scala.inline
      def setAlignItems(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignItems */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignItems */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      @scala.inline
      def setAlignItemsVarargs(value: js.Any*): Self = StObject.set(x, "alignItems", js.Array(value :_*))
      
      @scala.inline
      def setAlignSelf(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignSelf */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAlignSelfVarargs(value: js.Any*): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
      
      @scala.inline
      def setBackground(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<string> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<string> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColor(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundColorVarargs(value: js.Any*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      @scala.inline
      def setBackgroundImage(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundImage */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundImage */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      @scala.inline
      def setBackgroundImageVarargs(value: js.Any*): Self = StObject.set(x, "backgroundImage", js.Array(value :_*))
      
      @scala.inline
      def setBackgroundPosition(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundPosition<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundPosition<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
      
      @scala.inline
      def setBackgroundPositionVarargs(value: js.Any*): Self = StObject.set(x, "backgroundPosition", js.Array(value :_*))
      
      @scala.inline
      def setBackgroundRepeat(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundRepeat */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundRepeat */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      @scala.inline
      def setBackgroundRepeatVarargs(value: js.Any*): Self = StObject.set(x, "backgroundRepeat", js.Array(value :_*))
      
      @scala.inline
      def setBackgroundSize(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundSize<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundSize<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
      
      @scala.inline
      def setBackgroundSizeVarargs(value: js.Any*): Self = StObject.set(x, "backgroundSize", js.Array(value :_*))
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBackgroundVarargs(value: js.Any*): Self = StObject.set(x, "background", js.Array(value :_*))
      
      @scala.inline
      def setBg(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Background<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      @scala.inline
      def setBgVarargs(value: js.Any*): Self = StObject.set(x, "bg", js.Array(value :_*))
      
      @scala.inline
      def setBorder(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottom(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottom<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderBottom<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomColor(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
      
      @scala.inline
      def setBorderBottomColorVarargs(value: js.Any*): Self = StObject.set(x, "borderBottomColor", js.Array(value :_*))
      
      @scala.inline
      def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
      
      @scala.inline
      def setBorderBottomVarargs(value: js.Any*): Self = StObject.set(x, "borderBottom", js.Array(value :_*))
      
      @scala.inline
      def setBorderColor(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderColorVarargs(value: js.Any*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
      
      @scala.inline
      def setBorderLeft(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeft<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeft<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftColor(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
      
      @scala.inline
      def setBorderLeftColorVarargs(value: js.Any*): Self = StObject.set(x, "borderLeftColor", js.Array(value :_*))
      
      @scala.inline
      def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
      
      @scala.inline
      def setBorderLeftVarargs(value: js.Any*): Self = StObject.set(x, "borderLeft", js.Array(value :_*))
      
      @scala.inline
      def setBorderRadius(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setBorderRadiusVarargs(value: js.Any*): Self = StObject.set(x, "borderRadius", js.Array(value :_*))
      
      @scala.inline
      def setBorderRight(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRight<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRight<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightColor(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
      
      @scala.inline
      def setBorderRightColorVarargs(value: js.Any*): Self = StObject.set(x, "borderRightColor", js.Array(value :_*))
      
      @scala.inline
      def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
      
      @scala.inline
      def setBorderRightVarargs(value: js.Any*): Self = StObject.set(x, "borderRight", js.Array(value :_*))
      
      @scala.inline
      def setBorderStyle(
        value: (ResponsiveValue[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ _) | Double
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ _) | Double
                ]
              ]
            ])
      ): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setBorderStyleVarargs(value: (js.Any | Double)*): Self = StObject.set(x, "borderStyle", js.Array(value :_*))
      
      @scala.inline
      def setBorderTop(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTop<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTop<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopColor(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderColor */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
      
      @scala.inline
      def setBorderTopColorVarargs(value: js.Any*): Self = StObject.set(x, "borderTopColor", js.Array(value :_*))
      
      @scala.inline
      def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
      
      @scala.inline
      def setBorderTopVarargs(value: js.Any*): Self = StObject.set(x, "borderTop", js.Array(value :_*))
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setBorderVarargs(value: js.Any*): Self = StObject.set(x, "border", js.Array(value :_*))
      
      @scala.inline
      def setBorderWidth(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setBorderWidthVarargs(value: js.Any*): Self = StObject.set(x, "borderWidth", js.Array(value :_*))
      
      @scala.inline
      def setBottom(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setBottomVarargs(value: js.Any*): Self = StObject.set(x, "bottom", js.Array(value :_*))
      
      @scala.inline
      def setBoxShadow(
        value: (ResponsiveValue[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ _) | Double
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ _) | Double
                ]
              ]
            ])
      ): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
      
      @scala.inline
      def setBoxShadowVarargs(value: (js.Any | Double)*): Self = StObject.set(x, "boxShadow", js.Array(value :_*))
      
      @scala.inline
      def setCol(
        value: (ResponsiveValue[String | Double | Boolean]) | (BreakpointObject[js.UndefOr[ResponsiveValue[String | Double | Boolean]]])
      ): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColUndefined: Self = StObject.set(x, "col", js.undefined)
      
      @scala.inline
      def setColVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "col", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: js.Any | BreakpointObject[js.UndefOr[_]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDisplay(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setDisplayVarargs(value: js.Any*): Self = StObject.set(x, "display", js.Array(value :_*))
      
      @scala.inline
      def setFlex(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexBasis(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexBasis<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexBasis<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      @scala.inline
      def setFlexBasisVarargs(value: js.Any*): Self = StObject.set(x, "flexBasis", js.Array(value :_*))
      
      @scala.inline
      def setFlexDirection(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexDirection */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      @scala.inline
      def setFlexDirectionVarargs(value: js.Any*): Self = StObject.set(x, "flexDirection", js.Array(value :_*))
      
      @scala.inline
      def setFlexGrow(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      @scala.inline
      def setFlexGrowVarargs(value: js.Any*): Self = StObject.set(x, "flexGrow", js.Array(value :_*))
      
      @scala.inline
      def setFlexShrink(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexShrink */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexShrink */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      @scala.inline
      def setFlexShrinkVarargs(value: js.Any*): Self = StObject.set(x, "flexShrink", js.Array(value :_*))
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setFlexVarargs(value: js.Any*): Self = StObject.set(x, "flex", js.Array(value :_*))
      
      @scala.inline
      def setFlexWrap(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexWrap */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      @scala.inline
      def setFlexWrapVarargs(value: js.Any*): Self = StObject.set(x, "flexWrap", js.Array(value :_*))
      
      @scala.inline
      def setFontFamily(
        value: (ResponsiveValue[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ _) | Double
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ _) | Double
                ]
              ]
            ])
      ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontFamilyVarargs(value: (js.Any | Double)*): Self = StObject.set(x, "fontFamily", js.Array(value :_*))
      
      @scala.inline
      def setFontSize(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontSizeVarargs(value: js.Any*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
      
      @scala.inline
      def setFontStyle(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontStyle */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontStyle */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontStyleVarargs(value: js.Any*): Self = StObject.set(x, "fontStyle", js.Array(value :_*))
      
      @scala.inline
      def setFontWeight(
        value: (ResponsiveValue[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ _) | AliasKey
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ _) | AliasKey
                ]
              ]
            ])
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setFontWeightVarargs(value: (js.Any | AliasKey)*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
      
      @scala.inline
      def setGridArea(value: ResponsiveValue[String] | BreakpointObject[js.UndefOr[ResponsiveValue[String]]]): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setGridAreaVarargs(value: String*): Self = StObject.set(x, "gridArea", js.Array(value :_*))
      
      @scala.inline
      def setGridAutoColumns(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoColumns<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoColumns<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
      
      @scala.inline
      def setGridAutoColumnsVarargs(value: js.Any*): Self = StObject.set(x, "gridAutoColumns", js.Array(value :_*))
      
      @scala.inline
      def setGridAutoFlow(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
      
      @scala.inline
      def setGridAutoFlowVarargs(value: js.Any*): Self = StObject.set(x, "gridAutoFlow", js.Array(value :_*))
      
      @scala.inline
      def setGridAutoRows(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
      
      @scala.inline
      def setGridAutoRowsVarargs(value: js.Any*): Self = StObject.set(x, "gridAutoRows", js.Array(value :_*))
      
      @scala.inline
      def setGridColumn(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumn */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColumnGap(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumnGap<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumnGap<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
      
      @scala.inline
      def setGridColumnGapVarargs(value: js.Any*): Self = StObject.set(x, "gridColumnGap", js.Array(value :_*))
      
      @scala.inline
      def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
      
      @scala.inline
      def setGridColumnVarargs(value: js.Any*): Self = StObject.set(x, "gridColumn", js.Array(value :_*))
      
      @scala.inline
      def setGridGap(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
      
      @scala.inline
      def setGridGapVarargs(value: js.Any*): Self = StObject.set(x, "gridGap", js.Array(value :_*))
      
      @scala.inline
      def setGridRow(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRow */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRow */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridRowGap(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRowGap<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRowGap<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
      
      @scala.inline
      def setGridRowGapVarargs(value: js.Any*): Self = StObject.set(x, "gridRowGap", js.Array(value :_*))
      
      @scala.inline
      def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
      
      @scala.inline
      def setGridRowVarargs(value: js.Any*): Self = StObject.set(x, "gridRow", js.Array(value :_*))
      
      @scala.inline
      def setGridTemplateAreas(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
      
      @scala.inline
      def setGridTemplateAreasVarargs(value: js.Any*): Self = StObject.set(x, "gridTemplateAreas", js.Array(value :_*))
      
      @scala.inline
      def setGridTemplateColumns(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateColumns<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateColumns<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
      
      @scala.inline
      def setGridTemplateColumnsVarargs(value: js.Any*): Self = StObject.set(x, "gridTemplateColumns", js.Array(value :_*))
      
      @scala.inline
      def setGridTemplateRows(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateRows<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateRows<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
      
      @scala.inline
      def setGridTemplateRowsVarargs(value: js.Any*): Self = StObject.set(x, "gridTemplateRows", js.Array(value :_*))
      
      @scala.inline
      def setHeight(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHeightVarargs(value: js.Any*): Self = StObject.set(x, "height", js.Array(value :_*))
      
      @scala.inline
      def setJustifyContent(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      @scala.inline
      def setJustifyContentVarargs(value: js.Any*): Self = StObject.set(x, "justifyContent", js.Array(value :_*))
      
      @scala.inline
      def setJustifyItems(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
      
      @scala.inline
      def setJustifyItemsVarargs(value: js.Any*): Self = StObject.set(x, "justifyItems", js.Array(value :_*))
      
      @scala.inline
      def setJustifySelf(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifySelf */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifySelf */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
      
      @scala.inline
      def setJustifySelfVarargs(value: js.Any*): Self = StObject.set(x, "justifySelf", js.Array(value :_*))
      
      @scala.inline
      def setLeft(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Left<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Left<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setLeftVarargs(value: js.Any*): Self = StObject.set(x, "left", js.Array(value :_*))
      
      @scala.inline
      def setLetterSpacing(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLetterSpacingVarargs(value: js.Any*): Self = StObject.set(x, "letterSpacing", js.Array(value :_*))
      
      @scala.inline
      def setLineHeight(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setLineHeightVarargs(value: js.Any*): Self = StObject.set(x, "lineHeight", js.Array(value :_*))
      
      @scala.inline
      def setM(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setMVarargs(value: js.Any*): Self = StObject.set(x, "m", js.Array(value :_*))
      
      @scala.inline
      def setMargin(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottom(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginBottomVarargs(value: js.Any*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      @scala.inline
      def setMarginLeft(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginLeftVarargs(value: js.Any*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      @scala.inline
      def setMarginRight(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginRightVarargs(value: js.Any*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      @scala.inline
      def setMarginTop(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMarginTopVarargs(value: js.Any*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarginVarargs(value: js.Any*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      @scala.inline
      def setMaxHeight(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxHeight<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxHeightVarargs(value: js.Any*): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
      
      @scala.inline
      def setMaxWidth(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MaxWidth<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMaxWidthVarargs(value: js.Any*): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
      
      @scala.inline
      def setMb(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
      
      @scala.inline
      def setMbVarargs(value: js.Any*): Self = StObject.set(x, "mb", js.Array(value :_*))
      
      @scala.inline
      def setMinHeight(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinHeight<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinHeightVarargs(value: js.Any*): Self = StObject.set(x, "minHeight", js.Array(value :_*))
      
      @scala.inline
      def setMinWidth(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MinWidth<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMinWidthVarargs(value: js.Any*): Self = StObject.set(x, "minWidth", js.Array(value :_*))
      
      @scala.inline
      def setMl(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
      
      @scala.inline
      def setMlVarargs(value: js.Any*): Self = StObject.set(x, "ml", js.Array(value :_*))
      
      @scala.inline
      def setMr(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginRight<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
      
      @scala.inline
      def setMrVarargs(value: js.Any*): Self = StObject.set(x, "mr", js.Array(value :_*))
      
      @scala.inline
      def setMt(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
      
      @scala.inline
      def setMtVarargs(value: js.Any*): Self = StObject.set(x, "mt", js.Array(value :_*))
      
      @scala.inline
      def setMx(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
      
      @scala.inline
      def setMxVarargs(value: js.Any*): Self = StObject.set(x, "mx", js.Array(value :_*))
      
      @scala.inline
      def setMy(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      @scala.inline
      def setMyVarargs(value: js.Any*): Self = StObject.set(x, "my", js.Array(value :_*))
      
      @scala.inline
      def setOpacity(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Opacity */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOpacityVarargs(value: js.Any*): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      @scala.inline
      def setOrder(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Order */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: js.Any*): Self = StObject.set(x, "order", js.Array(value :_*))
      
      @scala.inline
      def setOverflow(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setOverflowVarargs(value: js.Any*): Self = StObject.set(x, "overflow", js.Array(value :_*))
      
      @scala.inline
      def setP(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setPVarargs(value: js.Any*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      @scala.inline
      def setPadding(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Padding<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottom(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingBottomVarargs(value: js.Any*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      @scala.inline
      def setPaddingLeft(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingLeftVarargs(value: js.Any*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      @scala.inline
      def setPaddingRight(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingRight<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingRight<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setPaddingRightVarargs(value: js.Any*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      @scala.inline
      def setPaddingTop(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      @scala.inline
      def setPaddingTopVarargs(value: js.Any*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: js.Any*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setPb(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
      
      @scala.inline
      def setPbVarargs(value: js.Any*): Self = StObject.set(x, "pb", js.Array(value :_*))
      
      @scala.inline
      def setPl(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
      
      @scala.inline
      def setPlVarargs(value: js.Any*): Self = StObject.set(x, "pl", js.Array(value :_*))
      
      @scala.inline
      def setPosition(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPositionVarargs(value: js.Any*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      @scala.inline
      def setPr(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingRight<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingRight<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
      
      @scala.inline
      def setPrVarargs(value: js.Any*): Self = StObject.set(x, "pr", js.Array(value :_*))
      
      @scala.inline
      def setPt(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      @scala.inline
      def setPtVarargs(value: js.Any*): Self = StObject.set(x, "pt", js.Array(value :_*))
      
      @scala.inline
      def setPx(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingLeft<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
      
      @scala.inline
      def setPxVarargs(value: js.Any*): Self = StObject.set(x, "px", js.Array(value :_*))
      
      @scala.inline
      def setPy(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingTop<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
      
      @scala.inline
      def setPyVarargs(value: js.Any*): Self = StObject.set(x, "py", js.Array(value :_*))
      
      @scala.inline
      def setRight(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Right<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Right<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setRightVarargs(value: js.Any*): Self = StObject.set(x, "right", js.Array(value :_*))
      
      @scala.inline
      def setRow(
        value: (ResponsiveValue[String | Double | Boolean]) | (BreakpointObject[js.UndefOr[ResponsiveValue[String | Double | Boolean]]])
      ): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      @scala.inline
      def setRowVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "row", js.Array(value :_*))
      
      @scala.inline
      def setSize(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizeVarargs(value: js.Any*): Self = StObject.set(x, "size", js.Array(value :_*))
      
      @scala.inline
      def setTextAlign(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextAlign */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextAlignVarargs(value: js.Any*): Self = StObject.set(x, "textAlign", js.Array(value :_*))
      
      @scala.inline
      def setTextShadow(
        value: (ResponsiveValue[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextShadow */ _) | Double
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextShadow */ _) | Double
                ]
              ]
            ])
      ): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
      
      @scala.inline
      def setTextShadowVarargs(value: (js.Any | Double)*): Self = StObject.set(x, "textShadow", js.Array(value :_*))
      
      @scala.inline
      def setTextTransform(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextTransform */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.TextTransform */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      @scala.inline
      def setTextTransformVarargs(value: js.Any*): Self = StObject.set(x, "textTransform", js.Array(value :_*))
      
      @scala.inline
      def setTop(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setTopVarargs(value: js.Any*): Self = StObject.set(x, "top", js.Array(value :_*))
      
      @scala.inline
      def setTransition(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Transition<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Transition<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setTransitionVarargs(value: js.Any*): Self = StObject.set(x, "transition", js.Array(value :_*))
      
      @scala.inline
      def setVerticalAlign(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.VerticalAlign<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setVerticalAlignVarargs(value: js.Any*): Self = StObject.set(x, "verticalAlign", js.Array(value :_*))
      
      @scala.inline
      def setWidth(
        value: (ResponsiveValue[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLength> */ _
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Width<TLength> */ _
                ]
              ]
            ])
      ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWidthVarargs(value: js.Any*): Self = StObject.set(x, "width", js.Array(value :_*))
      
      @scala.inline
      def setZIndex(
        value: (ResponsiveValue[
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _) | AliasKey
            ]) | (BreakpointObject[
              js.UndefOr[
                ResponsiveValue[
                  (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _) | AliasKey
                ]
              ]
            ])
      ): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      @scala.inline
      def setZIndexVarargs(value: (js.Any | AliasKey)*): Self = StObject.set(x, "zIndex", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xstyledStyledComponents.xstyledStyledComponentsStrings.xs
    - typings.xstyledStyledComponents.xstyledStyledComponentsStrings.sm
    - typings.xstyledStyledComponents.xstyledStyledComponentsStrings.md
    - typings.xstyledStyledComponents.xstyledStyledComponentsStrings.lg
    - typings.xstyledStyledComponents.xstyledStyledComponentsStrings.xl
  */
  trait BreakpointName extends StObject
  
  /* Inlined {[ Key in @xstyled/styled-components.@xstyled/styled-components.BreakpointName ]:? ArgType} */
  @js.native
  trait BreakpointObject[ArgType] extends StObject {
    
    var lg: js.UndefOr[ArgType] = js.native
    
    var md: js.UndefOr[ArgType] = js.native
    
    var sm: js.UndefOr[ArgType] = js.native
    
    var xl: js.UndefOr[ArgType] = js.native
    
    var xs: js.UndefOr[ArgType] = js.native
  }
  object BreakpointObject {
    
    @scala.inline
    def apply[ArgType](): BreakpointObject[ArgType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreakpointObject[ArgType]]
    }
    
    @scala.inline
    implicit class BreakpointObjectMutableBuilder[Self <: BreakpointObject[_], ArgType] (val x: Self with BreakpointObject[ArgType]) extends AnyVal {
      
      @scala.inline
      def setLg(value: ArgType): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: ArgType): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setSm(value: ArgType): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setXl(value: ArgType): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: ArgType): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
    }
  }
  
  @js.native
  trait ColorModeProviderProps extends StObject {
    
    var children: ReactNode = js.native
    
    var target: HTMLElement = js.native
    
    var targetSelector: String = js.native
  }
  object ColorModeProviderProps {
    
    @scala.inline
    def apply(target: HTMLElement, targetSelector: String): ColorModeProviderProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], targetSelector = targetSelector.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorModeProviderProps]
    }
    
    @scala.inline
    implicit class ColorModeProviderPropsMutableBuilder[Self <: ColorModeProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetSelector(value: String): Self = StObject.set(x, "targetSelector", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefaultBreakpoints extends StObject {
    
    var lg: js.Any = js.native
    
    var md: js.Any = js.native
    
    var sm: js.Any = js.native
    
    var xl: js.Any = js.native
    
    var xs: js.Any = js.native
  }
  object DefaultBreakpoints {
    
    @scala.inline
    def apply(lg: js.Any, md: js.Any, sm: js.Any, xl: js.Any, xs: js.Any): DefaultBreakpoints = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultBreakpoints]
    }
    
    @scala.inline
    implicit class DefaultBreakpointsMutableBuilder[Self <: DefaultBreakpoints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLg(value: js.Any): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd(value: js.Any): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSm(value: js.Any): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXl(value: js.Any): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXs(value: js.Any): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    }
  }
  
  /* Augments a type to be Type | BreakpointObject<Type>,
    * in other words, allow a property to be `1` or `{ xs: 1, sm: 2 }`
    */
  type WithBreakpointArgs[Props] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof Props ]:? Props[Key] | @xstyled/styled-components.@xstyled/styled-components.BreakpointObject<Props[Key]>}
    */ typings.xstyledStyledComponents.xstyledStyledComponentsStrings.WithBreakpointArgs with TopLevel[js.Any]
}
