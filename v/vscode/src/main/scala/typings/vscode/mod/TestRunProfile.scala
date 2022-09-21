package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRunProfile extends StObject {
  
  /**
    * If this method is present, a configuration gear will be present in the
    * UI, and this method will be invoked when it's clicked. When called,
    * you can take other editor actions, such as showing a quick pick or
    * opening a configuration file.
    */
  var configureHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Deletes the run profile.
    */
  def dispose(): Unit
  
  /**
    * Controls whether this profile is the default action that will
    * be taken when its kind is actioned. For example, if the user clicks
    * the generic "run all" button, then the default profile for
    * {@link TestRunProfileKind.Run} will be executed, although the
    * user can configure this.
    */
  var isDefault: Boolean
  
  /**
    * Configures what kind of execution this profile controls. If there
    * are no profiles for a kind, it will not be available in the UI.
    */
  val kind: TestRunProfileKind
  
  /**
    * Label shown to the user in the UI.
    *
    * Note that the label has some significance if the user requests that
    * tests be re-run in a certain way. For example, if tests were run
    * normally and the user requests to re-run them in debug mode, the editor
    * will attempt use a configuration with the same label of the `Debug`
    * kind. If there is no such configuration, the default will be used.
    */
  var label: String
  
  /**
    * Handler called to start a test run. When invoked, the function should call
    * {@link TestController.createTestRun} at least once, and all test runs
    * associated with the request should be created before the function returns
    * or the returned promise is resolved.
    *
    * @param request Request information for the test run.
    * @param cancellationToken Token that signals the used asked to abort the
    * test run. If cancellation is requested on this token, all {@link TestRun}
    * instances associated with the request will be
    * automatically cancelled as well.
    */
  def runHandler(request: TestRunRequest, token: CancellationToken): Thenable[Unit] | Unit
  
  /**
    * Associated tag for the profile. If this is set, only {@link TestItem}
    * instances with the same tag will be eligible to execute in this profile.
    */
  var tag: js.UndefOr[TestTag] = js.undefined
}
object TestRunProfile {
  
  inline def apply(
    dispose: () => Unit,
    isDefault: Boolean,
    kind: TestRunProfileKind,
    label: String,
    runHandler: (TestRunRequest, CancellationToken) => Thenable[Unit] | Unit
  ): TestRunProfile = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDefault = isDefault.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], runHandler = js.Any.fromFunction2(runHandler))
    __obj.asInstanceOf[TestRunProfile]
  }
  
  extension [Self <: TestRunProfile](x: Self) {
    
    inline def setConfigureHandler(value: () => Unit): Self = StObject.set(x, "configureHandler", js.Any.fromFunction0(value))
    
    inline def setConfigureHandlerUndefined: Self = StObject.set(x, "configureHandler", js.undefined)
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setKind(value: TestRunProfileKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRunHandler(value: (TestRunRequest, CancellationToken) => Thenable[Unit] | Unit): Self = StObject.set(x, "runHandler", js.Any.fromFunction2(value))
    
    inline def setTag(value: TestTag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
