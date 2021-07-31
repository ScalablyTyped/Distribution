package typings.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Param
  extends StObject
     with UnnamedParam {
  
  var name: js.UndefOr[String] = js.undefined
}
object Param {
  
  @scala.inline
  def apply(): Param = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Param]
  }
  
  @scala.inline
  implicit class ParamMutableBuilder[Self <: Param] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
