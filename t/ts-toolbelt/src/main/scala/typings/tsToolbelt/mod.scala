package typings.tsToolbelt

import typings.tsToolbelt.booleanInternalMod.Boolean
import typings.tsToolbelt.equalsMod.Equals
import typings.tsToolbelt.tsToolbeltInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Test {
    
    @JSImport("ts-toolbelt", "Test")
    @js.native
    val ^ : js.Any = js.native
    
    inline def check[Type, Expect, Outcome /* <: Boolean */](): Equals[Equals[Type, Expect], Outcome] = ^.asInstanceOf[js.Dynamic].applyDynamic("check")().asInstanceOf[Equals[Equals[Type, Expect], Outcome]]
    inline def check[Type, Expect, Outcome /* <: Boolean */](debug: Type): Equals[Equals[Type, Expect], Outcome] = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(debug.asInstanceOf[js.Any]).asInstanceOf[Equals[Equals[Type, Expect], Outcome]]
    
    inline def checks_1(checks: js.Array[`1`]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checks")(checks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
