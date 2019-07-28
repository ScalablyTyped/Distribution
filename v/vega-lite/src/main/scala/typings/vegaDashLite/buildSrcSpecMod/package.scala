package typings.vegaDashLite

import typings.std.Partial
import typings.vegaDashLite.Anon_Config
import typings.vegaDashLite.Anon_DataDescription
import typings.vegaDashLite.buildSrcEncodingMod.Encoding
import typings.vegaDashLite.buildSrcEncodingMod.EncodingWithFacet
import typings.vegaDashLite.buildSrcFielddefMod.RepeatRef
import typings.vegaDashLite.buildSrcMarkMod.AnyMark
import typings.vegaDashLite.buildSrcMarkMod.Mark
import typings.vegaDashLite.buildSrcMarkMod.MarkDef
import typings.vegaDashLite.buildSrcToplevelpropsMod.TopLevelProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcSpecMod {
  type BaseSpec = Partial[DataMixins] with Anon_DataDescription
  type CompositeUnitSpec = GenericUnitSpec[Encoding[String | RepeatRef], AnyMark]
  type FacetedCompositeUnitSpec = GenericUnitSpec[EncodingWithFacet[String | RepeatRef], AnyMark]
  /* Rewritten from type alias, can be one of: 
    - U
    - L
    - typings.vegaDashLite.buildSrcSpecMod.GenericFacetSpec[U, L]
    - typings.vegaDashLite.buildSrcSpecMod.GenericRepeatSpec[U, L]
    - typings.vegaDashLite.buildSrcSpecMod.GenericVConcatSpec[U, L]
    - typings.vegaDashLite.buildSrcSpecMod.GenericHConcatSpec[U, L]
  */
  type GenericSpec[U /* <: GenericUnitSpec[_, _] */, L /* <: GenericLayerSpec[_] */] = (_GenericSpec[U, L]) | U | L
  type NormalizedConcatSpec = (GenericVConcatSpec[NormalizedUnitSpec, NormalizedLayerSpec]) | (GenericHConcatSpec[NormalizedUnitSpec, NormalizedLayerSpec])
  type NormalizedFacetSpec = GenericFacetSpec[NormalizedUnitSpec, NormalizedLayerSpec]
  type NormalizedLayerSpec = GenericLayerSpec[NormalizedUnitSpec]
  type NormalizedRepeatSpec = GenericRepeatSpec[NormalizedUnitSpec, NormalizedLayerSpec]
  type NormalizedSpec = GenericSpec[NormalizedUnitSpec, NormalizedLayerSpec]
  type NormalizedUnitSpec = GenericUnitSpec[Encoding[String | RepeatRef], Mark | MarkDef]
  type TopLevel[S /* <: BaseSpec */] = S with TopLevelProperties with Anon_Config
  type TopLevelFacetSpec = (TopLevel[GenericFacetSpec[CompositeUnitSpec, ExtendedLayerSpec]]) with DataMixins
  type TopLevelFacetedUnitSpec = TopLevel[FacetedCompositeUnitSpec] with DataMixins
  type TopLevelSpec = TopLevelFacetedUnitSpec | TopLevelFacetSpec | (TopLevel[
    ExtendedLayerSpec | (GenericHConcatSpec[CompositeUnitSpec, ExtendedLayerSpec]) | (GenericRepeatSpec[CompositeUnitSpec, ExtendedLayerSpec]) | (GenericVConcatSpec[CompositeUnitSpec, ExtendedLayerSpec])
  ])
}
