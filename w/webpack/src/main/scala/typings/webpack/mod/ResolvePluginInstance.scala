package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Plugin instance.
  */
trait ResolvePluginInstance
  extends StObject
     with /* index */ StringDictionary[Any] {
  
  /**
  	 * The run point of the plugin, required method.
  	 */
  @JSName("apply")
  def apply(resolver: Resolver): Unit
}
object ResolvePluginInstance {
  
  inline def apply(apply: Resolver => Unit): ResolvePluginInstance = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[ResolvePluginInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvePluginInstance] (val x: Self) extends AnyVal {
    
    inline def setApply(value: Resolver => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
  }
}
