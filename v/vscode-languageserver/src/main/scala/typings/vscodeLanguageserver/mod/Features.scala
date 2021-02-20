package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.Instantiable0
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.features
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] extends StObject {
  
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
  implicit class FeaturesMutableBuilder[Self <: Features[_, _, _, _, _, _, _], PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] (val x: Self with (Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages])) extends AnyVal {
    
    @scala.inline
    def setClient(value: /* Base */ Instantiable0[RemoteClient] => Instantiable0[RemoteClient with PClient]): Self = StObject.set(x, "client", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setConsole(value: /* Base */ Instantiable0[RemoteConsole] => Instantiable0[RemoteConsole with PConsole]): Self = StObject.set(x, "console", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
    
    @scala.inline
    def setLanguages(value: /* Base */ Instantiable0[Languages] => Instantiable0[Languages with PLanguages]): Self = StObject.set(x, "languages", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setTelemetry(value: /* Base */ Instantiable0[Telemetry] => Instantiable0[Telemetry with PTelemetry]): Self = StObject.set(x, "telemetry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    
    @scala.inline
    def setTracer(value: /* Base */ Instantiable0[Tracer] => Instantiable0[Tracer with PTracer]): Self = StObject.set(x, "tracer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTracerUndefined: Self = StObject.set(x, "tracer", js.undefined)
    
    @scala.inline
    def setWindow(value: /* Base */ Instantiable0[RemoteWindow] => Instantiable0[RemoteWindow with PWindow]): Self = StObject.set(x, "window", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    
    @scala.inline
    def setWorkspace(value: /* Base */ Instantiable0[RemoteWorkspace] => Instantiable0[RemoteWorkspace with PWorkspace]): Self = StObject.set(x, "workspace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    
    @scala.inline
    def set__brand(value: features): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
