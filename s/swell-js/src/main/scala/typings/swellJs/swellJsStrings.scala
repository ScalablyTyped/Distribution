package typings.swellJs

import typings.swellJs.mod.PurchaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swellJsStrings {
  
  @js.native
  sealed trait Size extends StObject
  inline def Size: Size = "Size".asInstanceOf[Size]
  
  @js.native
  sealed trait select extends StObject
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait standard
    extends StObject
       with PurchaseOptions
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait subscription
    extends StObject
       with PurchaseOptions
  inline def subscription: subscription = "subscription".asInstanceOf[subscription]
}
