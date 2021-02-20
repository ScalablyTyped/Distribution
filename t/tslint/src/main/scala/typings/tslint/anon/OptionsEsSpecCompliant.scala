package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsEsSpecCompliant extends StObject {
  
  var options: EsSpecCompliant = js.native
}
object OptionsEsSpecCompliant {
  
  @scala.inline
  def apply(options: EsSpecCompliant): OptionsEsSpecCompliant = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsEsSpecCompliant]
  }
  
  @scala.inline
  implicit class OptionsEsSpecCompliantMutableBuilder[Self <: OptionsEsSpecCompliant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: EsSpecCompliant): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
