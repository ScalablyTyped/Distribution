package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.Instantiable0
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] extends js.Object {
  
  var __brand: features = js.native
  
  var client: js.UndefOr[ClientFeature[PClient]] = js.native
  
  var console: js.UndefOr[ConsoleFeature[PConsole]] = js.native
  
  var languages: js.UndefOr[LanguagesFeature[PLanguages]] = js.native
  
  var telemetry: js.UndefOr[TelemetryFeature[PTelemetry]] = js.native
  
  var tracer: js.UndefOr[TracerFeature[PTracer]] = js.native
  
  var window: js.UndefOr[WindowFeature[PWindow]] = js.native
  
  var workspace: js.UndefOr[WorkspaceFeature[PWorkspace]] = js.native
}
object Features {
  
  @scala.inline
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](__brand: features): Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = {
    val __obj = js.Dynamic.literal(__brand = __brand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]
  }
  
  @scala.inline
  implicit class FeaturesOps[Self <: Features[_, _, _, _, _, _, _], PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] (val x: Self with (Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages])) extends AnyVal {
    
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
    def set__brand(value: features): Self = this.set("__brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: /* Base */ Instantiable0[RemoteClient] => Instantiable0[RemoteClient with PClient]): Self = this.set("client", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setConsole(value: /* Base */ Instantiable0[RemoteConsole] => Instantiable0[RemoteConsole with PConsole]): Self = this.set("console", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConsole: Self = this.set("console", js.undefined)
    
    @scala.inline
    def setLanguages(value: /* Base */ Instantiable0[Languages] => Instantiable0[Languages with PLanguages]): Self = this.set("languages", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    
    @scala.inline
    def setTelemetry(value: /* Base */ Instantiable0[Telemetry] => Instantiable0[Telemetry with PTelemetry]): Self = this.set("telemetry", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTelemetry: Self = this.set("telemetry", js.undefined)
    
    @scala.inline
    def setTracer(value: /* Base */ Instantiable0[Tracer] => Instantiable0[Tracer with PTracer]): Self = this.set("tracer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTracer: Self = this.set("tracer", js.undefined)
    
    @scala.inline
    def setWindow(value: /* Base */ Instantiable0[RemoteWindow] => Instantiable0[RemoteWindow with PWindow]): Self = this.set("window", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
    
    @scala.inline
    def setWorkspace(value: /* Base */ Instantiable0[RemoteWorkspace] => Instantiable0[RemoteWorkspace with PWorkspace]): Self = this.set("workspace", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWorkspace: Self = this.set("workspace", js.undefined)
  }
}
