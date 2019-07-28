package typings.supercluster.superclusterMod

import typings.geojson.geojsonMod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A very fast geospatial point clustering library for browsers and Node.
  */
@JSImport("supercluster", JSImport.Namespace)
@js.native
class ^[P /* <: GeoJsonProperties */, C /* <: GeoJsonProperties */] () extends Supercluster[P, C] {
  def this(options: Options[P, C]) = this()
}

