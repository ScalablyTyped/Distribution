package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: typings.typedoc.distLibUtilsOptionsOptionsMod.Options
}
object Options {
  
  inline def apply(options: typings.typedoc.distLibUtilsOptionsOptionsMod.Options): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: typings.typedoc.distLibUtilsOptionsOptionsMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
