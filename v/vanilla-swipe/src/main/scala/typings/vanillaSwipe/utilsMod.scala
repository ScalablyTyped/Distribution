package typings.vanillaSwipe

import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.vanillaSwipe.anon.Delta
import typings.vanillaSwipe.anon.IsSwiping
import typings.vanillaSwipe.anon.Passive
import typings.vanillaSwipe.anon.PassiveUndefined
import typings.vanillaSwipe.anon.X
import typings.vanillaSwipe.anon.Y
import typings.vanillaSwipe.calculateMovingPositionMod.E
import typings.vanillaSwipe.calculatePositionMod.Options
import typings.vanillaSwipe.rotateByAngleMod.Value
import typings.vanillaSwipe.typesMod.Axis
import typings.vanillaSwipe.typesMod.Direction
import typings.vanillaSwipe.typesMod.EventData
import typings.vanillaSwipe.typesMod.State
import typings.vanillaSwipe.typesMod.TraceDirection
import typings.vanillaSwipe.typesMod.TraceDirectionKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("vanilla-swipe/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateDirection(trace: js.Array[Double]): TraceDirectionKey = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateDirection")(trace.asInstanceOf[js.Any]).asInstanceOf[TraceDirectionKey]
  
  inline def calculateDirectionDelta(traceDirections: js.Array[TraceDirection]): TraceDirectionKey = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateDirectionDelta")(traceDirections.asInstanceOf[js.Any]).asInstanceOf[TraceDirectionKey]
  inline def calculateDirectionDelta(traceDirections: js.Array[TraceDirection], delta: Double): TraceDirectionKey = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDirectionDelta")(traceDirections.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[TraceDirectionKey]
  
  inline def calculateDuration(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateDuration")().asInstanceOf[Double]
  inline def calculateDuration(prevTime: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateDuration")(prevTime.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def calculateDuration(prevTime: Double, nextTime: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDuration")(prevTime.asInstanceOf[js.Any], nextTime.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calculateDuration(prevTime: Unit, nextTime: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDuration")(prevTime.asInstanceOf[js.Any], nextTime.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def calculateMovingPosition[T /* <: E */](e: T): X = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMovingPosition")(e.asInstanceOf[js.Any]).asInstanceOf[X]
  inline def calculateMovingPosition[T /* <: E */](e: MouseEvent): X = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMovingPosition")(e.asInstanceOf[js.Any]).asInstanceOf[X]
  inline def calculateMovingPosition[T /* <: E */](e: TouchEvent): X = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMovingPosition")(e.asInstanceOf[js.Any]).asInstanceOf[X]
  
  inline def calculatePosition(state: State, options: Options): EventData = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePosition")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EventData]
  
  inline def calculateTraceDirections(): js.Array[TraceDirection] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateTraceDirections")().asInstanceOf[js.Array[TraceDirection]]
  inline def calculateTraceDirections(trace: js.Array[Double]): js.Array[TraceDirection] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateTraceDirections")(trace.asInstanceOf[js.Any]).asInstanceOf[js.Array[TraceDirection]]
  
  inline def calculateVelocity(x: Double, y: Double, time: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateVelocity")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def checkIsMoreThanSingleTouches(e: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIsMoreThanSingleTouches")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def checkIsPassiveSupported(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIsPassiveSupported")().asInstanceOf[js.UndefOr[Boolean]]
  inline def checkIsPassiveSupported(isPassiveSupported: Boolean): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIsPassiveSupported")(isPassiveSupported.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def checkIsTouchEventsSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIsTouchEventsSupported")().asInstanceOf[Boolean]
  
  inline def createOptions(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("createOptions")().asInstanceOf[js.Object]
  inline def createOptions(proxy: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("createOptions")(proxy.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def getDifference(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDifference")().asInstanceOf[Double]
  inline def getDifference(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDifference")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getDifference(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDifference")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getDifference(x: Unit, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDifference")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDirectionKey(): TraceDirectionKey = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionKey")().asInstanceOf[TraceDirectionKey]
  inline def getDirectionKey(`object`: js.Object): TraceDirectionKey = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionKey")(`object`.asInstanceOf[js.Any]).asInstanceOf[TraceDirectionKey]
  
  inline def getDirectionValue(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionValue")().asInstanceOf[Double]
  inline def getDirectionValue(values: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectionValue")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getInitialProps(): Delta = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialProps")().asInstanceOf[Delta]
  inline def getInitialProps(props: js.Object): Delta = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialProps")(props.asInstanceOf[js.Any]).asInstanceOf[Delta]
  
  inline def getInitialState(): IsSwiping = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialState")().asInstanceOf[IsSwiping]
  inline def getInitialState(options: js.Object): IsSwiping = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialState")(options.asInstanceOf[js.Any]).asInstanceOf[IsSwiping]
  
  inline def getOptions(): Passive | PassiveUndefined = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")().asInstanceOf[Passive | PassiveUndefined]
  inline def getOptions(isPassiveSupported: Boolean): Passive | PassiveUndefined = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(isPassiveSupported.asInstanceOf[js.Any]).asInstanceOf[Passive | PassiveUndefined]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def resolveAxisDirection(axis: Axis, key: TraceDirectionKey): Direction = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAxisDirection")(axis.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Direction]
  
  inline def resolveDirection(trace: js.Array[Double]): Direction = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirection")(trace.asInstanceOf[js.Any]).asInstanceOf[Direction]
  inline def resolveDirection(trace: js.Array[Double], axis: Unit, directionDelta: Double): Direction = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirection")(trace.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], directionDelta.asInstanceOf[js.Any])).asInstanceOf[Direction]
  inline def resolveDirection(trace: js.Array[Double], axis: Axis): Direction = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirection")(trace.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Direction]
  inline def resolveDirection(trace: js.Array[Double], axis: Axis, directionDelta: Double): Direction = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirection")(trace.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], directionDelta.asInstanceOf[js.Any])).asInstanceOf[Direction]
  
  inline def rotateByAngle(position: Y): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("rotateByAngle")(position.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def rotateByAngle(position: Y, angle: Double): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateByAngle")(position.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def updateTrace(trace: js.Array[Double], value: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTrace")(trace.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
