package typings.winrt.Windows.ApplicationModel

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IGetActivationFactory
import typings.winrt.Windows.UI.Core.CoreWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  trait CoreApplication extends StObject
  
  trait CoreApplicationView
    extends StObject
       with ICoreApplicationView
  object CoreApplicationView {
    
    inline def apply(coreWindow: CoreWindow, isHosted: Boolean, isMain: Boolean, onactivated: Any): CoreApplicationView = {
      val __obj = js.Dynamic.literal(coreWindow = coreWindow.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], onactivated = onactivated.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoreApplicationView]
    }
  }
  
  trait ICoreApplication extends StObject {
    
    def getCurrentView(): CoreApplicationView
    
    var id: String
    
    var onresuming: Any
    
    var onsuspending: Any
    
    var properties: IPropertySet
    
    def run(viewSource: IFrameworkViewSource): Unit
    
    def runWithActivationFactories(activationFactoryCallback: IGetActivationFactory): Unit
  }
  object ICoreApplication {
    
    inline def apply(
      getCurrentView: () => CoreApplicationView,
      id: String,
      onresuming: Any,
      onsuspending: Any,
      properties: IPropertySet,
      run: IFrameworkViewSource => Unit,
      runWithActivationFactories: IGetActivationFactory => Unit
    ): ICoreApplication = {
      val __obj = js.Dynamic.literal(getCurrentView = js.Any.fromFunction0(getCurrentView), id = id.asInstanceOf[js.Any], onresuming = onresuming.asInstanceOf[js.Any], onsuspending = onsuspending.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], run = js.Any.fromFunction1(run), runWithActivationFactories = js.Any.fromFunction1(runWithActivationFactories))
      __obj.asInstanceOf[ICoreApplication]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICoreApplication] (val x: Self) extends AnyVal {
      
      inline def setGetCurrentView(value: () => CoreApplicationView): Self = StObject.set(x, "getCurrentView", js.Any.fromFunction0(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnresuming(value: Any): Self = StObject.set(x, "onresuming", value.asInstanceOf[js.Any])
      
      inline def setOnsuspending(value: Any): Self = StObject.set(x, "onsuspending", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setRun(value: IFrameworkViewSource => Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
      
      inline def setRunWithActivationFactories(value: IGetActivationFactory => Unit): Self = StObject.set(x, "runWithActivationFactories", js.Any.fromFunction1(value))
    }
  }
  
  trait ICoreApplicationExit extends StObject {
    
    def exit(): Unit
    
    var onexiting: Any
  }
  object ICoreApplicationExit {
    
    inline def apply(exit: () => Unit, onexiting: Any): ICoreApplicationExit = {
      val __obj = js.Dynamic.literal(exit = js.Any.fromFunction0(exit), onexiting = onexiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICoreApplicationExit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICoreApplicationExit] (val x: Self) extends AnyVal {
      
      inline def setExit(value: () => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction0(value))
      
      inline def setOnexiting(value: Any): Self = StObject.set(x, "onexiting", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICoreApplicationUseCount extends StObject {
    
    def decrementApplicationUseCount(): Unit
    
    def incrementApplicationUseCount(): Unit
  }
  object ICoreApplicationUseCount {
    
    inline def apply(decrementApplicationUseCount: () => Unit, incrementApplicationUseCount: () => Unit): ICoreApplicationUseCount = {
      val __obj = js.Dynamic.literal(decrementApplicationUseCount = js.Any.fromFunction0(decrementApplicationUseCount), incrementApplicationUseCount = js.Any.fromFunction0(incrementApplicationUseCount))
      __obj.asInstanceOf[ICoreApplicationUseCount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICoreApplicationUseCount] (val x: Self) extends AnyVal {
      
      inline def setDecrementApplicationUseCount(value: () => Unit): Self = StObject.set(x, "decrementApplicationUseCount", js.Any.fromFunction0(value))
      
      inline def setIncrementApplicationUseCount(value: () => Unit): Self = StObject.set(x, "incrementApplicationUseCount", js.Any.fromFunction0(value))
    }
  }
  
  trait ICoreApplicationView extends StObject {
    
    var coreWindow: CoreWindow
    
    var isHosted: Boolean
    
    var isMain: Boolean
    
    var onactivated: Any
  }
  object ICoreApplicationView {
    
    inline def apply(coreWindow: CoreWindow, isHosted: Boolean, isMain: Boolean, onactivated: Any): ICoreApplicationView = {
      val __obj = js.Dynamic.literal(coreWindow = coreWindow.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], onactivated = onactivated.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICoreApplicationView]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICoreApplicationView] (val x: Self) extends AnyVal {
      
      inline def setCoreWindow(value: CoreWindow): Self = StObject.set(x, "coreWindow", value.asInstanceOf[js.Any])
      
      inline def setIsHosted(value: Boolean): Self = StObject.set(x, "isHosted", value.asInstanceOf[js.Any])
      
      inline def setIsMain(value: Boolean): Self = StObject.set(x, "isMain", value.asInstanceOf[js.Any])
      
      inline def setOnactivated(value: Any): Self = StObject.set(x, "onactivated", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICoreImmersiveApplication extends StObject {
    
    def createNewView(runtimeType: String, entryPoint: String): CoreApplicationView
    
    var mainView: CoreApplicationView
    
    var views: IVectorView[CoreApplicationView]
  }
  object ICoreImmersiveApplication {
    
    inline def apply(
      createNewView: (String, String) => CoreApplicationView,
      mainView: CoreApplicationView,
      views: IVectorView[CoreApplicationView]
    ): ICoreImmersiveApplication = {
      val __obj = js.Dynamic.literal(createNewView = js.Any.fromFunction2(createNewView), mainView = mainView.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICoreImmersiveApplication]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICoreImmersiveApplication] (val x: Self) extends AnyVal {
      
      inline def setCreateNewView(value: (String, String) => CoreApplicationView): Self = StObject.set(x, "createNewView", js.Any.fromFunction2(value))
      
      inline def setMainView(value: CoreApplicationView): Self = StObject.set(x, "mainView", value.asInstanceOf[js.Any])
      
      inline def setViews(value: IVectorView[CoreApplicationView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFrameworkView extends StObject {
    
    def initialize(applicationView: CoreApplicationView): Unit
    
    def load(entryPoint: String): Unit
    
    def run(): Unit
    
    def setWindow(window: CoreWindow): Unit
    
    def uninitialize(): Unit
  }
  object IFrameworkView {
    
    inline def apply(
      initialize: CoreApplicationView => Unit,
      load: String => Unit,
      run: () => Unit,
      setWindow: CoreWindow => Unit,
      uninitialize: () => Unit
    ): IFrameworkView = {
      val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize), load = js.Any.fromFunction1(load), run = js.Any.fromFunction0(run), setWindow = js.Any.fromFunction1(setWindow), uninitialize = js.Any.fromFunction0(uninitialize))
      __obj.asInstanceOf[IFrameworkView]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFrameworkView] (val x: Self) extends AnyVal {
      
      inline def setInitialize(value: CoreApplicationView => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      inline def setLoad(value: String => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      inline def setSetWindow(value: CoreWindow => Unit): Self = StObject.set(x, "setWindow", js.Any.fromFunction1(value))
      
      inline def setUninitialize(value: () => Unit): Self = StObject.set(x, "uninitialize", js.Any.fromFunction0(value))
    }
  }
  
  trait IFrameworkViewSource extends StObject {
    
    def createView(): IFrameworkView
  }
  object IFrameworkViewSource {
    
    inline def apply(createView: () => IFrameworkView): IFrameworkViewSource = {
      val __obj = js.Dynamic.literal(createView = js.Any.fromFunction0(createView))
      __obj.asInstanceOf[IFrameworkViewSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFrameworkViewSource] (val x: Self) extends AnyVal {
      
      inline def setCreateView(value: () => IFrameworkView): Self = StObject.set(x, "createView", js.Any.fromFunction0(value))
    }
  }
}
