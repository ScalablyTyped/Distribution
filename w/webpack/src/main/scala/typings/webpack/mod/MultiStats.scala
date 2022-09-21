package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "MultiStats")
@js.native
abstract class MultiStats () extends StObject {
  
  def hasErrors(): Boolean = js.native
  
  def hasWarnings(): Boolean = js.native
  
  val hash: String = js.native
  
  var stats: js.Array[Stats] = js.native
  
  def toJson(): StatsCompilation = js.native
  def toJson(options: Any): StatsCompilation = js.native
  
  def toString(options: Any): String = js.native
}
