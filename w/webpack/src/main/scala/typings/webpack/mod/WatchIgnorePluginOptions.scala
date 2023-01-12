package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchIgnorePluginOptions extends StObject {
  
  /**
  	 * A list of RegExps or absolute paths to directories or files that should be ignored.
  	 */
  var paths: js.Array[String | js.RegExp]
}
object WatchIgnorePluginOptions {
  
  inline def apply(paths: js.Array[String | js.RegExp]): WatchIgnorePluginOptions = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchIgnorePluginOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchIgnorePluginOptions] (val x: Self) extends AnyVal {
    
    inline def setPaths(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
