package typings.yargs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictargName
  extends StObject
     with /** All remaining options */
/* argName */ StringDictionary[Any] {
  
  /** The script name or node command */
  @JSName("$0")
  var $0: java.lang.String
  
  /** Non-option arguments */
  @JSName("_")
  var _underscore: js.Array[java.lang.String | Double]
}
object DictargName {
  
  inline def apply($0: java.lang.String, _underscore: js.Array[java.lang.String | Double]): DictargName = {
    val __obj = js.Dynamic.literal($0 = $0.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictargName]
  }
  
  extension [Self <: DictargName](x: Self) {
    
    inline def set$0(value: java.lang.String): Self = StObject.set(x, "$0", value.asInstanceOf[js.Any])
    
    inline def set_underscore(value: js.Array[java.lang.String | Double]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
    
    inline def set_underscoreVarargs(value: (java.lang.String | Double)*): Self = StObject.set(x, "_", js.Array(value*))
  }
}
