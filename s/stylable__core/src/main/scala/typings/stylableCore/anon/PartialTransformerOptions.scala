package typings.stylableCore.anon

import typings.stylableCore.cachedProcessFileMod.FileProcessor
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableTransformerMod.EnvMode
import typings.stylableCore.stylableTransformerMod.StylableResults
import typings.stylableCore.stylableTransformerMod.StylableTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@stylable/core.@stylable/core/cjs/stylable-transformer.TransformerOptions> */
@js.native
trait PartialTransformerOptions extends js.Object {
  
  var delimiter: js.UndefOr[String] = js.native
  
  var diagnostics: js.UndefOr[Diagnostics] = js.native
  
  var fileProcessor: js.UndefOr[FileProcessor[StylableMeta]] = js.native
  
  var keepValues: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[EnvMode] = js.native
  
  var postProcessor: js.UndefOr[typings.stylableCore.stylableTransformerMod.postProcessor[js.Object]] = js.native
  
  var replaceValueHook: js.UndefOr[typings.stylableCore.stylableTransformerMod.replaceValueHook] = js.native
  
  var requireModule: js.UndefOr[js.Function1[/* modulePath */ String, _]] = js.native
}
object PartialTransformerOptions {
  
  @scala.inline
  def apply(): PartialTransformerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTransformerOptions]
  }
  
  @scala.inline
  implicit class PartialTransformerOptionsOps[Self <: PartialTransformerOptions] (val x: Self) extends AnyVal {
    
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDiagnostics(value: Diagnostics): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagnostics: Self = this.set("diagnostics", js.undefined)
    
    @scala.inline
    def setFileProcessor(value: FileProcessor[StylableMeta]): Self = this.set("fileProcessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileProcessor: Self = this.set("fileProcessor", js.undefined)
    
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
    
    @scala.inline
    def setRequireModule(value: /* modulePath */ String => _): Self = this.set("requireModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequireModule: Self = this.set("requireModule", js.undefined)
  }
}
