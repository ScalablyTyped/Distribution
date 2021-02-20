package typings.weakNapi

import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.weakNapi.weakNapiBooleans.`false`
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
  @JSImport("weak-napi", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Object */](`object`: T): WeakRef[T] = js.native
  @JSImport("weak-napi", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Object */](`object`: T, callback: js.Function0[Unit]): WeakRef[T] = js.native
  
  /**
    * Adds callback to the Array of callback functions that will be invoked before the Object gets garbage collected. The callbacks get executed in the order that they are added.
    * @param ref weak reference object
    * @param callback function to be called
    */
  @JSImport("weak-napi", "addCallback")
  @js.native
  def addCallback(ref: WeakRef[_], callback: js.Function0[Unit]): EventEmitter = js.native
  
  /**
    * Returns an Array that ref iterates through to invoke the GC callbacks. This utilizes node's EventEmitter#listeners() function and therefore returns a copy in node 0.10 and newer.
    * @param ref weak reference object
    */
  @JSImport("weak-napi", "callbacks")
  @js.native
  def callbacks(ref: WeakRef[_]): js.Array[js.Function0[Unit]] = js.native
  
  // export alias
  @JSImport("weak-napi", "create")
  @js.native
  val create: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof weak */ js.Any = js.native
  
  /**
    * Returns the actual reference to the Object that this weak reference was created with. If this is called with a dead reference, undefined is returned.
    * @param ref weak reference object
    */
  @JSImport("weak-napi", "get")
  @js.native
  def get[T](ref: WeakRef[T]): js.UndefOr[T] = js.native
  
  /**
    * Checks to see if ref is a dead reference. Returns true if the original Object has already been GC'd, false otherwise
    * @param ref weak reference object
    */
  @JSImport("weak-napi", "isDead")
  @js.native
  def isDead(ref: WeakRef[_]): /* is weak-napi.weak-napi.WeakRef<undefined> */ Boolean = js.native
  
  /**
    * Checks to see if ref is "near death". This will be true exactly during the weak reference callback function, and false any other time.
    * @param ref weak reference object
    */
  @JSImport("weak-napi", "isNearDeath")
  @js.native
  def isNearDeath(ref: WeakRef[_]): `false` = js.native
  
  /**
    * Checks to see if obj is "weak reference" instance. Returns true if the passed in object is a "weak reference", false otherwise.
    * @param obj object to check
    */
  @JSImport("weak-napi", "isWeakRef")
  @js.native
  def isWeakRef(obj: js.Any): /* is weak-napi.weak-napi.WeakRef<any> */ Boolean = js.native
  
  /**
    * Removes callback from the Array of callback functions that will be invoked before the Object gets garbage collected.
    * @param ref weak reference object
    * @param callback function to be called
    */
  @JSImport("weak-napi", "removeCallback")
  @js.native
  def removeCallback(ref: WeakRef[_], callback: js.Function0[Unit]): EventEmitter = js.native
  
  /**
    * Empties the Array of callback functions that will be invoked before the Object gets garbage collected.
    * @param ref weak reference object
    */
  @JSImport("weak-napi", "removeCallbacks")
  @js.native
  def removeCallbacks(ref: WeakRef[_]): EventEmitter = js.native
  
  @js.native
  trait WeakRef[T] extends StObject
}
