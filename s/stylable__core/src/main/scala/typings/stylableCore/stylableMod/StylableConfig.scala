package typings.stylableCore.stylableMod

import typings.postcss.mod.ProcessOptions
import typings.postcss.mod.Root_
import typings.stylableCore.anon.Dictkey
import typings.stylableCore.anon.OmitTimedCacheOptionscrea
import typings.stylableCore.cachedProcessFileMod.MinimalFS
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.parserMod.CssParser
import typings.stylableCore.stylableCoreStrings.development
import typings.stylableCore.stylableCoreStrings.production
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableTransformerMod.TransformHooks
import typings.stylableCore.typesMod.IStylableOptimizer
import typings.stylableCore.typesMod.ModuleResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylableConfig extends js.Object {
  
  var cssParser: js.UndefOr[CssParser] = js.native
  
  var delimiter: js.UndefOr[String] = js.native
  
  var diagnostics: js.UndefOr[Diagnostics] = js.native
  
  var fileSystem: MinimalFS = js.native
  
  var hooks: js.UndefOr[TransformHooks] = js.native
  
  var mode: js.UndefOr[production | development] = js.native
  
  var onProcess: js.UndefOr[js.Function2[/* meta */ StylableMeta, /* path */ String, StylableMeta]] = js.native
  
  var optimizer: js.UndefOr[IStylableOptimizer] = js.native
  
  var projectRoot: String = js.native
  
  var requireModule: js.UndefOr[js.Function1[/* path */ String, _]] = js.native
  
  var resolveModule: js.UndefOr[ModuleResolver] = js.native
  
  var resolveNamespace: js.UndefOr[js.Function2[/* namespace */ String, /* source */ String, String]] = js.native
  
  var resolveOptions: js.UndefOr[Dictkey] = js.native
  
  var timedCacheOptions: js.UndefOr[OmitTimedCacheOptionscrea] = js.native
}
object StylableConfig {
  
  @scala.inline
  def apply(fileSystem: MinimalFS, projectRoot: String): StylableConfig = {
    val __obj = js.Dynamic.literal(fileSystem = fileSystem.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableConfig]
  }
  
  @scala.inline
  implicit class StylableConfigOps[Self <: StylableConfig] (val x: Self) extends AnyVal {
    
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
    def setFileSystem(value: MinimalFS): Self = this.set("fileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectRoot(value: String): Self = this.set("projectRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssParser(value: (/* css */ String, /* options */ js.UndefOr[ProcessOptions]) => Root_): Self = this.set("cssParser", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCssParser: Self = this.set("cssParser", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDiagnostics(value: Diagnostics): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagnostics: Self = this.set("diagnostics", js.undefined)
    
    @scala.inline
    def setHooks(value: TransformHooks): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    
    @scala.inline
    def setMode(value: production | development): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnProcess(value: (/* meta */ StylableMeta, /* path */ String) => StylableMeta): Self = this.set("onProcess", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnProcess: Self = this.set("onProcess", js.undefined)
    
    @scala.inline
    def setOptimizer(value: IStylableOptimizer): Self = this.set("optimizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizer: Self = this.set("optimizer", js.undefined)
    
    @scala.inline
    def setRequireModule(value: /* path */ String => _): Self = this.set("requireModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequireModule: Self = this.set("requireModule", js.undefined)
    
    @scala.inline
    def setResolveModule(value: (/* directoryPath */ String, /* request */ String) => String): Self = this.set("resolveModule", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteResolveModule: Self = this.set("resolveModule", js.undefined)
    
    @scala.inline
    def setResolveNamespace(value: (/* namespace */ String, /* source */ String) => String): Self = this.set("resolveNamespace", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteResolveNamespace: Self = this.set("resolveNamespace", js.undefined)
    
    @scala.inline
    def setResolveOptions(value: Dictkey): Self = this.set("resolveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveOptions: Self = this.set("resolveOptions", js.undefined)
    
    @scala.inline
    def setTimedCacheOptions(value: OmitTimedCacheOptionscrea): Self = this.set("timedCacheOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimedCacheOptions: Self = this.set("timedCacheOptions", js.undefined)
  }
}
