package typings.visibilityjs

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("visibilityjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def afterPrerendering(callback: js.Function): Double | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("afterPrerendering")(callback.asInstanceOf[js.Any]).asInstanceOf[Double | Boolean]
  
  inline def change(listener: VisiblityChangeListener): Double | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("change")(listener.asInstanceOf[js.Any]).asInstanceOf[Double | Boolean]
  
  inline def every(interval: Double, callback: js.Function): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(interval.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def every(interval: Double, hiddenInterval: Double, callback: js.Function): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(interval.asInstanceOf[js.Any], hiddenInterval.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hidden(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hidden")().asInstanceOf[Boolean]
  
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
  inline def onVisible(callback: js.Function): Double | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("onVisible")(callback.asInstanceOf[js.Any]).asInstanceOf[Double | Boolean]
  
  inline def state(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("state")().asInstanceOf[String]
  
  inline def stop(id: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def unbind(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type VisiblityChangeListener = js.Function2[/* event */ Event, /* state */ String, Unit]
}
