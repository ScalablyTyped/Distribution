package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobPartial extends StObject {
  
  /**
    * Determines whether or not symlinks are followed when generating the
    * precache manifest. For more information, see the definition of `follow` in
    * the `glob` [documentation](https://github.com/isaacs/node-glob#options).
    * @default true
    */
  var globFollow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A set of patterns matching files to always exclude when generating the
    * precache manifest. For more information, see the definition of `ignore` in
    * the `glob` [documentation](https://github.com/isaacs/node-glob#options).
    * @default ["**\/node_modules\/ **\/ *"]
    */
  var globIgnores: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Files matching any of these patterns will be included in the precache
    * manifest. For more information, see the
    * [`glob` primer](https://github.com/isaacs/node-glob#glob-primer).
    * @default ["**\/ *.{js,css,html}"]
    */
  var globPatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If true, an error reading a directory when generating a precache manifest
    * will cause the build to fail. If false, the problematic directory will be
    * skipped. For more information, see the definition of `strict` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    * @default true
    */
  var globStrict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If a URL is rendered based on some server-side logic, its contents may
    * depend on multiple files or on some other unique string value. The keys in
    * this object are server-rendered URLs. If the values are an array of
    * strings, they will be interpreted as `glob` patterns, and the contents of
    * any files matching the patterns will be used to uniquely version the URL.
    * If used with a single string, it will be interpreted as unique versioning
    * information that you've generated for a given URL.
    */
  var templatedURLs: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
}
object GlobPartial {
  
  inline def apply(): GlobPartial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobPartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobPartial] (val x: Self) extends AnyVal {
    
    inline def setGlobFollow(value: Boolean): Self = StObject.set(x, "globFollow", value.asInstanceOf[js.Any])
    
    inline def setGlobFollowUndefined: Self = StObject.set(x, "globFollow", js.undefined)
    
    inline def setGlobIgnores(value: js.Array[String]): Self = StObject.set(x, "globIgnores", value.asInstanceOf[js.Any])
    
    inline def setGlobIgnoresUndefined: Self = StObject.set(x, "globIgnores", js.undefined)
    
    inline def setGlobIgnoresVarargs(value: String*): Self = StObject.set(x, "globIgnores", js.Array(value*))
    
    inline def setGlobPatterns(value: js.Array[String]): Self = StObject.set(x, "globPatterns", value.asInstanceOf[js.Any])
    
    inline def setGlobPatternsUndefined: Self = StObject.set(x, "globPatterns", js.undefined)
    
    inline def setGlobPatternsVarargs(value: String*): Self = StObject.set(x, "globPatterns", js.Array(value*))
    
    inline def setGlobStrict(value: Boolean): Self = StObject.set(x, "globStrict", value.asInstanceOf[js.Any])
    
    inline def setGlobStrictUndefined: Self = StObject.set(x, "globStrict", js.undefined)
    
    inline def setTemplatedURLs(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "templatedURLs", value.asInstanceOf[js.Any])
    
    inline def setTemplatedURLsUndefined: Self = StObject.set(x, "templatedURLs", js.undefined)
  }
}
