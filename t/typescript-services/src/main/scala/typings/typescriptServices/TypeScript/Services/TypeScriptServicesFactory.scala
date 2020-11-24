package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeScriptServicesFactory extends IShimFactory {
  
  var _shims: js.Any = js.native
  
  def close(): Unit = js.native
  
  def createClassifier(host: IClassifierHost): Classifier = js.native
  
  def createClassifierShim(host: IClassifierHost): ClassifierShim = js.native
  
  def createCoreServices(host: ICoreServicesHost): CoreServices = js.native
  
  def createCoreServicesShim(host: ICoreServicesHost): CoreServicesShim = js.native
  
  def createLanguageServiceShim(host: ILanguageServiceShimHost): ILanguageServiceShim = js.native
  
  def createPullLanguageService(host: ILanguageServiceHost): ILanguageService = js.native
}
object TypeScriptServicesFactory {
  
  @scala.inline
  def apply(
    _shims: js.Any,
    close: () => Unit,
    createClassifier: IClassifierHost => Classifier,
    createClassifierShim: IClassifierHost => ClassifierShim,
    createCoreServices: ICoreServicesHost => CoreServices,
    createCoreServicesShim: ICoreServicesHost => CoreServicesShim,
    createLanguageServiceShim: ILanguageServiceShimHost => ILanguageServiceShim,
    createPullLanguageService: ILanguageServiceHost => ILanguageService,
    registerShim: IShim => Unit,
    unregisterShim: IShim => Unit
  ): TypeScriptServicesFactory = {
    val __obj = js.Dynamic.literal(_shims = _shims.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), createClassifier = js.Any.fromFunction1(createClassifier), createClassifierShim = js.Any.fromFunction1(createClassifierShim), createCoreServices = js.Any.fromFunction1(createCoreServices), createCoreServicesShim = js.Any.fromFunction1(createCoreServicesShim), createLanguageServiceShim = js.Any.fromFunction1(createLanguageServiceShim), createPullLanguageService = js.Any.fromFunction1(createPullLanguageService), registerShim = js.Any.fromFunction1(registerShim), unregisterShim = js.Any.fromFunction1(unregisterShim))
    __obj.asInstanceOf[TypeScriptServicesFactory]
  }
  
  @scala.inline
  implicit class TypeScriptServicesFactoryOps[Self <: TypeScriptServicesFactory] (val x: Self) extends AnyVal {
    
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
    def set_shims(value: js.Any): Self = this.set("_shims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateClassifier(value: IClassifierHost => Classifier): Self = this.set("createClassifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateClassifierShim(value: IClassifierHost => ClassifierShim): Self = this.set("createClassifierShim", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateCoreServices(value: ICoreServicesHost => CoreServices): Self = this.set("createCoreServices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateCoreServicesShim(value: ICoreServicesHost => CoreServicesShim): Self = this.set("createCoreServicesShim", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateLanguageServiceShim(value: ILanguageServiceShimHost => ILanguageServiceShim): Self = this.set("createLanguageServiceShim", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreatePullLanguageService(value: ILanguageServiceHost => ILanguageService): Self = this.set("createPullLanguageService", js.Any.fromFunction1(value))
  }
}
