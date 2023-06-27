package typings.turndown

import typings.std.Document
import typings.std.DocumentFragment
import typings.std.HTMLElement
import typings.turndown.turndownStrings.Asterisk
import typings.turndown.turndownStrings.AsteriskAsterisk
import typings.turndown.turndownStrings.GraveaccentGraveaccentGraveaccent
import typings.turndown.turndownStrings.Plussign
import typings.turndown.turndownStrings.TildeTildeTilde
import typings.turndown.turndownStrings.__
import typings.turndown.turndownStrings._underscore
import typings.turndown.turndownStrings.`-_`
import typings.turndown.turndownStrings.atx
import typings.turndown.turndownStrings.collapsed
import typings.turndown.turndownStrings.fenced
import typings.turndown.turndownStrings.full
import typings.turndown.turndownStrings.indented
import typings.turndown.turndownStrings.inlined
import typings.turndown.turndownStrings.referenced
import typings.turndown.turndownStrings.setext
import typings.turndown.turndownStrings.shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("turndown", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TurndownService {
    def this(options: Options) = this()
  }
  
  type Filter = TagName | js.Array[TagName] | FilterFunction
  
  type FilterFunction = js.Function2[/* node */ HTMLElement, /* options */ Options, Boolean]
  
  type Node = HTMLElement | Document | DocumentFragment
  
  trait Options extends StObject {
    
    var blankReplacement: js.UndefOr[ReplacementFunction] = js.undefined
    
    var br: js.UndefOr[String] = js.undefined
    
    var bulletListMarker: js.UndefOr[`-_` | Plussign | Asterisk] = js.undefined
    
    var codeBlockStyle: js.UndefOr[indented | fenced] = js.undefined
    
    var defaultReplacement: js.UndefOr[ReplacementFunction] = js.undefined
    
    var emDelimiter: js.UndefOr[_underscore | Asterisk] = js.undefined
    
    var fence: js.UndefOr[GraveaccentGraveaccentGraveaccent | TildeTildeTilde] = js.undefined
    
    var headingStyle: js.UndefOr[setext | atx] = js.undefined
    
    var hr: js.UndefOr[String] = js.undefined
    
    var keepReplacement: js.UndefOr[ReplacementFunction] = js.undefined
    
    var linkReferenceStyle: js.UndefOr[full | collapsed | shortcut] = js.undefined
    
    var linkStyle: js.UndefOr[inlined | referenced] = js.undefined
    
    var strongDelimiter: js.UndefOr[__ | AsteriskAsterisk] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBlankReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "blankReplacement", js.Any.fromFunction3(value))
      
      inline def setBlankReplacementUndefined: Self = StObject.set(x, "blankReplacement", js.undefined)
      
      inline def setBr(value: String): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      inline def setBulletListMarker(value: `-_` | Plussign | Asterisk): Self = StObject.set(x, "bulletListMarker", value.asInstanceOf[js.Any])
      
      inline def setBulletListMarkerUndefined: Self = StObject.set(x, "bulletListMarker", js.undefined)
      
      inline def setCodeBlockStyle(value: indented | fenced): Self = StObject.set(x, "codeBlockStyle", value.asInstanceOf[js.Any])
      
      inline def setCodeBlockStyleUndefined: Self = StObject.set(x, "codeBlockStyle", js.undefined)
      
      inline def setDefaultReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "defaultReplacement", js.Any.fromFunction3(value))
      
      inline def setDefaultReplacementUndefined: Self = StObject.set(x, "defaultReplacement", js.undefined)
      
      inline def setEmDelimiter(value: _underscore | Asterisk): Self = StObject.set(x, "emDelimiter", value.asInstanceOf[js.Any])
      
      inline def setEmDelimiterUndefined: Self = StObject.set(x, "emDelimiter", js.undefined)
      
      inline def setFence(value: GraveaccentGraveaccentGraveaccent | TildeTildeTilde): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
      
      inline def setFenceUndefined: Self = StObject.set(x, "fence", js.undefined)
      
      inline def setHeadingStyle(value: setext | atx): Self = StObject.set(x, "headingStyle", value.asInstanceOf[js.Any])
      
      inline def setHeadingStyleUndefined: Self = StObject.set(x, "headingStyle", js.undefined)
      
      inline def setHr(value: String): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      inline def setKeepReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "keepReplacement", js.Any.fromFunction3(value))
      
      inline def setKeepReplacementUndefined: Self = StObject.set(x, "keepReplacement", js.undefined)
      
      inline def setLinkReferenceStyle(value: full | collapsed | shortcut): Self = StObject.set(x, "linkReferenceStyle", value.asInstanceOf[js.Any])
      
      inline def setLinkReferenceStyleUndefined: Self = StObject.set(x, "linkReferenceStyle", js.undefined)
      
      inline def setLinkStyle(value: inlined | referenced): Self = StObject.set(x, "linkStyle", value.asInstanceOf[js.Any])
      
      inline def setLinkStyleUndefined: Self = StObject.set(x, "linkStyle", js.undefined)
      
      inline def setStrongDelimiter(value: __ | AsteriskAsterisk): Self = StObject.set(x, "strongDelimiter", value.asInstanceOf[js.Any])
      
      inline def setStrongDelimiterUndefined: Self = StObject.set(x, "strongDelimiter", js.undefined)
    }
  }
  
  type Plugin = js.Function1[/* service */ TurndownService, Unit]
  
  type ReplacementFunction = js.Function3[/* content */ String, /* node */ Node, /* options */ Options, String]
  
  trait Rule extends StObject {
    
    var filter: Filter
    
    var replacement: js.UndefOr[ReplacementFunction] = js.undefined
  }
  object Rule {
    
    inline def apply(filter: Filter): Rule = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction2(value: (/* node */ HTMLElement, /* options */ Options) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterVarargs(value: TagName*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "replacement", js.Any.fromFunction3(value))
      
      inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    }
  }
  
  trait Rules extends StObject {
    
    def add(key: Filter, rule: Rule): Unit
    
    var array: js.Array[Rule]
    
    def blankRule(content: String, node: Node, options: Options): String
    @JSName("blankRule")
    var blankRule_Original: ReplacementFunction
    
    def defaultRule(content: String, node: Node, options: Options): String
    @JSName("defaultRule")
    var defaultRule_Original: ReplacementFunction
    
    def forEach(callback: js.Function2[/* rule */ Rule, /* index */ Double, Any]): Unit
    
    def forNode(node: Node): Rule
    
    def keep(filter: Filter): Unit
    
    def keepReplacement(content: String, node: Node, options: Options): String
    @JSName("keepReplacement")
    var keepReplacement_Original: ReplacementFunction
    
    var options: Options
    
    def remove(filter: Filter): Unit
  }
  object Rules {
    
    inline def apply(
      add: (Filter, Rule) => Unit,
      array: js.Array[Rule],
      blankRule: (/* content */ String, /* node */ Node, /* options */ Options) => String,
      defaultRule: (/* content */ String, /* node */ Node, /* options */ Options) => String,
      forEach: js.Function2[/* rule */ Rule, /* index */ Double, Any] => Unit,
      forNode: Node => Rule,
      keep: Filter => Unit,
      keepReplacement: (/* content */ String, /* node */ Node, /* options */ Options) => String,
      options: Options,
      remove: Filter => Unit
    ): Rules = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), array = array.asInstanceOf[js.Any], blankRule = js.Any.fromFunction3(blankRule), defaultRule = js.Any.fromFunction3(defaultRule), forEach = js.Any.fromFunction1(forEach), forNode = js.Any.fromFunction1(forNode), keep = js.Any.fromFunction1(keep), keepReplacement = js.Any.fromFunction3(keepReplacement), options = options.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[Rules]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rules] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: (Filter, Rule) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setArray(value: js.Array[Rule]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayVarargs(value: Rule*): Self = StObject.set(x, "array", js.Array(value*))
      
      inline def setBlankRule(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "blankRule", js.Any.fromFunction3(value))
      
      inline def setDefaultRule(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "defaultRule", js.Any.fromFunction3(value))
      
      inline def setForEach(value: js.Function2[/* rule */ Rule, /* index */ Double, Any] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setForNode(value: Node => Rule): Self = StObject.set(x, "forNode", js.Any.fromFunction1(value))
      
      inline def setKeep(value: Filter => Unit): Self = StObject.set(x, "keep", js.Any.fromFunction1(value))
      
      inline def setKeepReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "keepReplacement", js.Any.fromFunction3(value))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Filter => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.turndown.turndownStrings.a
    - typings.turndown.turndownStrings.abbr
    - typings.turndown.turndownStrings.address
    - typings.turndown.turndownStrings.area
    - typings.turndown.turndownStrings.article
    - typings.turndown.turndownStrings.aside
    - typings.turndown.turndownStrings.audio
    - typings.turndown.turndownStrings.b
    - typings.turndown.turndownStrings.base
    - typings.turndown.turndownStrings.bdi
    - typings.turndown.turndownStrings.bdo
    - typings.turndown.turndownStrings.blockquote
    - typings.turndown.turndownStrings.body
    - typings.turndown.turndownStrings.br
    - typings.turndown.turndownStrings.button
    - typings.turndown.turndownStrings.canvas
    - typings.turndown.turndownStrings.caption
    - typings.turndown.turndownStrings.cite
    - typings.turndown.turndownStrings.code
    - typings.turndown.turndownStrings.col
    - typings.turndown.turndownStrings.colgroup
    - typings.turndown.turndownStrings.data
    - typings.turndown.turndownStrings.datalist
    - typings.turndown.turndownStrings.dd
    - typings.turndown.turndownStrings.del
    - typings.turndown.turndownStrings.details
    - typings.turndown.turndownStrings.dfn
    - typings.turndown.turndownStrings.dialog
    - typings.turndown.turndownStrings.div
    - typings.turndown.turndownStrings.dl
    - typings.turndown.turndownStrings.dt
    - typings.turndown.turndownStrings.em
    - typings.turndown.turndownStrings.embed
    - typings.turndown.turndownStrings.fieldset
    - typings.turndown.turndownStrings.figcaption
    - typings.turndown.turndownStrings.figure
    - typings.turndown.turndownStrings.footer
    - typings.turndown.turndownStrings.form
    - typings.turndown.turndownStrings.h1
    - typings.turndown.turndownStrings.h2
    - typings.turndown.turndownStrings.h3
    - typings.turndown.turndownStrings.h4
    - typings.turndown.turndownStrings.h5
    - typings.turndown.turndownStrings.h6
    - typings.turndown.turndownStrings.head
    - typings.turndown.turndownStrings.header
    - typings.turndown.turndownStrings.hgroup
    - typings.turndown.turndownStrings.hr
    - typings.turndown.turndownStrings.html
    - typings.turndown.turndownStrings.i
    - typings.turndown.turndownStrings.iframe
    - typings.turndown.turndownStrings.img
    - typings.turndown.turndownStrings.input
    - typings.turndown.turndownStrings.ins
    - typings.turndown.turndownStrings.kbd
    - typings.turndown.turndownStrings.label
    - typings.turndown.turndownStrings.legend
    - typings.turndown.turndownStrings.li
    - typings.turndown.turndownStrings.link
    - typings.turndown.turndownStrings.main
    - typings.turndown.turndownStrings.map
    - typings.turndown.turndownStrings.mark
    - typings.turndown.turndownStrings.menu
    - typings.turndown.turndownStrings.meta
    - typings.turndown.turndownStrings.meter
    - typings.turndown.turndownStrings.nav
    - typings.turndown.turndownStrings.noscript
    - typings.turndown.turndownStrings.`object`
    - typings.turndown.turndownStrings.ol
    - typings.turndown.turndownStrings.optgroup
    - typings.turndown.turndownStrings.option
    - typings.turndown.turndownStrings.output
    - typings.turndown.turndownStrings.p
    - typings.turndown.turndownStrings.picture
    - typings.turndown.turndownStrings.pre
    - typings.turndown.turndownStrings.progress
    - typings.turndown.turndownStrings.q
    - typings.turndown.turndownStrings.rp
    - typings.turndown.turndownStrings.rt
    - typings.turndown.turndownStrings.ruby
    - typings.turndown.turndownStrings.s
    - typings.turndown.turndownStrings.samp
    - typings.turndown.turndownStrings.script
    - typings.turndown.turndownStrings.search
    - typings.turndown.turndownStrings.section
    - typings.turndown.turndownStrings.select
    - typings.turndown.turndownStrings.slot
    - typings.turndown.turndownStrings.small
    - typings.turndown.turndownStrings.source
    - typings.turndown.turndownStrings.span
    - typings.turndown.turndownStrings.strong
    - typings.turndown.turndownStrings.style
    - typings.turndown.turndownStrings.sub
    - typings.turndown.turndownStrings.summary
    - typings.turndown.turndownStrings.sup
    - typings.turndown.turndownStrings.table
    - typings.turndown.turndownStrings.tbody
    - typings.turndown.turndownStrings.td
    - typings.turndown.turndownStrings.template
    - typings.turndown.turndownStrings.textarea
    - typings.turndown.turndownStrings.tfoot
    - typings.turndown.turndownStrings.th
    - typings.turndown.turndownStrings.thead
    - typings.turndown.turndownStrings.time
    - typings.turndown.turndownStrings.title
    - typings.turndown.turndownStrings.tr
    - typings.turndown.turndownStrings.track
    - typings.turndown.turndownStrings.u
    - typings.turndown.turndownStrings.ul
    - typings.turndown.turndownStrings.`var`
    - typings.turndown.turndownStrings.video
    - typings.turndown.turndownStrings.wbr
  */
  trait TagName extends StObject
  
  @js.native
  trait TurndownService extends StObject {
    
    def addRule(key: String, rule: Rule): this.type = js.native
    
    def escape(str: String): String = js.native
    
    def keep(filter: Filter): this.type = js.native
    
    var options: Options = js.native
    
    def remove(filter: Filter): this.type = js.native
    
    var rules: Rules = js.native
    
    def turndown(html: String): String = js.native
    def turndown(html: Node): String = js.native
    
    def use(plugins: js.Array[Plugin]): this.type = js.native
    def use(plugins: Plugin): this.type = js.native
  }
}
