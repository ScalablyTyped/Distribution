package typings.vfileStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vfile-statistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def statistics(): Statistics_ = ^.asInstanceOf[js.Dynamic].applyDynamic("statistics")().asInstanceOf[Statistics_]
  inline def statistics(value: js.Array[VFile | VFileMessage]): Statistics_ = ^.asInstanceOf[js.Dynamic].applyDynamic("statistics")(value.asInstanceOf[js.Any]).asInstanceOf[Statistics_]
  inline def statistics(value: VFile): Statistics_ = ^.asInstanceOf[js.Dynamic].applyDynamic("statistics")(value.asInstanceOf[js.Any]).asInstanceOf[Statistics_]
  inline def statistics(value: VFileMessage): Statistics_ = ^.asInstanceOf[js.Dynamic].applyDynamic("statistics")(value.asInstanceOf[js.Any]).asInstanceOf[Statistics_]
  
  trait Statistics_ extends StObject {
    
    /**
      * Fatal errors (`fatal: true`)
      */
    var fatal: Double
    
    /**
      * informational messages (`fatal: null|undefined`)
      */
    var info: Double
    
    /**
      * warning + info
      */
    var nonfatal: Double
    
    /**
      * nonfatal + fatal
      */
    var total: Double
    
    /**
      * warning errors (`fatal: false`)
      */
    var warn: Double
  }
  object Statistics_ {
    
    inline def apply(fatal: Double, info: Double, nonfatal: Double, total: Double, warn: Double): Statistics_ = {
      val __obj = js.Dynamic.literal(fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], nonfatal = nonfatal.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Statistics_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Statistics_] (val x: Self) extends AnyVal {
      
      inline def setFatal(value: Double): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setNonfatal(value: Double): Self = StObject.set(x, "nonfatal", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: Double): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
  
  type VFile = typings.vfile.mod.VFile
  
  type VFileMessage = typings.vfileMessage.mod.VFileMessage
}
