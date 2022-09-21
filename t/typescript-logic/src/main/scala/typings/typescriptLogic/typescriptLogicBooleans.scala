package typings.typescriptLogic

import typings.typescriptLogic.mod.Not
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typescriptLogicBooleans {
  
  @js.native
  sealed trait `false`
    extends StObject
       with Not[Any]
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with Not[Any]
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
