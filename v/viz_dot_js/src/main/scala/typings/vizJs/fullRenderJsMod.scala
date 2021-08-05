package typings.vizJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullRenderJsMod {
  
  @JSImport("viz.js/full.render.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("viz.js/full.render.js", "Module")
  @js.native
  val Module: typings.vizJs.Module = js.native
  
  inline def render(instance: typings.vizJs.Module, src: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(instance.asInstanceOf[js.Any], src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
