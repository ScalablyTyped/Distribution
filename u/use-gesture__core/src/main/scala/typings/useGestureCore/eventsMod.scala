package typings.useGestureCore

import typings.std.PointerEvent
import typings.std.Touch
import typings.std.TouchEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.useGestureCore.anon.Device
import typings.useGestureCore.anon.Origin
import typings.useGestureCore.utilsMod.PointerType
import typings.useGestureCore.utilsMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/utils/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distanceAngle(P1: PointerEvent, P2: PointerEvent): Origin = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceAngle")(P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any])).asInstanceOf[Origin]
  inline def distanceAngle(P1: PointerEvent, P2: Touch): Origin = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceAngle")(P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any])).asInstanceOf[Origin]
  inline def distanceAngle(P1: Touch, P2: PointerEvent): Origin = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceAngle")(P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any])).asInstanceOf[Origin]
  inline def distanceAngle(P1: Touch, P2: Touch): Origin = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceAngle")(P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any])).asInstanceOf[Origin]
  
  inline def getEventDetails(event: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventDetails")(event.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getPointerType(event: UIEvent): PointerType = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointerType")(event.asInstanceOf[js.Any]).asInstanceOf[PointerType]
  
  inline def isTouch(event: UIEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouch")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseProp(prop: String): Device = ^.asInstanceOf[js.Dynamic].applyDynamic("parseProp")(prop.asInstanceOf[js.Any]).asInstanceOf[Device]
  
  inline def pointerId(event: PointerEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerId")(event.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def pointerId(event: TouchEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerId")(event.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def pointerValues(event: PointerEvent): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerValues")(event.asInstanceOf[js.Any]).asInstanceOf[Vector2]
  inline def pointerValues(event: TouchEvent): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerValues")(event.asInstanceOf[js.Any]).asInstanceOf[Vector2]
  
  inline def scrollValues(event: UIEvent): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollValues")(event.asInstanceOf[js.Any]).asInstanceOf[Vector2]
  
  inline def toDomEventType(device: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDomEventType")(device.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toDomEventType(device: String, action: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDomEventType")(device.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toHandlerProp(device: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHandlerProp")(device.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHandlerProp(device: String, action: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHandlerProp")(device.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toHandlerProp(device: String, action: String, capture: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHandlerProp")(device.asInstanceOf[js.Any], action.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toHandlerProp(device: String, action: Unit, capture: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHandlerProp")(device.asInstanceOf[js.Any], action.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def touchDistanceAngle(event: TouchEvent, ids: js.Array[Double]): Origin = (^.asInstanceOf[js.Dynamic].applyDynamic("touchDistanceAngle")(event.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[Origin]
  
  inline def touchIds(event: TouchEvent): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchIds")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def wheelValues(event: WheelEvent): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("wheelValues")(event.asInstanceOf[js.Any]).asInstanceOf[Vector2]
}
