package typings.twilioSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object treeMod {
  
  type Equal[T] = js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  
  type Less[T] = js.Function2[/* x */ T, /* y */ T, scala.Boolean]
}
