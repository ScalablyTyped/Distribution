package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/numeric/special_math", JSImport.Namespace)
@js.native
object specialMathMod extends js.Object {
  
  @JSName("assoc_laguerre")
  def assocLaguerre(n: Double, m: Double, x: Double): Double = js.native
  
  @JSName("assoc_legendre")
  def assocLegendre(n: Double, m: Double, x: Double): Double = js.native
  
  def beta(x: Double, y: Double): Double = js.native
  
  @JSName("comp_ellint_1")
  def compEllint1(k: Double): Double = js.native
  
  @JSName("comp_ellint_2")
  def compEllint2(k: Double): Double = js.native
  
  @JSName("comp_ellint_3")
  def compEllint3(k: Double, n: Double): Double = js.native
  
  @JSName("cyl_bessel_i")
  def cylBesselI(n: Double, x: Double): Double = js.native
  
  @JSName("cyl_bessel_j")
  def cylBesselJ(n: Double, x: Double): Double = js.native
  
  @JSName("cyl_bessel_k")
  def cylBesselK(n: Double, x: Double): Double = js.native
  
  @JSName("cyl_neumann")
  def cylNeumann(v: Double, x: Double): Double = js.native
  
  @JSName("ellint_1")
  def ellint1(k: Double, phi: Double): Double = js.native
  
  @JSName("ellint_2")
  def ellint2(k: Double, phi: Double): Double = js.native
  
  @JSName("ellint_3")
  def ellint3(k: Double, v: Double, phi: Double): Double = js.native
  
  def expint(x: Double): Double = js.native
  
  def hermite(n: Double, x: Double): Double = js.native
  
  def laguerre(n: Double, x: Double): Double = js.native
  
  def legendre(n: Double, x: Double): Double = js.native
  
  def lgamma(x: Double): Double = js.native
  
  @JSName("riemann_zeta")
  def riemannZeta(arg: Double): Double = js.native
  
  @JSName("sph_bessel")
  def sphBessel(n: Double, x: Double): Double = js.native
  
  @JSName("sph_neumann")
  def sphNeumann(n: Double, x: Double): Double = js.native
  
  def tgamma(x: Double): Double = js.native
}
