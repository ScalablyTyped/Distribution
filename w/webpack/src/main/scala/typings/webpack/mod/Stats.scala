package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "Stats")
@js.native
open class Stats protected () extends StObject {
  def this(compilation: Compilation) = this()
  
  var compilation: Compilation = js.native
  
  val endTime: Any = js.native
  
  def hasErrors(): Boolean = js.native
  
  def hasWarnings(): Boolean = js.native
  
  val hash: js.UndefOr[String] = js.native
  
  val startTime: Any = js.native
  
  def toJson(): StatsCompilation = js.native
  def toJson(options: String): StatsCompilation = js.native
  def toJson(options: StatsOptions): StatsCompilation = js.native
  
  def toString(options: Any): String = js.native
}
