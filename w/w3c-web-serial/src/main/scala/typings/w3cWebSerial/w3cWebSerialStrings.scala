package typings.w3cWebSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object w3cWebSerialStrings {
  
  @js.native
  sealed trait connect extends StObject
  inline def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait disconnect extends StObject
  inline def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @js.native
  sealed trait even
    extends StObject
       with ParityType
  inline def even: even = "even".asInstanceOf[even]
  
  @js.native
  sealed trait hardware
    extends StObject
       with FlowControlType
  inline def hardware: hardware = "hardware".asInstanceOf[hardware]
  
  @js.native
  sealed trait none
    extends StObject
       with FlowControlType
       with ParityType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait odd
    extends StObject
       with ParityType
  inline def odd: odd = "odd".asInstanceOf[odd]
}
