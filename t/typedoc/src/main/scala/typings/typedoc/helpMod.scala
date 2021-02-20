package typings.typedoc

import typings.typedoc.optionsOptionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpMod {
  
  @JSImport("typedoc/dist/lib/utils/options/help", "getOptionsHelp")
  @js.native
  def getOptionsHelp(options: Options): String = js.native
  
  @js.native
  trait ParameterHelp extends StObject {
    
    var helps: js.Array[String] = js.native
    
    var margin: Double = js.native
    
    var names: js.Array[String] = js.native
  }
  object ParameterHelp {
    
    @scala.inline
    def apply(helps: js.Array[String], margin: Double, names: js.Array[String]): ParameterHelp = {
      val __obj = js.Dynamic.literal(helps = helps.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterHelp]
    }
    
    @scala.inline
    implicit class ParameterHelpMutableBuilder[Self <: ParameterHelp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHelps(value: js.Array[String]): Self = StObject.set(x, "helps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpsVarargs(value: String*): Self = StObject.set(x, "helps", js.Array(value :_*))
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    }
  }
}
