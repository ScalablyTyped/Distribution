package typings.swcCore

import typings.swcCore.typesMod.TruePlusMinus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swcCoreBooleans {
  
  @js.native
  sealed trait `false` extends StObject
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with TruePlusMinus
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
