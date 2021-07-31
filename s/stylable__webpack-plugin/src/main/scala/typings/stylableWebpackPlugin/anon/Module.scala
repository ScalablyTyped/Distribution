package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.typesMod.StylableModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module extends StObject {
  
  var module: StylableModule
}
object Module {
  
  @scala.inline
  def apply(module: StylableModule): Module = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  @scala.inline
  implicit class ModuleMutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModule(value: StylableModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
  }
}
