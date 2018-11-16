package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.TypeScriptServicesFactory")
@js.native
class TypeScriptServicesFactory () extends IShimFactory {
  var _shims: js.Any = js.native
  def close(): scala.Unit = js.native
  def createClassifier(host: IClassifierHost): Classifier = js.native
  def createClassifierShim(host: IClassifierHost): ClassifierShim = js.native
  def createCoreServices(host: ICoreServicesHost): CoreServices = js.native
  def createCoreServicesShim(host: ICoreServicesHost): CoreServicesShim = js.native
  def createLanguageServiceShim(host: ILanguageServiceShimHost): ILanguageServiceShim = js.native
  def createPullLanguageService(host: ILanguageServiceHost): ILanguageService = js.native
  /* CompleteClass */
  override def registerShim(shim: IShim): scala.Unit = js.native
  /* CompleteClass */
  override def unregisterShim(shim: IShim): scala.Unit = js.native
}

