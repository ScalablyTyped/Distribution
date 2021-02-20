package typings.uglifycss

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Uglify one or more files
    */
  @JSImport("uglifycss", "processFiles")
  @js.native
  def processFiles(filenames: js.Array[String]): String = js.native
  @JSImport("uglifycss", "processFiles")
  @js.native
  def processFiles(filenames: js.Array[String], options: UglifyCSSOptions): String = js.native
  
  /**
    * Uglify a string
    */
  @JSImport("uglifycss", "processString")
  @js.native
  def processString(content: String): String = js.native
  @JSImport("uglifycss", "processString")
  @js.native
  def processString(content: String, options: UglifyCSSOptions): String = js.native
  
  @js.native
  trait UglifyCSSOptions extends StObject {
    
    /**
      * Preserves newlines within and around preserved comments
      */
    var cuteComments: js.UndefOr[Boolean] = js.native
    
    /**
      * eEpands variables; by default, @variables blocks are preserved and var(x)s are not expanded
      */
    var expandVars: js.UndefOr[Boolean] = js.native
    
    /**
      * Adds a newline (approx.) every n characters; 0 means no newline and is the default value
      */
    var maxLineLen: js.UndefOr[Double] = js.native
    
    /**
      * Removes newlines within preserved comments; by default, newlines are preserved
      */
    var uglyComments: js.UndefOr[Boolean] = js.native
  }
  object UglifyCSSOptions {
    
    @scala.inline
    def apply(): UglifyCSSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UglifyCSSOptions]
    }
    
    @scala.inline
    implicit class UglifyCSSOptionsMutableBuilder[Self <: UglifyCSSOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCuteComments(value: Boolean): Self = StObject.set(x, "cuteComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCuteCommentsUndefined: Self = StObject.set(x, "cuteComments", js.undefined)
      
      @scala.inline
      def setExpandVars(value: Boolean): Self = StObject.set(x, "expandVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandVarsUndefined: Self = StObject.set(x, "expandVars", js.undefined)
      
      @scala.inline
      def setMaxLineLen(value: Double): Self = StObject.set(x, "maxLineLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLineLenUndefined: Self = StObject.set(x, "maxLineLen", js.undefined)
      
      @scala.inline
      def setUglyComments(value: Boolean): Self = StObject.set(x, "uglyComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUglyCommentsUndefined: Self = StObject.set(x, "uglyComments", js.undefined)
    }
  }
}
