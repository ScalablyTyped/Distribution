package typings.typedoc

import typings.typedoc.outputComponentsMod.RendererComponent
import typings.typedoc.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendPluginMod {
  
  @JSImport("typedoc/dist/lib/output/plugins/LegendPlugin", "LegendBuilder")
  @js.native
  class LegendBuilder () extends StObject {
    
    var _classesList: js.Any = js.native
    
    def build(): js.Array[js.Array[LegendItem]] = js.native
    
    var isArrayEqualToSet: js.Any = js.native
    
    def registerCssClasses(classArray: js.Array[String]): Unit = js.native
  }
  
  @JSImport("typedoc/dist/lib/output/plugins/LegendPlugin", "LegendPlugin")
  @js.native
  class LegendPlugin protected () extends RendererComponent {
    def this(owner: js.Symbol) = this()
    def this(owner: Renderer) = this()
    
    var _project: js.Any = js.native
    
    var buildLegend: js.Any = js.native
    
    var onRenderBegin: js.Any = js.native
    
    var onRendererBeginPage: js.Any = js.native
  }
  
  @js.native
  trait LegendItem extends StObject {
    
    var classes: js.Array[String] = js.native
    
    var name: String = js.native
  }
  object LegendItem {
    
    @scala.inline
    def apply(classes: js.Array[String], name: String): LegendItem = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendItem]
    }
    
    @scala.inline
    implicit class LegendItemMutableBuilder[Self <: LegendItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
