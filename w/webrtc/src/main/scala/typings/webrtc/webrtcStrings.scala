package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webrtcStrings {
  
  @js.native
  sealed trait controlled
    extends StObject
       with RTCIceRole
  inline def controlled: controlled = "controlled".asInstanceOf[controlled]
  
  @js.native
  sealed trait controlling
    extends StObject
       with RTCIceRole
  inline def controlling: controlling = "controlling".asInstanceOf[controlling]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait gatheringstatechange extends StObject
  inline def gatheringstatechange: gatheringstatechange = "gatheringstatechange".asInstanceOf[gatheringstatechange]
  
  @js.native
  sealed trait selectedcandidatepairchange extends StObject
  inline def selectedcandidatepairchange: selectedcandidatepairchange = "selectedcandidatepairchange".asInstanceOf[selectedcandidatepairchange]
  
  @js.native
  sealed trait statechange extends StObject
  inline def statechange: statechange = "statechange".asInstanceOf[statechange]
  
  @js.native
  sealed trait unknown
    extends StObject
       with RTCIceRole
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
}
