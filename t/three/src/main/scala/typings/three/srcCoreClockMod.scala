package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreClockMod {
  
  @JSImport("three/src/core/Clock", "Clock")
  @js.native
  /**
    * Create a new instance of {@link THREE.Clock | Clock}
    * @param autoStart - Whether to automatically start the clock when {@link getDelta | .getDelta()} is called for the first time. Default `true`
    */
  open class Clock () extends StObject {
    def this(autoStart: Boolean) = this()
    
    /**
      * If set, starts the clock automatically when {@link getDelta | .getDelta()} is called for the first time.
      * @defaultValue `true`
      */
    var autoStart: Boolean = js.native
    
    /**
      * Keeps track of the total time that the clock has been running.
      * @defaultValue `0`
      */
    var elapsedTime: Double = js.native
    
    /**
      * Get the seconds passed since the time {@link oldTime | .oldTime} was set and sets {@link oldTime | .oldTime} to the current time.
      * @remarks
      * If {@link autoStart | .autoStart} is `true` and the clock is not running, also starts the clock.
      */
    def getDelta(): Double = js.native
    
    /**
      * Get the seconds passed since the clock started and sets {@link oldTime | .oldTime} to the current time.
      * @remarks
      * If {@link autoStart | .autoStart} is `true` and the clock is not running, also starts the clock.
      */
    def getElapsedTime(): Double = js.native
    
    /**
      * Holds the time at which the clock's {@link start | .start()}, {@link getElapsedTime | .getElapsedTime()} or {@link getDelta | .getDelta()} methods were last called.
      * @defaultValue `0`
      */
    var oldTime: Double = js.native
    
    /**
      * Whether the clock is running or not.
      * @defaultValue `false`
      */
    var running: Boolean = js.native
    
    /**
      * Starts clock.
      * @remarks
      * Also sets the {@link startTime | .startTime} and {@link oldTime | .oldTime} to the current time,
      * sets {@link elapsedTime | .elapsedTime} to `0` and {@link running | .running} to `true`.
      */
    def start(): Unit = js.native
    
    /**
      * Holds the time at which the clock's {@link start | .start()} method was last called.
      * @defaultValue `0`
      */
    var startTime: Double = js.native
    
    /**
      * Stops clock and sets {@link oldTime | oldTime} to the current time.
      */
    def stop(): Unit = js.native
  }
}
