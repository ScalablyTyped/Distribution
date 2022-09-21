package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ComputedUpdater")
@js.native
open class ComputedUpdater[T] protected () extends StObject {
  def this(_updater: Any) = this()
  
  var dependencies: Dependencies = js.native
  
  def dispose(): Any = js.native
  
  /* protected */ def getDependencies(): Dependencies = js.native
  
  def setDependencies(dependencies: Dependencies): Unit = js.native
  
  var `type`: Any = js.native
  
  def updater: Any = js.native
}
/* static members */
object ComputedUpdater {
  
  @JSImport("survey-knockout", "ComputedUpdater")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "ComputedUpdater.ComputedUpdaterType")
  @js.native
  def ComputedUpdaterType: Any = js.native
  inline def ComputedUpdaterType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ComputedUpdaterType")(x.asInstanceOf[js.Any])
}
