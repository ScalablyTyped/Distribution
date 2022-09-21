package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Dependencies")
@js.native
open class Dependencies protected () extends StObject {
  def this(currentDependency: Any, target: Base, property: String) = this()
  
  def addDependency(target: Base, property: String): Unit = js.native
  
  var currentDependency: Any = js.native
  
  var dependencies: Any = js.native
  
  def dispose(): Unit = js.native
  
  var id: String = js.native
  
  var property: String = js.native
  
  var target: Base = js.native
}
/* static members */
object Dependencies {
  
  @JSImport("survey-knockout", "Dependencies")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "Dependencies.DependenciesCount")
  @js.native
  def DependenciesCount: Double = js.native
  inline def DependenciesCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DependenciesCount")(x.asInstanceOf[js.Any])
}
