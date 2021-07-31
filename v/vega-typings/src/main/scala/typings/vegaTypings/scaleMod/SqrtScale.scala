package typings.vegaTypings.scaleMod

import typings.vegaTypings.vegaTypingsStrings.sqrt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqrtScale
  extends StObject
     with NumericScale
     with Scale {
  
  @JSName("type")
  var type_SqrtScale: sqrt
}
object SqrtScale {
  
  @scala.inline
  def apply(name: String): SqrtScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sqrt")
    __obj.asInstanceOf[SqrtScale]
  }
  
  @scala.inline
  implicit class SqrtScaleMutableBuilder[Self <: SqrtScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: sqrt): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
