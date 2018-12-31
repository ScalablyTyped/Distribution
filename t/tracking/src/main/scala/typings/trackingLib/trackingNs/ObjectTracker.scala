package typings
package trackingLib.trackingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object tracker utility.
  */
@JSGlobal("tracking.ObjectTracker")
@js.native
/**
  * Create a new Object Tracker.
  * @param classifiers Optional object classifiers to track.
  */
class ObjectTracker () extends Tracker {
  def this(classifiers: java.lang.String) = this()
  def this(classifiers: js.Array[java.lang.String]) = this()
  /** Gets the tracker HAAR classifiers. */
  def getClassifiers(): js.Array[scala.Double] = js.native
  /** Gets the edges density value. */
  def getEdgesDensity(): scala.Double = js.native
  /** Gets the initial scale to start the feature block scaling. */
  def getInitialScale(): scala.Double = js.native
  /** Gets the scale factor to scale the feature block. */
  def getScaleFactor(): scala.Double = js.native
  /** Gets the block step size. */
  def getStepSize(): scala.Double = js.native
  /**
    * Sets the tracker HAAR classifiers.
    * @param classifiers Classifiers to track.
    */
  def setClassifiers(classifiers: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Sets the edges density.
    * @param edgesDensity
    */
  def setEdgesDensity(edgesDensity: scala.Double): scala.Unit = js.native
  /**
    * Sets the initial scale to start the block scaling.
    * @param initialScale
    */
  def setInitialScale(initialScale: scala.Double): scala.Unit = js.native
  /**
    * Sets the scale factor to scale the feature block.
    * @param scaleFactor
    */
  def setScaleFactor(scaleFactor: scala.Double): scala.Unit = js.native
  /**
    * Sets the block step size.
    * @param stepSize
    */
  def setStepSize(stepSize: scala.Double): scala.Unit = js.native
}

