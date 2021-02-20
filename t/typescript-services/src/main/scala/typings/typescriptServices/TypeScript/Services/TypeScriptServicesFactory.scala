package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
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
  implicit class TypeScriptServicesFactoryMutableBuilder[Self <: TypeScriptServicesFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateClassifier(value: IClassifierHost => Classifier): Self = StObject.set(x, "createClassifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateClassifierShim(value: IClassifierHost => ClassifierShim): Self = StObject.set(x, "createClassifierShim", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateCoreServices(value: ICoreServicesHost => CoreServices): Self = StObject.set(x, "createCoreServices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateCoreServicesShim(value: ICoreServicesHost => CoreServicesShim): Self = StObject.set(x, "createCoreServicesShim", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateLanguageServiceShim(value: ILanguageServiceShimHost => ILanguageServiceShim): Self = StObject.set(x, "createLanguageServiceShim", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreatePullLanguageService(value: ILanguageServiceHost => ILanguageService): Self = StObject.set(x, "createPullLanguageService", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_shims(value: js.Any): Self = StObject.set(x, "_shims", value.asInstanceOf[js.Any])
  }
}
