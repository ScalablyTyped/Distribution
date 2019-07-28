package typings.three.srcHelpersBoxHelperMod

import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMathColorMod.Color
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/BoxHelper", "BoxHelper")
@js.native
class BoxHelper protected () extends LineSegments {
  def this(`object`: Object3D) = this()
  def this(`object`: Object3D, color: Color) = this()
  def update(): Unit = js.native
  def update(`object`: Object3D): Unit = js.native
}

