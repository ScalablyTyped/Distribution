package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `updateValue` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "UpdateValueConstants")
@js.native
object UpdateValueConstants extends js.Object {
  
  @js.native
  sealed trait ValueType extends js.Object
  /** Specifies the type of entity value. */
  @js.native
  object ValueType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ValueType with String] = js.native
    
    @js.native
    sealed trait PATTERNS extends ValueType
    /* "patterns" */ @js.native
    object PATTERNS extends TopLevel[PATTERNS with String]
    
    @js.native
    sealed trait SYNONYMS extends ValueType
    /* "synonyms" */ @js.native
    object SYNONYMS extends TopLevel[SYNONYMS with String]
  }
}
