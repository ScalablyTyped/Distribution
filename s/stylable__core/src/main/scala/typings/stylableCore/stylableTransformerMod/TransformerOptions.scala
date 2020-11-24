package typings.stylableCore.stylableTransformerMod

import typings.stylableCore.anon.Args
import typings.stylableCore.cachedProcessFileMod.FileProcessor
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.stylableProcessorMod.StylableMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformerOptions extends js.Object {
  
  var delimiter: js.UndefOr[String] = js.native
  
  var diagnostics: Diagnostics = js.native
  
  var fileProcessor: FileProcessor[StylableMeta] = js.native
  
  var keepValues: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[EnvMode] = js.native
  
  var postProcessor: js.UndefOr[typings.stylableCore.stylableTransformerMod.postProcessor[js.Object]] = js.native
  
  var replaceValueHook: js.UndefOr[typings.stylableCore.stylableTransformerMod.replaceValueHook] = js.native
  
  def requireModule(modulePath: String): js.Any = js.native
}
object TransformerOptions {
  
  @scala.inline
  def apply(
    diagnostics: Diagnostics,
    fileProcessor: FileProcessor[StylableMeta],
    requireModule: String => js.Any
  ): TransformerOptions = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], fileProcessor = fileProcessor.asInstanceOf[js.Any], requireModule = js.Any.fromFunction1(requireModule))
    __obj.asInstanceOf[TransformerOptions]
  }
  
  @scala.inline
  implicit class TransformerOptionsOps[Self <: TransformerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDiagnostics(value: Diagnostics): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileProcessor(value: FileProcessor[StylableMeta]): Self = this.set("fileProcessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireModule(value: String => js.Any): Self = this.set("requireModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setKeepValues(value: Boolean): Self = this.set("keepValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepValues: Self = this.set("keepValues", js.undefined)
    
    @scala.inline
    def setMode(value: EnvMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setPostProcessor(
      value: (/* stylableResults */ StylableResults, /* transformer */ StylableTransformer) => StylableResults with js.Object
    ): Self = this.set("postProcessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePostProcessor: Self = this.set("postProcessor", js.undefined)
    
    @scala.inline
    def setReplaceValueHook(
      value: (/* value */ String, /* name */ String | Args, /* isLocal */ Boolean, /* passedThrough */ js.Array[String]) => String
    ): Self = this.set("replaceValueHook", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteReplaceValueHook: Self = this.set("replaceValueHook", js.undefined)
  }
}
