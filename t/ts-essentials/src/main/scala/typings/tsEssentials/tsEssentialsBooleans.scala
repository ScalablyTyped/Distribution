package typings.tsEssentials

import typings.tsEssentials.typesMod.IsEqualConsideringWritability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsEssentialsBooleans {
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
  
  @js.native
  sealed trait `false`
    extends IsEqualConsideringWritability[js.Any, js.Any]
  
  @js.native
  sealed trait `true`
    extends IsEqualConsideringWritability[js.Any, js.Any]
}
