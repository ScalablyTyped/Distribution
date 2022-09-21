package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery.Promise
import typings.wordpressCustomizeBrowser.customizeMod.Customize
import typings.wordpressCustomizeBrowser.settingMod.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object wp {
      
      @JSGlobal("wp")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("wp.customize")
      @js.native
      def customize: Customize = js.native
      inline def customize(arg: String): Setting[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("customize")(arg.asInstanceOf[js.Any]).asInstanceOf[Setting[Any]]
      inline def customize(args: (String | (js.Function1[/* repeated */ Setting[Any], Unit]))*): Promise[Any, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("customize")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Promise[Any, Any, Any]]
      inline def customize_=(x: Customize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customize")(x.asInstanceOf[js.Any])
    }
  }
}
