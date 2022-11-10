package typings.webpack.mod

import typings.std.Map
import typings.std.Set
import typings.webpack.anon.Key
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeValue extends StObject {
  
  def exec(parser: JavascriptParser, valueCacheVersions: Map[String, String | Set[String]], key: String): CodeValuePrimitive = js.native
  
  def fileDependencies: `true` | js.Array[String] = js.native
  
  def fn(arg0: Key): CodeValuePrimitive = js.native
  
  def getCacheVersion(): js.UndefOr[String] = js.native
  
  var options: `true` | RuntimeValueOptions = js.native
}
