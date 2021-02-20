package typings.vegaTypings.scaleMod

import typings.vegaTypings.vegaTypingsStrings.sequential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequentialScale
  extends NumericScale
     with Scale {
  
  @JSName("type")
  var type_SequentialScale: sequential = js.native
}
object SequentialScale {
  
  @scala.inline
  def apply(name: String, `type`: sequential): SequentialScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequentialScale]
  }
  
  @scala.inline
  implicit class SequentialScaleMutableBuilder[Self <: SequentialScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: sequential): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
