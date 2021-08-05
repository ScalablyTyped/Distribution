package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsLayers.callbacksMod.EarlyStoppingCallbackArgs
import typings.tensorflowTfjsLayers.callbacksMod.EarlyStopping_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbacks {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "callbacks")
  @js.native
  val ^ : js.Any = js.native
  
  inline def earlyStopping(): EarlyStopping_ = ^.asInstanceOf[js.Dynamic].applyDynamic("earlyStopping")().asInstanceOf[EarlyStopping_]
  inline def earlyStopping(args: EarlyStoppingCallbackArgs): EarlyStopping_ = ^.asInstanceOf[js.Dynamic].applyDynamic("earlyStopping")(args.asInstanceOf[js.Any]).asInstanceOf[EarlyStopping_]
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "callbacks.earlyStopping")
  @js.native
  def earlyStopping_Fcallbacks: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_] = js.native
  
  inline def earlyStopping_Fcallbacks_=(x: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("earlyStopping")(x.asInstanceOf[js.Any])
}
