package typings.travisFold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("travis-fold", "end")
  @js.native
  def end(group: String): String = js.native
  
  @JSImport("travis-fold", "isTravis")
  @js.native
  def isTravis(): Boolean = js.native
  
  @JSImport("travis-fold", "pushEnd")
  @js.native
  def pushEnd(ret: js.Array[String], group: String): Unit = js.native
  
  @JSImport("travis-fold", "pushStart")
  @js.native
  def pushStart(ret: js.Array[String], group: String): Unit = js.native
  
  @JSImport("travis-fold", "start")
  @js.native
  def start(group: String): String = js.native
  
  @JSImport("travis-fold", "wrap")
  @js.native
  def wrap(group: String, content: String): String = js.native
}
