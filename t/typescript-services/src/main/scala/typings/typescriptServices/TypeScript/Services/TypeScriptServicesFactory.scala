package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeScriptServicesFactory extends IShimFactory {
  var _shims: js.Any
  def close(): Unit
  def createClassifier(host: IClassifierHost): Classifier
  def createClassifierShim(host: IClassifierHost): ClassifierShim
  def createCoreServices(host: ICoreServicesHost): CoreServices
  def createCoreServicesShim(host: ICoreServicesHost): CoreServicesShim
  def createLanguageServiceShim(host: ILanguageServiceShimHost): ILanguageServiceShim
  def createPullLanguageService(host: ILanguageServiceHost): ILanguageService
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
}

