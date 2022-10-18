package typings.vueReactivity

import typings.vueReactivity.mod.ReactiveFlags
import typings.vueReactivity.mod.TrackOpTypes
import typings.vueReactivity.mod.TriggerOpTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueReactivityStrings {
  
  @js.native
  sealed trait __v_isReactive
    extends StObject
       with ReactiveFlags
  inline def __v_isReactive: __v_isReactive = "__v_isReactive".asInstanceOf[__v_isReactive]
  
  @js.native
  sealed trait __v_isReadonly
    extends StObject
       with ReactiveFlags
  inline def __v_isReadonly: __v_isReadonly = "__v_isReadonly".asInstanceOf[__v_isReadonly]
  
  @js.native
  sealed trait __v_isShallow
    extends StObject
       with ReactiveFlags
  inline def __v_isShallow: __v_isShallow = "__v_isShallow".asInstanceOf[__v_isShallow]
  
  @js.native
  sealed trait __v_raw
    extends StObject
       with ReactiveFlags
  inline def __v_raw: __v_raw = "__v_raw".asInstanceOf[__v_raw]
  
  @js.native
  sealed trait __v_skip
    extends StObject
       with ReactiveFlags
  inline def __v_skip: __v_skip = "__v_skip".asInstanceOf[__v_skip]
  
  @js.native
  sealed trait add
    extends StObject
       with TriggerOpTypes
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait clear
    extends StObject
       with TriggerOpTypes
  inline def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait delete
    extends StObject
       with TriggerOpTypes
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait get
    extends StObject
       with TrackOpTypes
  inline def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait has
    extends StObject
       with TrackOpTypes
  inline def has: has = "has".asInstanceOf[has]
  
  @js.native
  sealed trait iterate
    extends StObject
       with TrackOpTypes
  inline def iterate: iterate = "iterate".asInstanceOf[iterate]
  
  @js.native
  sealed trait set
    extends StObject
       with TriggerOpTypes
  inline def set: set = "set".asInstanceOf[set]
}
