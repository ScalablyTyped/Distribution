package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Event")
@js.native
open class Event[T, Options] () extends StObject {
  
  def add(func: T): Unit = js.native
  
  /* protected */ var callbacks: Any = js.native
  
  def clear(): Unit = js.native
  
  def fire(sender: Any, options: Any): Unit = js.native
  
  def fireByCreatingOptions(sender: Any, createOptions: Any): Unit = js.native
  
  def hasFunc(func: T): Boolean = js.native
  
  def isEmpty: Boolean = js.native
  
  def length: Double = js.native
  
  var onCallbacksChanged: Any = js.native
  
  def remove(func: T): Unit = js.native
}
