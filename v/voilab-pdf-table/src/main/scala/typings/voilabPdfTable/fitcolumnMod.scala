package typings.voilabPdfTable

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.voilabPdfTable.mod.VoilabPdfTable
import typings.voilabPdfTable.mod.VoilabPdfTablePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fitcolumnMod extends Shortcut {
  
  @JSImport("voilab-pdf-table/plugins/fitcolumn", JSImport.Namespace)
  @js.native
  val ^ : VoilabPdfTablePluginFitColumn[Any] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("voilab-pdf-table/plugins/fitcolumn", JSImport.Namespace)
  @js.native
  open class Class[T] protected ()
    extends StObject
       with VoilabPdfTablePlugin[T] {
    // tslint:disable-next-line:no-misused-new
    def this(conf: VoilabPdfTablePluginFitColumnConf[T]) = this()
    
    /* CompleteClass */
    override def configure(table: VoilabPdfTable[T]): Unit = js.native
  }
  
  @js.native
  trait VoilabPdfTablePluginFitColumn[T]
    extends StObject
       with // tslint:disable-next-line:no-misused-new
  Instantiable1[
          /* conf */ VoilabPdfTablePluginFitColumnConf[js.Object], 
          VoilabPdfTablePlugin[js.Object]
        ]
  
  trait VoilabPdfTablePluginFitColumnConf[T] extends StObject {
    
    var column: js.UndefOr[/* keyof T */ String] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
  }
  object VoilabPdfTablePluginFitColumnConf {
    
    inline def apply[T](): VoilabPdfTablePluginFitColumnConf[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VoilabPdfTablePluginFitColumnConf[T]]
    }
    
    extension [Self <: VoilabPdfTablePluginFitColumnConf[?], T](x: Self & VoilabPdfTablePluginFitColumnConf[T]) {
      
      inline def setColumn(value: /* keyof T */ String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    }
  }
  
  type _To = VoilabPdfTablePluginFitColumn[Any]
  
  /* This means you don't have to write `^`, but can instead just say `fitcolumnMod.foo` */
  override def _to: VoilabPdfTablePluginFitColumn[Any] = ^
}
