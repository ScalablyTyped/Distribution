package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `updateValue` operation. */
object UpdateValueConstants {
  
  @js.native
  sealed trait ValueType extends StObject
  /** Specifies the type of entity value. */
  @JSImport("watson-developer-cloud/assistant/v1", "UpdateValueConstants.ValueType")
  @js.native
  object ValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ValueType & String] = js.native
    
    @js.native
    sealed trait PATTERNS
      extends StObject
         with ValueType
    /* "patterns" */ val PATTERNS: typings.watsonDeveloperCloud.mod.UpdateValueConstants.ValueType.PATTERNS & String = js.native
    
    @js.native
    sealed trait SYNONYMS
      extends StObject
         with ValueType
    /* "synonyms" */ val SYNONYMS: typings.watsonDeveloperCloud.mod.UpdateValueConstants.ValueType.SYNONYMS & String = js.native
  }
}
