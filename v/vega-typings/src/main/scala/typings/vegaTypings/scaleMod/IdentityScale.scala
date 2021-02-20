package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityScale
  extends BaseScale
     with Scale {
  
  var nice: js.UndefOr[Boolean | SignalRef] = js.native
  
  @JSName("type")
  var type_IdentityScale: identity = js.native
}
object IdentityScale {
  
  @scala.inline
  def apply(name: String, `type`: identity): IdentityScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityScale]
  }
  
  @scala.inline
  implicit class IdentityScaleMutableBuilder[Self <: IdentityScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNice(value: Boolean | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    @scala.inline
    def setType(value: identity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
