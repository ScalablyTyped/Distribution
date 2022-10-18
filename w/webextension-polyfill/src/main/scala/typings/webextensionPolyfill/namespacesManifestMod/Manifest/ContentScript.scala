package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import typings.webextensionPolyfill.namespacesExtensionTypesMod.ExtensionTypes.RunAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of the script or CSS to inject. Either the code or the file property must be set,
  * but both may not be set at the same time. Based on InjectDetails, but using underscore rather than camel case naming
  * conventions.
  */
trait ContentScript extends StObject {
  
  /**
    * If allFrames is <code>true</code>, implies that the JavaScript or CSS should be injected into all frames of current page.
    * By default, it's <code>false</code> and is only injected into the top frame.
    * Optional.
    */
  var all_frames: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of CSS files to inject
    * Optional.
    */
  var css: js.UndefOr[js.Array[ExtensionURL]] = js.undefined
  
  /**
    * Optional.
    */
  var exclude_globs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional.
    */
  var exclude_matches: js.UndefOr[js.Array[MatchPattern]] = js.undefined
  
  /**
    * Optional.
    */
  var include_globs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The list of JS files to inject
    * Optional.
    */
  @JSName("js")
  var js_ : js.UndefOr[js.Array[ExtensionURL]] = js.undefined
  
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has
    * access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is <code>false</code>.
    * Optional.
    */
  var match_about_blank: js.UndefOr[Boolean] = js.undefined
  
  var matches: js.Array[MatchPattern]
  
  /**
    * The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle".
    * Optional.
    */
  var run_at: js.UndefOr[RunAt] = js.undefined
}
object ContentScript {
  
  inline def apply(matches: js.Array[MatchPattern]): ContentScript = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentScript]
  }
  
  extension [Self <: ContentScript](x: Self) {
    
    inline def setAll_frames(value: Boolean): Self = StObject.set(x, "all_frames", value.asInstanceOf[js.Any])
    
    inline def setAll_framesUndefined: Self = StObject.set(x, "all_frames", js.undefined)
    
    inline def setCss(value: js.Array[ExtensionURL]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setCssVarargs(value: ExtensionURL*): Self = StObject.set(x, "css", js.Array(value*))
    
    inline def setExclude_globs(value: js.Array[String]): Self = StObject.set(x, "exclude_globs", value.asInstanceOf[js.Any])
    
    inline def setExclude_globsUndefined: Self = StObject.set(x, "exclude_globs", js.undefined)
    
    inline def setExclude_globsVarargs(value: String*): Self = StObject.set(x, "exclude_globs", js.Array(value*))
    
    inline def setExclude_matches(value: js.Array[MatchPattern]): Self = StObject.set(x, "exclude_matches", value.asInstanceOf[js.Any])
    
    inline def setExclude_matchesUndefined: Self = StObject.set(x, "exclude_matches", js.undefined)
    
    inline def setExclude_matchesVarargs(value: MatchPattern*): Self = StObject.set(x, "exclude_matches", js.Array(value*))
    
    inline def setInclude_globs(value: js.Array[String]): Self = StObject.set(x, "include_globs", value.asInstanceOf[js.Any])
    
    inline def setInclude_globsUndefined: Self = StObject.set(x, "include_globs", js.undefined)
    
    inline def setInclude_globsVarargs(value: String*): Self = StObject.set(x, "include_globs", js.Array(value*))
    
    inline def setJs_(value: js.Array[ExtensionURL]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
    
    inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
    
    inline def setJs_Varargs(value: ExtensionURL*): Self = StObject.set(x, "js", js.Array(value*))
    
    inline def setMatch_about_blank(value: Boolean): Self = StObject.set(x, "match_about_blank", value.asInstanceOf[js.Any])
    
    inline def setMatch_about_blankUndefined: Self = StObject.set(x, "match_about_blank", js.undefined)
    
    inline def setMatches(value: js.Array[MatchPattern]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: MatchPattern*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setRun_at(value: RunAt): Self = StObject.set(x, "run_at", value.asInstanceOf[js.Any])
    
    inline def setRun_atUndefined: Self = StObject.set(x, "run_at", js.undefined)
  }
}
