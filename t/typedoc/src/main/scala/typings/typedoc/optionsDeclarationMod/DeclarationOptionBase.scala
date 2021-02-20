package typings.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarationOptionBase extends StObject {
  
  var help: String = js.native
  
  var name: String = js.native
  
  var scope: js.UndefOr[ParameterScope] = js.native
  
  var short: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[ParameterType] = js.native
}
object DeclarationOptionBase {
  
  @scala.inline
  def apply(help: String, name: String): DeclarationOptionBase = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationOptionBase]
  }
  
  @scala.inline
  implicit class DeclarationOptionBaseMutableBuilder[Self <: DeclarationOptionBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: ParameterScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    @scala.inline
    def setType(value: ParameterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
