package typings.vueCompilerCore.mod

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserContext extends StObject {
  
  var column: Double
  
  var inPre: Boolean
  
  var inVPre: Boolean
  
  var line: Double
  
  var offset: Double
  
  var onWarn: NonNullable[js.UndefOr[js.Function1[/* warning */ CompilerError, Unit]]]
  
  var options: MergedParserOptions
  
  val originalSource: String
  
  var source: String
}
object ParserContext {
  
  inline def apply(
    column: Double,
    inPre: Boolean,
    inVPre: Boolean,
    line: Double,
    offset: Double,
    options: MergedParserOptions,
    originalSource: String,
    source: String
  ): ParserContext = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], inPre = inPre.asInstanceOf[js.Any], inVPre = inVPre.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalSource = originalSource.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParserContext] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setInPre(value: Boolean): Self = StObject.set(x, "inPre", value.asInstanceOf[js.Any])
    
    inline def setInVPre(value: Boolean): Self = StObject.set(x, "inVPre", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOnWarn(value: /* warning */ CompilerError => Unit): Self = StObject.set(x, "onWarn", js.Any.fromFunction1(value))
    
    inline def setOnWarnUndefined: Self = StObject.set(x, "onWarn", js.undefined)
    
    inline def setOptions(value: MergedParserOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOriginalSource(value: String): Self = StObject.set(x, "originalSource", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
