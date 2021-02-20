package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.anon.Html
import typings.react.mod.AnimationEvent
import typings.react.mod.AnimationEventHandler
import typings.react.mod.Booleanish
import typings.react.mod.CSSProperties
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.ComponentType
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.HTMLProps
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.PointerEvent
import typings.react.mod.PointerEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.TransitionEvent
import typings.react.mod.TransitionEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.wordpressBlockEditor.richTextMod.RichText.ContentProps
import typings.wordpressBlockEditor.richTextMod.RichText.Props
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`additions removals`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`additions text`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`inline`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`object`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`removals additions`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`removals text`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`text additions`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`text removals`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.`var`
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.a
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.abbr
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.access
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.additions
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.address
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.all
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.alt
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.applet
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.area
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.article
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ascending
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.aside
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.assertive
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.audio
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.b
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.base
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.basefont
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.bdi
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.bdo
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.blockquote
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.body
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.both
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.br
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.button
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.canvas
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.caption
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.cite
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.code
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.col
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.colgroup
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.copy
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ctrl
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ctrlShift
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.data
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.datalist
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.date
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dd
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.decimal
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.del
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.descending
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.details
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dfn
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dialog
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dir
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.div
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dl
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.dt
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.em
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.email
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.embed
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.execute
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.fieldset
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.figcaption
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.figure
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.font
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.footer
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.form
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.frame
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.frameset
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.grammar
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.grid
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h1
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h2
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h3
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h4
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h5
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.h6
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.head
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.header
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.hgroup
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.horizontal
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.hr
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.html
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.i
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.iframe
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.img
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.inherit
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.input
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ins
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.kbd
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.label
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.legend
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.li
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.link
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.list
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.listbox
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.location
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.main
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.map
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.mark
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.marquee
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.menu
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.meta
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.meter
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.mixed
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.move
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.nav
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.no
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.none
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.noscript
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.numeric
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.off
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ol
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.on
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.optgroup
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.option
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.other
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.output
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.p
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.page
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.param
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.picture
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.polite
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.popup
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.pre
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.primary
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.primaryAlt
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.primaryShift
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.progress
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.q
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.removals
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.rp
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.rt
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ruby
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.s
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.samp
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.script
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.search
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.secondary
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.section
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.select
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.shift
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.shiftAlt
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.slot
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.small
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.source
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.span
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.spelling
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.step
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.strong
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.style
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.sub
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.summary
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.sup
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.table
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.tbody
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.td
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.tel
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.template
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.text
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.textarea
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.tfoot
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.th
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.thead
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.time
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.title
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.tr
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.track
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.tree
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.u
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.ul
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.url
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.vertical
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.video
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.wbr
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.yes
import typings.wordpressBlocks.mod.BlockInstance
import typings.wordpressComponents.autocompleteMod.Autocomplete.Completer
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object richTextMod {
  
  object default {
    
    @JSImport("@wordpress/block-editor/components/rich-text", JSImport.Default)
    @js.native
    def apply(
      props: Props[
          a | abbr | address | applet | area | article | aside | audio | b | base | basefont | bdi | bdo | blockquote | body | br | button | canvas | caption | cite | code | col | colgroup | data | datalist | dd | del | details | dfn | dialog | dir | div | dl | dt | em | embed | fieldset | figcaption | figure | font | footer | form | frame | frameset | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | img | input | ins | kbd | label | legend | li | link | main | map | mark | marquee | menu | meta | meter | nav | noscript | `object` | ol | optgroup | option | output | p | param | picture | pre | progress | q | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | strong | style | sub | summary | sup | table | tbody | td | template | textarea | tfoot | th | thead | time | title | tr | track | u | ul | `var` | video | wbr
        ]
    ): Element = js.native
    
    /**
      * Should be used in the `save` function of your block to correctly save rich text content.
      */
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_a(props: ContentProps[a]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_abbr(props: ContentProps[abbr]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_address(props: ContentProps[address]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_applet(props: ContentProps[applet]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_area(props: ContentProps[area]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_article(props: ContentProps[article]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_aside(props: ContentProps[aside]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_audio(props: ContentProps[audio]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_b(props: ContentProps[b]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_base(props: ContentProps[base]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_basefont(props: ContentProps[basefont]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_bdi(props: ContentProps[bdi]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_bdo(props: ContentProps[bdo]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_blockquote(props: ContentProps[blockquote]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_body(props: ContentProps[body]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_br(props: ContentProps[br]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_button(props: ContentProps[button]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_canvas(props: ContentProps[canvas]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_caption(props: ContentProps[caption]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_cite(props: ContentProps[cite]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_code(props: ContentProps[code]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_col(props: ContentProps[col]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_colgroup(props: ContentProps[colgroup]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_data(props: ContentProps[data]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_datalist(props: ContentProps[datalist]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_dd(props: ContentProps[dd]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_del(props: ContentProps[del]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_details(props: ContentProps[details]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_dfn(props: ContentProps[dfn]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_dialog(props: ContentProps[dialog]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_dir(props: ContentProps[dir]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_div(props: ContentProps[div]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_dl(props: ContentProps[dl]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_dt(props: ContentProps[dt]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_em(props: ContentProps[em]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_embed(props: ContentProps[embed]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_fieldset(props: ContentProps[fieldset]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_figcaption(props: ContentProps[figcaption]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_figure(props: ContentProps[figure]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_font(props: ContentProps[font]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_footer(props: ContentProps[footer]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_form(props: ContentProps[form]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_frame(props: ContentProps[frame]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_frameset(props: ContentProps[frameset]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_h1(props: ContentProps[h1]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_h2(props: ContentProps[h2]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_h3(props: ContentProps[h3]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_h4(props: ContentProps[h4]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_h5(props: ContentProps[h5]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_h6(props: ContentProps[h6]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_head(props: ContentProps[head]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_header(props: ContentProps[header]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_hgroup(props: ContentProps[hgroup]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_hr(props: ContentProps[hr]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_html(props: ContentProps[html]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_i(props: ContentProps[i]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_iframe(props: ContentProps[iframe]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_img(props: ContentProps[img]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_input(props: ContentProps[input]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_ins(props: ContentProps[ins]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_kbd(props: ContentProps[kbd]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_label(props: ContentProps[label]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_legend(props: ContentProps[legend]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_li(props: ContentProps[li]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_link(props: ContentProps[link]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_main(props: ContentProps[main]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_map(props: ContentProps[map]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_mark(props: ContentProps[mark]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_marquee(props: ContentProps[marquee]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_menu(props: ContentProps[menu]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_meta(props: ContentProps[meta]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_meter(props: ContentProps[meter]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_nav(props: ContentProps[nav]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_noscript(props: ContentProps[noscript]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_object(props: ContentProps[`object`]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_ol(props: ContentProps[ol]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_optgroup(props: ContentProps[optgroup]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_option(props: ContentProps[option]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_output(props: ContentProps[output]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_p(props: ContentProps[p]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_param(props: ContentProps[param]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_picture(props: ContentProps[picture]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_pre(props: ContentProps[pre]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_progress(props: ContentProps[progress]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_q(props: ContentProps[q]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_rp(props: ContentProps[rp]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_rt(props: ContentProps[rt]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_ruby(props: ContentProps[ruby]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_s(props: ContentProps[s]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_samp(props: ContentProps[samp]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_script(props: ContentProps[script]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_section(props: ContentProps[section]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_select(props: ContentProps[select]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_slot(props: ContentProps[slot]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_small(props: ContentProps[small]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_source(props: ContentProps[source]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_span(props: ContentProps[span]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_strong(props: ContentProps[strong]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_style(props: ContentProps[style]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_sub(props: ContentProps[sub]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_summary(props: ContentProps[summary]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_sup(props: ContentProps[sup]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_table(props: ContentProps[table]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_tbody(props: ContentProps[tbody]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_td(props: ContentProps[td]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_template(props: ContentProps[template]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_textarea(props: ContentProps[textarea]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_tfoot(props: ContentProps[tfoot]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_th(props: ContentProps[th]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_thead(props: ContentProps[thead]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_time(props: ContentProps[time]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_title(props: ContentProps[title]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_tr(props: ContentProps[tr]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_track(props: ContentProps[track]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_u(props: ContentProps[u]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_ul(props: ContentProps[ul]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_var(props: ContentProps[`var`]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_video(props: ContentProps[video]): Element = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.Content")
    @js.native
    def Content_wbr(props: ContentProps[wbr]): Element = js.native
    
    @JSImport("@wordpress/block-editor/components/rich-text", "default.isEmpty")
    @js.native
    def isEmpty(value: String): Boolean = js.native
    @JSImport("@wordpress/block-editor/components/rich-text", "default.isEmpty")
    @js.native
    def isEmpty(value: js.Array[String]): Boolean = js.native
  }
  
  object RichTextShortcut extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/rich-text", "RichTextShortcut")
    @js.native
    val ^ : ComponentType[typings.wordpressBlockEditor.richTextMod.RichTextShortcut.Props] = js.native
    
    @js.native
    trait Props extends StObject {
      
      var character: String = js.native
      
      def onUse(): Unit = js.native
      
      var `type`: /* keyof @wordpress/block-editor.anon.TypeofrawShortcut */ primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt = js.native
    }
    object Props {
      
      @scala.inline
      def apply(
        character: String,
        onUse: () => Unit,
        `type`: /* keyof @wordpress/block-editor.anon.TypeofrawShortcut */ primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
      ): typings.wordpressBlockEditor.richTextMod.RichTextShortcut.Props = {
        val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], onUse = js.Any.fromFunction0(onUse))
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressBlockEditor.richTextMod.RichTextShortcut.Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: typings.wordpressBlockEditor.richTextMod.RichTextShortcut.Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnUse(value: () => Unit): Self = StObject.set(x, "onUse", js.Any.fromFunction0(value))
        
        @scala.inline
        def setType(
          value: /* keyof @wordpress/block-editor.anon.TypeofrawShortcut */ primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
        ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    type _To = ComponentType[typings.wordpressBlockEditor.richTextMod.RichTextShortcut.Props]
    
    /* This means you don't have to write `^`, but can instead just say `RichTextShortcut.foo` */
    override def _to: ComponentType[typings.wordpressBlockEditor.richTextMod.RichTextShortcut.Props] = ^
  }
  
  object RichTextToolbarButton extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/rich-text", "RichTextToolbarButton")
    @js.native
    val ^ : ComponentType[typings.wordpressBlockEditor.richTextMod.RichTextToolbarButton.Props] = js.native
    
    @js.native
    trait Props
      extends typings.wordpressComponents.toolbarButtonMod.ToolbarButton.Props {
      
      var name: js.UndefOr[String] = js.native
      
      var shortcutCharacter: js.UndefOr[String] = js.native
      
      var shortcutType: js.UndefOr[
            primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
          ] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(icon: Icon, onClick: () => Unit, title: String): typings.wordpressBlockEditor.richTextMod.RichTextToolbarButton.Props = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressBlockEditor.richTextMod.RichTextToolbarButton.Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: typings.wordpressBlockEditor.richTextMod.RichTextToolbarButton.Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setShortcutCharacter(value: String): Self = StObject.set(x, "shortcutCharacter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShortcutCharacterUndefined: Self = StObject.set(x, "shortcutCharacter", js.undefined)
        
        @scala.inline
        def setShortcutType(
          value: primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
        ): Self = StObject.set(x, "shortcutType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShortcutTypeUndefined: Self = StObject.set(x, "shortcutType", js.undefined)
      }
    }
    
    type _To = ComponentType[typings.wordpressBlockEditor.richTextMod.RichTextToolbarButton.Props]
    
    /* This means you don't have to write `^`, but can instead just say `RichTextToolbarButton.foo` */
    override def _to: ComponentType[typings.wordpressBlockEditor.richTextMod.RichTextToolbarButton.Props] = ^
  }
  
  object RichText {
    
    @js.native
    trait ContentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */] extends HTMLProps[T] {
      
      @JSName("children")
      var children_ContentProps: js.UndefOr[scala.Nothing] = js.native
      
      var multiline: js.UndefOr[Boolean | p | li] = js.native
      
      var tagName: js.UndefOr[T] = js.native
      
      @JSName("value")
      var value_ContentProps: String = js.native
    }
    object ContentProps {
      
      @scala.inline
      def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */](value: String): ContentProps[T] = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[ContentProps[T]]
      }
      
      @scala.inline
      implicit class ContentPropsMutableBuilder[Self <: ContentProps[_], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */] (val x: Self with ContentProps[T]) extends AnyVal {
        
        @scala.inline
        def setMultiline(value: Boolean | p | li): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
        
        @scala.inline
        def setTagName(value: T): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined parent std.Omit<react.react.HTMLProps<T>, 'onChange'> */
    @js.native
    trait Props[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */] extends StObject {
      
      var default: js.UndefOr[Boolean] = js.native
      
      var about: js.UndefOr[String] = js.native
      
      var accept: js.UndefOr[String] = js.native
      
      var acceptCharset: js.UndefOr[String] = js.native
      
      var accessKey: js.UndefOr[String] = js.native
      
      var action: js.UndefOr[String] = js.native
      
      var allowFullScreen: js.UndefOr[Boolean] = js.native
      
      var allowTransparency: js.UndefOr[Boolean] = js.native
      
      var alt: js.UndefOr[String] = js.native
      
      var `aria-activedescendant`: js.UndefOr[String] = js.native
      
      var `aria-atomic`: js.UndefOr[Boolean] = js.native
      
      var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
      
      var `aria-busy`: js.UndefOr[Boolean] = js.native
      
      var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
      
      var `aria-colcount`: js.UndefOr[Double] = js.native
      
      var `aria-colindex`: js.UndefOr[Double] = js.native
      
      var `aria-colspan`: js.UndefOr[Double] = js.native
      
      var `aria-controls`: js.UndefOr[String] = js.native
      
      var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
      
      var `aria-describedby`: js.UndefOr[String] = js.native
      
      var `aria-details`: js.UndefOr[String] = js.native
      
      var `aria-disabled`: js.UndefOr[Boolean] = js.native
      
      var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
      
      var `aria-errormessage`: js.UndefOr[String] = js.native
      
      var `aria-expanded`: js.UndefOr[Boolean] = js.native
      
      var `aria-flowto`: js.UndefOr[String] = js.native
      
      var `aria-grabbed`: js.UndefOr[Boolean] = js.native
      
      var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
      
      var `aria-hidden`: js.UndefOr[Boolean] = js.native
      
      var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
      
      var `aria-keyshortcuts`: js.UndefOr[String] = js.native
      
      var `aria-label`: js.UndefOr[String] = js.native
      
      var `aria-labelledby`: js.UndefOr[String] = js.native
      
      var `aria-level`: js.UndefOr[Double] = js.native
      
      var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
      
      var `aria-modal`: js.UndefOr[Boolean] = js.native
      
      var `aria-multiline`: js.UndefOr[Boolean] = js.native
      
      var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
      
      var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
      
      var `aria-owns`: js.UndefOr[String] = js.native
      
      var `aria-placeholder`: js.UndefOr[String] = js.native
      
      var `aria-posinset`: js.UndefOr[Double] = js.native
      
      var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
      
      var `aria-readonly`: js.UndefOr[Boolean] = js.native
      
      var `aria-relevant`: js.UndefOr[
            additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
          ] = js.native
      
      var `aria-required`: js.UndefOr[Boolean] = js.native
      
      var `aria-roledescription`: js.UndefOr[String] = js.native
      
      var `aria-rowcount`: js.UndefOr[Double] = js.native
      
      var `aria-rowindex`: js.UndefOr[Double] = js.native
      
      var `aria-rowspan`: js.UndefOr[Double] = js.native
      
      var `aria-selected`: js.UndefOr[Boolean] = js.native
      
      var `aria-setsize`: js.UndefOr[Double] = js.native
      
      var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
      
      var `aria-valuemax`: js.UndefOr[Double] = js.native
      
      var `aria-valuemin`: js.UndefOr[Double] = js.native
      
      var `aria-valuenow`: js.UndefOr[Double] = js.native
      
      var `aria-valuetext`: js.UndefOr[String] = js.native
      
      var as: js.UndefOr[String] = js.native
      
      var async: js.UndefOr[Boolean] = js.native
      
      var autoCapitalize: js.UndefOr[String] = js.native
      
      var autoComplete: js.UndefOr[String] = js.native
      
      var autoCorrect: js.UndefOr[String] = js.native
      
      var autoFocus: js.UndefOr[Boolean] = js.native
      
      var autoPlay: js.UndefOr[Boolean] = js.native
      
      var autoSave: js.UndefOr[String] = js.native
      
      /**
        * A list of autocompleters to use instead of the default.
        */
      var autocompleters: js.UndefOr[js.Array[Completer[_]]] = js.native
      
      var capture: js.UndefOr[Boolean | String] = js.native
      
      var cellPadding: js.UndefOr[Double | String] = js.native
      
      var cellSpacing: js.UndefOr[Double | String] = js.native
      
      var challenge: js.UndefOr[String] = js.native
      
      var charSet: js.UndefOr[String] = js.native
      
      var checked: js.UndefOr[Boolean] = js.native
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      var cite: js.UndefOr[String] = js.native
      
      var classID: js.UndefOr[String] = js.native
      
      var className: js.UndefOr[String] = js.native
      
      var colSpan: js.UndefOr[Double] = js.native
      
      var color: js.UndefOr[String] = js.native
      
      var cols: js.UndefOr[Double] = js.native
      
      var content: js.UndefOr[String] = js.native
      
      var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
      
      var contextMenu: js.UndefOr[String] = js.native
      
      var controls: js.UndefOr[Boolean] = js.native
      
      var coords: js.UndefOr[String] = js.native
      
      var crossOrigin: js.UndefOr[String] = js.native
      
      var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
      
      var data: js.UndefOr[String] = js.native
      
      var datatype: js.UndefOr[String] = js.native
      
      var dateTime: js.UndefOr[String] = js.native
      
      var defaultChecked: js.UndefOr[Boolean] = js.native
      
      var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
      
      var defer: js.UndefOr[Boolean] = js.native
      
      var dir: js.UndefOr[String] = js.native
      
      var disabled: js.UndefOr[Boolean] = js.native
      
      var download: js.UndefOr[js.Any] = js.native
      
      var draggable: js.UndefOr[Booleanish] = js.native
      
      var encType: js.UndefOr[String] = js.native
      
      var form: js.UndefOr[String] = js.native
      
      var formAction: js.UndefOr[String] = js.native
      
      var formEncType: js.UndefOr[String] = js.native
      
      var formMethod: js.UndefOr[String] = js.native
      
      var formNoValidate: js.UndefOr[Boolean] = js.native
      
      var formTarget: js.UndefOr[String] = js.native
      
      var frameBorder: js.UndefOr[Double | String] = js.native
      
      var headers: js.UndefOr[String] = js.native
      
      var height: js.UndefOr[Double | String] = js.native
      
      var hidden: js.UndefOr[Boolean] = js.native
      
      var high: js.UndefOr[Double] = js.native
      
      var href: js.UndefOr[String] = js.native
      
      var hrefLang: js.UndefOr[String] = js.native
      
      var htmlFor: js.UndefOr[String] = js.native
      
      var httpEquiv: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var identifier: js.UndefOr[String] = js.native
      
      var inlineToolbar: js.UndefOr[Boolean] = js.native
      
      var inlist: js.UndefOr[js.Any] = js.native
      
      var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
      
      var integrity: js.UndefOr[String] = js.native
      
      var is: js.UndefOr[String] = js.native
      
      var itemID: js.UndefOr[String] = js.native
      
      var itemProp: js.UndefOr[String] = js.native
      
      var itemRef: js.UndefOr[String] = js.native
      
      var itemScope: js.UndefOr[Boolean] = js.native
      
      var itemType: js.UndefOr[String] = js.native
      
      /**
        * By default, the placeholder will hide as soon as the editable field receives focus. With
        * this setting it can be be kept while the field is focussed and empty.
        */
      var keepPlaceholderOnFocus: js.UndefOr[Boolean] = js.native
      
      var key: js.UndefOr[Key | Null] = js.native
      
      var keyParams: js.UndefOr[String] = js.native
      
      var keyType: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var label: js.UndefOr[String] = js.native
      
      var lang: js.UndefOr[String] = js.native
      
      var list: js.UndefOr[String] = js.native
      
      var loop: js.UndefOr[Boolean] = js.native
      
      var low: js.UndefOr[Double] = js.native
      
      var manifest: js.UndefOr[String] = js.native
      
      var marginHeight: js.UndefOr[Double] = js.native
      
      var marginWidth: js.UndefOr[Double] = js.native
      
      var max: js.UndefOr[Double | String] = js.native
      
      var maxLength: js.UndefOr[Double] = js.native
      
      var media: js.UndefOr[String] = js.native
      
      var mediaGroup: js.UndefOr[String] = js.native
      
      var method: js.UndefOr[String] = js.native
      
      var min: js.UndefOr[Double | String] = js.native
      
      var minLength: js.UndefOr[Double] = js.native
      
      var multiline: js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 121 */ js.Any
          ] = js.native
      
      var multiple: js.UndefOr[Boolean] = js.native
      
      var muted: js.UndefOr[Boolean] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var noValidate: js.UndefOr[Boolean] = js.native
      
      var nonce: js.UndefOr[String] = js.native
      
      var onAbort: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.native
      
      var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.native
      
      var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.native
      
      var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.native
      
      var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.native
      
      var onBlur: js.UndefOr[FocusEventHandler[T]] = js.native
      
      var onCanPlay: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onCanPlayThrough: js.UndefOr[ReactEventHandler[T]] = js.native
      
      /**
        * Called when the value changes.
        */
      def onChange(value: String): Unit = js.native
      
      var onClick: js.UndefOr[MouseEventHandler[T]] = js.native
      
      var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.native
      
      var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.native
      
      var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.native
      
      var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.native
      
      var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.native
      
      var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.native
      
      var onDoubleClick: js.UndefOr[MouseEventHandler[T]] = js.native
      
      var onDrag: js.UndefOr[DragEventHandler[T]] = js.native
      
      var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.native
      
      var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.native
      
      var onDragExit: js.UndefOr[DragEventHandler[T]] = js.native
      
      var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.native
      
      var onDragOver: js.UndefOr[DragEventHandler[T]] = js.native
      
      var onDragStart: js.UndefOr[DragEventHandler[T]] = js.native
      
      var onDrop: js.UndefOr[DragEventHandler[T]] = js.native
      
      var onDurationChange: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onEmptied: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onEncrypted: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onEnded: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onError: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onFocus: js.UndefOr[FocusEventHandler[T]] = js.native
      
      var onInput: js.UndefOr[FormEventHandler[T]] = js.native
      
      var onInvalid: js.UndefOr[FormEventHandler[T]] = js.native
      
      var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.native
      
      var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.native
      
      var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.native
      
      var onLoad: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onLoadStart: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onLoadedData: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onLoadedMetadata: js.UndefOr[ReactEventHandler[T]] = js.native
      
      /**
        * Called when blocks can be merged. `forward` is `true` when merging with the next block,
        * false when merging with the previous block.
        */
      var onMerge: js.UndefOr[js.Function1[/* forward */ Boolean, Unit]] = js.native
      
      var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.native
      
      var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.native
      
      var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.native
      
      var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.native
      
      var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.native
      
      var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.native
      
      var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.native
      
      var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.native
      
      var onPause: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onPlay: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onPlaying: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.native
      
      var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.native
      
      var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.native
      
      var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.native
      
      var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.native
      
      var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.native
      
      var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.native
      
      var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.native
      
      var onProgress: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onRateChange: js.UndefOr[ReactEventHandler[T]] = js.native
      
      /**
        * Called when the block can be removed. `forward` is `true` when the selection is expected to
        * move to the next block, `false` to the previous block.
        */
      var onRemove: js.UndefOr[js.Function1[/* forward */ Boolean, Unit]] = js.native
      
      /**
        * Called when the `RichText` instance can be replaced with the given blocks.
        */
      var onReplace: js.UndefOr[js.Function1[/* blocks */ js.Array[BlockInstance[StringDictionary[_]]], Unit]] = js.native
      
      var onReset: js.UndefOr[FormEventHandler[T]] = js.native
      
      var onScroll: js.UndefOr[UIEventHandler[T]] = js.native
      
      var onSeeked: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onSeeking: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onSelect: js.UndefOr[ReactEventHandler[T]] = js.native
      
      /**
        * Called when the content can be split, where `value` is a piece of content being split
        * off. Here you should create a new block with that content and return it. Note that you
        * also need to provide `onReplace` in order for this to take any effect.
        */
      var onSplit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
      
      var onStalled: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onSubmit: js.UndefOr[FormEventHandler[T]] = js.native
      
      var onSuspend: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onTagNameChange: js.UndefOr[
            js.Function1[
              /* tagName */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any, 
              Unit
            ]
          ] = js.native
      
      var onTimeUpdate: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.native
      
      var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.native
      
      var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.native
      
      var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.native
      
      var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.native
      
      var onVolumeChange: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onWaiting: js.UndefOr[ReactEventHandler[T]] = js.native
      
      var onWheel: js.UndefOr[WheelEventHandler[T]] = js.native
      
      var open: js.UndefOr[Boolean] = js.native
      
      var optimum: js.UndefOr[Double] = js.native
      
      var pattern: js.UndefOr[String] = js.native
      
      /**
        * Placeholder text to show when the field is empty, similar to the `input` and `textarea`
        * attribute of the same name.
        * See: {@link https://developer.mozilla.org/en-US/docs/Learn/HTML/Forms/HTML5_updates#The_placeholder_attribute }
        */
      var placeholder: js.UndefOr[String] = js.native
      
      var playsInline: js.UndefOr[Boolean] = js.native
      
      var poster: js.UndefOr[String] = js.native
      
      var prefix: js.UndefOr[String] = js.native
      
      var preload: js.UndefOr[String] = js.native
      
      var property: js.UndefOr[String] = js.native
      
      var radioGroup: js.UndefOr[String] = js.native
      
      var readOnly: js.UndefOr[Boolean] = js.native
      
      var ref: js.UndefOr[LegacyRef[T]] = js.native
      
      var rel: js.UndefOr[String] = js.native
      
      var required: js.UndefOr[Boolean] = js.native
      
      var resource: js.UndefOr[String] = js.native
      
      var results: js.UndefOr[Double] = js.native
      
      var reversed: js.UndefOr[Boolean] = js.native
      
      var role: js.UndefOr[String] = js.native
      
      var rowSpan: js.UndefOr[Double] = js.native
      
      var rows: js.UndefOr[Double] = js.native
      
      var sandbox: js.UndefOr[String] = js.native
      
      var scope: js.UndefOr[String] = js.native
      
      var scoped: js.UndefOr[Boolean] = js.native
      
      var scrolling: js.UndefOr[String] = js.native
      
      var seamless: js.UndefOr[Boolean] = js.native
      
      var security: js.UndefOr[String] = js.native
      
      var selected: js.UndefOr[Boolean] = js.native
      
      var shape: js.UndefOr[String] = js.native
      
      var size: js.UndefOr[Double] = js.native
      
      var sizes: js.UndefOr[String] = js.native
      
      var slot: js.UndefOr[String] = js.native
      
      var span: js.UndefOr[Double] = js.native
      
      var spellCheck: js.UndefOr[Booleanish] = js.native
      
      var src: js.UndefOr[String] = js.native
      
      var srcDoc: js.UndefOr[String] = js.native
      
      var srcLang: js.UndefOr[String] = js.native
      
      var srcSet: js.UndefOr[String] = js.native
      
      var start: js.UndefOr[Double] = js.native
      
      var step: js.UndefOr[Double | String] = js.native
      
      var style: js.UndefOr[CSSProperties] = js.native
      
      var summary: js.UndefOr[String] = js.native
      
      var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
      
      var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
      
      var tabIndex: js.UndefOr[Double] = js.native
      
      /**
        * The tag name of the editable element.
        * @defaultValue div
        */
      var tagName: js.UndefOr[T] = js.native
      
      var target: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var translate: js.UndefOr[yes | no] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var typeof: js.UndefOr[String] = js.native
      
      var unselectable: js.UndefOr[on | off] = js.native
      
      var useMap: js.UndefOr[String] = js.native
      
      /**
        * HTML string to make editable. The HTML should be valid, and valid inside the `tagName`,
        * if provided.
        */
      var value: String = js.native
      
      var vocab: js.UndefOr[String] = js.native
      
      var width: js.UndefOr[Double | String] = js.native
      
      var wmode: js.UndefOr[String] = js.native
      
      var wrap: js.UndefOr[String] = js.native
      
      var wrapperClassName: js.UndefOr[String] = js.native
    }
    object Props {
      
      @scala.inline
      def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */](onChange: String => Unit, value: String): Props[T] = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props[T]]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props[_], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */] (val x: Self with Props[T]) extends AnyVal {
        
        @scala.inline
        def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
        
        @scala.inline
        def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
        
        @scala.inline
        def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
        
        @scala.inline
        def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
        
        @scala.inline
        def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        @scala.inline
        def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
        
        @scala.inline
        def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
        
        @scala.inline
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        @scala.inline
        def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
        
        @scala.inline
        def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
        
        @scala.inline
        def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
        
        @scala.inline
        def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
        
        @scala.inline
        def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
        
        @scala.inline
        def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
        
        @scala.inline
        def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
        
        @scala.inline
        def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
        
        @scala.inline
        def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
        
        @scala.inline
        def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
        
        @scala.inline
        def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
        
        @scala.inline
        def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
        
        @scala.inline
        def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
        
        @scala.inline
        def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
        
        @scala.inline
        def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
        
        @scala.inline
        def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
        
        @scala.inline
        def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
        
        @scala.inline
        def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
        
        @scala.inline
        def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
        
        @scala.inline
        def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
        
        @scala.inline
        def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
        
        @scala.inline
        def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
        
        @scala.inline
        def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
        
        @scala.inline
        def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
        
        @scala.inline
        def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
        
        @scala.inline
        def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
        
        @scala.inline
        def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
        
        @scala.inline
        def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
        
        @scala.inline
        def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
        
        @scala.inline
        def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
        
        @scala.inline
        def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
        
        @scala.inline
        def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
        
        @scala.inline
        def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
        
        @scala.inline
        def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
        
        @scala.inline
        def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
        
        @scala.inline
        def `setAria-relevant`(
          value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
        ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
        
        @scala.inline
        def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
        
        @scala.inline
        def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
        
        @scala.inline
        def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
        
        @scala.inline
        def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
        
        @scala.inline
        def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
        
        @scala.inline
        def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
        
        @scala.inline
        def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
        
        @scala.inline
        def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
        
        @scala.inline
        def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
        
        @scala.inline
        def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
        
        @scala.inline
        def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
        
        @scala.inline
        def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
        
        @scala.inline
        def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
        
        @scala.inline
        def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
        
        @scala.inline
        def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
        
        @scala.inline
        def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
        
        @scala.inline
        def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
        
        @scala.inline
        def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
        
        @scala.inline
        def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
        
        @scala.inline
        def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
        
        @scala.inline
        def setAutocompleters(value: js.Array[Completer[_]]): Self = StObject.set(x, "autocompleters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutocompletersUndefined: Self = StObject.set(x, "autocompleters", js.undefined)
        
        @scala.inline
        def setAutocompletersVarargs(value: Completer[js.Any]*): Self = StObject.set(x, "autocompleters", js.Array(value :_*))
        
        @scala.inline
        def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
        
        @scala.inline
        def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
        
        @scala.inline
        def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
        
        @scala.inline
        def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
        
        @scala.inline
        def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
        
        @scala.inline
        def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
        
        @scala.inline
        def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
        
        @scala.inline
        def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
        
        @scala.inline
        def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
        
        @scala.inline
        def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
        
        @scala.inline
        def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        @scala.inline
        def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
        
        @scala.inline
        def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
        
        @scala.inline
        def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
        
        @scala.inline
        def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
        
        @scala.inline
        def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
        
        @scala.inline
        def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
        
        @scala.inline
        def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
        
        @scala.inline
        def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
        
        @scala.inline
        def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
        
        @scala.inline
        def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
        
        @scala.inline
        def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
        
        @scala.inline
        def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        @scala.inline
        def setDownload(value: js.Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
        
        @scala.inline
        def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
        
        @scala.inline
        def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
        
        @scala.inline
        def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
        
        @scala.inline
        def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
        
        @scala.inline
        def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
        
        @scala.inline
        def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
        
        @scala.inline
        def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
        
        @scala.inline
        def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
        
        @scala.inline
        def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
        
        @scala.inline
        def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        @scala.inline
        def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        @scala.inline
        def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
        
        @scala.inline
        def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
        
        @scala.inline
        def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
        
        @scala.inline
        def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
        
        @scala.inline
        def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
        
        @scala.inline
        def setInlineToolbar(value: Boolean): Self = StObject.set(x, "inlineToolbar", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInlineToolbarUndefined: Self = StObject.set(x, "inlineToolbar", js.undefined)
        
        @scala.inline
        def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
        
        @scala.inline
        def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
        
        @scala.inline
        def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
        
        @scala.inline
        def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
        
        @scala.inline
        def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
        
        @scala.inline
        def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
        
        @scala.inline
        def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
        
        @scala.inline
        def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
        
        @scala.inline
        def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
        
        @scala.inline
        def setKeepPlaceholderOnFocus(value: Boolean): Self = StObject.set(x, "keepPlaceholderOnFocus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeepPlaceholderOnFocusUndefined: Self = StObject.set(x, "keepPlaceholderOnFocus", js.undefined)
        
        @scala.inline
        def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyNull: Self = StObject.set(x, "key", null)
        
        @scala.inline
        def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
        
        @scala.inline
        def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
        
        @scala.inline
        def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setListUndefined: Self = StObject.set(x, "list", js.undefined)
        
        @scala.inline
        def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
        
        @scala.inline
        def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
        
        @scala.inline
        def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
        
        @scala.inline
        def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
        
        @scala.inline
        def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
        
        @scala.inline
        def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
        
        @scala.inline
        def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        @scala.inline
        def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
        
        @scala.inline
        def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        @scala.inline
        def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
        
        @scala.inline
        def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        @scala.inline
        def setMultiline(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 121 */ js.Any): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
        
        @scala.inline
        def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
        
        @scala.inline
        def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
        
        @scala.inline
        def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
        
        @scala.inline
        def setOnAbort(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
        
        @scala.inline
        def setOnAnimationEnd(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
        
        @scala.inline
        def setOnAnimationIteration(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
        
        @scala.inline
        def setOnAnimationStart(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
        
        @scala.inline
        def setOnAuxClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
        
        @scala.inline
        def setOnBeforeInput(value: FormEvent[T] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
        
        @scala.inline
        def setOnBlur(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
        
        @scala.inline
        def setOnCanPlay(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCanPlayThrough(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
        
        @scala.inline
        def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
        
        @scala.inline
        def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
        
        @scala.inline
        def setOnCompositionEnd(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
        
        @scala.inline
        def setOnCompositionStart(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
        
        @scala.inline
        def setOnCompositionUpdate(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
        
        @scala.inline
        def setOnContextMenu(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
        
        @scala.inline
        def setOnCopy(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
        
        @scala.inline
        def setOnCut(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
        
        @scala.inline
        def setOnDoubleClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
        
        @scala.inline
        def setOnDrag(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDragEnd(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
        
        @scala.inline
        def setOnDragEnter(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
        
        @scala.inline
        def setOnDragExit(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
        
        @scala.inline
        def setOnDragLeave(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
        
        @scala.inline
        def setOnDragOver(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
        
        @scala.inline
        def setOnDragStart(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
        
        @scala.inline
        def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
        
        @scala.inline
        def setOnDrop(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
        
        @scala.inline
        def setOnDurationChange(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
        
        @scala.inline
        def setOnEmptied(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
        
        @scala.inline
        def setOnEncrypted(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
        
        @scala.inline
        def setOnEnded(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
        
        @scala.inline
        def setOnError(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
        
        @scala.inline
        def setOnFocus(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
        
        @scala.inline
        def setOnInput(value: FormEvent[T] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
        
        @scala.inline
        def setOnInvalid(value: FormEvent[T] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
        
        @scala.inline
        def setOnKeyDown(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
        
        @scala.inline
        def setOnKeyPress(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
        
        @scala.inline
        def setOnKeyUp(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
        
        @scala.inline
        def setOnLoad(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnLoadStart(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
        
        @scala.inline
        def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
        
        @scala.inline
        def setOnLoadedData(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
        
        @scala.inline
        def setOnLoadedMetadata(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
        
        @scala.inline
        def setOnMerge(value: /* forward */ Boolean => Unit): Self = StObject.set(x, "onMerge", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnMergeUndefined: Self = StObject.set(x, "onMerge", js.undefined)
        
        @scala.inline
        def setOnMouseDown(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
        
        @scala.inline
        def setOnMouseEnter(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
        
        @scala.inline
        def setOnMouseLeave(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
        
        @scala.inline
        def setOnMouseMove(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
        
        @scala.inline
        def setOnMouseOut(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
        
        @scala.inline
        def setOnMouseOver(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
        
        @scala.inline
        def setOnMouseUp(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
        
        @scala.inline
        def setOnPaste(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
        
        @scala.inline
        def setOnPause(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
        
        @scala.inline
        def setOnPlay(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
        
        @scala.inline
        def setOnPlaying(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
        
        @scala.inline
        def setOnPointerCancel(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
        
        @scala.inline
        def setOnPointerDown(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
        
        @scala.inline
        def setOnPointerEnter(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
        
        @scala.inline
        def setOnPointerLeave(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
        
        @scala.inline
        def setOnPointerMove(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
        
        @scala.inline
        def setOnPointerOut(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
        
        @scala.inline
        def setOnPointerOver(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
        
        @scala.inline
        def setOnPointerUp(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
        
        @scala.inline
        def setOnProgress(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
        
        @scala.inline
        def setOnRateChange(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
        
        @scala.inline
        def setOnRemove(value: /* forward */ Boolean => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
        
        @scala.inline
        def setOnReplace(value: /* blocks */ js.Array[BlockInstance[StringDictionary[_]]] => Unit): Self = StObject.set(x, "onReplace", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnReplaceUndefined: Self = StObject.set(x, "onReplace", js.undefined)
        
        @scala.inline
        def setOnReset(value: FormEvent[T] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
        
        @scala.inline
        def setOnScroll(value: UIEvent[T, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
        
        @scala.inline
        def setOnSeeked(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
        
        @scala.inline
        def setOnSeeking(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
        
        @scala.inline
        def setOnSelect(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
        
        @scala.inline
        def setOnSplit(value: /* value */ String => Unit): Self = StObject.set(x, "onSplit", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSplitUndefined: Self = StObject.set(x, "onSplit", js.undefined)
        
        @scala.inline
        def setOnStalled(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
        
        @scala.inline
        def setOnSubmit(value: FormEvent[T] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
        
        @scala.inline
        def setOnSuspend(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
        
        @scala.inline
        def setOnTagNameChange(
          value: /* tagName */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => Unit
        ): Self = StObject.set(x, "onTagNameChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnTagNameChangeUndefined: Self = StObject.set(x, "onTagNameChange", js.undefined)
        
        @scala.inline
        def setOnTimeUpdate(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
        
        @scala.inline
        def setOnTouchCancel(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
        
        @scala.inline
        def setOnTouchEnd(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
        
        @scala.inline
        def setOnTouchMove(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
        
        @scala.inline
        def setOnTouchStart(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
        
        @scala.inline
        def setOnTransitionEnd(value: TransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
        
        @scala.inline
        def setOnVolumeChange(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
        
        @scala.inline
        def setOnWaiting(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
        
        @scala.inline
        def setOnWheel(value: WheelEvent[T] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
        
        @scala.inline
        def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
        
        @scala.inline
        def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
        
        @scala.inline
        def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        @scala.inline
        def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        @scala.inline
        def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
        
        @scala.inline
        def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        @scala.inline
        def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
        
        @scala.inline
        def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
        
        @scala.inline
        def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
        
        @scala.inline
        def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
        
        @scala.inline
        def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRefNull: Self = StObject.set(x, "ref", null)
        
        @scala.inline
        def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
        
        @scala.inline
        def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
        
        @scala.inline
        def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
        
        @scala.inline
        def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        @scala.inline
        def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
        
        @scala.inline
        def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
        
        @scala.inline
        def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        @scala.inline
        def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
        
        @scala.inline
        def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        @scala.inline
        def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
        
        @scala.inline
        def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        @scala.inline
        def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
        
        @scala.inline
        def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
        
        @scala.inline
        def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
        
        @scala.inline
        def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
        
        @scala.inline
        def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
        
        @scala.inline
        def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
        
        @scala.inline
        def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        @scala.inline
        def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
        
        @scala.inline
        def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
        
        @scala.inline
        def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
        
        @scala.inline
        def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
        
        @scala.inline
        def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
        
        @scala.inline
        def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
        
        @scala.inline
        def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
        
        @scala.inline
        def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
        
        @scala.inline
        def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        
        @scala.inline
        def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
        
        @scala.inline
        def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        @scala.inline
        def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
        @scala.inline
        def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
        
        @scala.inline
        def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
        
        @scala.inline
        def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
        
        @scala.inline
        def setTagName(value: T): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
        
        @scala.inline
        def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
        
        @scala.inline
        def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
        
        @scala.inline
        def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
        
        @scala.inline
        def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        @scala.inline
        def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
        
        @scala.inline
        def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
        
        @scala.inline
        def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
      }
    }
  }
}
