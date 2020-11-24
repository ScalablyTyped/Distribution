package typings.typescriptCompare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typescriptCompareStrings {
  
  @scala.inline
  def broaderLeft: broaderLeft = "broaderLeft".asInstanceOf[broaderLeft]
  
  @scala.inline
  def broaderRight: broaderRight = "broaderRight".asInstanceOf[broaderRight]
  
  @scala.inline
  def equal: equal = "equal".asInstanceOf[equal]
  
  @scala.inline
  def mismatch: mismatch = "mismatch".asInstanceOf[mismatch]
  
  @js.native
  sealed trait broaderLeft extends js.Object
  
  @js.native
  sealed trait broaderRight extends js.Object
  
  @js.native
  sealed trait equal extends js.Object
  
  @js.native
  sealed trait mismatch extends js.Object
}
