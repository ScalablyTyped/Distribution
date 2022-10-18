package typings.voilabPdfTable

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.voilabPdfTable.mod.VoilabPdfTable
import typings.voilabPdfTable.mod.VoilabPdfTablePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsRowshaderMod extends Shortcut {
  
  @JSImport("voilab-pdf-table/plugins/rowshader", JSImport.Namespace)
  @js.native
  val ^ : VoilabPdfTablePluginRowShader = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("voilab-pdf-table/plugins/rowshader", JSImport.Namespace)
  @js.native
  open class Class[T] protected ()
    extends StObject
       with VoilabPdfTablePlugin[T] {
    // tslint:disable-next-line:no-misused-new no-unnecessary-generics
    def this(conf: VoilabPdfTablePluginRowShaderConf) = this()
    
    /* CompleteClass */
    override def configure(table: VoilabPdfTable[T]): Unit = js.native
  }
  
  @js.native
  trait VoilabPdfTablePluginRowShader
    extends StObject
       with // tslint:disable-next-line:no-misused-new no-unnecessary-generics
  Instantiable1[/* conf */ VoilabPdfTablePluginRowShaderConf, VoilabPdfTablePlugin[js.Object]]
  
  trait VoilabPdfTablePluginRowShaderConf extends StObject {
    
    var offsetHeader: js.UndefOr[Boolean] = js.undefined
    
    var shade1: js.UndefOr[String] = js.undefined
    
    var shade2: js.UndefOr[String] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
  }
  object VoilabPdfTablePluginRowShaderConf {
    
    inline def apply(): VoilabPdfTablePluginRowShaderConf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VoilabPdfTablePluginRowShaderConf]
    }
    
    extension [Self <: VoilabPdfTablePluginRowShaderConf](x: Self) {
      
      inline def setOffsetHeader(value: Boolean): Self = StObject.set(x, "offsetHeader", value.asInstanceOf[js.Any])
      
      inline def setOffsetHeaderUndefined: Self = StObject.set(x, "offsetHeader", js.undefined)
      
      inline def setShade1(value: String): Self = StObject.set(x, "shade1", value.asInstanceOf[js.Any])
      
      inline def setShade1Undefined: Self = StObject.set(x, "shade1", js.undefined)
      
      inline def setShade2(value: String): Self = StObject.set(x, "shade2", value.asInstanceOf[js.Any])
      
      inline def setShade2Undefined: Self = StObject.set(x, "shade2", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    }
  }
  
  type _To = VoilabPdfTablePluginRowShader
  
  /* This means you don't have to write `^`, but can instead just say `pluginsRowshaderMod.foo` */
  override def _to: VoilabPdfTablePluginRowShader = ^
}
