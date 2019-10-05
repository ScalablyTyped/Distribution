package typings.tracking.tracking

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
  def this(classifiers: String) = this()
  def this(classifiers: js.Array[String]) = this()
  /** Gets the tracker HAAR classifiers. */
  def getClassifiers(): js.Array[Double] = js.native
  /** Gets the edges density value. */
  def getEdgesDensity(): Double = js.native
  /** Gets the initial scale to start the feature block scaling. */
  def getInitialScale(): Double = js.native
  /** Gets the scale factor to scale the feature block. */
  def getScaleFactor(): Double = js.native
  /** Gets the block step size. */
  def getStepSize(): Double = js.native
  /**
    * Sets the tracker HAAR classifiers.
    * @param classifiers Classifiers to track.
    */
  def setClassifiers(classifiers: js.Array[Double]): Unit = js.native
  /**
    * Sets the edges density.
    * @param edgesDensity
    */
  def setEdgesDensity(edgesDensity: Double): Unit = js.native
  /**
    * Sets the initial scale to start the block scaling.
    * @param initialScale
    */
  def setInitialScale(initialScale: Double): Unit = js.native
  /**
    * Sets the scale factor to scale the feature block.
    * @param scaleFactor
    */
  def setScaleFactor(scaleFactor: Double): Unit = js.native
  /**
    * Sets the block step size.
    * @param stepSize
    */
  def setStepSize(stepSize: Double): Unit = js.native
}

