package typings.stylableWebpackPlugin.typesMod

import typings.stylableWebpackPlugin.anon.FileDependencies
import typings.stylableWebpackPlugin.anon.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Module * / any */ @js.native
trait StylableModule extends js.Object {
  
  def addDependency(
    dep: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Dependency */ js.Any
  ): Unit = js.native
  
  var buildInfo: FileDependencies = js.native
  
  var context: String = js.native
  
  var dependencies: js.UndefOr[js.Array[StylableModule]] = js.native
  
  var loaders: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.NewLoader */ _
  ] = js.native
  
  var module: js.UndefOr[StylableModule] = js.native
  
  def originalSource(): String = js.native
  
  var reasons: js.Array[Module] = js.native
  
  var request: String = js.native
  
  var resource: String = js.native
}
object StylableModule {
  
  @scala.inline
  def apply(
    addDependency: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Dependency */ js.Any => Unit,
    buildInfo: FileDependencies,
    context: String,
    loaders: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.NewLoader */ _
    ],
    originalSource: () => String,
    reasons: js.Array[Module],
    request: String,
    resource: String
  ): StylableModule = {
    val __obj = js.Dynamic.literal(addDependency = js.Any.fromFunction1(addDependency), buildInfo = buildInfo.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], originalSource = js.Any.fromFunction0(originalSource), reasons = reasons.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableModule]
  }
  
  @scala.inline
  implicit class StylableModuleOps[Self <: StylableModule] (val x: Self) extends AnyVal {
    
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
    def setAddDependency(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Dependency */ js.Any => Unit
    ): Self = this.set("addDependency", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBuildInfo(value: FileDependencies): Self = this.set("buildInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadersVarargs(value: js.Any*): Self = this.set("loaders", js.Array(value :_*))
    
    @scala.inline
    def setLoaders(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.NewLoader */ _
        ]
    ): Self = this.set("loaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalSource(value: () => String): Self = this.set("originalSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReasonsVarargs(value: Module*): Self = this.set("reasons", js.Array(value :_*))
    
    @scala.inline
    def setReasons(value: js.Array[Module]): Self = this.set("reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: String): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesVarargs(value: StylableModule*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[StylableModule]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setModule(value: StylableModule): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
  }
}
