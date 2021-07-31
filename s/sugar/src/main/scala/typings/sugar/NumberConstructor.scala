package typings.sugar

import typings.sugar.sugarjs.Range
import typings.sugar.sugarjs._NativeConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberConstructor
  extends StObject
     with _NativeConstructor {
  
  def random(): Double = js.native
  def random(n1: Double): Double = js.native
  def random(n1: Double, n2: Double): Double = js.native
  def random(n1: Unit, n2: Double): Double = js.native
  
  def range(): Range = js.native
  def range(start: Double): Range = js.native
  def range(start: Double, end: Double): Range = js.native
  def range(start: Unit, end: Double): Range = js.native
}
