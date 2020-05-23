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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylefire", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val transformProps: js.Array[String] = js.native
  def buildSVGAttrs(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState): SVGAttrs = js.native
  def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState,
    dimensions: Dimensions
  ): SVGAttrs = js.native
  def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState,
    dimensions: Dimensions,
    totalPathLength: Double
  ): SVGAttrs = js.native
  def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState,
    dimensions: Dimensions,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState]
  ): SVGAttrs = js.native
  def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState,
    dimensions: Dimensions,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs
  ): SVGAttrs = js.native
  def buildSVGAttrs(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState,
    dimensions: Dimensions,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs,
    isDashCase: Boolean
  ): SVGAttrs = js.native
  def buildStyleProperty(
    state: State,
    enableHardwareAcceleration: js.UndefOr[Boolean],
    styles: js.UndefOr[ResolvedState],
    transform: js.UndefOr[ResolvedState],
    transformOrigin: js.UndefOr[ResolvedState],
    transformKeys: js.UndefOr[js.Array[String]],
    isDashCase: js.UndefOr[Boolean],
    allowTransformNone: js.UndefOr[Boolean]
  ): ResolvedState = js.native
  def createStylerFactory(hasOnReadOnRenderUncachedValuesUseCache: Config): js.Function1[/* hasProps */ js.UndefOr[Props], Styler] = js.native
  def default(nodeOrSelector: String): Styler = js.native
  def default(nodeOrSelector: String, props: Props): Styler = js.native
  def default(nodeOrSelector: Element): Styler = js.native
  def default(nodeOrSelector: Element, props: Props): Styler = js.native
  def default(nodeOrSelector: Window): Styler = js.native
  def default(nodeOrSelector: Window, props: Props): Styler = js.native
  def isTransformProp(key: String): Boolean = js.native
}

