package typings.tsEssentials

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-essentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-essentials", "UnreachableCaseError")
  @js.native
  class UnreachableCaseError protected ()
    extends typings.tsEssentials.functionsMod.UnreachableCaseError {
    def this(value: scala.Nothing) = this()
  }
  
  @scala.inline
  def literal(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def literal(value: js.BigInt): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  @scala.inline
  def literal(value: js.Symbol): js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[js.Symbol]
  @scala.inline
  def literal(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def literal(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def literal(value: Null): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[Null]
  @scala.inline
  def literal(value: Unit): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
