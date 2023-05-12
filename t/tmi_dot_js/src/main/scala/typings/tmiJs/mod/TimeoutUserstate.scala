package typings.tmiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tmiJs.mod.Userstate because Already inherited */ trait TimeoutUserstate
  extends StObject
     with BanUserstate {
  
  var `ban-duration`: js.UndefOr[String] = js.undefined
}
object TimeoutUserstate {
  
  inline def apply(): TimeoutUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutUserstate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeoutUserstate] (val x: Self) extends AnyVal {
    
    inline def `setBan-duration`(value: String): Self = StObject.set(x, "ban-duration", value.asInstanceOf[js.Any])
    
    inline def `setBan-durationUndefined`: Self = StObject.set(x, "ban-duration", js.undefined)
  }
}
