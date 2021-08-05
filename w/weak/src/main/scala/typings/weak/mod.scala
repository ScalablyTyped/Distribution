package typings.weak

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Makes weak references to JavaScript Objects
    * @param object can be a regular Object, an Array, a Function, a RegExp, or any of the primitive types or constructor function created with new
    * @param callback a callback function to be invoked before the object is garbage collected
    */
  inline def apply[T /* <: js.Object */](`object`: T): WeakRef[T] = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[WeakRef[T]]
  inline def apply[T /* <: js.Object */](`object`: T, callback: js.Function0[Unit]): WeakRef[T] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WeakRef[T]]
  
  @JSImport("weak", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds callback to the Array of callback functions that will be invoked before the Object gets garbage collected. The callbacks get executed in the order that they are added.
    * @param ref weak reference object
    * @param callback function to be called
    */
  inline def addCallback(ref: WeakRef[js.Any], callback: js.Function0[Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("addCallback")(ref.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  /**
    * Returns an Array that ref iterates through to invoke the GC callbacks. This utilizes node's EventEmitter#listeners() function and therefore returns a copy in node 0.10 and newer.
    * @param ref weak reference object
    */
  inline def callbacks(ref: WeakRef[js.Any]): js.Array[js.Function0[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbacks")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function0[Unit]]]
  
  /**
    * Returns the actual reference to the Object that this weak reference was created with. If this is called with a dead reference, undefined is returned.
    * @param ref weak reference object
    */
  inline def get[T](ref: WeakRef[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(ref.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  /**
    * Checks to see if ref is a dead reference. Returns true if the original Object has already been GC'd, false otherwise
    * @param ref weak reference object
    */
  inline def isDead(ref: WeakRef[js.Any]): /* is weak.weak.WeakRef<undefined> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDead")(ref.asInstanceOf[js.Any]).asInstanceOf[/* is weak.weak.WeakRef<undefined> */ Boolean]
  
  /**
    * Checks to see if ref is "near death". This will be true exactly during the weak reference callback function, and false any other time.
    * @param ref weak reference object
    */
  inline def isNearDeath(ref: WeakRef[js.Any]): /* is weak.weak.WeakRef<undefined> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNearDeath")(ref.asInstanceOf[js.Any]).asInstanceOf[/* is weak.weak.WeakRef<undefined> */ Boolean]
  
  /**
    * Checks to see if obj is "weak reference" instance. Returns true if the passed in object is a "weak reference", false otherwise.
    * @param obj object to check
    */
  inline def isWeakRef(obj: js.Any): /* is weak.weak.WeakRef<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeakRef")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is weak.weak.WeakRef<any> */ Boolean]
  
  /**
    * Removes callback from the Array of callback functions that will be invoked before the Object gets garbage collected.
    * @param ref weak reference object
    * @param callback function to be called
    */
  inline def removeCallback(ref: WeakRef[js.Any], callback: js.Function0[Unit]): EventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCallback")(ref.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[EventEmitter]
  
  /**
    * Empties the Array of callback functions that will be invoked before the Object gets garbage collected.
    * @param ref weak reference object
    */
  inline def removeCallbacks(ref: WeakRef[js.Any]): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCallbacks")(ref.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  
  trait WeakRef[T] extends StObject
}
