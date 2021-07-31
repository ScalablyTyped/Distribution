package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.Instantiable0
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.features
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] extends StObject {
  
  var __brand: features
  
  var client: js.UndefOr[ClientFeature[PClient]] = js.undefined
  
  var console: js.UndefOr[ConsoleFeature[PConsole]] = js.undefined
  
  var languages: js.UndefOr[LanguagesFeature[PLanguages]] = js.undefined
  
  var telemetry: js.UndefOr[TelemetryFeature[PTelemetry]] = js.undefined
  
  var tracer: js.UndefOr[TracerFeature[PTracer]] = js.undefined
  
  var window: js.UndefOr[WindowFeature[PWindow]] = js.undefined
  
  var workspace: js.UndefOr[WorkspaceFeature[PWorkspace]] = js.undefined
}
object Features {
  
  @scala.inline
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages](): Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] = {
    val __obj = js.Dynamic.literal(__brand = "features")
    __obj.asInstanceOf[Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages]]
  }
  
  @scala.inline
  implicit class FeaturesMutableBuilder[Self <: Features[?, ?, ?, ?, ?, ?, ?], PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages] (val x: Self & (Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages])) extends AnyVal {
    
    @scala.inline
    def setClient(value: /* Base */ Instantiable0[RemoteClient] => Instantiable0[RemoteClient & PClient]): Self = StObject.set(x, "client", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setConsole(value: /* Base */ Instantiable0[RemoteConsole] => Instantiable0[RemoteConsole & PConsole]): Self = StObject.set(x, "console", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
    
    @scala.inline
    def setLanguages(value: /* Base */ Instantiable0[Languages] => Instantiable0[Languages & PLanguages]): Self = StObject.set(x, "languages", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setTelemetry(value: /* Base */ Instantiable0[Telemetry] => Instantiable0[Telemetry & PTelemetry]): Self = StObject.set(x, "telemetry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    
    @scala.inline
    def setTracer(value: /* Base */ Instantiable0[Tracer] => Instantiable0[Tracer & PTracer]): Self = StObject.set(x, "tracer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTracerUndefined: Self = StObject.set(x, "tracer", js.undefined)
    
    @scala.inline
    def setWindow(value: /* Base */ Instantiable0[RemoteWindow] => Instantiable0[RemoteWindow & PWindow]): Self = StObject.set(x, "window", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    
    @scala.inline
    def setWorkspace(value: /* Base */ Instantiable0[RemoteWorkspace] => Instantiable0[RemoteWorkspace & PWorkspace]): Self = StObject.set(x, "workspace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    
    @scala.inline
    def set__brand(value: features): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
