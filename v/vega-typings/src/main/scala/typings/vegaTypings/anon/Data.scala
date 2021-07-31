package typings.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* object */ js.UndefOr[js.Any], Boolean]
  ] = js.undefined
  
  var recurse: js.UndefOr[Boolean] = js.undefined
  
  var signals: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* operator */ js.UndefOr[js.Any], Boolean]
  ] = js.undefined
}
object Data {
  
  @scala.inline
  def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: (/* name */ js.UndefOr[String], /* object */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
    
    @scala.inline
    def setSignals(value: (/* name */ js.UndefOr[String], /* operator */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "signals", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
  }
}
