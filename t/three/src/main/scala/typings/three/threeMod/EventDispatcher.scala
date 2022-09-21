package typings.three.threeMod

import typings.three.eventDispatcherMod.BaseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "EventDispatcher")
@js.native
/**
  * Creates eventDispatcher object. It needs to be call with '.call' to add the functionality to an object.
  */
open class EventDispatcher[E /* <: BaseEvent */] ()
  extends typings.three.eventDispatcherMod.EventDispatcher[E]
