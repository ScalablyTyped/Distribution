package typings.stylableRuntime

import typings.stylableRuntime.anon.RequiredPickHoststcsts
import typings.stylableRuntime.typesMod.Host
import typings.stylableRuntime.typesMod.StateMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeMod {
  
  @JSImport("@stylable/runtime/dist/runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stylable/runtime/dist/runtime", "injectCSS")
  @js.native
  val injectCSS: js.UndefOr[
    js.Function4[
      /* namespace */ String, 
      /* css */ String, 
      /* depth */ Double, 
      /* runtimeId */ String, 
      Unit
    ]
  ] = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(sts) */ inline def statesRuntime(namespace: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("statesRuntime")(namespace.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def statesRuntime(namespace: String, stateMapping: StateMap): String = (^.asInstanceOf[js.Dynamic].applyDynamic("statesRuntime")(namespace.asInstanceOf[js.Any], stateMapping.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stylesheet(): RequiredPickHoststcsts = ^.asInstanceOf[js.Dynamic].applyDynamic("stylesheet")().asInstanceOf[RequiredPickHoststcsts]
  inline def stylesheet(host: Host): RequiredPickHoststcsts = ^.asInstanceOf[js.Dynamic].applyDynamic("stylesheet")(host.asInstanceOf[js.Any]).asInstanceOf[RequiredPickHoststcsts]
}
