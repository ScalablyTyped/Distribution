package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.IStorageItem
import typings.winrtUwp.Windows.Storage.Search.StorageFileQueryResult
import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated because it is the app associated with a file. */
trait FileActivatedEventArgs extends StObject {
  
  /** The package family name of the app that launched your app. */
  var callerPackageFamilyName: String
  
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double
  
  /** Gets the files for which the app was activated. */
  var files: IVectorView[IStorageItem]
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the neighboring files of the files for which the app was activated. */
  var neighboringFilesQuery: StorageFileQueryResult
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  
  /** Gets the action associated with the activated file. */
  var verb: String
  
  /** Provides the object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher
}
object FileActivatedEventArgs {
  
  inline def apply(
    callerPackageFamilyName: String,
    currentlyShownApplicationViewId: Double,
    files: IVectorView[IStorageItem],
    kind: ActivationKind,
    neighboringFilesQuery: StorageFileQueryResult,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String,
    viewSwitcher: ActivationViewSwitcher
  ): FileActivatedEventArgs = {
    val __obj = js.Dynamic.literal(callerPackageFamilyName = callerPackageFamilyName.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], neighboringFilesQuery = neighboringFilesQuery.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any], viewSwitcher = viewSwitcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileActivatedEventArgs]
  }
  
  extension [Self <: FileActivatedEventArgs](x: Self) {
    
    inline def setCallerPackageFamilyName(value: String): Self = StObject.set(x, "callerPackageFamilyName", value.asInstanceOf[js.Any])
    
    inline def setCurrentlyShownApplicationViewId(value: Double): Self = StObject.set(x, "currentlyShownApplicationViewId", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: IVectorView[IStorageItem]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNeighboringFilesQuery(value: StorageFileQueryResult): Self = StObject.set(x, "neighboringFilesQuery", value.asInstanceOf[js.Any])
    
    inline def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    inline def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setViewSwitcher(value: ActivationViewSwitcher): Self = StObject.set(x, "viewSwitcher", value.asInstanceOf[js.Any])
  }
}
