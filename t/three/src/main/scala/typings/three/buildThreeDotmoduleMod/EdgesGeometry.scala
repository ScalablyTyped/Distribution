package typings.three.buildThreeDotmoduleMod

import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module", "EdgesGeometry")
@js.native
/**
  * Create a new instance of {@link EdgesGeometry}
  * @param geometry Any geometry object. Default `null`.
  * @param thresholdAngle An edge is only rendered if the angle (in degrees) between the face normals of the adjoining faces exceeds this value. Expects a `Integer`. Default `1` _degree_.
  */
open class EdgesGeometry[TBufferGeometry /* <: typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalBufferAttributes] */] ()
  extends typings.three.srcThreeMod.EdgesGeometry[TBufferGeometry] {
  def this(geometry: TBufferGeometry) = this()
  def this(geometry: TBufferGeometry, thresholdAngle: Double) = this()
  def this(geometry: Null, thresholdAngle: Double) = this()
  def this(geometry: Unit, thresholdAngle: Double) = this()
}
