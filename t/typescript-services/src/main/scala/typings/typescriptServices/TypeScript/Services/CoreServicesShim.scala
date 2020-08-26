package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.ILogger
import typings.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreServicesShim extends ShimBase {
  var host: ICoreServicesHost = js.native
  var logger: ILogger = js.native
  var services: CoreServices = js.native
  def dumpMemory(dummy: js.Any): String = js.native
  /* private */ def forwardJSONCall(actionDescription: js.Any, action: js.Any): js.Any = js.native
  def getDefaultCompilationSettings(): String = js.native
  def getMemoryInfo(dummy: js.Any): String = js.native
  def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): String = js.native
}

object CoreServicesShim {
  @scala.inline
  def apply(
    dispose: js.Any => Unit,
    dumpMemory: js.Any => String,
    factory: js.Any,
    forwardJSONCall: (js.Any, js.Any) => js.Any,
    getDefaultCompilationSettings: () => String,
    getMemoryInfo: js.Any => String,
    getPreProcessedFileInfo: (String, IScriptSnapshot) => String,
    host: ICoreServicesHost,
    logger: ILogger,
    services: CoreServices
  ): CoreServicesShim = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1(dispose), dumpMemory = js.Any.fromFunction1(dumpMemory), factory = factory.asInstanceOf[js.Any], forwardJSONCall = js.Any.fromFunction2(forwardJSONCall), getDefaultCompilationSettings = js.Any.fromFunction0(getDefaultCompilationSettings), getMemoryInfo = js.Any.fromFunction1(getMemoryInfo), getPreProcessedFileInfo = js.Any.fromFunction2(getPreProcessedFileInfo), host = host.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreServicesShim]
  }
  @scala.inline
  implicit class CoreServicesShimOps[Self <: CoreServicesShim] (val x: Self) extends AnyVal {
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
    def setDumpMemory(value: js.Any => String): Self = this.set("dumpMemory", js.Any.fromFunction1(value))
    @scala.inline
    def setForwardJSONCall(value: (js.Any, js.Any) => js.Any): Self = this.set("forwardJSONCall", js.Any.fromFunction2(value))
    @scala.inline
    def setGetDefaultCompilationSettings(value: () => String): Self = this.set("getDefaultCompilationSettings", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMemoryInfo(value: js.Any => String): Self = this.set("getMemoryInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPreProcessedFileInfo(value: (String, IScriptSnapshot) => String): Self = this.set("getPreProcessedFileInfo", js.Any.fromFunction2(value))
    @scala.inline
    def setHost(value: ICoreServicesHost): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogger(value: ILogger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def setServices(value: CoreServices): Self = this.set("services", value.asInstanceOf[js.Any])
  }
  
}

