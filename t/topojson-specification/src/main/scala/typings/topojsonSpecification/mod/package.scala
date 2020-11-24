package typings.topojsonSpecification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Arc = js.Array[typings.topojsonSpecification.mod.Positions]
  
  type ArcIndexes = js.Array[scala.Double]
  
  type Objects[P /* <: typings.topojsonSpecification.mod.Properties */] = org.scalablytyped.runtime.StringDictionary[typings.topojsonSpecification.mod.GeometryObject[P]]
  
  type OrNull[T /* <: typings.topojsonSpecification.mod.Objects[js.Object] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | topojson-specification.topojson-specification.NullObject}
    */ typings.topojsonSpecification.topojsonSpecificationStrings.OrNull with org.scalablytyped.runtime.TopLevel[T]
  
  type Positions = js.Array[scala.Double]
  
  type Properties = typings.geojson.mod.GeoJsonProperties
}
