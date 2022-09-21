package typings.vscodeLanguageserver.serverMod

import org.scalablytyped.runtime.Instantiable0
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.features
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks] extends StObject {
  
  var __brand: features
  
  var client: js.UndefOr[ClientFeature[PClient]] = js.undefined
  
  var console: js.UndefOr[ConsoleFeature[PConsole]] = js.undefined
  
  var languages: js.UndefOr[LanguagesFeature[PLanguages]] = js.undefined
  
  var notebooks: js.UndefOr[NotebooksFeature[PNotebooks]] = js.undefined
  
  var telemetry: js.UndefOr[TelemetryFeature[PTelemetry]] = js.undefined
  
  var tracer: js.UndefOr[TracerFeature[PTracer]] = js.undefined
  
  var window: js.UndefOr[WindowFeature[PWindow]] = js.undefined
  
  var workspace: js.UndefOr[WorkspaceFeature[PWorkspace]] = js.undefined
}
object Features {
  
  inline def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks](): Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks] = {
    val __obj = js.Dynamic.literal(__brand = "features")
    __obj.asInstanceOf[Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks]]
  }
  
  extension [Self <: Features[?, ?, ?, ?, ?, ?, ?, ?], PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks](x: Self & (Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks])) {
    
    inline def setClient(value: /* Base */ Instantiable0[RemoteClient] => Instantiable0[RemoteClient & PClient]): Self = StObject.set(x, "client", js.Any.fromFunction1(value))
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setConsole(value: /* Base */ Instantiable0[RemoteConsole] => Instantiable0[RemoteConsole & PConsole]): Self = StObject.set(x, "console", js.Any.fromFunction1(value))
    
    inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
    
    inline def setLanguages(value: /* Base */ Instantiable0[_Languages] => Instantiable0[_Languages & PLanguages]): Self = StObject.set(x, "languages", js.Any.fromFunction1(value))
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setNotebooks(value: /* Base */ Instantiable0[_Notebooks] => Instantiable0[_Notebooks & PNotebooks]): Self = StObject.set(x, "notebooks", js.Any.fromFunction1(value))
    
    inline def setNotebooksUndefined: Self = StObject.set(x, "notebooks", js.undefined)
    
    inline def setTelemetry(value: /* Base */ Instantiable0[Telemetry] => Instantiable0[Telemetry & PTelemetry]): Self = StObject.set(x, "telemetry", js.Any.fromFunction1(value))
    
    inline def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    
    inline def setTracer(value: /* Base */ Instantiable0[RemoteTracer] => Instantiable0[RemoteTracer & PTracer]): Self = StObject.set(x, "tracer", js.Any.fromFunction1(value))
    
    inline def setTracerUndefined: Self = StObject.set(x, "tracer", js.undefined)
    
    inline def setWindow(value: /* Base */ Instantiable0[_RemoteWindow] => Instantiable0[_RemoteWindow & PWindow]): Self = StObject.set(x, "window", js.Any.fromFunction1(value))
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    
    inline def setWorkspace(value: /* Base */ Instantiable0[_RemoteWorkspace] => Instantiable0[_RemoteWorkspace & PWorkspace]): Self = StObject.set(x, "workspace", js.Any.fromFunction1(value))
    
    inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    
    inline def set__brand(value: features): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
