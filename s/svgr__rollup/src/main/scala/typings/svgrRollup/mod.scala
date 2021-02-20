package typings.svgrRollup

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@svgr/rollup", JSImport.Namespace)
  @js.native
  def apply(): Plugin = js.native
  @JSImport("@svgr/rollup", JSImport.Namespace)
  @js.native
  def apply(options: Options): Plugin = js.native
  
  @js.native
  trait Options extends StObject {
    
    var babel: Boolean = js.native
    
    var exclude: String = js.native
    
    var include: js.UndefOr[String] = js.native
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
