package typings.watsonDeveloperCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createValue` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.CreateValueConstants")
@js.native
object CreateValueConstants extends js.Object {
  
  /** Specifies the type of entity value. */
  @js.native
  object ValueType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.mod.CreateValueConstants.ValueType with String] = js.native
    
    /* "patterns" */ val PATTERNS: typings.watsonDeveloperCloud.mod.CreateValueConstants.ValueType.PATTERNS with String = js.native
    
    /* "synonyms" */ val SYNONYMS: typings.watsonDeveloperCloud.mod.CreateValueConstants.ValueType.SYNONYMS with String = js.native
  }
}
