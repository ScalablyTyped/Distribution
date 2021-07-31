package typings.when

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whenStrings {
  
  @js.native
  sealed trait fulfilled extends StObject
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  
  @js.native
  sealed trait pending extends StObject
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait rejected extends StObject
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
}
