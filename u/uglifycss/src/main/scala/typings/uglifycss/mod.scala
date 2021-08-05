package typings.uglifycss

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uglifycss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Uglify one or more files
    */
  inline def processFiles(filenames: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("processFiles")(filenames.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def processFiles(filenames: js.Array[String], options: UglifyCSSOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("processFiles")(filenames.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Uglify a string
    */
  inline def processString(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("processString")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def processString(content: String, options: UglifyCSSOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("processString")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait UglifyCSSOptions extends StObject {
    
    /**
      * Preserves newlines within and around preserved comments
      */
    var cuteComments: js.UndefOr[Boolean] = js.undefined
    
    /**
      * eEpands variables; by default, @variables blocks are preserved and var(x)s are not expanded
      */
    var expandVars: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds a newline (approx.) every n characters; 0 means no newline and is the default value
      */
    var maxLineLen: js.UndefOr[Double] = js.undefined
    
    /**
      * Removes newlines within preserved comments; by default, newlines are preserved
      */
    var uglyComments: js.UndefOr[Boolean] = js.undefined
  }
  object UglifyCSSOptions {
    
    inline def apply(): UglifyCSSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UglifyCSSOptions]
    }
    
    extension [Self <: UglifyCSSOptions](x: Self) {
      
      inline def setCuteComments(value: Boolean): Self = StObject.set(x, "cuteComments", value.asInstanceOf[js.Any])
      
      inline def setCuteCommentsUndefined: Self = StObject.set(x, "cuteComments", js.undefined)
      
      inline def setExpandVars(value: Boolean): Self = StObject.set(x, "expandVars", value.asInstanceOf[js.Any])
      
      inline def setExpandVarsUndefined: Self = StObject.set(x, "expandVars", js.undefined)
      
      inline def setMaxLineLen(value: Double): Self = StObject.set(x, "maxLineLen", value.asInstanceOf[js.Any])
      
      inline def setMaxLineLenUndefined: Self = StObject.set(x, "maxLineLen", js.undefined)
      
      inline def setUglyComments(value: Boolean): Self = StObject.set(x, "uglyComments", value.asInstanceOf[js.Any])
      
      inline def setUglyCommentsUndefined: Self = StObject.set(x, "uglyComments", js.undefined)
    }
  }
}
