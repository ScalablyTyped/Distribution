package typings.wonderJs

import typings.wonderJs.anon.Alpha
import typings.wonderJs.distEs2015DeviceEscreensizeMod.EScreenSize
import typings.wonderJs.distEs2015StructureRectRegionMod.RectRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015CoreDataMainDataMod {
  
  @JSImport("wonder.js/dist/es2015/core/data/MainData", "MainData")
  @js.native
  open class MainData () extends StObject
  /* static members */
  object MainData {
    
    @JSImport("wonder.js/dist/es2015/core/data/MainData", "MainData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wonder.js/dist/es2015/core/data/MainData", "MainData.isTest")
    @js.native
    def isTest: Boolean = js.native
    inline def isTest_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTest")(x.asInstanceOf[js.Any])
    
    @JSImport("wonder.js/dist/es2015/core/data/MainData", "MainData.screenSize")
    @js.native
    def screenSize: EScreenSize & RectRegion = js.native
    inline def screenSize_=(x: EScreenSize & RectRegion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("screenSize")(x.asInstanceOf[js.Any])
  }
  
  trait ContextConfigData extends StObject {
    
    var options: Alpha
  }
  object ContextConfigData {
    
    inline def apply(options: Alpha): ContextConfigData = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextConfigData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextConfigData] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: Alpha): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
