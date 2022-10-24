package typings.wonderJs.distEs2015Mod

import typings.wonderJs.anon.CanvasId
import typings.wonderJs.anon.TypeofMain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Main")
@js.native
open class Main ()
  extends typings.wonderJs.distEs2015CoreMainMod.Main
/* static members */
object Main {
  
  @JSImport("wonder.js/dist/es2015", "Main")
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(): TypeofMain = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[TypeofMain]
  
  inline def setConfig(param0: CanvasId): TypeofMain = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(param0.asInstanceOf[js.Any]).asInstanceOf[TypeofMain]
}
