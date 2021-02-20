package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstParty extends StObject {
  
  var all: scala.Double = js.native
  
  var firstParty: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var preview: scala.Double = js.native
  
  var `private`: scala.Double = js.native
  
  var public: scala.Double = js.native
  
  var released: scala.Double = js.native
}
object FirstParty {
  
  @scala.inline
  def apply(
    all: scala.Double,
    firstParty: scala.Double,
    none: scala.Double,
    preview: scala.Double,
    `private`: scala.Double,
    public: scala.Double,
    released: scala.Double
  ): FirstParty = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], firstParty = firstParty.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstParty]
  }
  
  @scala.inline
  implicit class FirstPartyMutableBuilder[Self <: FirstParty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstParty(value: scala.Double): Self = StObject.set(x, "firstParty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview(value: scala.Double): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: scala.Double): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic(value: scala.Double): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleased(value: scala.Double): Self = StObject.set(x, "released", value.asInstanceOf[js.Any])
  }
}
