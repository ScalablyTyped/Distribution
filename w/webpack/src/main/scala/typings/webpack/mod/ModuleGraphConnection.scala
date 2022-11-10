package typings.webpack.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleGraphConnection extends StObject {
  
  var active: Unit = js.native
  
  def addCondition(condition: js.Function2[/* arg0 */ this.type, /* arg1 */ RuntimeSpec, ConnectionState]): Unit = js.native
  
  def addExplanation(explanation: String): Unit = js.native
  
  def condition(arg0: ModuleGraphConnection, arg1: RuntimeSpec): ConnectionState = js.native
  
  var conditional: Boolean = js.native
  
  var dependency: Null | Dependency = js.native
  
  def explanation: String = js.native
  
  var explanations: Set[String] = js.native
  
  def getActiveState(runtime: RuntimeSpec): ConnectionState = js.native
  
  def isActive(runtime: RuntimeSpec): Boolean = js.native
  
  def isTargetActive(runtime: RuntimeSpec): Boolean = js.native
  
  var module: Module = js.native
  
  var originModule: Null | Module = js.native
  
  var resolvedModule: Module = js.native
  
  var resolvedOriginModule: Null | Module = js.native
  
  def setActive(value: Boolean): Unit = js.native
  
  var weak: Boolean = js.native
}
