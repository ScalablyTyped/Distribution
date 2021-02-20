package typings.weak

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Makes weak references to JavaScript Objects
    * @param object can be a regular Object, an Array, a Function, a RegExp, or any of the primitive types or constructor function created with new
    * @param callback a callback function to be invoked before the object is garbage collected
    */
  @JSImport("weak", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Object */](`object`: T): WeakRef[T] = js.native
  @JSImport("weak", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Object */](`object`: T, callback: js.Function0[Unit]): WeakRef[T] = js.native
  
  /**
    * Adds callback to the Array of callback functions that will be invoked before the Object gets garbage collected. The callbacks get executed in the order that they are added.
    * @param ref weak reference object
    * @param callback function to be called
    */
  @JSImport("weak", "addCallback")
  @js.native
  def addCallback(ref: WeakRef[_], callback: js.Function0[Unit]): EventEmitter = js.native
  
  /**
    * Returns an Array that ref iterates through to invoke the GC callbacks. This utilizes node's EventEmitter#listeners() function and therefore returns a copy in node 0.10 and newer.
    * @param ref weak reference object
    */
  @JSImport("weak", "callbacks")
  @js.native
  def callbacks(ref: WeakRef[_]): js.Array[js.Function0[Unit]] = js.native
  
  /**
    * Returns the actual reference to the Object that this weak reference was created with. If this is called with a dead reference, undefined is returned.
    * @param ref weak reference object
    */
  @JSImport("weak", "get")
  @js.native
  def get[T](ref: WeakRef[T]): js.UndefOr[T] = js.native
  
  /**
    * Checks to see if ref is a dead reference. Returns true if the original Object has already been GC'd, false otherwise
    * @param ref weak reference object
    */
  @JSImport("weak", "isDead")
  @js.native
  def isDead(ref: WeakRef[_]): /* is weak.weak.WeakRef<undefined> */ Boolean = js.native
  
  /**
    * Checks to see if ref is "near death". This will be true exactly during the weak reference callback function, and false any other time.
    * @param ref weak reference object
    */
  @JSImport("weak", "isNearDeath")
  @js.native
  def isNearDeath(ref: WeakRef[_]): /* is weak.weak.WeakRef<undefined> */ Boolean = js.native
  
  /**
    * Checks to see if obj is "weak reference" instance. Returns true if the passed in object is a "weak reference", false otherwise.
    * @param obj object to check
    */
  @JSImport("weak", "isWeakRef")
  @js.native
  def isWeakRef(obj: js.Any): /* is weak.weak.WeakRef<any> */ Boolean = js.native
  
  /**
    * Removes callback from the Array of callback functions that will be invoked before the Object gets garbage collected.
    * @param ref weak reference object
    * @param callback function to be called
    */
  @JSImport("weak", "removeCallback")
  @js.native
  def removeCallback(ref: WeakRef[_], callback: js.Function0[Unit]): EventEmitter = js.native
  
  /**
    * Empties the Array of callback functions that will be invoked before the Object gets garbage collected.
    * @param ref weak reference object
    */
  @JSImport("weak", "removeCallbacks")
  @js.native
  def removeCallbacks(ref: WeakRef[_]): EventEmitter = js.native
  
  @js.native
  trait WeakRef[T] extends StObject
}
