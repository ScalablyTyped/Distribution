package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Event")
@js.native
class Event[T /* <: js.Function */, Options] () extends StObject {
  
  def add(func: T): Unit = js.native
  
  var callbacks: js.Array[T] = js.native
  
  def clear(): Unit = js.native
  
  def fire(sender: js.Any, options: Options): Unit = js.native
  
  def hasFunc(func: T): Boolean = js.native
  
  val isEmpty: Boolean = js.native
  
  def onCallbacksChanged(): Unit = js.native
  
  def remove(func: T): Unit = js.native
}
