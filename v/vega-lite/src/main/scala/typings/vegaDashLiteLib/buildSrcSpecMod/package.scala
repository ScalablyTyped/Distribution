package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcSpecMod {
  type BaseSpec = stdLib.Partial[DataMixins] with vegaDashLiteLib.Anon_DataDescription
  type CompositeUnitSpec = GenericUnitSpec[
    vegaDashLiteLib.buildSrcEncodingMod.Encoding[java.lang.String | vegaDashLiteLib.buildSrcFielddefMod.RepeatRef], 
    vegaDashLiteLib.buildSrcMarkMod.AnyMark
  ]
  type FacetedCompositeUnitSpec = GenericUnitSpec[
    vegaDashLiteLib.buildSrcEncodingMod.EncodingWithFacet[java.lang.String | vegaDashLiteLib.buildSrcFielddefMod.RepeatRef], 
    vegaDashLiteLib.buildSrcMarkMod.AnyMark
  ]
  /* Rewritten from type alias, can be one of: 
    - U
    - L
    - GenericFacetSpec[U, L]
    - GenericRepeatSpec[U, L]
    - GenericVConcatSpec[U, L]
    - GenericHConcatSpec[U, L]
  */
  type GenericSpec[U /* <: GenericUnitSpec[_, _] */, L /* <: GenericLayerSpec[_] */] = (_GenericSpec[U, L]) | U | L
  type NormalizedConcatSpec = (GenericVConcatSpec[NormalizedUnitSpec, NormalizedLayerSpec]) | (GenericHConcatSpec[NormalizedUnitSpec, NormalizedLayerSpec])
  type NormalizedFacetSpec = GenericFacetSpec[NormalizedUnitSpec, NormalizedLayerSpec]
  type NormalizedLayerSpec = GenericLayerSpec[NormalizedUnitSpec]
  type NormalizedRepeatSpec = GenericRepeatSpec[NormalizedUnitSpec, NormalizedLayerSpec]
  type NormalizedSpec = GenericSpec[NormalizedUnitSpec, NormalizedLayerSpec]
  type NormalizedUnitSpec = GenericUnitSpec[
    vegaDashLiteLib.buildSrcEncodingMod.Encoding[java.lang.String | vegaDashLiteLib.buildSrcFielddefMod.RepeatRef], 
    vegaDashLiteLib.buildSrcMarkMod.Mark | vegaDashLiteLib.buildSrcMarkMod.MarkDef
  ]
  type TopLevel[S /* <: BaseSpec */] = S with vegaDashLiteLib.buildSrcToplevelpropsMod.TopLevelProperties with vegaDashLiteLib.Anon_Config
  type TopLevelFacetSpec = (TopLevel[GenericFacetSpec[CompositeUnitSpec, ExtendedLayerSpec]]) with DataMixins
  type TopLevelFacetedUnitSpec = TopLevel[FacetedCompositeUnitSpec] with DataMixins
  type TopLevelSpec = TopLevelFacetedUnitSpec | TopLevelFacetSpec | (TopLevel[
    ExtendedLayerSpec | (GenericHConcatSpec[CompositeUnitSpec, ExtendedLayerSpec]) | (GenericRepeatSpec[CompositeUnitSpec, ExtendedLayerSpec]) | (GenericVConcatSpec[CompositeUnitSpec, ExtendedLayerSpec])
  ])
}
