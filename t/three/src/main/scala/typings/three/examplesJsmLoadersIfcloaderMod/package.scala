package typings.three.examplesJsmLoadersIfcloaderMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.three.anon.Ids
import typings.three.examplesJsmLoadersIfcloaderMod.^
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcThreeMod.BufferAttribute
import typings.three.srcThreeMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFAULT: /* "default" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT").asInstanceOf[/* "default" */ String]

inline def IdAttrName: /* "expressID" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("IdAttrName").asInstanceOf[/* "expressID" */ String]

inline def merge(geoms: js.Array[BufferGeometry[NormalBufferAttributes]]): BufferGeometry[NormalBufferAttributes] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geoms.asInstanceOf[js.Any]).asInstanceOf[BufferGeometry[NormalBufferAttributes]]
inline def merge(geoms: js.Array[BufferGeometry[NormalBufferAttributes]], createGroups: Boolean): BufferGeometry[NormalBufferAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geoms.asInstanceOf[js.Any], createGroups.asInstanceOf[js.Any])).asInstanceOf[BufferGeometry[NormalBufferAttributes]]

inline def newFloatAttr(data: js.Array[Any], size: Double): BufferAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("newFloatAttr")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[BufferAttribute]

inline def newIntAttr(data: js.Array[Any], size: Double): BufferAttribute = (^.asInstanceOf[js.Dynamic].applyDynamic("newIntAttr")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[BufferAttribute]

type GeometriesByMaterials = StringDictionary[GeometriesByMaterial]

type IdAttributeByMaterial = NumberDictionary[Double]

type IdAttributesByMaterials = StringDictionary[IdAttributeByMaterial]

type IdGeometries = NumberDictionary[BufferGeometry[NormalBufferAttributes]]

type MapFaceindexID = NumberDictionary[Double]

type SelectedItems = StringDictionary[Ids]

type TypesMap = NumberDictionary[Double]
