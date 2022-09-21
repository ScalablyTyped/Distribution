package typings.svgpath

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.svgpath.svgpathStrings.A
import typings.svgpath.svgpathStrings.C
import typings.svgpath.svgpathStrings.H
import typings.svgpath.svgpathStrings.L
import typings.svgpath.svgpathStrings.M
import typings.svgpath.svgpathStrings.Q
import typings.svgpath.svgpathStrings.S
import typings.svgpath.svgpathStrings.T
import typings.svgpath.svgpathStrings.V
import typings.svgpath.svgpathStrings.Z
import typings.svgpath.svgpathStrings.a_
import typings.svgpath.svgpathStrings.c_
import typings.svgpath.svgpathStrings.h_
import typings.svgpath.svgpathStrings.l_
import typings.svgpath.svgpathStrings.m_
import typings.svgpath.svgpathStrings.q_
import typings.svgpath.svgpathStrings.s_
import typings.svgpath.svgpathStrings.t_
import typings.svgpath.svgpathStrings.v_
import typings.svgpath.svgpathStrings.z_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("svgpath", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SvgPath {
    def this(path: String) = this()
  }
  @JSImport("svgpath", JSImport.Namespace)
  @js.native
  val ^ : SvgPath = js.native
  
  type ClosePath = js.Array[Z | z_]
  
  type CurveToAbs = js.Tuple7[C, Double, Double, Double, Double, Double, Double]
  
  type CurveToRel = js.Tuple7[c_, Double, Double, Double, Double, Double, Double]
  
  type EllipticalArcAbs = js.Tuple8[A, Double, Double, Double, Double, Double, Double, Double]
  
  type EllipticalArcRel = js.Tuple8[a_, Double, Double, Double, Double, Double, Double, Double]
  
  type HorizontalLineToAbs = js.Tuple2[H, Double]
  
  type HorizontalLineToRel = js.Tuple2[h_, Double]
  
  type LineToAbs = js.Tuple3[L, Double, Double]
  
  type LineToRel = js.Tuple3[l_, Double, Double]
  
  type MoveToAbs = js.Tuple3[M, Double, Double]
  
  type MoveToRel = js.Tuple3[m_, Double, Double]
  
  type QuadraticBézierCurveToAbs = js.Tuple5[Q, Double, Double, Double, Double]
  
  type QuadraticBézierCurveToRel = js.Tuple5[q_, Double, Double, Double, Double]
  
  type Segment = MoveToAbs | MoveToRel | LineToAbs | LineToRel | HorizontalLineToAbs | HorizontalLineToRel | VerticalLineToAbs | VerticalLineToRel | CurveToAbs | CurveToRel | SmoothCurveToAbs | SmoothCurveToRel | QuadraticBézierCurveToAbs | QuadraticBézierCurveToRel | SmoothQuadraticBézierCurveToAbs | SmoothQuadraticBézierCurveToRel | EllipticalArcAbs | EllipticalArcRel | ClosePath
  
  type SmoothCurveToAbs = js.Tuple5[S, Double, Double, Double, Double]
  
  type SmoothCurveToRel = js.Tuple5[s_, Double, Double, Double, Double]
  
  type SmoothQuadraticBézierCurveToAbs = js.Tuple3[T, Double, Double]
  
  type SmoothQuadraticBézierCurveToRel = js.Tuple3[t_, Double, Double]
  
  @js.native
  trait SvgPath
    extends StObject
       with Instantiable1[/* path */ String, SvgPath] {
    
    def apply(path: String): SvgPath = js.native
    
    def abs(): SvgPath = js.native
    
    def from(path: String): SvgPath = js.native
    def from(path: SvgPath): SvgPath = js.native
    
    def iterate(
      iterator: js.Function4[/* segment */ Segment, /* index */ Double, /* x */ Double, /* y */ Double, Unit]
    ): SvgPath = js.native
    def iterate(
      iterator: js.Function4[/* segment */ Segment, /* index */ Double, /* x */ Double, /* y */ Double, Unit],
      keepLazyStack: Boolean
    ): SvgPath = js.native
    
    def matrix(m: js.Array[Double]): SvgPath = js.native
    
    def rel(): SvgPath = js.native
    
    def rotate(angle: Double): SvgPath = js.native
    def rotate(angle: Double, rx: Double): SvgPath = js.native
    def rotate(angle: Double, rx: Double, ry: Double): SvgPath = js.native
    def rotate(angle: Double, rx: Unit, ry: Double): SvgPath = js.native
    
    def round(precision: Double): SvgPath = js.native
    
    def scale(sx: Double): SvgPath = js.native
    def scale(sx: Double, sy: Double): SvgPath = js.native
    
    def skewX(degrees: Double): SvgPath = js.native
    
    def skewY(degrees: Double): SvgPath = js.native
    
    def transform(str: String): SvgPath = js.native
    
    def translate(x: Double): SvgPath = js.native
    def translate(x: Double, y: Double): SvgPath = js.native
    
    def unarc(): SvgPath = js.native
    
    def unshort(): SvgPath = js.native
  }
  
  type VerticalLineToAbs = js.Tuple2[V, Double]
  
  type VerticalLineToRel = js.Tuple2[v_, Double]
  
  type _To = SvgPath
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SvgPath = ^
}
