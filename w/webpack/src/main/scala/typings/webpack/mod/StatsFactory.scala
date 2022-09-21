package typings.webpack.mod

import typings.std.Omit
import typings.webpack.anon.ReadonlyextractHookMapSyn
import typings.webpack.webpackStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatsFactory extends StObject {
  
  @JSName("create")
  def create_type(`type`: String, data: Any, baseContext: Omit[StatsFactoryContext, `type`]): Any
  
  var hooks: ReadonlyextractHookMapSyn
}
object StatsFactory {
  
  inline def apply(create: (String, Any, Omit[StatsFactoryContext, `type`]) => Any, hooks: ReadonlyextractHookMapSyn): StatsFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), hooks = hooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsFactory]
  }
  
  extension [Self <: StatsFactory](x: Self) {
    
    inline def setCreate(value: (String, Any, Omit[StatsFactoryContext, `type`]) => Any): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
    
    inline def setHooks(value: ReadonlyextractHookMapSyn): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
  }
}
