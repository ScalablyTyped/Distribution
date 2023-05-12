package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options that the user of the userscript
  * can set in the settings (!== overrides)
  */
trait ScriptSettings extends StObject {
  
  var check_for_updates: Boolean
  
  var comment: String | Null
  
  var compat_foreach: Boolean
  
  var compat_metadata: Boolean
  
  var compat_powerful_this: Boolean | Null
  
  var compat_prototypes: Boolean
  
  var compat_wrappedjsobject: Boolean
  
  var compatopts_for_requires: Boolean
  
  var noframes: Boolean | Null
  
  var `override`: ScriptMetadataOverrides
  
  var run_at: String
  
  var sandbox: String | Null
  
  var tab_types: String | Null
  
  var unwrap: Boolean | Null
}
object ScriptSettings {
  
  inline def apply(
    check_for_updates: Boolean,
    compat_foreach: Boolean,
    compat_metadata: Boolean,
    compat_prototypes: Boolean,
    compat_wrappedjsobject: Boolean,
    compatopts_for_requires: Boolean,
    `override`: ScriptMetadataOverrides,
    run_at: String
  ): ScriptSettings = {
    val __obj = js.Dynamic.literal(check_for_updates = check_for_updates.asInstanceOf[js.Any], compat_foreach = compat_foreach.asInstanceOf[js.Any], compat_metadata = compat_metadata.asInstanceOf[js.Any], compat_prototypes = compat_prototypes.asInstanceOf[js.Any], compat_wrappedjsobject = compat_wrappedjsobject.asInstanceOf[js.Any], compatopts_for_requires = compatopts_for_requires.asInstanceOf[js.Any], run_at = run_at.asInstanceOf[js.Any], comment = null, compat_powerful_this = null, noframes = null, sandbox = null, tab_types = null, unwrap = null)
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptSettings] (val x: Self) extends AnyVal {
    
    inline def setCheck_for_updates(value: Boolean): Self = StObject.set(x, "check_for_updates", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCompat_foreach(value: Boolean): Self = StObject.set(x, "compat_foreach", value.asInstanceOf[js.Any])
    
    inline def setCompat_metadata(value: Boolean): Self = StObject.set(x, "compat_metadata", value.asInstanceOf[js.Any])
    
    inline def setCompat_powerful_this(value: Boolean): Self = StObject.set(x, "compat_powerful_this", value.asInstanceOf[js.Any])
    
    inline def setCompat_powerful_thisNull: Self = StObject.set(x, "compat_powerful_this", null)
    
    inline def setCompat_prototypes(value: Boolean): Self = StObject.set(x, "compat_prototypes", value.asInstanceOf[js.Any])
    
    inline def setCompat_wrappedjsobject(value: Boolean): Self = StObject.set(x, "compat_wrappedjsobject", value.asInstanceOf[js.Any])
    
    inline def setCompatopts_for_requires(value: Boolean): Self = StObject.set(x, "compatopts_for_requires", value.asInstanceOf[js.Any])
    
    inline def setNoframes(value: Boolean): Self = StObject.set(x, "noframes", value.asInstanceOf[js.Any])
    
    inline def setNoframesNull: Self = StObject.set(x, "noframes", null)
    
    inline def setOverride(value: ScriptMetadataOverrides): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setRun_at(value: String): Self = StObject.set(x, "run_at", value.asInstanceOf[js.Any])
    
    inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxNull: Self = StObject.set(x, "sandbox", null)
    
    inline def setTab_types(value: String): Self = StObject.set(x, "tab_types", value.asInstanceOf[js.Any])
    
    inline def setTab_typesNull: Self = StObject.set(x, "tab_types", null)
    
    inline def setUnwrap(value: Boolean): Self = StObject.set(x, "unwrap", value.asInstanceOf[js.Any])
    
    inline def setUnwrapNull: Self = StObject.set(x, "unwrap", null)
  }
}
