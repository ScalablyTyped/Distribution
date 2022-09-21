package typings.waterline.mod

import org.scalablytyped.runtime.Instantiable0
import typings.std.ReturnType
import typings.waterline.anon.Extend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterlineStatic
  extends StObject
     with Instantiable0[Waterline] {
  
  var Collection: Extend = js.native
  
  var Model: Extend = js.native
  
  def start[CB /* <: js.Function2[/* err */ js.UndefOr[js.Error], /* orm */ Waterline, Any] */](options: StartOptions, done: CB): CB = js.native
  
  def stop[CB /* <: js.Function1[/* err */ js.UndefOr[js.Error], Any] */](orm: Waterline, done: CB): ReturnType[CB] = js.native
}
