package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import org.scalablytyped.runtime.TopLevel
import typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateValueConstants.ValueType
import typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateValueConstants.ValueType.PATTERNS
import typings.watsonDashDeveloperDashCloud.assistantV1Mod.UpdateValueConstants.ValueType.SYNONYMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `updateValue` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "UpdateValueConstants")
@js.native
object UpdateValueConstants extends js.Object {
  @js.native
  sealed trait ValueType extends js.Object
  
  /** Specifies the type of entity value. */
  @js.native
  object ValueType extends js.Object {
    @js.native
    sealed trait PATTERNS extends ValueType
    
    @js.native
    sealed trait SYNONYMS extends ValueType
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ValueType with String] = js.native
    /* "patterns" */ @js.native
    object PATTERNS extends TopLevel[PATTERNS with String]
    
    /* "synonyms" */ @js.native
    object SYNONYMS extends TopLevel[SYNONYMS with String]
    
  }
  
}

