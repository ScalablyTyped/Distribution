package typings.svgrRollup

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  @scala.inline
  def apply(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("@svgr/rollup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var babel: Boolean
    
    var exclude: String
    
    var include: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(babel: Boolean, exclude: String): Options = {
      val __obj = js.Dynamic.literal(babel = babel.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBabel(value: Boolean): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclude(value: String): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    }
  }
}
