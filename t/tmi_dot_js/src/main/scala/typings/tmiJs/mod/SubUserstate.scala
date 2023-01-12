package typings.tmiJs.mod

import typings.tmiJs.tmiJsStrings.resub
import typings.tmiJs.tmiJsStrings.sub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubUserstate
  extends StObject
     with CommonSubUserstate
     with Userstate {
  
  var `message-type`: js.UndefOr[sub | resub] = js.undefined
  
  var `msg-param-cumulative-months`: js.UndefOr[String | Boolean] = js.undefined
  
  var `msg-param-should-share-streak`: js.UndefOr[Boolean] = js.undefined
  
  var `msg-param-streak-months`: js.UndefOr[String | Boolean] = js.undefined
}
object SubUserstate {
  
  inline def apply(): SubUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubUserstate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubUserstate] (val x: Self) extends AnyVal {
    
    inline def `setMessage-type`(value: sub | resub): Self = StObject.set(x, "message-type", value.asInstanceOf[js.Any])
    
    inline def `setMessage-typeUndefined`: Self = StObject.set(x, "message-type", js.undefined)
    
    inline def `setMsg-param-cumulative-months`(value: String | Boolean): Self = StObject.set(x, "msg-param-cumulative-months", value.asInstanceOf[js.Any])
    
    inline def `setMsg-param-cumulative-monthsUndefined`: Self = StObject.set(x, "msg-param-cumulative-months", js.undefined)
    
    inline def `setMsg-param-should-share-streak`(value: Boolean): Self = StObject.set(x, "msg-param-should-share-streak", value.asInstanceOf[js.Any])
    
    inline def `setMsg-param-should-share-streakUndefined`: Self = StObject.set(x, "msg-param-should-share-streak", js.undefined)
    
    inline def `setMsg-param-streak-months`(value: String | Boolean): Self = StObject.set(x, "msg-param-streak-months", value.asInstanceOf[js.Any])
    
    inline def `setMsg-param-streak-monthsUndefined`: Self = StObject.set(x, "msg-param-streak-months", js.undefined)
  }
}
