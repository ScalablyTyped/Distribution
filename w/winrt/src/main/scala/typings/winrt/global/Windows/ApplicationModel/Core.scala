package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.ApplicationModel.Core.IFrameworkViewSource
import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IGetActivationFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.ApplicationModel.Core")
@js.native
object Core extends js.Object {
  
  @js.native
  class CoreApplication ()
    extends typings.winrt.Windows.ApplicationModel.Core.CoreApplication
  /* static members */
  @js.native
  object CoreApplication extends js.Object {
    
    def createNewView(runtimeType: String, entryPoint: String): typings.winrt.Windows.ApplicationModel.Core.CoreApplicationView = js.native
    
    def decrementApplicationUseCount(): Unit = js.native
    
    def exit(): Unit = js.native
    
    def getCurrentView(): typings.winrt.Windows.ApplicationModel.Core.CoreApplicationView = js.native
    
    var id: String = js.native
    
    def incrementApplicationUseCount(): Unit = js.native
    
    var mainView: typings.winrt.Windows.ApplicationModel.Core.CoreApplicationView = js.native
    
    var onexiting: js.Any = js.native
    
    var onresuming: js.Any = js.native
    
    var onsuspending: js.Any = js.native
    
    var properties: IPropertySet = js.native
    
    def run(viewSource: IFrameworkViewSource): Unit = js.native
    
    def runWithActivationFactories(activationFactoryCallback: IGetActivationFactory): Unit = js.native
    
    var views: IVectorView[typings.winrt.Windows.ApplicationModel.Core.CoreApplicationView] = js.native
  }
  
  @js.native
  class CoreApplicationView ()
    extends typings.winrt.Windows.ApplicationModel.Core.CoreApplicationView
}
