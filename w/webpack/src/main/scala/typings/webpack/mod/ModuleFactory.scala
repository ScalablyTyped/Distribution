package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleFactory extends StObject {
  
  def create(
    data: ModuleFactoryCreateData,
    callback: js.Function2[/* arg0 */ js.UndefOr[js.Error], /* arg1 */ js.UndefOr[ModuleFactoryResult], Unit]
  ): Unit
}
object ModuleFactory {
  
  inline def apply(
    create: (ModuleFactoryCreateData, js.Function2[/* arg0 */ js.UndefOr[js.Error], /* arg1 */ js.UndefOr[ModuleFactoryResult], Unit]) => Unit
  ): ModuleFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[ModuleFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleFactory] (val x: Self) extends AnyVal {
    
    inline def setCreate(
      value: (ModuleFactoryCreateData, js.Function2[/* arg0 */ js.UndefOr[js.Error], /* arg1 */ js.UndefOr[ModuleFactoryResult], Unit]) => Unit
    ): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
  }
}
