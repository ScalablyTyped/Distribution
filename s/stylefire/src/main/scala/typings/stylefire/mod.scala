package typings.stylefire

import typings.std.Element
import typings.std.Window
import typings.stylefire.buildMod.SVGAttrs
import typings.stylefire.svgTypesMod.Dimensions
import typings.stylefire.svgTypesMod.SVGState
import typings.stylefire.typesMod.Config
import typings.stylefire.typesMod.Props
import typings.stylefire.typesMod.ResolvedState
import typings.stylefire.typesMod.State
import typings.stylefire.typesMod.Styler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stylefire", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(nodeOrSelector: String): Styler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodeOrSelector.asInstanceOf[js.Any]).asInstanceOf[Styler]
  inline def default(nodeOrSelector: String, props: Props): Styler = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodeOrSelector.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Styler]
  inline def default(nodeOrSelector: Element): Styler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodeOrSelector.asInstanceOf[js.Any]).asInstanceOf[Styler]
  inline def default(nodeOrSelector: Element, props: Props): Styler = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodeOrSelector.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Styler]
  inline def default(nodeOrSelector: Window): Styler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodeOrSelector.asInstanceOf[js.Any]).asInstanceOf[Styler]
  inline def default(nodeOrSelector: Window, props: Props): Styler = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodeOrSelector.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Styler]
  
  inline def buildSVGAttrs(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState): SVGAttrs = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any]).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Double
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState]
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: Unit,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Double,
    cssBuilder: Unit,
    attrs: Unit,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Double,
    cssBuilder: Unit,
    attrs: SVGAttrs
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Double,
    cssBuilder: Unit,
    attrs: SVGAttrs,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Unit,
    cssBuilder: js.Function1[/* state */ State, ResolvedState]
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Unit,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: Unit,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Unit,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Unit,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Unit,
    cssBuilder: Unit,
    attrs: Unit,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Unit,
    cssBuilder: Unit,
    attrs: SVGAttrs
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Unit,
    totalPathLength: Unit,
    cssBuilder: Unit,
    attrs: SVGAttrs,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Double
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState]
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: Unit,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Double,
    cssBuilder: Unit,
    attrs: Unit,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Double,
    cssBuilder: Unit,
    attrs: SVGAttrs
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Double,
    cssBuilder: Unit,
    attrs: SVGAttrs,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Unit,
    cssBuilder: js.Function1[/* state */ State, ResolvedState]
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Unit,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: Unit,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Unit,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Unit,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Unit,
    cssBuilder: Unit,
    attrs: Unit,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Unit,
    cssBuilder: Unit,
    attrs: SVGAttrs
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  inline def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State & SVGState,
    dimensions: Dimensions,
    totalPathLength: Unit,
    cssBuilder: Unit,
    attrs: SVGAttrs,
    isDashCase: Boolean
  ): SVGAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSVGAttrs")(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any], totalPathLength.asInstanceOf[js.Any], cssBuilder.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any])).asInstanceOf[SVGAttrs]
  
  inline def buildStyleProperty(
    state: State,
    enableHardwareAcceleration: js.UndefOr[Boolean],
    styles: js.UndefOr[ResolvedState],
    transform: js.UndefOr[ResolvedState],
    transformOrigin: js.UndefOr[ResolvedState],
    transformKeys: js.UndefOr[js.Array[String]],
    isDashCase: js.UndefOr[Boolean],
    allowTransformNone: js.UndefOr[Boolean]
  ): ResolvedState = (^.asInstanceOf[js.Dynamic].applyDynamic("buildStyleProperty")(state.asInstanceOf[js.Any], enableHardwareAcceleration.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], transformOrigin.asInstanceOf[js.Any], transformKeys.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any], allowTransformNone.asInstanceOf[js.Any])).asInstanceOf[ResolvedState]
  
  inline def createStylerFactory(hasOnReadOnRenderUncachedValuesUseCache: Config): js.Function1[/* hasProps */ js.UndefOr[Props], Styler] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStylerFactory")(hasOnReadOnRenderUncachedValuesUseCache.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasProps */ js.UndefOr[Props], Styler]]
  
  inline def isTransformProp(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransformProp")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("stylefire", "transformProps")
  @js.native
  val transformProps: js.Array[String] = js.native
}
