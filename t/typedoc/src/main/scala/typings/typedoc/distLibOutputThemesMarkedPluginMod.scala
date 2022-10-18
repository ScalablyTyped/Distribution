package typings.typedoc

import typings.shiki.mod.Theme
import typings.typedoc.distLibOutputComponentsMod.ContextAwareRendererComponent
import typings.typedoc.distLibOutputEventsMod.MarkdownEvent
import typings.typedoc.distLibOutputRendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesMarkedPluginMod {
  
  @JSImport("typedoc/dist/lib/output/themes/MarkedPlugin", "MarkedPlugin")
  @js.native
  open class MarkedPlugin protected () extends ContextAwareRendererComponent {
    /**
      * Create new Component instance.
      */
    def this(owner: Renderer) = this()
    
    /**
      * Creates an object with options that are passed to the markdown parser.
      *
      * @returns The options object for the markdown parser.
      */
    /* private */ var createMarkedOptions: Any = js.native
    
    var darkTheme: Theme = js.native
    
    /**
      * Highlight the syntax of the given text using HighlightJS.
      *
      * @param text  The text that should be highlighted.
      * @param lang  The language that should be used to highlight the string.
      * @return A html string with syntax highlighting.
      */
    def getHighlighted(text: String): String = js.native
    def getHighlighted(text: String, lang: String): String = js.native
    
    /**
      * The pattern used to find references in markdown.
      */
    /* private */ var includePattern: Any = js.native
    
    var includeSource: String = js.native
    
    /**
      * The path referenced files are located in.
      */
    /* private */ var includes: Any = js.native
    
    var lightTheme: Theme = js.native
    
    /**
      * Path to the output media directory.
      */
    /* private */ var mediaDirectory: Any = js.native
    
    /**
      * The pattern used to find media links.
      */
    /* private */ var mediaPattern: Any = js.native
    
    var mediaSource: String = js.native
    
    /**
      * Triggered when {@link MarkedPlugin} parses a markdown string.
      *
      * @param event
      */
    def onParseMarkdown(event: MarkdownEvent): Unit = js.native
    
    /* private */ var outputFileName: Any = js.native
    
    /**
      * Parse the given markdown string and return the resulting html.
      *
      * @param text  The markdown string that should be parsed.
      * @returns The resulting html string.
      */
    def parseMarkdown(text: String): String = js.native
    
    /* private */ var sources: Any = js.native
  }
}
