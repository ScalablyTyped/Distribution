package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datum extends StObject {
  
  var datum: js.UndefOr[String] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[String] = js.native
}
object Datum {
  
  @scala.inline
  def apply(): Datum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datum]
  }
  
  @scala.inline
  implicit class DatumMutableBuilder[Self <: Datum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatum(value: String): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
