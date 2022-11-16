package typings.vueRouter.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type HistoryState = {[x: number] : vue-router.vue-router.HistoryStateValue, [x: string] : vue-router.vue-router.HistoryStateValue}
}}}
to avoid circular code involving: 
- vue-router.vue-router.HistoryState
- vue-router.vue-router.HistoryStateArray
- vue-router.vue-router.HistoryStateValue
*/
trait HistoryState
  extends StObject
     with /* x */ NumberDictionary[HistoryStateValue]
     with /* x */ StringDictionary[HistoryStateValue]
object HistoryState {
  
  inline def apply(): HistoryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryState]
  }
}
