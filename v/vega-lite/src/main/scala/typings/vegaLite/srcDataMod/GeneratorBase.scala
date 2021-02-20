package typings.vegaLite.srcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneratorBase extends StObject {
  
  /**
    * Provide a placeholder name and bind data at runtime.
    */
  var name: js.UndefOr[String] = js.native
}
object GeneratorBase {
  
  @scala.inline
  def apply(): GeneratorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratorBase]
  }
  
  @scala.inline
  implicit class GeneratorBaseMutableBuilder[Self <: GeneratorBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
