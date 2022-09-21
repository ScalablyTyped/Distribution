package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestController extends StObject {
  
  /**
    * Creates a profile used for running tests. Extensions must create
    * at least one profile in order for tests to be run.
    * @param label A human-readable label for this profile.
    * @param kind Configures what kind of execution this profile manages.
    * @param runHandler Function called to start a test run.
    * @param isDefault Whether this is the default action for its kind.
    * @param tag Profile test tag.
    * @returns An instance of a {@link TestRunProfile}, which is automatically
    * associated with this controller.
    */
  def createRunProfile(
    label: String,
    kind: TestRunProfileKind,
    runHandler: js.Function2[/* request */ TestRunRequest, /* token */ CancellationToken, Thenable[Unit] | Unit]
  ): TestRunProfile = js.native
  def createRunProfile(
    label: String,
    kind: TestRunProfileKind,
    runHandler: js.Function2[/* request */ TestRunRequest, /* token */ CancellationToken, Thenable[Unit] | Unit],
    isDefault: Boolean
  ): TestRunProfile = js.native
  def createRunProfile(
    label: String,
    kind: TestRunProfileKind,
    runHandler: js.Function2[/* request */ TestRunRequest, /* token */ CancellationToken, Thenable[Unit] | Unit],
    isDefault: Boolean,
    tag: TestTag
  ): TestRunProfile = js.native
  def createRunProfile(
    label: String,
    kind: TestRunProfileKind,
    runHandler: js.Function2[/* request */ TestRunRequest, /* token */ CancellationToken, Thenable[Unit] | Unit],
    isDefault: Unit,
    tag: TestTag
  ): TestRunProfile = js.native
  
  /**
    * Creates a new managed {@link TestItem} instance. It can be added into
    * the {@link TestItem.children} of an existing item, or into the
    * {@link TestController.items}.
    *
    * @param id Identifier for the TestItem. The test item's ID must be unique
    * in the {@link TestItemCollection} it's added to.
    * @param label Human-readable label of the test item.
    * @param uri URI this TestItem is associated with. May be a file or directory.
    */
  def createTestItem(id: String, label: String): TestItem = js.native
  def createTestItem(id: String, label: String, uri: Uri): TestItem = js.native
  
  /**
    * Creates a {@link TestRun}. This should be called by the
    * {@link TestRunProfile} when a request is made to execute tests, and may
    * also be called if a test run is detected externally. Once created, tests
    * that are included in the request will be moved into the queued state.
    *
    * All runs created using the same `request` instance will be grouped
    * together. This is useful if, for example, a single suite of tests is
    * run on multiple platforms.
    *
    * @param request Test run request. Only tests inside the `include` may be
    * modified, and tests in its `exclude` are ignored.
    * @param name The human-readable name of the run. This can be used to
    * disambiguate multiple sets of results in a test run. It is useful if
    * tests are run across multiple platforms, for example.
    * @param persist Whether the results created by the run should be
    * persisted in the editor. This may be false if the results are coming from
    * a file already saved externally, such as a coverage information file.
    * @returns An instance of the {@link TestRun}. It will be considered "running"
    * from the moment this method is invoked until {@link TestRun.end} is called.
    */
  def createTestRun(request: TestRunRequest): TestRun = js.native
  def createTestRun(request: TestRunRequest, name: String): TestRun = js.native
  def createTestRun(request: TestRunRequest, name: String, persist: Boolean): TestRun = js.native
  def createTestRun(request: TestRunRequest, name: Unit, persist: Boolean): TestRun = js.native
  
  /**
    * Unregisters the test controller, disposing of its associated tests
    * and unpersisted results.
    */
  def dispose(): Unit = js.native
  
  /**
    * The id of the controller passed in {@link vscode.tests.createTestController}.
    * This must be globally unique.
    */
  val id: String = js.native
  
  /**
    * A collection of "top-level" {@link TestItem} instances, which can in
    * turn have their own {@link TestItem.children children} to form the
    * "test tree."
    *
    * The extension controls when to add tests. For example, extensions should
    * add tests for a file when {@link vscode.workspace.onDidOpenTextDocument}
    * fires in order for decorations for tests within a file to be visible.
    *
    * However, the editor may sometimes explicitly request children using the
    * {@link resolveHandler} See the documentation on that method for more details.
    */
  val items: TestItemCollection = js.native
  
  /**
    * Human-readable label for the test controller.
    */
  var label: String = js.native
  
  /**
    * If this method is present, a refresh button will be present in the
    * UI, and this method will be invoked when it's clicked. When called,
    * the extension should scan the workspace for any new, changed, or
    * removed tests.
    *
    * It's recommended that extensions try to update tests in realtime, using
    * a {@link FileSystemWatcher} for example, and use this method as a fallback.
    *
    * @returns A thenable that resolves when tests have been refreshed.
    */
  var refreshHandler: js.UndefOr[js.Function1[/* token */ CancellationToken, Thenable[Unit] | Unit]] = js.native
  
  /**
    * A function provided by the extension that the editor may call to request
    * children of a test item, if the {@link TestItem.canResolveChildren} is
    * `true`. When called, the item should discover children and call
    * {@link vscode.tests.createTestItem} as children are discovered.
    *
    * Generally the extension manages the lifecycle of test items, but under
    * certain conditions the editor may request the children of a specific
    * item to be loaded. For example, if the user requests to re-run tests
    * after reloading the editor, the editor may need to call this method
    * to resolve the previously-run tests.
    *
    * The item in the explorer will automatically be marked as "busy" until
    * the function returns or the returned thenable resolves.
    *
    * @param item An unresolved test item for which children are being
    * requested, or `undefined` to resolve the controller's initial {@link TestController.items items}.
    */
  var resolveHandler: js.UndefOr[js.Function1[/* item */ js.UndefOr[TestItem], Thenable[Unit] | Unit]] = js.native
}
