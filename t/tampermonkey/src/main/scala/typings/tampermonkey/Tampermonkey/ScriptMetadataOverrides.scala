package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Interfaces for GM_info
/**
  * The metadata that the user can override in the settings
  * for example run-at or excludes
  */
trait ScriptMetadataOverrides extends StObject {
  
  var merge_connects: Boolean
  
  var merge_excludes: Boolean
  
  var merge_includes: Boolean
  
  var merge_matches: Boolean
  
  var orig_connects: js.Array[String]
  
  var orig_excludes: js.Array[String]
  
  var orig_includes: js.Array[String]
  
  var orig_matches: js.Array[String]
  
  var orig_noframes: String | Null
  
  var orig_run_at: String | Null
  
  var use_blockers: js.Array[String]
  
  var use_connects: js.Array[String]
  
  var use_excludes: js.Array[String]
  
  var use_includes: js.Array[String]
  
  var use_matches: js.Array[String]
}
object ScriptMetadataOverrides {
  
  inline def apply(
    merge_connects: Boolean,
    merge_excludes: Boolean,
    merge_includes: Boolean,
    merge_matches: Boolean,
    orig_connects: js.Array[String],
    orig_excludes: js.Array[String],
    orig_includes: js.Array[String],
    orig_matches: js.Array[String],
    use_blockers: js.Array[String],
    use_connects: js.Array[String],
    use_excludes: js.Array[String],
    use_includes: js.Array[String],
    use_matches: js.Array[String]
  ): ScriptMetadataOverrides = {
    val __obj = js.Dynamic.literal(merge_connects = merge_connects.asInstanceOf[js.Any], merge_excludes = merge_excludes.asInstanceOf[js.Any], merge_includes = merge_includes.asInstanceOf[js.Any], merge_matches = merge_matches.asInstanceOf[js.Any], orig_connects = orig_connects.asInstanceOf[js.Any], orig_excludes = orig_excludes.asInstanceOf[js.Any], orig_includes = orig_includes.asInstanceOf[js.Any], orig_matches = orig_matches.asInstanceOf[js.Any], use_blockers = use_blockers.asInstanceOf[js.Any], use_connects = use_connects.asInstanceOf[js.Any], use_excludes = use_excludes.asInstanceOf[js.Any], use_includes = use_includes.asInstanceOf[js.Any], use_matches = use_matches.asInstanceOf[js.Any], orig_noframes = null, orig_run_at = null)
    __obj.asInstanceOf[ScriptMetadataOverrides]
  }
  
  extension [Self <: ScriptMetadataOverrides](x: Self) {
    
    inline def setMerge_connects(value: Boolean): Self = StObject.set(x, "merge_connects", value.asInstanceOf[js.Any])
    
    inline def setMerge_excludes(value: Boolean): Self = StObject.set(x, "merge_excludes", value.asInstanceOf[js.Any])
    
    inline def setMerge_includes(value: Boolean): Self = StObject.set(x, "merge_includes", value.asInstanceOf[js.Any])
    
    inline def setMerge_matches(value: Boolean): Self = StObject.set(x, "merge_matches", value.asInstanceOf[js.Any])
    
    inline def setOrig_connects(value: js.Array[String]): Self = StObject.set(x, "orig_connects", value.asInstanceOf[js.Any])
    
    inline def setOrig_connectsVarargs(value: String*): Self = StObject.set(x, "orig_connects", js.Array(value*))
    
    inline def setOrig_excludes(value: js.Array[String]): Self = StObject.set(x, "orig_excludes", value.asInstanceOf[js.Any])
    
    inline def setOrig_excludesVarargs(value: String*): Self = StObject.set(x, "orig_excludes", js.Array(value*))
    
    inline def setOrig_includes(value: js.Array[String]): Self = StObject.set(x, "orig_includes", value.asInstanceOf[js.Any])
    
    inline def setOrig_includesVarargs(value: String*): Self = StObject.set(x, "orig_includes", js.Array(value*))
    
    inline def setOrig_matches(value: js.Array[String]): Self = StObject.set(x, "orig_matches", value.asInstanceOf[js.Any])
    
    inline def setOrig_matchesVarargs(value: String*): Self = StObject.set(x, "orig_matches", js.Array(value*))
    
    inline def setOrig_noframes(value: String): Self = StObject.set(x, "orig_noframes", value.asInstanceOf[js.Any])
    
    inline def setOrig_noframesNull: Self = StObject.set(x, "orig_noframes", null)
    
    inline def setOrig_run_at(value: String): Self = StObject.set(x, "orig_run_at", value.asInstanceOf[js.Any])
    
    inline def setOrig_run_atNull: Self = StObject.set(x, "orig_run_at", null)
    
    inline def setUse_blockers(value: js.Array[String]): Self = StObject.set(x, "use_blockers", value.asInstanceOf[js.Any])
    
    inline def setUse_blockersVarargs(value: String*): Self = StObject.set(x, "use_blockers", js.Array(value*))
    
    inline def setUse_connects(value: js.Array[String]): Self = StObject.set(x, "use_connects", value.asInstanceOf[js.Any])
    
    inline def setUse_connectsVarargs(value: String*): Self = StObject.set(x, "use_connects", js.Array(value*))
    
    inline def setUse_excludes(value: js.Array[String]): Self = StObject.set(x, "use_excludes", value.asInstanceOf[js.Any])
    
    inline def setUse_excludesVarargs(value: String*): Self = StObject.set(x, "use_excludes", js.Array(value*))
    
    inline def setUse_includes(value: js.Array[String]): Self = StObject.set(x, "use_includes", value.asInstanceOf[js.Any])
    
    inline def setUse_includesVarargs(value: String*): Self = StObject.set(x, "use_includes", js.Array(value*))
    
    inline def setUse_matches(value: js.Array[String]): Self = StObject.set(x, "use_matches", value.asInstanceOf[js.Any])
    
    inline def setUse_matchesVarargs(value: String*): Self = StObject.set(x, "use_matches", js.Array(value*))
  }
}
