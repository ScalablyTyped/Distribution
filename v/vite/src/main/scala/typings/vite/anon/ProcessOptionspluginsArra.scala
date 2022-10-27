package typings.vite.anon

import typings.postcss.anon.PickProcessOptionsmapfrom
import typings.postcss.anon.ToString
import typings.postcss.libNodeMod.AnyNode
import typings.postcss.libRootMod.default
import typings.postcss.mod.AcceptedPlugin
import typings.postcss.mod.Builder
import typings.postcss.mod.Parser
import typings.postcss.mod.SourceMapOptions
import typings.postcss.mod.Stringifier
import typings.postcss.mod.Syntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined postcss.postcss.ProcessOptions & {  plugins :std.Array<postcss.postcss.AcceptedPlugin> | undefined} */
trait ProcessOptionspluginsArra extends StObject {
  
  /**
    * The path of the CSS source file. You should always set `from`,
    * because it is used in source map generation and syntax error messages.
    */
  var from: js.UndefOr[String] = js.undefined
  
  /**
    * Source map options
    */
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.undefined
  
  /**
    * Function to generate AST by string.
    */
  var parser: js.UndefOr[Syntax | (Parser[default | typings.postcss.libDocumentMod.default])] = js.undefined
  
  var plugins: js.UndefOr[js.Array[AcceptedPlugin]] = js.undefined
  
  /**
    * Class to generate string by AST.
    */
  var stringifier: js.UndefOr[Syntax | Stringifier] = js.undefined
  
  /**
    * Object with parse and stringify.
    */
  var syntax: js.UndefOr[Syntax] = js.undefined
  
  /**
    * The path where you'll put the output CSS file. You should always set `to`
    * to generate correct source maps.
    */
  var to: js.UndefOr[String] = js.undefined
}
object ProcessOptionspluginsArra {
  
  inline def apply(): ProcessOptionspluginsArra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessOptionspluginsArra]
  }
  
  extension [Self <: ProcessOptionspluginsArra](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setMap(value: SourceMapOptions | Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setParser(value: Syntax | (Parser[default | typings.postcss.libDocumentMod.default])): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserFunction2(
      value: (/* css */ String | ToString, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => default | typings.postcss.libDocumentMod.default
    ): Self = StObject.set(x, "parser", js.Any.fromFunction2(value))
    
    inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    inline def setPlugins(value: js.Array[AcceptedPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: AcceptedPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setStringifier(value: Syntax | Stringifier): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
    
    inline def setStringifierFunction2(value: (/* node */ AnyNode, /* builder */ Builder) => Unit): Self = StObject.set(x, "stringifier", js.Any.fromFunction2(value))
    
    inline def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
    
    inline def setSyntax(value: Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
