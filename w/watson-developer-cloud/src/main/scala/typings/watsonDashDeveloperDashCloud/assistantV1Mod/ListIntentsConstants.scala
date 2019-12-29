package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listIntents` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "ListIntentsConstants")
@js.native
object ListIntentsConstants extends js.Object {
  @js.native
  sealed trait Sort extends js.Object
  
  /** The attribute by which returned intents will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    @js.native
    sealed trait INTENT extends Sort
    
    @js.native
    sealed trait UPDATED extends Sort
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    /* "intent" */ @js.native
    object INTENT extends TopLevel[INTENT with String]
    
    /* "updated" */ @js.native
    object UPDATED extends TopLevel[UPDATED with String]
    
  }
  
}

