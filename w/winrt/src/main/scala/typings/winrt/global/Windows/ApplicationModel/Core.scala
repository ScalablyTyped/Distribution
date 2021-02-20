package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.ApplicationModel.Core.IFrameworkViewSource
import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IGetActivationFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  @JSGlobal("Windows.ApplicationModel.Core.CoreApplication")
  @js.native
  class CoreApplication ()
    extends typings.winrt.Windows.ApplicationModel.Core.CoreApplication
  /* static members */
  object CoreApplication {
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.createNewView")
    @js.native
    def createNewView(runtimeType: String, entryPoint: String): typings.winrt.Windows.ApplicationModel.Core.CoreApplicationView = js.native
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.decrementApplicationUseCount")
    @js.native
    def decrementApplicationUseCount(): Unit = js.native
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.exit")
    @js.native
    def exit(): Unit = js.native
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.getCurrentView")
    @js.native
    def getCurrentView(): typings.winrt.Windows.ApplicationModel.Core.CoreApplicationView = js.native
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.incrementApplicationUseCount")
    @js.native
    def incrementApplicationUseCount(): Unit = js.native
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.mainView")
    @js.native
    def mainView: typings.winrt.Windows.ApplicationModel.Core.CoreApplicationView = js.native
    @scala.inline
    def mainView_=(x: typings.winrt.Windows.ApplicationModel.Core.CoreApplicationView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainView")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.onexiting")
    @js.native
    def onexiting: js.Any = js.native
    @scala.inline
    def onexiting_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onexiting")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.onresuming")
    @js.native
    def onresuming: js.Any = js.native
    @scala.inline
    def onresuming_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onresuming")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.onsuspending")
    @js.native
    def onsuspending: js.Any = js.native
    @scala.inline
    def onsuspending_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onsuspending")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.properties")
    @js.native
    def properties: IPropertySet = js.native
    @scala.inline
    def properties_=(x: IPropertySet): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.run")
    @js.native
    def run(viewSource: IFrameworkViewSource): Unit = js.native
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.runWithActivationFactories")
    @js.native
    def runWithActivationFactories(activationFactoryCallback: IGetActivationFactory): Unit = js.native
    
    @JSGlobal("Windows.ApplicationModel.Core.CoreApplication.views")
    @js.native
    def views: IVectorView[typings.winrt.Windows.ApplicationModel.Core.CoreApplicationView] = js.native
    @scala.inline
    def views_=(x: IVectorView[typings.winrt.Windows.ApplicationModel.Core.CoreApplicationView]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("views")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.ApplicationModel.Core.CoreApplicationView")
  @js.native
  class CoreApplicationView ()
    extends typings.winrt.Windows.ApplicationModel.Core.CoreApplicationView
}
