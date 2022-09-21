package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserStateBase extends StObject {
  
  var compilation: Compilation
  
  var current: NormalModule
  
  var module: NormalModule
  
  var options: StringDictionary[Any]
  
  var source: String | Buffer
}
object ParserStateBase {
  
  inline def apply(
    compilation: Compilation,
    current: NormalModule,
    module: NormalModule,
    options: StringDictionary[Any],
    source: String | Buffer
  ): ParserStateBase = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserStateBase]
  }
  
  extension [Self <: ParserStateBase](x: Self) {
    
    inline def setCompilation(value: Compilation): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    
    inline def setCurrent(value: NormalModule): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setModule(value: NormalModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String | Buffer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
