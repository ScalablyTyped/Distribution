package typings.typeFest

import typings.std.Pick
import typings.typeFest.sourceConditionalKeysMod.ConditionalKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceConditionalPickMod {
  
  type ConditionalPick[Base, Condition] = Pick[Base, ConditionalKeys[Base, Condition]]
}
