package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaSinkToArrayMod {
  
  @JSImport("wonka/src/sinks/wonka_sink_toArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def toArray[A](source: Source[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
}
