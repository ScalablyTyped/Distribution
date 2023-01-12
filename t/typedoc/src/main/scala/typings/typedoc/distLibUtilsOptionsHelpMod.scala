package typings.typedoc

import typings.typedoc.distLibUtilsOptionsOptionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsOptionsHelpMod {
  
  @JSImport("typedoc/dist/lib/utils/options/help", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOptionsHelp(options: Options): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionsHelp")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ParameterHelp extends StObject {
    
    var helps: js.Array[String]
    
    var margin: Double
    
    var names: js.Array[String]
  }
  object ParameterHelp {
    
    inline def apply(helps: js.Array[String], margin: Double, names: js.Array[String]): ParameterHelp = {
      val __obj = js.Dynamic.literal(helps = helps.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterHelp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParameterHelp] (val x: Self) extends AnyVal {
      
      inline def setHelps(value: js.Array[String]): Self = StObject.set(x, "helps", value.asInstanceOf[js.Any])
      
      inline def setHelpsVarargs(value: String*): Self = StObject.set(x, "helps", js.Array(value*))
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    }
  }
}
