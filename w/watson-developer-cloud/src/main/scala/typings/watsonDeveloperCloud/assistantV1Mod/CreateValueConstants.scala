package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createValue` operation. */
object CreateValueConstants {
  
  @js.native
  sealed trait ValueType extends StObject
  /** Specifies the type of entity value. */
  @JSImport("watson-developer-cloud/assistant/v1", "CreateValueConstants.ValueType")
  @js.native
  object ValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ValueType & String] = js.native
    
    @js.native
    sealed trait PATTERNS
      extends StObject
         with ValueType
    /* "patterns" */ val PATTERNS: typings.watsonDeveloperCloud.assistantV1Mod.CreateValueConstants.ValueType.PATTERNS & String = js.native
    
    @js.native
    sealed trait SYNONYMS
      extends StObject
         with ValueType
    /* "synonyms" */ val SYNONYMS: typings.watsonDeveloperCloud.assistantV1Mod.CreateValueConstants.ValueType.SYNONYMS & String = js.native
  }
}
