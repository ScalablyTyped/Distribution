package typings.yaml

import typings.std.Record
import typings.yaml.anon.Explicit
import typings.yaml.documentMod.Document
import typings.yaml.nodeMod.Node
import typings.yaml.yamlBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesMod {
  
  @JSImport("yaml/dist/doc/directives", "Directives")
  @js.native
  open class Directives () extends StObject {
    def this(yaml: Explicit) = this()
    def this(yaml: Unit, tags: Record[String, String]) = this()
    def this(yaml: Explicit, tags: Record[String, String]) = this()
    
    /**
      * @param onError - May be called even if the action was successful
      * @returns `true` on success
      */
    def add(
      line: String,
      onError: js.Function3[/* offset */ Double, /* message */ String, /* warning */ js.UndefOr[Boolean], Unit]
    ): Boolean = js.native
    
    /**
      * During parsing, get a Directives instance for the current document and
      * update the stream state according to the current version's spec.
      */
    def atDocument(): Directives = js.native
    
    /**
      * Used when parsing YAML 1.1, where:
      * > If the document specifies no directives, it is parsed using the same
      * > settings as the previous document. If the document does specify any
      * > directives, all directives of previous documents, if any, are ignored.
      */
    /* private */ var atNextDocument: Any = js.native
    
    /** The doc-end marker `...`.  */
    var docEnd: Boolean = js.native
    
    /**
      * The directives-end/doc-start marker `---`. If `null`, a marker may still be
      * included in the document's stringified representation.
      */
    var docStart: `true` | Null = js.native
    
    /**
      * Resolves a tag, matching handles to those defined in %TAG directives.
      *
      * @returns Resolved tag, which may also be the non-specific tag `'!'` or a
      *   `'!local'` tag, or `null` if unresolvable.
      */
    def tagName(source: String, onError: js.Function1[/* message */ String, Unit]): String | Null = js.native
    
    /**
      * Given a fully resolved tag, returns its printable string form,
      * taking into account current tag prefixes and defaults.
      */
    def tagString(tag: String): String = js.native
    
    var tags: Record[String, String] = js.native
    
    def toString(doc: Document[Node[Any]]): String = js.native
    
    var yaml: Explicit = js.native
  }
  /* static members */
  object Directives {
    
    @JSImport("yaml/dist/doc/directives", "Directives")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist/doc/directives", "Directives.defaultTags")
    @js.native
    def defaultTags: Record[String, String] = js.native
    inline def defaultTags_=(x: Record[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTags")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/doc/directives", "Directives.defaultYaml")
    @js.native
    def defaultYaml: Explicit = js.native
    inline def defaultYaml_=(x: Explicit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultYaml")(x.asInstanceOf[js.Any])
  }
}
