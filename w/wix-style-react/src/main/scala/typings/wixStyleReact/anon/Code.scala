package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: Requireable[String]
  
  var formatDistance: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var formatLong: Requireable[js.Object]
  
  var formatRelative: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var localize: Requireable[js.Object]
  
  var `match`: Requireable[js.Object]
  
  var options: Requireable[js.Object]
}
object Code {
  
  inline def apply(
    code: Requireable[String],
    formatDistance: Requireable[js.Function1[/* repeated */ Any, Any]],
    formatLong: Requireable[js.Object],
    formatRelative: Requireable[js.Function1[/* repeated */ Any, Any]],
    localize: Requireable[js.Object],
    `match`: Requireable[js.Object],
    options: Requireable[js.Object]
  ): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], formatDistance = formatDistance.asInstanceOf[js.Any], formatLong = formatLong.asInstanceOf[js.Any], formatRelative = formatRelative.asInstanceOf[js.Any], localize = localize.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCode(value: Requireable[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setFormatDistance(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatDistance", value.asInstanceOf[js.Any])
    
    inline def setFormatLong(value: Requireable[js.Object]): Self = StObject.set(x, "formatLong", value.asInstanceOf[js.Any])
    
    inline def setFormatRelative(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatRelative", value.asInstanceOf[js.Any])
    
    inline def setLocalize(value: Requireable[js.Object]): Self = StObject.set(x, "localize", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: Requireable[js.Object]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Requireable[js.Object]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
