package typings.vegaUtil

import typings.vegaUtil.mod.Order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vegaUtilStrings {
  
  @js.native
  sealed trait ascending
    extends StObject
       with Order
  inline def ascending: ascending = "ascending".asInstanceOf[ascending]
  
  @js.native
  sealed trait center extends StObject
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait descending
    extends StObject
       with Order
  inline def descending: descending = "descending".asInstanceOf[descending]
  
  @js.native
  sealed trait left extends StObject
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
}
