package typings
package topojsonDashClientLib.topojsonDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson-client", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bbox(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ]
  ): geojsonLib.geojsonMod.BBox = js.native
  def feature[P](
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    `object`: topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryCollection[P]
  ): geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.GeometryObject, P] = js.native
  def feature[P](
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    `object`: topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryObject[P]
  ): (geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, P]) | (geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.GeometryObject, P]) = js.native
  def feature[P](
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    `object`: topojsonDashSpecificationLib.topojsonDashSpecificationMod.LineString[P]
  ): geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.LineString, P] = js.native
  def feature[P](
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    `object`: topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiLineString[P]
  ): geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.MultiLineString, P] = js.native
  def feature[P](
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    `object`: topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiPoint[P]
  ): geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.MultiPoint, P] = js.native
  def feature[P](
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    `object`: topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiPolygon[P]
  ): geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.MultiPolygon, P] = js.native
  def feature[P](
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    `object`: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Point[P]
  ): geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Point, P] = js.native
  def feature[P](
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    `object`: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Polygon[P]
  ): geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Polygon, P] = js.native
  def merge(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    objects: js.Array[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Polygon[js.Object] | topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiPolygon[js.Object]
    ]
  ): geojsonLib.geojsonMod.MultiPolygon = js.native
  def mergeArcs(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    objects: js.Array[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Polygon[js.Object] | topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiPolygon[js.Object]
    ]
  ): topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiPolygon[js.Object] = js.native
  def mesh(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ]
  ): geojsonLib.geojsonMod.MultiLineString = js.native
  def mesh(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    obj: topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryObject[js.Object]
  ): geojsonLib.geojsonMod.MultiLineString = js.native
  def mesh(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    obj: topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryObject[js.Object], 
      /* b */ topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryObject[js.Object], 
      scala.Boolean
    ]
  ): geojsonLib.geojsonMod.MultiLineString = js.native
  def meshArcs(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ]
  ): topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiLineString[js.Object] = js.native
  def meshArcs(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    obj: topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryObject[js.Object]
  ): topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiLineString[js.Object] = js.native
  def meshArcs(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    obj: topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryObject[js.Object], 
      /* b */ topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryObject[js.Object], 
      scala.Boolean
    ]
  ): topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiLineString[js.Object] = js.native
  def neighbors(
    objects: js.Array[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryObject[js.Object]
    ]
  ): js.Array[js.Array[scala.Double]] = js.native
  def quantize[T /* <: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[js.Object] */](
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[T],
    transform: scala.Double
  ): topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[T] = js.native
  def quantize[T /* <: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[js.Object] */](
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[T],
    transform: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Transform
  ): topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[T] = js.native
  def transform(): topojsonDashClientLib.topojsonDashClientMod.Transformer = js.native
  def transform(transform: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Transform): topojsonDashClientLib.topojsonDashClientMod.Transformer = js.native
  def untransform(): topojsonDashClientLib.topojsonDashClientMod.Transformer = js.native
  def untransform(transform: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Transform): topojsonDashClientLib.topojsonDashClientMod.Transformer = js.native
}

