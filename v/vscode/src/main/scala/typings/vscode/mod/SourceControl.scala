package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceControl extends StObject {
  
  /**
    * Optional accept input command.
    *
    * This command will be invoked when the user accepts the value
    * in the Source Control input.
    */
  var acceptInputCommand: js.UndefOr[Command] = js.undefined
  
  /**
    * Optional commit template string.
    *
    * The Source Control viewlet will populate the Source Control
    * input with this value when appropriate.
    */
  var commitTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * The UI-visible count of [resource states](#SourceControlResourceState) of
    * this source control.
    *
    * Equals to the total number of [resource state](#SourceControlResourceState)
    * of this source control, if undefined.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Create a new [resource group](#SourceControlResourceGroup).
    */
  def createResourceGroup(id: String, label: String): SourceControlResourceGroup
  
  /**
    * Dispose this source control.
    */
  def dispose(): Unit
  
  /**
    * The id of this source control.
    */
  val id: String
  
  /**
    * The [input box](#SourceControlInputBox) for this source control.
    */
  val inputBox: SourceControlInputBox
  
  /**
    * The human-readable label of this source control.
    */
  val label: String
  
  /**
    * An optional [quick diff provider](#QuickDiffProvider).
    */
  var quickDiffProvider: js.UndefOr[QuickDiffProvider] = js.undefined
  
  /**
    * The (optional) Uri of the root of this source control.
    */
  val rootUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * Optional status bar commands.
    *
    * These commands will be displayed in the editor's status bar.
    */
  var statusBarCommands: js.UndefOr[js.Array[Command]] = js.undefined
}
object SourceControl {
  
  @scala.inline
  def apply(
    createResourceGroup: (String, String) => SourceControlResourceGroup,
    dispose: () => Unit,
    id: String,
    inputBox: SourceControlInputBox,
    label: String
  ): SourceControl = {
    val __obj = js.Dynamic.literal(createResourceGroup = js.Any.fromFunction2(createResourceGroup), dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], inputBox = inputBox.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControl]
  }
  
  @scala.inline
  implicit class SourceControlMutableBuilder[Self <: SourceControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptInputCommand(value: Command): Self = StObject.set(x, "acceptInputCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptInputCommandUndefined: Self = StObject.set(x, "acceptInputCommand", js.undefined)
    
    @scala.inline
    def setCommitTemplate(value: String): Self = StObject.set(x, "commitTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitTemplateUndefined: Self = StObject.set(x, "commitTemplate", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setCreateResourceGroup(value: (String, String) => SourceControlResourceGroup): Self = StObject.set(x, "createResourceGroup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputBox(value: SourceControlInputBox): Self = StObject.set(x, "inputBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickDiffProvider(value: QuickDiffProvider): Self = StObject.set(x, "quickDiffProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickDiffProviderUndefined: Self = StObject.set(x, "quickDiffProvider", js.undefined)
    
    @scala.inline
    def setRootUri(value: Uri): Self = StObject.set(x, "rootUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUriUndefined: Self = StObject.set(x, "rootUri", js.undefined)
    
    @scala.inline
    def setStatusBarCommands(value: js.Array[Command]): Self = StObject.set(x, "statusBarCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarCommandsUndefined: Self = StObject.set(x, "statusBarCommands", js.undefined)
    
    @scala.inline
    def setStatusBarCommandsVarargs(value: Command*): Self = StObject.set(x, "statusBarCommands", js.Array(value :_*))
  }
}
