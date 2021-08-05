package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Matcher extends StObject {
  
  var args: js.Array[String | js.Object]
  
  var `class`: js.UndefOr[String] = js.undefined
  
  var name: String
}
object Matcher {
  
  inline def apply(args: js.Array[String | js.Object], name: String): Matcher = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matcher]
  }
  
  extension [Self <: Matcher](x: Self) {
    
    inline def setArgs(value: js.Array[String | js.Object]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: (String | js.Object)*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
