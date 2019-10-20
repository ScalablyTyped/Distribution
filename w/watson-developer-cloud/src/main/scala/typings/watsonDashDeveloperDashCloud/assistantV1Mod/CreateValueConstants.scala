package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateValueConstants.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `createValue` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "CreateValueConstants")
@js.native
object CreateValueConstants extends js.Object {
  @js.native
  sealed trait ValueType extends js.Object
  
  /** Specifies the type of entity value. */
  @js.native
  object ValueType extends js.Object {
    @js.native
    sealed trait PATTERNS extends ValueType
    
    @js.native
    sealed trait SYNONYMS extends ValueType
    
    /* "patterns" */ val PATTERNS: typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateValueConstants.ValueType.PATTERNS with String = js.native
    /* "synonyms" */ val SYNONYMS: typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateValueConstants.ValueType.SYNONYMS with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ValueType with String] = js.native
  }
  
}

