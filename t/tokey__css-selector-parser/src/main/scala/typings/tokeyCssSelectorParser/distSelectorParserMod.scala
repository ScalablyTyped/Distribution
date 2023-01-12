package typings.tokeyCssSelectorParser

import typings.tokeyCssSelectorParser.anon.PartialParseConfig
import typings.tokeyCssSelectorParser.distAstTypesMod.SelectorList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSelectorParserMod {
  
  @JSImport("@tokey/css-selector-parser/dist/selector-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseCssSelector(source: String): SelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCssSelector")(source.asInstanceOf[js.Any]).asInstanceOf[SelectorList]
  inline def parseCssSelector(source: String, options: PartialParseConfig): SelectorList = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCssSelector")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelectorList]
  
  trait ParseConfig extends StObject {
    
    var offset: Double
  }
  object ParseConfig {
    
    inline def apply(offset: Double): ParseConfig = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseConfig] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
