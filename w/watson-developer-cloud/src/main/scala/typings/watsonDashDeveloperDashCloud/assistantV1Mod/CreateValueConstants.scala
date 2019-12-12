package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import org.scalablytyped.runtime.TopLevel
import typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateValueConstants.ValueType
import typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateValueConstants.ValueType.PATTERNS
import typings.watsonDashDeveloperDashCloud.assistantV1Mod.CreateValueConstants.ValueType.SYNONYMS
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ValueType with String] = js.native
    /* "patterns" */ @js.native
    object PATTERNS extends TopLevel[PATTERNS with String]
    
    /* "synonyms" */ @js.native
    object SYNONYMS extends TopLevel[SYNONYMS with String]
    
  }
  
}

