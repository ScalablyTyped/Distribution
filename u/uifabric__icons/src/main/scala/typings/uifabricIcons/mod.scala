package typings.uifabricIcons

import typings.uifabricIcons.anon.FontBaseUrl
import typings.uifabricStyling.libUtilitiesIconsMod.IIconOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@uifabric/icons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializeIcons(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeIcons")().asInstanceOf[Unit]
  inline def initializeIcons(baseUrl: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeIcons")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def initializeIcons(baseUrl: String, options: IIconOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeIcons")(baseUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initializeIcons(baseUrl: Unit, options: IIconOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeIcons")(baseUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object global {
    
    trait Window extends StObject {
      
      /**
        * The FabricConfig options can be burned on the page prior to script load to provide
        * alternative defaults at script load time. This helps avoid race conditions by calling
        * `initializeIcons` too late, or in cases where you can't control the `initializeIcons` call,
        * such as using the pre-created Fluent bundle.
        */
      var FabricConfig: js.UndefOr[FontBaseUrl] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setFabricConfig(value: FontBaseUrl): Self = StObject.set(x, "FabricConfig", value.asInstanceOf[js.Any])
        
        inline def setFabricConfigUndefined: Self = StObject.set(x, "FabricConfig", js.undefined)
      }
    }
  }
}
